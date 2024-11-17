package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class Empleado extends Persona {
    private String rol;
    private List<Transaccion> transaccionesRealizadas;
   

    // Constructor
    public Empleado(String nombre, int identificacion, String direccion, String telefono, String rol) {
        super(nombre, identificacion, direccion, telefono);
        this.rol = rol;
        this.transaccionesRealizadas = new ArrayList<>();
        
    }

    // Métodos
    public void registrarVehiculo(Vehiculo vehiculo) {
        // Lógica para registrar un vehículo
    }

    public void registrarCliente(Cliente cliente) {
        // Lógica para registrar un cliente
    }

    public void gestionarCompra(Vehiculo vehiculo, Cliente cliente) {
        // Lógica para gestionar compra de un vehículo
    }

    public void gestionarVenta(Vehiculo vehiculo, Cliente cliente) {
        // Lógica para gestionar venta de un vehículo
    }

    public void gestionarAlquiler(Vehiculo vehiculo, Cliente cliente) {
        // Lógica para gestionar alquiler de un vehículo
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
        return "Empleado [rol=" + rol + ", transaccionesRealizadas=" + transaccionesRealizadas 
                + "]";
    }
    
}
