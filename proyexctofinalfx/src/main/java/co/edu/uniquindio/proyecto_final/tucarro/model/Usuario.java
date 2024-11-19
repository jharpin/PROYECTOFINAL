package co.edu.uniquindio.proyecto_final.tucarro.model;

import co.edu.uniquindio.proyecto_final.tucarro.model.Enum.PreguntasSeguridad;

public class Usuario {

    private String nombreUsuario;
    private String contrasena;
    private String palabraSecreta;
    private PreguntasSeguridad preguntasSeguridad;
    private boolean bloqueado;

    public Usuario(String nombreUsuario, String contrasena, String palabraSecreta, PreguntasSeguridad preguntasSeguridad) {
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
        this.preguntasSeguridad = preguntasSeguridad;
        this.palabraSecreta = palabraSecreta;
    }

    public Usuario(){

    }


    public void desbloquearUsuario(){
        this.bloqueado = false;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public PreguntasSeguridad getPreguntasSeguridad() {
        return preguntasSeguridad;
    }

    public void setPreguntasSeguridad(PreguntasSeguridad preguntasSeguridad) {
        this.preguntasSeguridad = preguntasSeguridad;
    }

    public String getPalabraSecreta() {
        return palabraSecreta;
    }

    public void setPalabraSecreta(String palabraSecreta) {
        this.palabraSecreta = palabraSecreta;
    }

    public boolean isBloqueado() {
        return bloqueado;
    }

    public void setBloqueado(boolean bloqueado) {
        this.bloqueado = true;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombreUsuario='" + nombreUsuario + '\'' +
                ", contrasena='" + contrasena + '\'' +
                ", palabraSecreta='" + palabraSecreta + '\'' +
                '}';
    }
}
