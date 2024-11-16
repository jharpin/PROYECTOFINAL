package co.edu.uniquindio.poo;

import java.util.List;

public class Administrador extends Persona {
    // Constructor
    public Administrador(String nombre, int identificacion, String direccion, String telefono) {
        super(nombre, identificacion, direccion, telefono);
    }

    // Métodos
    public void gestionarEmpleados(Empleado empleado) {
        // Lógica para gestionar empleados
    }

    public void generarReportes() {
        // Lógica para generar reportes
    }

    public void bloquearCuenta(Empleado empleado) {
        // Lógica para bloquear la cuenta de un empleado
    }
}

