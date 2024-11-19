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
        gestionarAlquiler(empresa);
        registrarVenta(empresa);
    }

    private static void inicializarDatos(Empresa empresa) {
        // Crear administrador
        Administrador administrador = new Administrador(1, "Amerika", "Esmeralda", "1080678932", 20, "admin@gmail.com", "3007506643", Rol.ADMINISTRADOR.toString(),
                new Usuario("admin", "admin123", "CHISPAS", PreguntasSeguridad.CUALESTUPIRMERAMASCOTA));
        empresa.getListaAdministrador().add(administrador);
        empresa.getListaUsuarios().add(administrador.getUsuario());

        // Crear empleados
        Empleado empleado1 = new Empleado(1, "David", "Bedoya", "1090456789", 30, "david@gmail.com", "3017894562", Rol.EMPLEADO.toString(),
                new Usuario("empleado1", "empleado123", "CALCULO", PreguntasSeguridad.MATERIAFAVORITA));
        empresa.getListaEmpleados().add(empleado1);
        empresa.getListaUsuarios().add(empleado1.getUsuario());

        Empleado empleado2 = new Empleado(2, "JEAN", "GALVEZ", "1095678341", 22, "marcelo@gmail.com", "3143245677", Rol.EMPLEADO.toString(),
                new Usuario("empleado2", "empleado321", "CORRER ", PreguntasSeguridad.ACTIVIDADPREFERIDA));
        empresa.getListaEmpleados().add(empleado2);
        empresa.getListaUsuarios().add(empleado2.getUsuario());

        // Crear clientes
        Cliente cliente1 = new Cliente(1, "FALSO", "CHAVEZ", "1070954321", 25, "cliente@gmail.com", "3023456789", Rol.CLIENTE.toString(),
                new Usuario("cliente1", "cliente123", "GUA GUAU", PreguntasSeguridad.ANIMALFAVORITO));
        empresa.getListaClientes().add(cliente1);
        empresa.getListaUsuarios().add(cliente1.getUsuario());

        Cliente cliente2 = new Cliente(2, "JUAN ", "PEREZ", "109867653", 31, "steban@gmail.com", "3123456789", Rol.CLIENTE.toString(),
                new Usuario("cliente2", "cliente321", " KIN KONG", PreguntasSeguridad.ANIMALFAVORITO));
        empresa.getListaClientes().add(cliente2);
        empresa.getListaUsuarios().add(cliente2.getUsuario());

        // Crear vehículos
        Sedan sedan = new Sedan("Toyota", "Nuevo", "Corolla", "AMJ123", 6, 180.0, 1.8, "gasolina", true, 5, 4, 470.0, true, true, true, 6, true, true, true, true);
        empresa.getListaVehiculos().add(sedan);

        Deportivo deportivo = new Deportivo("Porsche", "Nuevo", "911", "ABC987", 7, 320.0, 3.0, "Gasolina", false, 2, 2, 6, 450.0, 3.5);
        empresa.getListaVehiculos().add(deportivo);

        // Crear alquiler
        Alquiler alquiler = new Alquiler(1, sedan, cliente1, empleado1, 75000, LocalDate.of(2024, 1, 12), LocalDate.of(2024, 4, 11),
                Alquiler.calcularTotalAlquiler(75000, LocalDate.of(2024, 1, 12), LocalDate.of(2024, 4, 11)));
        empresa.getListaAlquileres().add(alquiler);

        // Crear venta
        Venta venta = new Venta(1, deportivo, cliente2, empleado2, 250430250, LocalDate.of(2024, 2, 20));
        empresa.getListaVentas().add(venta);
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
            // Bloquear usuario
            empresa.bloquearUsuario(nombreUsuario);
            System.out.println("Usuario bloqueado: " + nombreUsuario);

            // Desbloquear usuario
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

    private static void gestionarAlquiler(Empresa empresa) {
        try {
            Cliente cliente = empresa.getListaClientes().get(0);
            Empleado empleado = empresa.getListaEmpleados().get(0);
            Vehiculo vehiculo = empresa.getListaVehiculos().get(0);

            Alquiler alquiler = new Alquiler(2, vehiculo, cliente, empleado, 80000,
                    LocalDate.of(2024, 6, 1), LocalDate.of(2024, 6, 10),
                    Alquiler.calcularTotalAlquiler(80000, LocalDate.of(2024, 6, 1), LocalDate.of(2024, 6, 10)));

            empresa.getListaAlquileres().add(alquiler);
            System.out.println("Nuevo alquiler registrado: " + alquiler);

        } catch (Exception e) {
            System.out.println("Error al gestionar alquiler: " + e.getMessage());
        }
    }

    private static void registrarVenta(Empresa empresa) {
        try {
            Cliente cliente = empresa.getListaClientes().get(1);
            Empleado empleado = empresa.getListaEmpleados().get(1);
            Vehiculo vehiculo = empresa.getListaVehiculos().get(1);

            Venta venta = new Venta(2, vehiculo, cliente, empleado, 350000000, LocalDate.of(2024, 7, 15));
            empresa.getListaVentas().add(venta);
            System.out.println("Nueva venta registrada: " + venta);

        } catch (Exception e) {
            System.out.println("Error al registrar venta: " + e.getMessage());
        }
    }
}