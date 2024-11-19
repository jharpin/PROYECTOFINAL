package co.edu.uniquindio.poo;

import java.time.LocalDate;

/**
 * Clase que representa una venta de vehículo.
 * La clase `Venta` contiene los detalles asociados a una transacción de venta,
 * como el ID de la venta, el vehículo vendido, el cliente que realiza la compra,
 * el empleado que gestiona la venta, el precio de la venta y la fecha en que se realizó.
 */
public class Venta {

    // Atributos de la clase Venta
    private int idVenta;            // Identificador único para la venta
    private Vehiculo vehiculo;      // Vehículo que se está vendiendo
    private Cliente cliente;        // Cliente que realiza la compra
    private Empleado empleado;      // Empleado que gestiona la venta
    private double precio;          // Precio de la venta
    private LocalDate fecha;        // Fecha en que se realizó la venta

    /**
     * Constructor por defecto que inicializa una instancia de `Venta` sin valores.
     * Este constructor es útil para crear objetos de `Venta` y luego asignar valores a sus atributos.
     */
    public Venta() {

    }

    /**
     * Constructor que inicializa todos los atributos de la clase `Venta`.
     *
     * @param idVenta   Identificador único de la venta
     * @param vehiculo  Vehículo que se está vendiendo
     * @param cliente   Cliente que realiza la compra
     * @param empleado  Empleado que gestiona la venta
     * @param precio    Precio de la venta
     * @param fecha     Fecha en que se realizó la venta
     */
    public Venta(int idVenta, Vehiculo vehiculo, Cliente cliente, Empleado empleado, double precio, LocalDate fecha) {
        this.idVenta = idVenta;
        this.vehiculo = vehiculo;
        this.cliente = cliente;
        this.empleado = empleado;
        this.precio = precio;
        this.fecha = fecha;
    }

    // Métodos Getter y Setter para acceder y modificar los atributos

    /**
     * Obtiene el identificador único de la venta.
     *
     * @return El ID de la venta.
     */
    public int getIdVenta() {
        return idVenta;
    }

    /**
     * Establece el identificador único de la venta.
     *
     * @param idVenta El ID de la venta.
     */
    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    /**
     * Obtiene el vehículo que se está vendiendo.
     *
     * @return El vehículo que se está vendiendo.
     */
    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    /**
     * Establece el vehículo que se está vendiendo.
     *
     * @param vehiculo El vehículo que se está vendiendo.
     */
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    /**
     * Obtiene el cliente que realiza la compra.
     *
     * @return El cliente que realiza la compra.
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Establece el cliente que realiza la compra.
     *
     * @param cliente El cliente que realiza la compra.
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * Obtiene el empleado que gestiona la venta.
     *
     * @return El empleado que gestiona la venta.
     */
    public Empleado getEmpleado() {
        return empleado;
    }

    /**
     * Establece el empleado que gestiona la venta.
     *
     * @param empleado El empleado que gestiona la venta.
     */
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    /**
     * Obtiene el precio de la venta.
     *
     * @return El precio de la venta.
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Establece el precio de la venta.
     *
     * @param precio El precio de la venta.
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Obtiene la fecha en que se realizó la venta.
     *
     * @return La fecha de la venta.
     */
    public LocalDate getFecha() {
        return fecha;
    }

    /**
     * Establece la fecha en que se realizó la venta.
     *
     * @param fecha La fecha de la venta.
     */
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    /**
     * Método `toString` que devuelve una representación en texto de la venta.
     * Este método proporciona una vista amigable para visualizar los detalles de la venta.
     *
     * @return Una cadena que representa todos los atributos de la venta.
     */
    @Override
    public String toString() {
        return "Venta {" +
                "ID Venta=" + idVenta +
                ", Vehículo=" + vehiculo +
                ", Cliente=" + cliente.getNombre() + " " + cliente.getApellido() +
                ", Empleado=" + empleado.getNombre() + " " + empleado.getApellido() +
                ", Precio=" + precio +
                ", Fecha=" + fecha +
                '}';  // Retorna una cadena con los atributos de la venta
    }
}
