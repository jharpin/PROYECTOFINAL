package co.edu.uniquindio.proyecto_final.tucarro.viewcontroller;

import java.io.*;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import co.edu.uniquindio.proyecto_final.tucarro.controller.EmpleadoController;
import co.edu.uniquindio.proyecto_final.tucarro.model.*;
import co.edu.uniquindio.proyecto_final.tucarro.model.Enum.PreguntasSeguridad;
import co.edu.uniquindio.proyecto_final.tucarro.model.Enum.Rol;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;

public class AdminPanelViewController {
    @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;
    @FXML
    private ComboBox<Rol> cbRol;
    @FXML
    private ComboBox<PreguntasSeguridad> cbPregunta;
    @FXML
    private PasswordField pwfContrasena;
    @FXML
    private TableView<Empleado> tablaEmpleado;
    @FXML
    private TableColumn<Empleado,Integer> tcId;
    @FXML
    private TableColumn<Empleado, String> tcApellido;
    @FXML
    private TableColumn<Empleado, String> tcCedula;
    @FXML
    private TableColumn<Empleado, String> tcCorreo;
    @FXML
    private TableColumn<Empleado, Integer> tcEdad;
    @FXML
    private TableColumn<Empleado, String> tcNombre;
    @FXML
    private TableColumn<Empleado, String> tcPalabra;
    @FXML
    private TableColumn<Empleado, String> tcRol;
    @FXML
    private TableColumn<Empleado, String> tcPregunta;
    @FXML
    private TableColumn<Empleado, String> tcPassword;
    @FXML
    private TableColumn<Empleado, String> tcTelefono;
    @FXML
    private TableColumn<Empleado, String> tcUsuario;
    @FXML
    private TextField txtApellido;
    @FXML
    private TextField txtCedula;
    @FXML
    private TextField txtCorreo;
    @FXML
    private TextField txtEdad;
    @FXML
    private TextField txtID;
    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtPalabra;
    @FXML
    private TextField txtTelefono;
    @FXML
    private TextField txtUsuario;
    @FXML
    private Button btnAgregar;
    @FXML
    private Button btnNuevo;
    @FXML
    private Button btnActualizar;
    @FXML
    private Button btnEliminar;
    @FXML
    private Button btnSalir;
    @FXML
    private Button btnReportesEmpleados;
    @FXML
    private RadioButton btnBloquear;
    @FXML
    private Button btnInfoAdmin;
    @FXML
    private Button btnEstadisticas;
    @FXML
    private Button btnReporteClientes;
    @FXML
    private Button btnReportesAlquileres;
    @FXML
    private Button btnReportesVehiculos;

    private ObservableList<Empleado> listaEmpleados = FXCollections.observableArrayList();
    private ObservableList<Rol> listaRols = FXCollections.observableArrayList();
    private ObservableList<PreguntasSeguridad> listaPreguntas = FXCollections.observableArrayList();
    private Empleado empleadoSeleccionado;
    private EmpleadoController empleadoController;
    private PrincipalViewController principalViewController;
    private Empresa empresa = Empresa.getInstancia();

    @FXML
    void onAgregar(ActionEvent event) {
        agregarEmpleado();
    }

    @FXML
    void onActualizar(ActionEvent event) {
        actualizarEmpleado();
    }

    @FXML
    void onEliminar(ActionEvent event) {
        eliminarEmpleado();
    }

    @FXML
    void onNuevo(ActionEvent event) {
        limpiar();
    }

    @FXML
    void onCerrarSesion(ActionEvent event) {
        cerrarSesion();
    }

    @FXML
    void onInformacionAdmin(ActionEvent event) {
        obtenerInformacionAdministrador();
    }

    @FXML
    void onGenerarReporte(ActionEvent event) {
        generarReportePDF();
    }
    @FXML
    void onGenerarReporteCliente(ActionEvent event) {
        generarReporteClientes();
    }
    @FXML
    void onReporteAlquiler(ActionEvent event) {
        principalViewController.navegarDatos("/co/edu/uniquindio/proyecto_final/tucarro/Alquiler.fxml");
    }
    @FXML
    void onIrEstadisticas(ActionEvent event) {
        principalViewController.navegarDatos("/co/edu/uniquindio/proyecto_final/tucarro/Estadistica.fxml");
    }
    @FXML
    void onGenerarReporteVehiculos(ActionEvent event) {
        generarReporteVehiculos();
    }

