package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {
        Empresa empresa = Empresa.getInstancia();

        // Inicializar datos iniciales
        inicializarDatos(empresa);

        // Mostrar datos iniciales
        System.out.println("=== Datos Iniciales ===");
        mostrarDatos(empresa);

        // Funcionalidades avanzadas
        System.out.println("\n=== Funciones ===");
        bloquearDesbloquearUsuario(empresa, "empleado1");
        recuperarContrasena(empresa, "empleado2", "Hamburguesa");
        realizarFuncionesEmpleado(empresa);
    }

    private static void inicializarDatos(Empresa empresa) {
        // Crear administrador
        Administrador administrador = new Administrador(1, "Amerika", "Esmeralda", "1080678932", 20, "admin@gmail.com", "3007506643", Rol.ADMINISTRADOR.toString(),
                new Usuario("admin", "admin123", "esmeralda", PreguntasSeguridad.CIUDAD_NACIMIENTO));
        empresa.getListaAdministrador().add(administrador);
        empresa.getListaUsuarios().add(administrador.getUsuario());

        // Crear empleados
        Empleado empleado1 = new Empleado(1, "David", "Bedoya", "1090456789", 30, "david@gmail.com", "3017894562", Rol.EMPLEADO.toString(),
                new Usuario("empleado1", "empleado123", "Verde", PreguntasSeguridad.COLOR_FAVORITO));
        empresa.getListaEmpleados().add(empleado1);
        empresa.getListaUsuarios().add(empleado1.getUsuario());

        Empleado empleado2 = new Empleado(2, "Marcelo", "Rodriguez", "1095678341", 22, "marcelo@gmail.com", "3143245677", Rol.EMPLEADO.toString(),
                new Usuario("empleado2", "empleado321", "Hamburguesa", PreguntasSeguridad.COMIDA_FAVORITA));
        empresa.getListaEmpleados().add(empleado2);
        empresa.getListaUsuarios().add(empleado2.getUsuario());

        // Crear clientes
        Cliente cliente1 = new Cliente(1, "Laura", "Martínez", "1070954321", 25, "cliente@gmail.com", "3023456789", Rol.CLIENTE.toString(),
                new Usuario("cliente1", "cliente123", "Tenis", PreguntasSeguridad.DEPORTE_FAVORITO));
        empresa.getListaClientes().add(cliente1);
        empresa.getListaUsuarios().add(cliente1.getUsuario());

        Cliente cliente2 = new Cliente(2, "Steban", "Martínez", "1098675433", 31, "steban@gmail.com", "3123456789", Rol.CLIENTE.toString(),
                new Usuario("cliente2", "cliente321", "Armenia", PreguntasSeguridad.CIUDAD_NACIMIENTO));
        empresa.getListaClientes().add(cliente2);
        empresa.getListaUsuarios().add(cliente2.getUsuario());

        // Crear vehículos
        Sedan sedan = new Sedan("Toyota", "Nuevo", "Corolla", "AMJ123", 6, 180.0, 1.8, "gasolina", true, 5, 4, 470.0, true, true, true, 6, true, true, true, true);
        empresa.getListaVehiculos().add(sedan);

        Deportivo deportivo = new Deportivo("Porsche", "Nuevo", "911", "ABC987", 7, 320.0, 3.0, "Gasolina", false, 2, 2, 6, 450.0, 3.5);
        empresa.getListaVehiculos().add(deportivo);
    }

    private static void mostrarDatos(Empresa empresa) {
        System.out.println("Administradores: " + empresa.getListaAdministrador());
        System.out.println("Empleados: " + empresa.getListaEmpleados());
        System.out.println("Clientes: " + empresa.getListaClientes());
        System.out.println("Vehículos: " + empresa.getListaVehiculos());
        System.out.println("Alquileres: " + empresa.getListaAlquileres());
        System.out.println("Ventas: " + empresa.getListaVentas());
    }

    private static void bloquearDesbloquearUsuario(Empresa empresa, String nombreUsuario) {
        try {
            empresa.bloquearUsuario(nombreUsuario);
            System.out.println("Usuario bloqueado: " + nombreUsuario);

            empresa.desbloquearUsuario(nombreUsuario);
            System.out.println("Usuario desbloqueado: " + nombreUsuario);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void recuperarContrasena(Empresa empresa, String nombreUsuario, String palabraSecreta) {
        try {
            String contrasena = empresa.recuperarContrasena(nombreUsuario, palabraSecreta);
            System.out.println("Contraseña recuperada para " + nombreUsuario + ": " + contrasena);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void realizarFuncionesEmpleado(Empresa empresa) {
        Empleado empleado1 = empresa.getListaEmpleados().get(0); // David
        Empleado empleado2 = empresa.getListaEmpleados().get(1); // Marcelo

        // Registrar un vehículo
        Vehiculo nuevoVehiculo = new Sedan("Nissan", "Usado", "Sentra", "XYZ456", 6, 200.0, 2.0, "Gasolina", true, 5, 4, 500.0, true, true, true, 6, true, true, true, true);
        empleado1.registrarVehiculo(empresa, nuevoVehiculo);

        // Registrar un cliente
        Cliente nuevoCliente = new Cliente(3, "Camila", "Lopez", "1080456789", 28, "camila@gmail.com", "3124567890", Rol.CLIENTE.toString(),
                new Usuario("cliente3", "camila123", "Perro", PreguntasSeguridad.COLOR_FAVORITO ));
        empleado1.registrarCliente(empresa, nuevoCliente);

        // Realizar un alquiler
        Cliente cliente1 = empresa.getListaClientes().get(0); // Laura
        Vehiculo vehiculoAlquiler = empresa.getListaVehiculos().get(0); // Toyota Corolla
        empleado1.realizarAlquiler(empresa, cliente1, vehiculoAlquiler, LocalDate.of(2024, 6, 1), LocalDate.of(2024, 6, 10), 80000);

        // Registrar una venta
        Cliente cliente2 = empresa.getListaClientes().get(1); // Steban
        Vehiculo vehiculoVenta = empresa.getListaVehiculos().get(1); // Porsche 911
        empleado2.registrarVenta(empresa, cliente2, vehiculoVenta, 350000000);

        // Comprar un vehículo
        Vehiculo vehiculoCompra = new Sedan("Mazda", "Usado", "Mazda 3", "LMN123", 7, 220.0, 1.8, "Gasolina", true, 5, 4, 450.0, true, true, true, 6, true, true, true, true);
        empleado2.comprarVehiculo(empresa, cliente2, vehiculoCompra);
    }
}