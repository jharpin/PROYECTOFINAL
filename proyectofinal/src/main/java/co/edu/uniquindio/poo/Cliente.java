package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Persona {
    private String email;
    private List<Transaccion> historialDeTransacciones;

    // Constructor
    public Cliente(String nombre, int identificacion, String direccion, String telefono, String email) {
        super(nombre, identificacion, direccion, telefono);
        this.email = email;
        this.historialDeTransacciones = new ArrayList<>();
    }

    // Métodos
    public void registrarTransaccion(Transaccion transaccion) {
        historialDeTransacciones.add(transaccion);
    }

    // Getters y setters
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Transaccion> getHistorialDeTransacciones() {
        return historialDeTransacciones;
    }

    public void setHistorialDeTransacciones(List<Transaccion> historialDeTransacciones) {
        this.historialDeTransacciones = historialDeTransacciones;
    }
}
