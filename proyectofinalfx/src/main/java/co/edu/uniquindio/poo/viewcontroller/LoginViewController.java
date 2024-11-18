package co.edu.uniquindio.poo.viewcontroller;

import co.edu.uniquindio.poo.model.Empleado;
import co.edu.uniquindio.poo.model.Empresa;
import co.edu.uniquindio.poo.model.Enum.PreguntasSeguridad;
import co.edu.uniquindio.poo.model.Usuario;
import javafx.animation.TranslateTransition;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class LoginViewController {

    @FXML
    private Button btnOlvidaste;

    @FXML
    private Button btnLogin;

    @FXML
    private Button btnValidar;

    @FXML
    private Button btnCambiarPss;

    @FXML
    private ComboBox<PreguntasSeguridad> cbPregunta;

    @FXML
    private PasswordField pwfLogin;

    @FXML
    private Button deslizarAlready;

    @FXML
    private AnchorPane formularioDeslizable;

    @FXML
    private PasswordField pwfNuevaContrasena;

    @FXML
    private TextField txtPalabra;

    @FXML
    private AnchorPane formularioLogin;

    @FXML
    private TextField txtUsuarioLogin;

    @FXML
    private Label lblNueva;

    private PrincipalViewController principalViewController;
    private final Empresa empresa = Empresa.getInstancia();
    private ObservableList<PreguntasSeguridad> listaPreguntas = FXCollections.observableArrayList();

    private void preguntasSeguridad() {
        listaPreguntas.setAll(PreguntasSeguridad.values());
        cbPregunta.setItems(listaPreguntas);
    }

    @FXML
    void onIniciarSesion(ActionEvent event) {
        iniciarSesion();
    }

    @FXML
    void onValidarPregunta(ActionEvent event) {
        verificarPalabra();
    }

    @FXML
    void onCambiarPss(ActionEvent event) {
        cambiarContrasena();
    }

    private void iniciarSesion() {
        String usuario = txtUsuarioLogin.getText();
        String pass = pwfLogin.getText();
        if (validarAdmin(usuario, pass)) {
            principalViewController.navegarDatos("/co/edu/uniquindio/proyecto_final/tucarro/AdminPanel.fxml");
            cerrarVentana();
        } else {
            Empleado empleado = empresa.validarEmpleado(usuario, pass);
            if (empleado != null) {
                if (empleado.getUsuario().isBloqueado()) {
                    principalViewController.mostrarAlerta(Alert.AlertType.WARNING, "Acceso denegado", "El usuario está bloqueado.");
                } else {
                    principalViewController.mostrarAlerta(Alert.AlertType.INFORMATION, "Éxito", "Bienvenido " + empleado.getUsuario().getNombreUsuario());
                }
            } else {
                principalViewController.mostrarAlerta(Alert.AlertType.WARNING, "Advertencia", "Usuario o contraseña inválidos");
            }
        }
    }


    @FXML
    void initialize() {
        principalViewController = new PrincipalViewController();
        btnLogin.setOnAction(this::onIniciarSesion);
        btnValidar.setOnAction(this::onValidarPregunta);
        btnCambiarPss.setOnAction(this::onCambiarPss);
        preguntasSeguridad();
        lblNueva.setVisible(false);
        pwfNuevaContrasena.setVisible(false);
        btnCambiarPss.setVisible(false);
    }

    private void verificarPalabra() {
        String palabraIngresada = txtPalabra.getText();
        Usuario usuario = empresa.obtenerUsuario(palabraIngresada);
        if (usuario != null) {
            lblNueva.setVisible(true);
            pwfNuevaContrasena.setVisible(true);
            btnCambiarPss.setVisible(true);
        } else {
            lblNueva.setVisible(false);
            pwfNuevaContrasena.setVisible(false);
            btnCambiarPss.setVisible(false);
            principalViewController.mostrarAlerta(Alert.AlertType.ERROR, "Información incorrecta", "La palabra secreta es inválida");
        }
    }

    private void cambiarContrasena() {
        String nuevaContrasena = pwfNuevaContrasena.getText();
        String palabraSecreta = txtPalabra.getText();
        Usuario usuario = empresa.obtenerUsuario(palabraSecreta);
        if (usuario != null) {
            if (nuevaContrasena.length() < 6) {
                principalViewController.mostrarAlerta(Alert.AlertType.ERROR,
                        "Error",
                        "La contraseña debe tener al menos 6 caracteres.");
                return;
            }
            usuario.setContrasena(nuevaContrasena);
            principalViewController.mostrarAlerta(Alert.AlertType.INFORMATION,
                    "Éxito",
                    "La contraseña ha sido cambiada exitosamente.\n" +
                            "Usuario: " + usuario.getNombreUsuario() + "\n" +
                            "Nueva Contraseña: " + usuario.getContrasena() + "\n" +
                            "Palabra Secreta: " + usuario.getPalabraSecreta());

            pwfNuevaContrasena.clear();
            txtPalabra.clear();
            lblNueva.setVisible(false);
            pwfNuevaContrasena.setVisible(false);
        } else {
            principalViewController.mostrarAlerta(Alert.AlertType.ERROR,
                    "Error",
                    "No se pudo cambiar la contraseña. Asegúrate de que la nueva contraseña no esté vacía.");
        }
    }


    private void cerrarVentana() {
        Stage stage = (Stage) btnLogin.getScene().getWindow();
        stage.close();
    }

    private boolean validarAdmin(String nombreUsuario, String password) {
        return "admin".equals(nombreUsuario) && "admin123".equals(password);
    }

    @FXML
    public void cambiarDeslizable(ActionEvent event) {
        TranslateTransition deslizar = new TranslateTransition();
        if (event.getSource() == btnOlvidaste) {
            deslizar.setNode(formularioDeslizable);
            deslizar.setToX(330);
            deslizar.setDuration(Duration.seconds(.5));
            deslizar.setOnFinished(e -> {
                deslizarAlready.setVisible(true);
                btnOlvidaste.setVisible(false);
            });
        } else if (event.getSource() == deslizarAlready) {
            deslizar.setNode(formularioDeslizable);
            deslizar.setToX(0);
            deslizar.setDuration(Duration.seconds(.5));
            deslizar.setOnFinished(e -> {
                deslizarAlready.setVisible(false);
                btnOlvidaste.setVisible(true);
            });
        }
        deslizar.play();
    }

}
