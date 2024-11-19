package co.edu.uniquindio.proyecto_final.tucarro.model;

public class Cliente extends Persona{

    public Cliente(){
        super();
    }

    public Cliente(int id, String nombre, String apellido, String cedula, int edad, String correo, String telefono, String rol,Usuario usuario) {
        super(id, nombre, apellido, cedula, edad, correo, telefono, rol,usuario);

    }
}
