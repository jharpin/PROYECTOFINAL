package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;
import java.time.temporal.ChronoUnit;

public class Empresa {
    private List<Administrador> listaAdministrador = new ArrayList<>();
    private List<Empleado> listaEmpleados = new ArrayList<>();
    private List<Usuario> listaUsuarios = new ArrayList<>();
    private List<Cliente> listaClientes = new ArrayList<>();
    private List<Vehiculo> listaVehiculos = new ArrayList<>();
    private List<Reporte> listaReportes = new ArrayList<>();
    private List<Venta> listaVentas = new ArrayList<>();
    private List<Alquiler> listaAlquileres = new ArrayList<>();
    private static Empresa instancia; // Singleton

    /**
     * Devuelve la instancia única de la empresa (Singleton).
     */
    public static Empresa getInstancia() {
        if (instancia == null) {
            instancia = new Empresa();
        }
        return instancia;
    }

    /**
     * Obtiene un usuario por su palabra secreta.
     */
    public Usuario obtenerUsuario(String palabraSecreta) {
        for (Empleado empleado : getListaEmpleados()) {
            if (empleado.getUsuario().getPalabraSecreta().equalsIgnoreCase(palabraSecreta)) {
                return empleado.getUsuario();
            }
        }
        return null;
    }

    /**
     * Bloquea un usuario basado en su nombre de usuario.
     */
    public boolean bloquearUsuario(String nombreUsuario) {
        Usuario usuario = listaUsuarios.stream()
            .filter(u -> u.getNombreUsuario().equals(nombreUsuario))
            .findFirst()
            .orElseThrow(() -> new IllegalArgumentException("Usuario no encontrado: " + nombreUsuario));
        usuario.setBloqueado(true);
        return true;
    }

    /**
     * Desbloquea un usuario basado en su nombre de usuario.
     */
    public boolean desbloquearUsuario(String nombreUsuario) {
        Usuario usuario = listaUsuarios.stream()
            .filter(u -> u.getNombreUsuario().equals(nombreUsuario))
            .findFirst()
            .orElseThrow(() -> new IllegalArgumentException("Usuario no encontrado: " + nombreUsuario));
        usuario.setBloqueado(false);
        return true;
    }

    /**
     * Verifica si un usuario está bloqueado.
     */
    public boolean verificarBloqueo(String nombreUsuario) {
        return listaUsuarios.stream()
            .filter(u -> u.getNombreUsuario().equals(nombreUsuario))
            .findFirst()
            .map(Usuario::isBloqueado)
            .orElse(false); // Devuelve false si no se encuentra el usuario
    }

    /**
     * Recupera la contraseña de un usuario basado en su nombre de usuario y palabra secreta.
     */
    public String recuperarContrasena(String nombreUsuario, String palabraSecreta) {
        Usuario usuario = listaUsuarios.stream()
            .filter(u -> u.getNombreUsuario().equals(nombreUsuario))
            .findFirst()
            .orElseThrow(() -> new IllegalArgumentException("Usuario no encontrado: " + nombreUsuario));
        if (!usuario.getPalabraSecreta().equalsIgnoreCase(palabraSecreta)) {
            throw new IllegalArgumentException("La palabra secreta no coincide.");
        }
        return usuario.getContrasena();
    }

    /**
     * Obtiene un empleado por su cédula.
     */
    public Empleado obtenerEmpleado(String cedula) {
        for (Empleado empleado : listaEmpleados) {
            if (empleado.getCedula().equals(cedula)) {
                return empleado;
            }
        }
        return null;
    }

    /**
     * Verifica si un empleado existe mediante su cédula.
     */
    public Boolean verificarEmpleado(String cedula) {
        for (Empleado empleado : listaEmpleados) {
            if (empleado.getCedula().equals(cedula)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Valida un empleado con su nombre de usuario y contraseña.
     */
    public Empleado validarEmpleado(String nombreUsuario, String contrasena) {
        for (Empleado empleado : listaEmpleados) {
            if (empleado.getUsuario().getNombreUsuario().equals(nombreUsuario) && empleado.getUsuario().getContrasena().equals(contrasena)) {
                return empleado;
            }
        }
        return null;
    }

    /**
     * Agrega un nuevo empleado a la lista si no existe previamente.
     */
    public Boolean agregarEmpleado(Empleado empleado) {
        if (!verificarEmpleado(empleado.getCedula())) {
            listaEmpleados.add(empleado);
            return true;
        }
        return false;
    }

    /**
     * Actualiza la información de un empleado existente.
     */
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

    /**
     * Elimina un empleado de la lista mediante su cédula.
     */
    public Boolean eliminarEmpleado(String cedula) {
        Empleado empleado = obtenerEmpleado(cedula);
        if (empleado != null) {
            listaEmpleados.remove(empleado);
            return true;
        }
        return false;
    }

    /**
     * Calcula el total de las ventas realizadas.
     */
    public double calcularTotalVentas() {
        double total = 0;
        for (Venta venta : listaVentas) {
            total += venta.getPrecio();
        }
        return total;
    }

    /**
     * Cuenta el número de vehículos vendidos.
     */
    public int contarVehiculosVendidos() {
        return listaVentas.size();
    }

    /**
     * Calcula el total del alquiler de un vehículo basado en el número de días y el precio por día.
     */
    public double calcularTotalAlquiler(Alquiler alquiler) {
        long diasAlquiler = ChronoUnit.DAYS.between(alquiler.getFechaInicio(), alquiler.getFechaFin());
        return diasAlquiler * alquiler.getPrecioPorDia();
    }

    // Getters y setters para las listas de la empresa

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

    public List<Reporte> getListaReportes() {
        return listaReportes;
    }

    public void setListaReportes(List<Reporte> listaReportes) {
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
