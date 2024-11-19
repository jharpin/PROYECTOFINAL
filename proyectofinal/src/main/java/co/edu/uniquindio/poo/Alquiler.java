package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * La clase <code>Alquiler</code> representa un alquiler de vehículo realizado por un cliente
 * a través de un empleado en el sistema.
 * Esta clase almacena la información relacionada con el alquiler, como el vehículo alquilado,
 * el cliente que lo alquila, el empleado que gestiona la transacción, el precio por día,
 * las fechas de inicio y fin del alquiler, y el total calculado.
 * 
 * @author [Tu nombre]
 */
public class Alquiler {

    private int idAlquiler;
    private Vehiculo vehiculo;
    private Cliente cliente;
    private Empleado empleado;
    private double precioPorDia;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private double total;

    /**
     * Constructor por defecto de la clase <code>Alquiler</code>.
     * Inicializa un alquiler con valores predeterminados.
     */
    public Alquiler() {
    }

    /**
     * Constructor de la clase <code>Alquiler</code> que recibe los parámetros necesarios
     * para inicializar un alquiler con información específica.
     * 
     * @param idAlquiler El ID único del alquiler.
     * @param vehiculo El vehículo que se alquila.
     * @param cliente El cliente que alquila el vehículo.
     * @param empleado El empleado que gestiona el alquiler.
     * @param precioPorDia El precio de alquiler por día.
     * @param fechaInicio La fecha de inicio del alquiler.
     * @param fechaFin La fecha de fin del alquiler.
     * @param total El total calculado del alquiler.
     */
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

    // Métodos getter y setter
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

    /**
     * Calcula el total del alquiler en función del precio por día y las fechas de inicio y fin.
     * 
     * @param precioPorDia El precio de alquiler por día.
     * @param inicio La fecha de inicio del alquiler.
     * @param fin La fecha de fin del alquiler.
     * @return El total del alquiler calculado.
     */
    public static double calcularTotalAlquiler(double precioPorDia, LocalDate inicio, LocalDate fin) {
        long dias = ChronoUnit.DAYS.between(inicio, fin);
        return precioPorDia * dias;
    }

    /**
     * Devuelve una representación en forma de cadena del objeto <code>Alquiler</code>.
     * 
     * @return Una cadena con los detalles del alquiler.
     */
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
