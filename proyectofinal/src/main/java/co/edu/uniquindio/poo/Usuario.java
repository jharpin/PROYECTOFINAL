package co.edu.uniquindio.poo;

public class Usuario {

    private String nombreUsuario;
    private String contrasena;
    private String palabraSecreta;
    private PreguntasSeguridad preguntasSeguridad;
    private boolean bloqueado;

    // Constructor con parámetros
    public Usuario(String nombreUsuario, String contrasena, String palabraSecreta, PreguntasSeguridad preguntasSeguridad) {
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
        this.preguntasSeguridad = preguntasSeguridad;
        this.palabraSecreta = palabraSecreta;
    }

    // Constructor vacío
    public Usuario() {
    }

    // Getter y Setter para nombreUsuario
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    // Getter y Setter para contrasena
    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    // Getter y Setter para preguntasSeguridad
    public PreguntasSeguridad getPreguntasSeguridad() {
        return preguntasSeguridad;
    }

    public void setPreguntasSeguridad(PreguntasSeguridad preguntasSeguridad) {
        this.preguntasSeguridad = preguntasSeguridad;
    }

    // Getter y Setter para palabraSecreta
    public String getPalabraSecreta() {
        return palabraSecreta;
    }

    public void setPalabraSecreta(String palabraSecreta) {
        this.palabraSecreta = palabraSecreta;
    }

    // Getter y Setter para bloqueado (arreglo el error aquí)
    public boolean isBloqueado() {
        return bloqueado;
    }

    public void setBloqueado(boolean bloqueado) {
        this.bloqueado = bloqueado; // Cambié el valor a 'bloqueado' que es el parámetro
    }

    // Método para desbloquear al usuario
    public void usuarioDesbloqueado() {
        this.bloqueado = false;
    }

    // Método toString
    @Override
    public String toString() {
        return "Usuario{" +
                "nombreUsuario='" + nombreUsuario + '\'' +
                ", contrasena='" + contrasena + '\'' +
                ", palabraSecreta='" + palabraSecreta + '\'' +
                '}';
    }
}
