package co.edu.uniquindio.poo.model;

public class Empleado extends Persona{

    public Empleado(){
        super();
    }

    public Empleado(int id, String nombre, String apellido, String cedula, int edad, String correo, String telefono, String rol, Usuario usuario) {
        super(id, nombre, apellido, cedula, edad, correo, telefono, rol, usuario);
    }
}
