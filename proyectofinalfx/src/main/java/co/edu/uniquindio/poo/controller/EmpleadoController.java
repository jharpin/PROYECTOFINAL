package co.edu.uniquindio.poo.controller;

import co.edu.uniquindio.poo.model.Empleado;
import co.edu.uniquindio.poo.model.Empresa;

public class EmpleadoController {
    private final Empresa empresa;

    public EmpleadoController() {
        empresa = Empresa.getInstancia();
    }

    public Boolean verificarEmpleado(String cedula) {
        return empresa.verificarEmpleado(cedula);
    }

    public Boolean agregarEmpleado(Empleado empleado) {
        return empresa.agregarEmpleado(empleado);
    }

    public Boolean actualizarEmpleado(Empleado empleadoActualizado) {
        return empresa.actualizarEmpleado(empleadoActualizado);
    }

    public Boolean eliminarEmpleado(String cedula) {
        return empresa.eliminarEmpleado(cedula);
    }

    public Empleado obtenerEmpleado(String cedula) {
        return empresa.obtenerEmpleado(cedula);
    }
}
