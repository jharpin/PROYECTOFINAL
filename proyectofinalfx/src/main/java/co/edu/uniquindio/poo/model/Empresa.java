package co.edu.uniquindio.poo.model;
import co.edu.uniquindio.poo.model.Enum.PreguntasSeguridad;
import co.edu.uniquindio.poo.model.Enum.Rol;

import java.time.LocalDate;
import java.util.ArrayList;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class Empresa {

    private List<Administrador> listaAdministrador = new ArrayList<>();
    private List<Empleado> listaEmpleados = new ArrayList<>();
    private List<Usuario> listaUsuarios = new ArrayList<>();
    private List<Cliente> listaClientes = new ArrayList<>();
    private List<Vehiculo> listaVehiculos = new ArrayList<>();
    private List<Reportes> listaReportes = new ArrayList<>();
    private List<Venta> listaVentas = new ArrayList<>();
    private List<Alquiler> listaAlquileres = new ArrayList<>();
    private static Empresa instancia;

    public Empresa(){
        datosPrueba();
    }

    public static Empresa getInstancia() {
        if (instancia == null) {
            instancia = new Empresa();
        }
        return instancia;
    }

    public Usuario obtenerUsuario(String palabraSecreta){
        for (Empleado empleado : getListaEmpleados()) {
            if (empleado.getUsuario().getPalabraSecreta().equalsIgnoreCase(palabraSecreta)) {
                return empleado.getUsuario();
            }
        }
        return null;
    }

    public Empleado obtenerEmpleado(String cedula) {
        Empleado empleado = null;
        for(Empleado empleado1 : listaEmpleados) {
            if(empleado1.getCedula().equals(cedula)) {
                empleado = empleado1;
                break;
            }
        }
        return empleado;
    }

    public Boolean verificarEmpleado(String cedula) {
        for (Empleado empleado : listaEmpleados) {
            if (empleado.getCedula().equals(cedula)) {
                return true;
            }
        }
        return false;
    }

    public Empleado validarEmpleado(String nombreUsuario, String contrasena){
        for (Empleado empleado : listaEmpleados) {
            if (empleado.getUsuario().getNombreUsuario().equals(nombreUsuario) && empleado.getUsuario().getContrasena().equals(contrasena)) {
                return empleado;
            }
        }
        return null;
    }

    public Boolean agregarEmpleado(Empleado empleado) {
        if (!verificarEmpleado(empleado.getCedula())) {
            listaEmpleados.add(empleado);
            return true;
        }
        return false;
    }

    public Boolean actualizarEmpleado(Empleado empleadoActualizado) {
        for (Empleado empleadoExistente : listaEmpleados) {
            if (empleadoExistente.getCedula().equals(empleadoActualizado.getCedula())) {
                empleadoExistente.setNombre(empleadoActualizado.getNombre());
                empleadoExistente.setApellido(empleadoActualizado.getApellido());
                empleadoExistente.setEdad(empleadoActualizado.getEdad());
                empleadoExistente.setCorreo(empleadoActualizado.getCorreo());
                empleadoExistente.setTelefono(empleadoActualizado.getTelefono());
                empleadoExistente.setUsuario(empleadoActualizado.getUsuario());
                return true;
            }
        }
        return false;
    }

    public Boolean eliminarEmpleado(String cedula) {
        Empleado empleado = obtenerEmpleado(cedula);
        if(empleado != null) {
            listaEmpleados.remove(empleado);
            return true;
        }
        return false;
    }

    public double calcularTotalVentas() {
        double total = 0;
        for (Venta venta : listaVentas) {
            total += venta.getPrecio();
        }
        return total;
    }

    public int contarVehiculosVendidos() {
        return listaVentas.size();
    }

    public double calcularTotalAlquiler(Alquiler alquiler) {
        long diasAlquiler = ChronoUnit.DAYS.between(alquiler.getFechaInicio(), alquiler.getFechaFin());
        return diasAlquiler * alquiler.getPrecioPorDia();
    }















    public void datosPrueba() {
        Administrador administrador = new Administrador();
        administrador.setId(01);
        administrador.setNombre("Amerika");
        administrador.setApellido("Esmeralda");
        administrador.setCedula("1080678932");
        administrador.setEdad(20);
        administrador.setCorreo("admin@gmail.com");
        administrador.setTelefono("3007506643");
        administrador.setRol(Rol.ADMINISTRADOR.toString());
        listaAdministrador.add(administrador);
        Usuario adminUsuario = new Usuario();
        adminUsuario.setNombreUsuario("admin");
        adminUsuario.setContrasena("admin123");
        administrador.setUsuario(adminUsuario);
        listaUsuarios.add(adminUsuario);

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
        cliente.setUsuario(clienteUsuario2);
        listaClientes.add(cliente2);
        listaUsuarios.add(clienteUsuario2);

        Sedan sedan = new Sedan("Toyota",
                "Nuevo",
                "Corolla",
                "AMJ123",
                6,
                180.0,
                1.8,
                "gasolina",
                true,
                5,
                4,
                470.0,
                true,
                true,
                true, 6,
                true,
                true,
                true,
                true);
        listaVehiculos.add(sedan);

        Deportivo deportivo = new Deportivo(
                "Porsche",
                "Nuevo",
                "911",
                "ABC987",
                7,
                320.0,
                3.0,
                "Gasolina",
                false,
                2,
                2,
                6,
                450.0,
                3.5
        );
        listaVehiculos.add(deportivo);

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

        Venta venta = new Venta();
        venta.setIdVenta(1);
        venta.setCliente(cliente2);
        venta.setEmpleado(empleado2);
        venta.setVehiculo(deportivo);
        venta.setFecha(LocalDate.of(2024, 2, 20));
        venta.setPrecio(250430250);
        listaVentas.add(venta);
    }

    public List<Administrador> getListaAdministrador() {
        return listaAdministrador;
    }
    public void setListaAdministrador(List<Administrador> listaAdministrador) {
        this.listaAdministrador = listaAdministrador;
    }
    public List<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }
    public void setListaEmpleados(List<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }
    public List<Cliente> getListaClientes() {
        return listaClientes;
    }
    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }
    public List<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }
    public void setListaVehiculos(List<Vehiculo> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }

    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public List<Reportes> getListaReportes() {
        return listaReportes;
    }

    public void setListaReportes(List<Reportes> listaReportes) {
        this.listaReportes = listaReportes;
    }

    public static void setInstancia(Empresa instancia) {
        Empresa.instancia = instancia;
    }

    public List<Venta> getListaVentas() {
        return listaVentas;
    }

    public void setListaVentas(List<Venta> listaVentas) {
        this.listaVentas = listaVentas;
    }

    public List<Alquiler> getListaAlquileres() {
        return listaAlquileres;
    }

    public void setListaAlquileres(List<Alquiler> listaAlquileres) {
        this.listaAlquileres = listaAlquileres;
    }
}
