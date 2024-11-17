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
    public boolean agregarCliente(Cliente cliente) {
        if (!clientes.contains(cliente)) { // Verifica que no esté en la lista
            clientes.add(cliente);
            return true; // Cliente agregado exitosamente
        }
        return false; // Cliente ya existe
    }

    public boolean agregarEmpleado(Empleado empleado) {
        if (!empleados.contains(empleado)) { // Verifica que no esté en la lista
            empleados.add(empleado);
            return true; // Empleado agregado exitosamente
        }
        return false; // Empleado ya existe
    }
    public boolean agregarAdministrador(Empleado administrador) {
        if (!empleados.contains(administrador)) { // Verifica que no esté en la lista
            empleados.add(administrador);
            return true; // Administrador agregado exitosamente
        }
        return false; // Administrador ya existe
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

    @Override
    public String toString() {
        return "Empresa [nombre=" + nombre + ", clientes=" + clientes + ", empleados=" + empleados + ", vehiculos="
                + vehiculos + ", transacciones=" + transacciones + "]";
    }

    
}


