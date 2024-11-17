package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class Empresa {

    private List<Administrador> listaAdministrador = new ArrayList<>();
    private List<Empleado> listaEmpleados = new ArrayList<>();
    private List<Usuario> listaUsuarios = new ArrayList<>();
    private List<Cliente> listaClientes = new ArrayList<>();
    private List<Vehiculo> listaVehiculos = new ArrayList<>();
    private List<Reporte> listaReportes = new ArrayList<>();
    private List<Venta> listaVentas = new ArrayList<>();
    private List<Alquiler> listaAlquileres = new ArrayList<>();
    private static Empresa instancia;


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
    
    public boolean bloquearUsuario(String nombreUsuario) {
        Usuario usuario = listaUsuarios.stream()
            .filter(u -> u.getNombreUsuario().equals(nombreUsuario))
            .findFirst()
            .orElseThrow(() -> new IllegalArgumentException("Usuario no encontrado: " + nombreUsuario));
    
        usuario.setBloqueado(true);
        return true;
    }
    
    public boolean desbloquearUsuario(String nombreUsuario) {
        Usuario usuario = listaUsuarios.stream()
            .filter(u -> u.getNombreUsuario().equals(nombreUsuario))
            .findFirst()
            .orElseThrow(() -> new IllegalArgumentException("Usuario no encontrado: " + nombreUsuario));
    
        usuario.setBloqueado(false);
        return true;
    }

    public boolean verificarBloqueo(String nombreUsuario) {
        return listaUsuarios.stream()
            .filter(u -> u.getNombreUsuario().equals(nombreUsuario))
            .findFirst()
            .map(Usuario::isBloqueado)
            .orElse(false); // Devuelve false si no se encuentra el usuario
    }

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
