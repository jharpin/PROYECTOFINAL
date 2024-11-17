package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Empresa empresa=new Empresa("tu carro");

                Empleado empleado = new Empleado("Juan Pérez", 12345, "Calle Falsa 123", "123456789", "Vendedor");
                Cliente cliente = new Cliente("Ana López", 67890, "Avenida Real 456", "987654321", "ana@email.com");
                Vehiculo vehiculo = new Vehiculo("Toyota", 2022, true, "Automática", "venta") {
                    @Override
                    public boolean revisionTecnica() {
                        return true; // Implementación de revisión técnica para vehículos concretos
                    }
                };
        
                // Registrar un vehículo para venta
                empleado.registrarVehiculo(vehiculo, "venta");
        
                // Registrar un cliente
                empleado.registrarCliente(cliente);
        
                // Gestionar la venta del vehículo al cliente
                empleado.gestionarVenta(vehiculo, cliente);
        
                // Mostrar transacciones realizadas
                System.out.println(empleado);
            }
        }
