package co.edu.uniquindio.proyecto_final.tucarro.viewcontroller;

import co.edu.uniquindio.proyecto_final.tucarro.model.Empleado;
import co.edu.uniquindio.proyecto_final.tucarro.model.Empresa;
import co.edu.uniquindio.proyecto_final.tucarro.model.Enum.PreguntasSeguridad;
import co.edu.uniquindio.proyecto_final.tucarro.model.Usuario;
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
        
        // Validación de usuario admin
        if ("admin".equals(usuario) && "admin123".equals(pass)) {
            principalViewController.navegarDatos("/co/edu/uniquindio/proyecto_final/tucarro/AdminPanel.fxml");
            cerrarVentana();
        } else {
            // Verificación de empleado
            Empleado empleado = empresa.validarEmpleado(usuario, pass);
            if (empleado != null) {
                // Verificar si el usuario está bloqueado
                boolean isBlocked = empleado.getUsuario().isBloqueado();
                if (isBlocked) {
                    mostrarAccesoDenegado();
                } else {
                    mostrarBienvenida(empleado.getUsuario().getNombreUsuario());
                }
            } else {
                mostrarAdvertencia();
            }
        }
    }
    
    private void mostrarAccesoDenegado() {
        principalViewController.mostrarAlerta(Alert.AlertType.WARNING, "Acceso denegado", "EL USUARIO SE ENCUENTRA BLOQUEADO POR EL ADMIN .");
    }
    
    private void mostrarBienvenida(String nombreUsuario) {
        principalViewController.mostrarAlerta(Alert.AlertType.INFORMATION, "Éxito", "BIENVENID " + nombreUsuario);
    }
    
    private void mostrarAdvertencia() {
        principalViewController.mostrarAlerta(Alert.AlertType.WARNING, "Advertencia", "USUARIO O CONTRASEÑA NO SON CORRECTOS, VERIFICALOS HE INTENTA NUEVAMENTE ");
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
            principalViewController.mostrarAlerta(Alert.AlertType.ERROR, "Información incorrecta", "ESA NO ES LA PALABRA SECRETA ");
        }
    }

    private void cambiarContrasena() {
        String nuevaContrasena = pwfNuevaContrasena.getText();
        String palabraSecreta = txtPalabra.getText();
        Usuario usuario = empresa.obtenerUsuario(palabraSecreta);
        if (usuario != null) {
            if (nuevaContrasena.length() < 6) {
                principalViewController.mostrarAlerta(Alert.AlertType.ERROR,
                        "ERROR!!!!!!!!!!!",
                        "La contraseña debe tener al menos 6 caracteres.");
                return;
            }
            usuario.setContrasena(nuevaContrasena);
            principalViewController.mostrarAlerta(Alert.AlertType.INFORMATION,
                    "Éxito",
                    "SE HA CAMBIADO LA CONTRASEÑA .\n" +
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
                    "LA NUEVA CONTRASEÑA NO PUEDE ESTAR VACIA .");
        }
    }


    private void cerrarVentana() {
        Stage stage = (Stage) btnLogin.getScene().getWindow();
        stage.close();
    }

    private boolean validarAdmin(String nombreUsuario, String password) {
        return "admin".equals(nombreUsuario) && "admin123".equals(password);
    }

    

}
