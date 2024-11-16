package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nombre;
    private List<Cliente> clientes;
    private List<Empleado> empleados;
    private List<Vehiculo> vehiculos;
    private List<Transaccion> transacciones;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.clientes = new ArrayList<>();
        this.empleados = new ArrayList<>();
        this.vehiculos = new ArrayList<>();
        this.transacciones = new ArrayList<>();
    }

    // Métodos para agregar elementos
    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    public void agregarTransaccion(Transaccion transaccion) {
        transacciones.add(transaccion);
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public List<Transaccion> getTransacciones() {
        return transacciones;
    }
}