    @FXML
    void initialize() {
        principalViewController = new PrincipalViewController();
        empleadoController = new EmpleadoController();
        initView();
        llenarCbRol();
        llenarCbPreguntas();
        btnNuevo.setOnAction(this::onNuevo);
        btnAgregar.setOnAction(this::onAgregar);
        btnActualizar.setOnAction(this::onActualizar);
        btnEliminar.setOnAction(this::onEliminar);
        btnSalir.setOnAction(this::onCerrarSesion);
        btnBloquear.setOnAction(this::onBloquear);
        btnInfoAdmin.setOnAction(this::onInformacionAdmin);
        btnReportesEmpleados.setOnAction(this::onGenerarReporte);
        btnReporteClientes.setOnAction(this::onGenerarReporteCliente);
        btnEstadisticas.setOnAction(this::onIrEstadisticas);
        btnReportesAlquileres.setOnAction(this::onReporteAlquiler);
        btnReportesVehiculos.setOnAction(this::onGenerarReporteVehiculos);
    }

    private void initView() {
        initDataBinding();
        obtenerEmpleados();
        listenerSelection();
    }

    private void initDataBinding() {
        tcNombre.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNombre()));
        tcApellido.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getApellido()));
        tcCedula.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getCedula()));
        tcEdad.setCellValueFactory(cellData -> new SimpleIntegerProperty(cellData.getValue().getEdad()).asObject());
        tcCorreo.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getCorreo()));
        tcTelefono.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getTelefono()));
        tcUsuario.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getUsuario().getNombreUsuario()));
        tcPassword.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getUsuario().getContrasena()));
        tcRol.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getRol()));
        tcPalabra.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getUsuario().getPalabraSecreta()));
        tcPregunta.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getUsuario().getPreguntasSeguridad().toString()));
    }

    private void llenarCbRol() {
        listaRols.setAll(Rol.values());
        cbRol.setItems(listaRols);
    }

    private void llenarCbPreguntas() {
        listaPreguntas.setAll(PreguntasSeguridad.values());
        cbPregunta.setItems(listaPreguntas);
    }

    private void obtenerEmpleados() {
        listaEmpleados.clear();
        listaEmpleados.addAll(empresa.getListaEmpleados());
        tablaEmpleado.setItems(listaEmpleados);
    }

    private Empleado crearEmpleado() {
        return new Empleado(
                Integer.parseInt(txtID.getText()),
                txtNombre.getText(),
                txtApellido.getText(),
                txtCedula.getText(),
                Integer.parseInt(txtEdad.getText()),
                txtCorreo.getText(),
                txtTelefono.getText(),
                cbRol.getValue().toString(),
                crearUsuario()
        );
    }


    private Usuario crearUsuario() {
        Usuario usuario = new Usuario();
        usuario.setNombreUsuario(txtUsuario.getText());
        usuario.setContrasena(pwfContrasena.getText());
        usuario.setPalabraSecreta(txtPalabra.getText());
        usuario.setPreguntasSeguridad(cbPregunta.getValue());
        usuario.setBloqueado(false);
        return usuario;
    }

    private void mostrarInformacion(Empleado empleadoSeleccionado) {
        if (empleadoSeleccionado != null) {
            txtID.setText(String.valueOf(empleadoSeleccionado.getId()));
            txtNombre.setText(empleadoSeleccionado.getNombre());
            txtApellido.setText(empleadoSeleccionado.getApellido());
            txtCedula.setText(empleadoSeleccionado.getCedula());
            txtEdad.setText(String.valueOf(empleadoSeleccionado.getEdad()));
            txtCorreo.setText(empleadoSeleccionado.getCorreo());
            txtTelefono.setText(empleadoSeleccionado.getTelefono());
            txtUsuario.setText(empleadoSeleccionado.getUsuario().getNombreUsuario());
            pwfContrasena.setText(empleadoSeleccionado.getUsuario().getContrasena());
            txtPalabra.setText(empleadoSeleccionado.getUsuario().getPalabraSecreta());
            cbRol.setValue(Rol.valueOf(empleadoSeleccionado.getRol()));
            cbPregunta.setValue(empleadoSeleccionado.getUsuario().getPreguntasSeguridad());
            Usuario usuario = empleadoSeleccionado.getUsuario();
            btnBloquear.setText(usuario.isBloqueado() ? "Desbloquear" : "Bloquear");
        }
    }

    private void agregarEmpleado() {
        if (validar()) {
            Empleado empleado = crearEmpleado();
            if (empleadoController.verificarEmpleado(empleado.getCedula())) {
                principalViewController.mostrarAlerta(Alert.AlertType.WARNING, "Precaución", "El empleado ya existe.");
                return;
            }
            if (empleadoController.agregarEmpleado(empleado)) {
                listaEmpleados.add(empleado);
                principalViewController.mostrarAlerta(Alert.AlertType.INFORMATION, "Éxito", "Empleado agregado correctamente.");
                obtenerEmpleados();
                tablaEmpleado.getSelectionModel().clearSelection();
                limpiar();
            } else {
                principalViewController.mostrarAlerta(Alert.AlertType.ERROR, "Error", "Empleado no agregado correctamente.");
            }
        }
    }

    private void actualizarEmpleado() {
        if (empleadoSeleccionado != null) {
            if (validar()) {
                Empleado empleadoActualizado = crearEmpleado();
                if (empleadoController.actualizarEmpleado(empleadoActualizado)) {
                    int index = listaEmpleados.indexOf(empleadoSeleccionado);
                    if (index != -1) {
                        listaEmpleados.set(index, empleadoActualizado);
                    }
                    tablaEmpleado.refresh();
                    tablaEmpleado.getSelectionModel().clearSelection();
                    limpiar();
                    principalViewController.mostrarAlerta(Alert.AlertType.INFORMATION, "Éxito", "Empleado actualizado correctamente.");
                } else {
                    principalViewController.mostrarAlerta(Alert.AlertType.ERROR, "Error", "El empleado no se actualizó.");
                }
            }
        } else {
            principalViewController.mostrarAlerta(Alert.AlertType.WARNING, "Advertencia", "Seleccione un empleado para actualizar.");
        }
    }

    private void eliminarEmpleado() {
        if (empleadoSeleccionado != null) {
            if (empleadoController.eliminarEmpleado(empleadoSeleccionado.getCedula())) {
                listaEmpleados.remove(empleadoSeleccionado);
                empleadoSeleccionado = null;
                tablaEmpleado.getSelectionModel().clearSelection();
                limpiar();
                principalViewController.mostrarAlerta(Alert.AlertType.INFORMATION, "Éxito", "Empleado eliminado correctamente.");
            } else {
                principalViewController.mostrarAlerta(Alert.AlertType.ERROR, "Error", "El empleado no se eliminó correctamente.");
            }
        } else {
            principalViewController.mostrarAlerta(Alert.AlertType.WARNING, "Advertencia", "Seleccione un empleado para eliminar.");
        }
    }

    private void listenerSelection() {
        tablaEmpleado.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            empleadoSeleccionado = newValue;
            mostrarInformacion(empleadoSeleccionado);
        });
    }

    private void limpiar() {
        txtID.clear();
        txtNombre.clear();
        txtApellido.clear();
        txtCedula.clear();
        txtEdad.clear();
        txtCorreo.clear();
        txtTelefono.clear();
        txtUsuario.clear();
        pwfContrasena.clear();
        txtPalabra.clear();
        cbRol.setValue(null);
        cbPregunta.setValue(null);
        tablaEmpleado.getSelectionModel().clearSelection();
    }

    private void cerrarSesion() {
        Stage stage = (Stage) btnSalir.getScene().getWindow();
        stage.close();
        principalViewController.navegarDatos("/co/edu/uniquindio/proyecto_final/tucarro/Login.fxml");
    }

    private void obtenerInformacionAdministrador() {
        if (!empresa.getListaAdministrador().isEmpty()) {
            Administrador admin = empresa.getListaAdministrador().get(0);
            principalViewController.mostrarAlerta(Alert.AlertType.INFORMATION,
                    "Información del administrador",
                    "ID: " + admin.getId() + "\n" +
                            "Nombre: " + admin.getNombre() + "\n" +
                            "Apellido: " + admin.getApellido() + "\n" +
                            "Cédula: " + admin.getCedula() + "\n" +
                            "Edad: " + admin.getEdad() + "\n" +
                            "Correo: " + admin.getCorreo() + "\n" +
                            "Teléfono: " + admin.getTelefono() + "\n" +
                            "Usuario: " + admin.getUsuario().getNombreUsuario() + "\n" +
                            "Contraseña: " + admin.getUsuario().getContrasena() + "\n" +
                            "Rol: " + admin.getRol());
        } else {
            principalViewController.mostrarAlerta(Alert.AlertType.WARNING,
                    "Información administrador",
                    "No hay administradores disponibles.");
        }
    }

    private boolean validar() {
        if (txtID.getText().isEmpty() || txtNombre.getText().isEmpty() || txtApellido.getText().isEmpty() ||
                txtCedula.getText().isEmpty() || txtEdad.getText().isEmpty() || txtCorreo.getText().isEmpty() ||
                txtTelefono.getText().isEmpty() || txtUsuario.getText().isEmpty() || pwfContrasena.getText().isEmpty() ||
                txtPalabra.getText().isEmpty() || cbRol.getValue() == null || cbPregunta.getValue() == null) {
            principalViewController.mostrarAlerta(Alert.AlertType.WARNING, "Advertencia", "Por favor, complete todos los campos.");
            return false;
        }
        try {
            int edad = Integer.parseInt(txtEdad.getText());
            if (edad < 18 || edad > 65) {
                principalViewController.mostrarAlerta(Alert.AlertType.WARNING, "Advertencia", "La edad debe estar entre 18 y 65 años.");
                return false;
            }
        } catch (NumberFormatException e) {
            principalViewController.mostrarAlerta(Alert.AlertType.WARNING, "Advertencia", "La edad debe ser un número válido.");
            return false;
        }
        if (!txtCorreo.getText().matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            principalViewController.mostrarAlerta(Alert.AlertType.WARNING, "Advertencia", "Ingrese un correo electrónico válido.");
            return false;
        }
        if (pwfContrasena.getText().length() < 6) {
            principalViewController.mostrarAlerta(Alert.AlertType.WARNING, "Advertencia", "La contraseña debe tener al menos 6 caracteres.");
            return false;
        }
        try {
            int id = Integer.parseInt(txtID.getText());
            if (id <= 0) {
                principalViewController.mostrarAlerta(Alert.AlertType.WARNING, "Advertencia", "El ID debe ser un número positivo.");
                return false;
            }
        } catch (NumberFormatException e) {
            principalViewController.mostrarAlerta(Alert.AlertType.WARNING, "Advertencia", "El ID debe ser un número válido.");
            return false;
        }
        if (txtCedula.getText().length() != 10) {
            principalViewController.mostrarAlerta(Alert.AlertType.WARNING, "Advertencia", "La cédula debe tener 10 dígitos.");
            return false;
        }
        if (!txtTelefono.getText().matches("\\d{10}")) {
            principalViewController.mostrarAlerta(Alert.AlertType.WARNING, "Advertencia", "El número de teléfono debe tener 10 dígitos.");
            return false;
        }
        if (cbRol.getValue() == null) {
            principalViewController.mostrarAlerta(Alert.AlertType.WARNING, "Advertencia", "Seleccione un rol.");
            return false;
        }
        if (cbPregunta.getValue() == null) {
            principalViewController.mostrarAlerta(Alert.AlertType.WARNING, "Advertencia", "Seleccione una pregunta.");
            return false;
        }
        return true;
    }

    @FXML
    void onBloquear(ActionEvent event) {
        if (empleadoSeleccionado != null) {
            Usuario usuario = empleadoSeleccionado.getUsuario();
            if (usuario.isBloqueado()) {
                usuario.setBloqueado(false);
                principalViewController.mostrarAlerta(Alert.AlertType.INFORMATION, "Éxito", "Empleado desbloqueado correctamente.");
                btnBloquear.setText("Bloquear");
            } else {
                usuario.setBloqueado(true);
                principalViewController.mostrarAlerta(Alert.AlertType.INFORMATION, "Éxito", "Empleado bloqueado correctamente.");
                btnBloquear.setText("Desbloquear");
            }
            obtenerEmpleados();
        } else {
            principalViewController.mostrarAlerta(Alert.AlertType.WARNING, "Advertencia", "Seleccione un empleado para bloquear o desbloquear.");
        }
    }

    private void generarReporteVehiculos() {
        try {
            List<Vehiculo> listaVehiculos = empresa.getListaVehiculos();
            if (listaVehiculos.isEmpty()) {
                principalViewController.mostrarAlerta(Alert.AlertType.WARNING, "Advertencia", "No hay vehículos disponibles para generar el reporte.");
                return;
            }
            String projectDir = new File("").getAbsolutePath();
            String reportPath = projectDir + "/src/main/resources/co/edu/uniquindio/proyecto_final/reportes";
            File reportesDir = new File(reportPath);
            if (!reportesDir.exists()) {
                reportesDir.mkdirs();
            }
            File pdfFile = new File(reportesDir, "Reporte_Vehiculos.pdf");
            Document documento = new Document();
            OutputStream outputStream = new FileOutputStream(pdfFile);
            PdfWriter.getInstance(documento, outputStream);
            documento.open();
            Font titleFont = new Font(Font.FontFamily.HELVETICA, 20, Font.BOLD);
            Paragraph title = new Paragraph("Reporte de Vehículos", titleFont);
            title.setAlignment(Element.ALIGN_CENTER);
            documento.add(title);
            documento.add(new Paragraph(" "));
            PdfPTable table = new PdfPTable(9);
            table.setWidthPercentage(100);
            table.setSpacingBefore(10f);
            table.setSpacingAfter(10f);
            table.setWidths(new float[]{1.5f, 2, 1.5f, 1.5f, 1.5f, 1.5f, 1.5f, 2, 3});
            Font headerFont = new Font(Font.FontFamily.HELVETICA, 12, Font.BOLD, BaseColor.WHITE);
            String[] headers = {"Tipo", "Marca", "Estado", "Modelo", "Placa", "Velocidad Max", "Motor (L)", "Combustible", "Detalles Específicos"};
            for (String header : headers) {
                PdfPCell headerCell = new PdfPCell(new Paragraph(header, headerFont));
                headerCell.setBackgroundColor(BaseColor.GRAY);
                headerCell.setHorizontalAlignment(Element.ALIGN_CENTER);
                headerCell.setPadding(5);
                table.addCell(headerCell);
            }
            Font cellFont = new Font(Font.FontFamily.HELVETICA, 10, Font.NORMAL);
            for (Vehiculo vehiculo : listaVehiculos) {
                table.addCell(createCell(vehiculo.getClass().getSimpleName(), cellFont));
                table.addCell(createCell(vehiculo.getMarca(), cellFont));
                table.addCell(createCell(vehiculo.getEstado(), cellFont));
                table.addCell(createCell(vehiculo.getModelo(), cellFont));
                table.addCell(createCell(vehiculo.getPlaca(), cellFont));
                table.addCell(createCell(String.valueOf(vehiculo.getVelocidadMaxima()), cellFont));
                table.addCell(createCell(String.valueOf(vehiculo.getCilindraje()), cellFont));
                table.addCell(createCell(vehiculo.getCombustible(), cellFont));
                String detalles;
                if (vehiculo instanceof Sedan) {
                    Sedan sedan = (Sedan) vehiculo;
                    detalles = "Aire acondicionado: " + (sedan.isAireAcondicionado() ? "Sí" : "No") +
                            ", Cámara Reversa: " + (sedan.isCamaraReversa() ? "Sí" : "No") +
                            ", Frenos ABS: " + (sedan.isAbs() ? "Sí" : "No");
                } else if (vehiculo instanceof Deportivo) {
                    Deportivo deportivo = (Deportivo) vehiculo;
                    detalles = "Transmisión Automática: " + (deportivo.isTransmisionAutomatica() ? "Sí" : "No") +
                            ", Velocidad Máx: " + deportivo.getVelocidadMaxima();
                } else {
                    detalles = "N/A";
                }
                table.addCell(createCell(detalles, cellFont));
            }
            documento.add(table);
            documento.close();
            outputStream.close();
            principalViewController.mostrarAlerta(Alert.AlertType.INFORMATION, "Éxito", "El reporte de vehículos ha sido generado en: " + pdfFile.getAbsolutePath());
        } catch (DocumentException | IOException e) {
            principalViewController.mostrarAlerta(Alert.AlertType.ERROR, "Error", "No se pudo generar el reporte de vehículos: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private void generarReporteClientes() {
        try {
            List<Cliente> listaClientes = empresa.getListaClientes();
            if (listaClientes.isEmpty()) {
                principalViewController.mostrarAlerta(Alert.AlertType.WARNING, "Advertencia", "No hay clientes disponibles para generar el reporte.");
                return;
            }
            String projectDir = new File("").getAbsolutePath();
            String reportPath = projectDir + "/src/main/resources/co/edu/uniquindio/proyecto_final/reportes";
            File reportesDir = new File(reportPath);
            if (!reportesDir.exists()) {
                reportesDir.mkdirs();
            }
            File pdfFile = new File(reportesDir, "Reporte_Clientes.pdf");
            Document documento = new Document();
            OutputStream outputStream = new FileOutputStream(pdfFile);
            PdfWriter.getInstance(documento, outputStream);
            documento.open();
            Font titleFont = new Font(Font.FontFamily.HELVETICA, 20, Font.BOLD);
            Paragraph title = new Paragraph("Reporte de Clientes", titleFont);
            title.setAlignment(Element.ALIGN_CENTER);
            documento.add(title);
            documento.add(new Paragraph(" "));
            PdfPTable table = new PdfPTable(7);
            table.setWidthPercentage(100);
            table.addCell("ID");
            table.addCell("Nombre");
            table.addCell("Apellido");
            table.addCell("Cédula");
            table.addCell("Edad");
            table.addCell("Correo");
            table.addCell("Teléfono");
            for (Cliente cliente : listaClientes) {
                table.addCell(String.valueOf(cliente.getId()));
                table.addCell(cliente.getNombre() != null ? cliente.getNombre() : "N/A");
                table.addCell(cliente.getApellido() != null ? cliente.getApellido() : "N/A");
                table.addCell(cliente.getCedula() != null ? cliente.getCedula() : "N/A");
                table.addCell(String.valueOf(cliente.getEdad()));
                table.addCell(cliente.getCorreo() != null ? cliente.getCorreo() : "N/A");
                table.addCell(cliente.getTelefono() != null ? cliente.getTelefono() : "N/A");
            }
            documento.add(table);
            documento.close();
            outputStream.close();
            principalViewController.mostrarAlerta(Alert.AlertType.INFORMATION, "Éxito", "El reporte de clientes ha sido generado en: " + pdfFile.getAbsolutePath());
        } catch (DocumentException | IOException e) {
            principalViewController.mostrarAlerta(Alert.AlertType.ERROR, "Error", "No se pudo generar el reporte de clientes: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private void generarReportePDF() {
        try {
            String projectDir = new File("").getAbsolutePath();
            String reportPath = projectDir + "/src/main/resources/co/edu/uniquindio/proyecto_final/reportes";
            File reportesDir = new File(reportPath);
            if (!reportesDir.exists()) {
                reportesDir.mkdirs();
            }
            File pdfFile = new File(reportesDir, "Reporte_Empleados.pdf");
            Document documento = new Document();
            OutputStream outputStream = new FileOutputStream(pdfFile);
            PdfWriter.getInstance(documento, outputStream);
            documento.open();
            Font titleFont = new Font(Font.FontFamily.HELVETICA, 20, Font.BOLD);
            Paragraph title = new Paragraph("Reporte de Empleados", titleFont);
            title.setAlignment(Element.ALIGN_CENTER);
            documento.add(title);
            documento.add(new Paragraph(" "));
            PdfPTable table = new PdfPTable(8);
            table.setWidthPercentage(100);
            table.addCell("ID");
            table.addCell("Nombre");
            table.addCell("Apellido");
            table.addCell("Cédula");
            table.addCell("Edad");
            table.addCell("Correo");
            table.addCell("Teléfono");
            table.addCell("Rol");
            for (Empleado empleado : listaEmpleados) {
                table.addCell(String.valueOf(empleado.getId()));
                table.addCell(empleado.getNombre());
                table.addCell(empleado.getApellido());
                table.addCell(empleado.getCedula());
                table.addCell(String.valueOf(empleado.getEdad()));
                table.addCell(empleado.getCorreo());
                table.addCell(empleado.getTelefono());
                table.addCell(empleado.getRol());
            }
            documento.add(table);
            documento.close();
            outputStream.close();
            principalViewController.mostrarAlerta(Alert.AlertType.INFORMATION, "Éxito", "El reporte ha sido generado en: " + pdfFile.getAbsolutePath());

        } catch (DocumentException | IOException e) {
            principalViewController.mostrarAlerta(Alert.AlertType.ERROR, "Error", "No se pudo generar el reporte: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private PdfPCell createCell(String content, Font font) {
        PdfPCell cell = new PdfPCell(new Paragraph(content != null ? content : "N/A", font));
        cell.setPadding(5);
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
        return cell;
    }
}
