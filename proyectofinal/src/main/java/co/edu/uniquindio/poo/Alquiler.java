package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Alquiler {

    private int idAlquiler;
    private Vehiculo vehiculo;
    private Cliente cliente;
    private Empleado empleado;
    private double precioPorDia;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private double total;

    public Alquiler() {
    }

    public Alquiler(int idAlquiler, Vehiculo vehiculo, Cliente cliente, Empleado empleado, double precioPorDia, LocalDate fechaInicio, LocalDate fechaFin, Double total) {
        this.idAlquiler = idAlquiler;
        this.vehiculo = vehiculo;
        this.cliente = cliente;
        this.empleado = empleado;
        this.precioPorDia = precioPorDia;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.total = total;
    }

    public int getIdAlquiler() {
        return idAlquiler;
    }

    public void setIdAlquiler(int idAlquiler) {
        this.idAlquiler = idAlquiler;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
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

    public double getPrecioPorDia() {
        return precioPorDia;
    }

    public void setPrecioPorDia(double precioPorDia) {
        this.precioPorDia = precioPorDia;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public static double calcularTotalAlquiler(double precioPorDia, LocalDate inicio, LocalDate fin) {
        long dias = ChronoUnit.DAYS.between(inicio, fin);
        return precioPorDia * dias;
    }


    @Override
public String toString() {
    return "Alquiler {" +
            "ID Alquiler=" + idAlquiler +
            ", Vehículo=" + vehiculo +
            ", Cliente=" + cliente.getNombre() + " " + cliente.getApellido() +
            ", Empleado=" + empleado.getNombre() + " " + empleado.getApellido() +
            ", Precio por Día=" + precioPorDia +
            ", Fecha Inicio=" + fechaInicio +
            ", Fecha Fin=" + fechaFin +
            ", Total=" + total +
            '}';
}
}
