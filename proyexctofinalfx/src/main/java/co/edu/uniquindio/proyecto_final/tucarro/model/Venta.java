package co.edu.uniquindio.proyecto_final.tucarro.model;

import java.time.LocalDate;

public class Venta {

    private int idVenta;
    private Vehiculo vehiculo;
    private Cliente cliente;
    private Empleado empleado;
    private double precio;
    private LocalDate fecha;

    public Venta(){

    }
    public Venta(int idVenta, Vehiculo vehiculo, Cliente cliente, Empleado empleado, double precio, LocalDate fecha) {
        this.idVenta = idVenta;
        this.vehiculo = vehiculo;
        this.cliente = cliente;
        this.empleado = empleado;
        this.precio = precio;
        this.fecha = fecha;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Venta{" +
                "idVenta=" + idVenta +
                "vehiculo=" + vehiculo +
                ", cliente=" + cliente +
                ", empleado=" + empleado +
                ", precio=" + precio +
                ", fecha=" + fecha +
                '}';
    }
}
