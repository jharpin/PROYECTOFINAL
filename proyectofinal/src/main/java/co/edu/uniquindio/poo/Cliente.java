package co.edu.uniquindio.poo;

/**
 * Clase que representa a un Cliente, quien hereda de la clase {@link Persona}.
 * Esta clase define los atributos específicos de un cliente en el sistema.
 */
public class Cliente extends Persona {

    /**
     * Constructor por defecto de la clase Cliente.
     * Inicializa una instancia de Cliente sin valores predefinidos.
     */
    public Cliente() {
    }

    /**
     * Constructor que inicializa un Cliente con los valores proporcionados.
     * 
     * @param id ID único del cliente.
     * @param nombre Nombre del cliente.
     * @param apellido Apellido del cliente.
     * @param cedula Cédula del cliente.
     * @param edad Edad del cliente.
     * @param correo Correo electrónico del cliente.
     * @param telefono Número de teléfono del cliente.
     * @param rol Rol del cliente (por ejemplo, "Cliente").
     * @param usuario Objeto {@link Usuario} asociado al cliente, que contiene información sobre el acceso y perfil del cliente.
     */
    public Cliente(int id, String nombre, String apellido, String cedula, int edad, String correo, String telefono, String rol, Usuario usuario) {
        super(id, nombre, apellido, cedula, edad, correo, telefono, rol, usuario);
    }
}
