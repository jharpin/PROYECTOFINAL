package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Transaccion {
    private LocalDate fecha;
    private Empleado empleado;
    private Cliente cliente;
    private Vehiculo vehiculo;

    // Constructor
    public Transaccion(LocalDate fecha, Empleado empleado, Cliente cliente, Vehiculo vehiculo) {
        this.fecha = fecha;
        this.empleado = empleado;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
    }

    // Métodos getters y setters
    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public String toString() {
        return "Transaccion [fecha=" + fecha + ", empleado=" + empleado + ", cliente=" + cliente + ", vehiculo="
                + vehiculo + "]";
    }

    
}

