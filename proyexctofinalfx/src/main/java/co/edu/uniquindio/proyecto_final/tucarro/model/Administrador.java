package co.edu.uniquindio.proyecto_final.tucarro.model;

public class Administrador extends Persona{

    public Administrador() {
        super();
    }

    public Administrador(int id, String nombre, String apellido, String cedula, int edad, String correo, String telefono, String rol, Usuario usuario) {
        super(id, nombre, apellido, cedula, edad, correo, telefono, rol, usuario);

    }

}
