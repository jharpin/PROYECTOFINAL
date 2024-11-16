package co.edu.uniquindio.poo;

public class Compra extends Transaccion {
    // Constructor que llama al constructor de la clase base (Transaccion)
    public Compra(LocalDate fecha, Empleado empleado, Cliente cliente, Vehiculo vehiculo) {
        super(fecha, empleado, cliente, vehiculo);
    }
}
