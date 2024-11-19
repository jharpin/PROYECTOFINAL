package co.edu.uniquindio.poo;

/**
 * La clase <code>Administrador</code> representa un administrador dentro del sistema.
 * Esta clase hereda de la clase <code>Persona</code> y tiene la capacidad de gestionar
 * información relacionada con un usuario administrador, como su ID, nombre, apellido, 
 * cédula, edad, correo, teléfono, rol y usuario asociado.
 * 
 * @author [Tu nombre]
 */
public class Administrador extends Persona {

    /**
     * Constructor por defecto de la clase <code>Administrador</code>.
     * Llama al constructor de la clase padre <code>Persona</code> sin parámetros.
     */
    public Administrador() {
        super();
    }

    /**
     * Constructor de la clase <code>Administrador</code> que recibe los parámetros necesarios
     * para inicializar un administrador con información específica.
     * 
     * @param id El ID único del administrador.
     * @param nombre El nombre del administrador.
     * @param apellido El apellido del administrador.
     * @param cedula El número de cédula del administrador.
     * @param edad La edad del administrador.
     * @param correo El correo electrónico del administrador.
     * @param telefono El número de teléfono del administrador.
     * @param rol El rol del administrador dentro del sistema.
     * @param usuario El objeto <code>Usuario</code> asociado al administrador.
     */
    public Administrador(int id, String nombre, String apellido, String cedula, int edad, String correo, String telefono, String rol, Usuario usuario) {
        super(id, nombre, apellido, cedula, edad, correo, telefono, rol, usuario);
    }
}
