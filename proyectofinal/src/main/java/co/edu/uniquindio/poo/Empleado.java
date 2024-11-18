package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Empleado extends Persona{

    public Empleado() {
        super();
    }

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
