package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class App {

    // Listas para almacenar los objetos creados
    private static List<Usuario> listaUsuarios = new ArrayList<>();
    private static List<Empleado> listaEmpleados = new ArrayList<>();
    private static List<Cliente> listaClientes = new ArrayList<>();
    private static List<Vehiculo> listaVehiculos = new ArrayList<>();
    private static List<Alquiler> listaAlquileres = new ArrayList<>();
    private static List<Venta> listaVentas = new ArrayList<>();
    private static List<Administrador> listaAdministrador = new ArrayList<>();

    public static void main(String[] args) {
        
        // Crear Administrador
        Administrador administrador = new Administrador();
        administrador.setId(01);
        administrador.setNombre("Amerika");
        administrador.setApellido("Esmeralda");
        administrador.setCedula("1080678932");
        administrador.setEdad(20);
        administrador.setCorreo("admin@gmail.com");
        administrador.setTelefono("3007506643");
        administrador.setRol(Rol.ADMINISTRADOR.toString());

        Usuario adminUsuario = new Usuario();
        adminUsuario.setNombreUsuario("admin");
        adminUsuario.setContrasena("admin123");
        administrador.setUsuario(adminUsuario);
        
        listaAdministrador.add(administrador);
        listaUsuarios.add(adminUsuario);

        // Crear Empleado 1
        Empleado empleado = new Empleado();
        empleado.setId(1);
        empleado.setNombre("David");
        empleado.setApellido("Bedoya");
        empleado.setCedula("1090456789");
        empleado.setEdad(30);
        empleado.setCorreo("david@gmail.com");
        empleado.setTelefono("3017894562");
        empleado.setRol(Rol.EMPLEADO.toString());

        Usuario empleadoUsuario = new Usuario();
        empleadoUsuario.setNombreUsuario("empleado1");
        empleadoUsuario.setContrasena("empleado123");
        empleadoUsuario.setPreguntasSeguridad(PreguntasSeguridad.COLOR_FAVORITO);
        empleadoUsuario.setPalabraSecreta("Verde");
        empleado.setUsuario(empleadoUsuario);
        
        listaEmpleados.add(empleado);
        listaUsuarios.add(empleadoUsuario);

        // Crear Empleado 2
        Empleado empleado2 = new Empleado();
        empleado2.setId(2);
        empleado2.setNombre("Marcelo");
        empleado2.setApellido("Rodriguez");
        empleado2.setCedula("1095678341");
        empleado2.setEdad(22);
        empleado2.setCorreo("marcelo@gmail.com");
        empleado2.setTelefono("3143245677");
        empleado2.setRol(Rol.EMPLEADO.toString());

        Usuario empleadoUsuario2 = new Usuario();
        empleadoUsuario2.setNombreUsuario("empleado2");
        empleadoUsuario2.setContrasena("empleado321");
        empleadoUsuario2.setPreguntasSeguridad(PreguntasSeguridad.COMIDA_FAVORITA);
        empleadoUsuario2.setPalabraSecreta("Hamburguesa");
        empleado2.setUsuario(empleadoUsuario2);
        
        listaEmpleados.add(empleado2);
        listaUsuarios.add(empleadoUsuario2);

        // Crear Cliente 1
        Cliente cliente = new Cliente();
        cliente.setId(1);
        cliente.setNombre("Laura");
        cliente.setApellido("Martínez");
        cliente.setCedula("1070954321");
        cliente.setEdad(25);
        cliente.setCorreo("cliente@gmail.com");
        cliente.setTelefono("3023456789");

        Usuario clienteUsuario = new Usuario();
        clienteUsuario.setNombreUsuario("cliente1");
        clienteUsuario.setContrasena("cliente123");
        clienteUsuario.setPreguntasSeguridad(PreguntasSeguridad.DEPORTE_FAVORITO);
        clienteUsuario.setPalabraSecreta("Tenis");
        cliente.setUsuario(clienteUsuario);

        listaClientes.add(cliente);
        listaUsuarios.add(clienteUsuario);

        // Crear Cliente 2
        Cliente cliente2 = new Cliente();
        cliente2.setId(2);
        cliente2.setNombre("Steban");
        cliente2.setApellido("Martínez");
        cliente2.setCedula("1098675433");
        cliente2.setEdad(31);
        cliente2.setCorreo("steban@gmail.com");
        cliente2.setTelefono("3123456789");

        Usuario clienteUsuario2 = new Usuario();
        clienteUsuario2.setNombreUsuario("cliente2");
        clienteUsuario2.setContrasena("cliente321");
        clienteUsuario2.setPreguntasSeguridad(PreguntasSeguridad.CIUDAD_NACIMIENTO);
        clienteUsuario2.setPalabraSecreta("Armenia");
        cliente2.setUsuario(clienteUsuario2);

        listaClientes.add(cliente2);
        listaUsuarios.add(clienteUsuario2);

        // Crear vehículos
        Sedan sedan = new Sedan("Toyota", "Nuevo", "Corolla", "AMJ123", 6, 180.0, 1.8, "gasolina", true, 5, 4, 470.0, true, true, true, 6, true, true, true, true);
        listaVehiculos.add(sedan);

        Deportivo deportivo = new Deportivo("Porsche", "Nuevo", "911", "ABC987", 7, 320.0, 3.0, "Gasolina", false, 2, 2, 6, 450.0, 3.5);
        listaVehiculos.add(deportivo);

        // Crear Alquiler
        Alquiler alquiler = new Alquiler();
        alquiler.setIdAlquiler(1);
        alquiler.setPrecioPorDia(75000);
        alquiler.setCliente(cliente);
        alquiler.setEmpleado(empleado);
        alquiler.setVehiculo(sedan);
        alquiler.setFechaInicio(LocalDate.of(2024, 1, 12));
        alquiler.setFechaFin(LocalDate.of(2024, 4, 11));
        alquiler.setTotal(calcularTotalAlquiler(alquiler));

        listaAlquileres.add(alquiler);

        // Crear Venta
        Venta venta = new Venta();
        venta.setIdVenta(1);
        venta.setCliente(cliente2);
        venta.setEmpleado(empleado2);
        venta.setVehiculo(deportivo);
        venta.setFecha(LocalDate.of(2024, 2, 20));
        venta.setPrecio(250430250);

        listaVentas.add(venta);

        // Imprimir los datos para verificar
        System.out.println("Administradores: " + listaAdministrador);
        System.out.println("Empleados: " + listaEmpleados);
        System.out.println("Clientes: " + listaClientes);
        System.out.println("Vehículos: " + listaVehiculos);
        System.out.println("Alquileres: " + listaAlquileres);
        System.out.println("Ventas: " + listaVentas);
    }

    // Método para calcular el total de un alquiler (ejemplo simple)
    public static double calcularTotalAlquiler(Alquiler alquiler) {
        long dias = java.time.temporal.ChronoUnit.DAYS.between(alquiler.getFechaInicio(), alquiler.getFechaFin());
        return alquiler.getPrecioPorDia() * dias;
    }
}
