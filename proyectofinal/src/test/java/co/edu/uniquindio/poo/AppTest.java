package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.logging.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AppTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    private Empresa empresa;
    private Empleado empleado;
    private Cliente cliente;
    private Vehiculo vehiculo;

    @BeforeEach
    public void setUp() {
        LOG.info("Configuración inicial para los tests");
        empresa = Empresa.getInstancia();

        // Crear un empleado y agregarlo a la empresa
        empleado = new Empleado(1, "Juan", "Pérez", "12345", 30, "juan@empresa.com", "555-5555", "Vendedor", null);
        empresa.agregarEmpleado(empleado);

        // Crear un cliente
        cliente = new Cliente(2, "Steban", "Martínez", "1098675433", 31, "steban@gmail.com", "3123456789", Rol.CLIENTE.toString(),
        new Usuario("cliente2", "cliente321", "Armenia", PreguntasSeguridad.CIUDAD_NACIMIENTO));

        // Crear un vehículo
        vehiculo = new Sedan("Toyota", "Nuevo", "Corolla", "AMJ123", 6, 180.0, 1.8, "gasolina", true, 5, 4, 470.0, true, true, true, 6, true, true, true, true);
    }

    @Test
    public void testRegistrarVehiculo() {
        LOG.info("Iniciando testRegistrarVehiculo");
        empleado.registrarVehiculo(empresa, vehiculo);

        assertTrue(empresa.getListaVehiculos().contains(vehiculo), "El vehículo debería estar registrado en la empresa");
        LOG.info("Finalizando testRegistrarVehiculo");
    }

    @Test
    public void testRegistrarCliente() {
        LOG.info("Iniciando testRegistrarCliente");
        empleado.registrarCliente(empresa, cliente);

        assertTrue(empresa.getListaClientes().contains(cliente), "El cliente debería estar registrado en la empresa");
        LOG.info("Finalizando testRegistrarCliente");
    }

    @Test
    public void testRealizarAlquiler() {
        LOG.info("Iniciando testRealizarAlquiler");
        LocalDate inicio = LocalDate.now();
        LocalDate fin = inicio.plusDays(5);
        double precioPorDia = 50.0;

        empleado.realizarAlquiler(empresa, cliente, vehiculo, inicio, fin, precioPorDia);

        assertEquals(1, empresa.getListaAlquileres().size(), "Debería haber un alquiler registrado");
        assertEquals(250.0, empresa.getListaAlquileres().get(0).getTotal(), "El total del alquiler debería ser 250.0");
        LOG.info("Finalizando testRealizarAlquiler");
    }

    @Test
    public void testRegistrarVenta() {
        LOG.info("Iniciando testRegistrarVenta");
        double precio = 18000.0;
        empleado.registrarVenta(empresa, cliente, vehiculo, precio);

        assertEquals(1, empresa.getListaVentas().size(), "Debería haber una venta registrada");
        assertEquals(precio, empresa.getListaVentas().get(0).getPrecio(), "El precio de la venta debería coincidir");
        LOG.info("Finalizando testRegistrarVenta");
    }

    @Test
    public void testVerificarEmpleado() {
        LOG.info("Iniciando testVerificarEmpleado");
        assertTrue(empresa.verificarEmpleado(empleado.getCedula()), "El empleado debería estar registrado en la empresa");
        LOG.info("Finalizando testVerificarEmpleado");
    }

    @Test
    public void testBloquearUsuario() {
        LOG.info("Iniciando testBloquearUsuario");
        Usuario usuario = new Usuario("empleado1", "empleado123", "Verde", PreguntasSeguridad.COLOR_FAVORITO);
        empleado.setUsuario(usuario);
        empresa.getListaUsuarios().add(usuario);

        assertTrue(empresa.bloquearUsuario(usuario.getNombreUsuario()), "El usuario debería ser bloqueado");
        assertTrue(usuario.isBloqueado(), "El usuario debería estar bloqueado");
        LOG.info("Finalizando testBloquearUsuario");
    }

    @Test
    public void testDesbloquearUsuario() {
        LOG.info("Iniciando testDesbloquearUsuario");
        Usuario usuario = new Usuario("empleado2", "empleado321", "Hamburguesa", PreguntasSeguridad.COMIDA_FAVORITA);
        usuario.setBloqueado(true);
        empleado.setUsuario(usuario);
        empresa.getListaUsuarios().add(usuario);

        assertTrue(empresa.desbloquearUsuario(usuario.getNombreUsuario()), "El usuario debería ser desbloqueado");
        assertFalse(usuario.isBloqueado(), "El usuario no debería estar bloqueado");
        LOG.info("Finalizando testDesbloquearUsuario");
    }

    @Test
    public void testObtenerEmpleado() {
        LOG.info("Iniciando testObtenerEmpleado");
        Empleado empleadoObtenido = empresa.obtenerEmpleado(empleado.getCedula());

        assertEquals(empleado, empleadoObtenido, "Debería devolver el empleado correspondiente a la cédula");
        LOG.info("Finalizando testObtenerEmpleado");
    }
}    