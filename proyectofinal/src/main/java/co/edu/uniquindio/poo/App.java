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
                Vehiculo vehiculo = new Sedan("marquillos", 2090, false,Transmision.AUTOMATICA, TipoCombustible.ELECTRICO, 2, 2, 2, false, false, false, 3, false, false, false, false)

        
                Vehiculo vehiculo2 = new Moto("yamaha", 2021, false, , , 0, 0, null){
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
