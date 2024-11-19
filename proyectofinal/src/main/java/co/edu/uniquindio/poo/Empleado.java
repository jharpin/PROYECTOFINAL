package co.edu.uniquindio.poo;

import java.time.LocalDate;

/**
 * Clase que representa a un empleado, que hereda de la clase {@link Persona}.
 * La clase Empleado agrega la funcionalidad de representar a un individuo que tiene
 * un rol específico dentro de la empresa, y su relación con un {@link Usuario}.
 */
public class Empleado extends Persona {

    /**
     * Constructor por defecto de la clase Empleado.
     * Inicializa una instancia de empleado sin valores predefinidos.
     */
    public Empleado() {
        super();
    }

    /**
     * Constructor que inicializa un empleado con los valores proporcionados.
     * 
     * @param id ID del empleado.
     * @param nombre Nombre del empleado.
     * @param apellido Apellido del empleado.
     * @param cedula Cédula del empleado.
     * @param edad Edad del empleado.
     * @param correo Correo electrónico del empleado.
     * @param telefono Número de teléfono del empleado.
     * @param rol Rol del empleado dentro de la empresa.
     * @param usuario Objeto de la clase {@link Usuario} que representa al usuario
     *                asociado al empleado.
     */
    public Empleado(int id, String nombre, String apellido, String cedula, int edad, String correo, String telefono, String rol, Usuario usuario) {
        super(id, nombre, apellido, cedula, edad, correo, telefono, rol, usuario);
    }
    // Método para registrar un vehículo (venta o alquiler)
    public void registrarVehiculo(Empresa empresa, Vehiculo vehiculo) {
        empresa.getListaVehiculos().add(vehiculo);
        System.out.println("Vehículo registrado por " + this.getNombre() + ": " + vehiculo);
    }

    // Método para registrar un cliente
    public void registrarCliente(Empresa empresa, Cliente cliente) {
        empresa.getListaClientes().add(cliente);
        System.out.println("Cliente registrado por " + this.getNombre() + ": " + cliente);
    }

    // Método para realizar un alquiler
    public void realizarAlquiler(Empresa empresa, Cliente cliente, Vehiculo vehiculo, LocalDate inicio, LocalDate fin, double precioPorDia) {
        double total = Alquiler.calcularTotalAlquiler(precioPorDia, inicio, fin);
        Alquiler alquiler = new Alquiler(empresa.getListaAlquileres().size() + 1, vehiculo, cliente, this, precioPorDia, inicio, fin, total);
        empresa.getListaAlquileres().add(alquiler);
        System.out.println("Alquiler realizado por " + this.getNombre() + ": " + alquiler);
    }

    // Método para registrar una venta
    public void registrarVenta(Empresa empresa, Cliente cliente, Vehiculo vehiculo, double precio) {
        Venta venta = new Venta(empresa.getListaVentas().size() + 1, vehiculo, cliente, this, precio, LocalDate.now());
        empresa.getListaVentas().add(venta);
        System.out.println("Venta realizada por " + this.getNombre() + ": " + venta);
    }

    // Método para comprar un vehículo
    public void comprarVehiculo(Empresa empresa, Cliente cliente, Vehiculo vehiculo) {
        if (vehiculo.isRevisionTecnicaAprobada()) {
            empresa.getListaVehiculos().add(vehiculo);
            System.out.println("Compra registrada por " + this.getNombre() + ": " + vehiculo);
        } else {
            System.out.println("El vehículo no pasó la revisión técnica y no se puede comprar.");
        }
    }











}
