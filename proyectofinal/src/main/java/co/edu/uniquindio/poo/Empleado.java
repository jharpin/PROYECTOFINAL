package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Empleado extends Persona {
    private String rol; // Rol del empleado (e.g., vendedor, gerente)
    private List<Transaccion> transaccionesRealizadas; // Registro de las transacciones del empleado

    // Constructor
    public Empleado(String nombre, int identificacion, String direccion, String telefono, String rol) {
        super(nombre, identificacion, direccion, telefono);
        this.rol = rol;
        this.transaccionesRealizadas = new ArrayList<>();
    }

    // Registrar un vehículo para venta o alquiler
    public void registrarVehiculo(Vehiculo vehiculo, String tipoRegistro) {
        if (tipoRegistro.equalsIgnoreCase("venta") || tipoRegistro.equalsIgnoreCase("alquiler")) {
            vehiculo.setTipoCombustible(tipoRegistro); // Ajustamos el tipo de registro del vehículo
            System.out.println("Vehículo registrado exitosamente para " + tipoRegistro + ".");
        } else {
            throw new IllegalArgumentException("El tipo de registro debe ser 'venta' o 'alquiler'.");
        }
    }

    // Registrar un cliente
    public void registrarCliente(Cliente cliente) {
        if (cliente != null) {
            System.out.println("Cliente registrado exitosamente: " + cliente.getNombre());
        } else {
            System.out.println("El cliente no puede ser nulo.");
        }
    }

    // Gestionar alquiler de vehículo
    public void gestionarAlquiler(Vehiculo vehiculo, Cliente cliente) {
        if (vehiculo != null && cliente != null && vehiculo.getTipoCombustible().equalsIgnoreCase("alquiler")) {
            vehiculo.setNuevo(false); // Suponemos que un vehículo alquilado no es nuevo
            registrarTransaccion("Alquiler", vehiculo, cliente);
            cliente.registrarTransaccion(new Transaccion(LocalDate.now(), this, cliente, vehiculo));
            System.out.println("Vehículo alquilado exitosamente a " + cliente.getNombre());
        } else {
            System.out.println("No se pudo realizar el alquiler. Verifique los datos.");
        }
    }

    // Gestionar venta de vehículo
    public void gestionarVenta(Vehiculo vehiculo, Cliente cliente) {
        if (vehiculo != null && cliente != null && vehiculo.getTipoCombustible().equalsIgnoreCase("venta")) {
            vehiculo.setNuevo(false); // Suponemos que un vehículo vendido no es nuevo
            registrarTransaccion("Venta", vehiculo, cliente);
            cliente.registrarTransaccion(new Transaccion(LocalDate.now(), this, cliente, vehiculo));
            System.out.println("Vehículo vendido exitosamente a " + cliente.getNombre());
        } else {
            System.out.println("No se pudo realizar la venta. Verifique los datos.");
        }
    }

    // Gestionar compra de vehículo de un cliente
    public void gestionarCompra(Vehiculo vehiculo, Cliente cliente) {
        if (vehiculo != null && cliente != null && vehiculo.revisionTecnica()) {
            registrarTransaccion("Compra", vehiculo, cliente);
            cliente.registrarTransaccion(new Transaccion(LocalDate.now(), this, cliente, vehiculo));
            System.out.println("Vehículo comprado exitosamente a " + cliente.getNombre());
        } else {
            System.out.println("No se pudo realizar la compra. Verifique los datos o la revisión técnica.");
        }
    }

    // Registrar una transacción
    private void registrarTransaccion(String tipo, Vehiculo vehiculo, Cliente cliente) {
        Transaccion transaccion = new Transaccion(LocalDate.now(), this, cliente, vehiculo);
        transaccionesRealizadas.add(transaccion);
        System.out.println("Transacción registrada: " + tipo + " - " + vehiculo.getMarca());
    }

    // Getters y setters
    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public List<Transaccion> getTransaccionesRealizadas() {
        return transaccionesRealizadas;
    }

    public void setTransaccionesRealizadas(List<Transaccion> transaccionesRealizadas) {
        this.transaccionesRealizadas = transaccionesRealizadas;
    }

    @Override
    public String toString() {
        return "Empleado [rol=" + rol + ", transaccionesRealizadas=" + transaccionesRealizadas.size() + "]";
    }
}