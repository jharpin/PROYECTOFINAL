package co.edu.uniquindio.poo;

/**
 * Clase que representa a un usuario del sistema.
 * Un usuario tiene un nombre de usuario, una contraseña, una palabra secreta
 * y una serie de preguntas de seguridad. Además, puede estar bloqueado.
 */
public class Usuario {

    // Atributos de la clase Usuario
    private String nombreUsuario; // Nombre de usuario del usuario
    private String contrasena;    // Contraseña asociada al usuario
    private String palabraSecreta; // Palabra secreta que puede ser utilizada para recuperar la cuenta
    private PreguntasSeguridad preguntasSeguridad; // Preguntas de seguridad asociadas al usuario
    private boolean bloqueado;    // Estado que indica si el usuario está bloqueado

    /**
     * Constructor con parámetros para inicializar un usuario con nombre de usuario, contraseña, palabra secreta
     * y preguntas de seguridad.
     *
     * @param nombreUsuario El nombre de usuario.
     * @param contrasena La contraseña del usuario.
     * @param palabraSecreta La palabra secreta del usuario.
     * @param preguntasSeguridad Las preguntas de seguridad asociadas al usuario.
     */
    public Usuario(String nombreUsuario, String contrasena, String palabraSecreta, PreguntasSeguridad preguntasSeguridad) {
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
        this.preguntasSeguridad = preguntasSeguridad;
        this.palabraSecreta = palabraSecreta;
    }

    /**
     * Constructor vacío para crear un usuario sin establecer valores iniciales.
     */
    public Usuario() {
    }

    // Métodos Getter y Setter para cada uno de los atributos

    /**
     * Obtiene el nombre de usuario.
     *
     * @return El nombre de usuario.
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    /**
     * Establece el nombre de usuario.
     *
     * @param nombreUsuario El nombre de usuario a establecer.
     */
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    /**
     * Obtiene la contraseña del usuario.
     *
     * @return La contraseña.
     */
    public String getContrasena() {
        return contrasena;
    }

    /**
     * Establece la contraseña del usuario.
     *
     * @param contrasena La contraseña a establecer.
     */
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    /**
     * Obtiene las preguntas de seguridad asociadas al usuario.
     *
     * @return Las preguntas de seguridad.
     */
    public PreguntasSeguridad getPreguntasSeguridad() {
        return preguntasSeguridad;
    }

    /**
     * Establece las preguntas de seguridad asociadas al usuario.
     *
     * @param preguntasSeguridad Las preguntas de seguridad a establecer.
     */
    public void setPreguntasSeguridad(PreguntasSeguridad preguntasSeguridad) {
        this.preguntasSeguridad = preguntasSeguridad;
    }

    /**
     * Obtiene la palabra secreta del usuario.
     *
     * @return La palabra secreta.
     */
    public String getPalabraSecreta() {
        return palabraSecreta;
    }

    /**
     * Establece la palabra secreta del usuario.
     *
     * @param palabraSecreta La palabra secreta a establecer.
     */
    public void setPalabraSecreta(String palabraSecreta) {
        this.palabraSecreta = palabraSecreta;
    }

    /**
     * Obtiene el estado de bloqueo del usuario.
     *
     * @return true si el usuario está bloqueado, false si no lo está.
     */
    public boolean isBloqueado() {
        return bloqueado;
    }

    /**
     * Establece el estado de bloqueo del usuario.
     *
     * @param bloqueado El estado de bloqueo a establecer.
     */
    public void setBloqueado(boolean bloqueado) {
        this.bloqueado = bloqueado; // Cambié el valor a 'bloqueado' que es el parámetro
    }

    /**
     * Método para desbloquear al usuario.
     * Cambia el estado de 'bloqueado' a false.
     */
    public void usuarioDesbloqueado() {
        this.bloqueado = false; // Establece el estado como desbloqueado.
    }

    /**
     * Método que devuelve una representación en cadena del objeto Usuario.
     *
     * @return Una cadena que describe el objeto Usuario.
     */
    @Override
    public String toString() {
        return "Usuario{" +
                "nombreUsuario='" + nombreUsuario + '\'' +
                ", contrasena='" + contrasena + '\'' +
                ", palabraSecreta='" + palabraSecreta + '\'' +
                '}'; // Devuelve la representación de los atributos en forma de cadena.
    }
}
