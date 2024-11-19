package co.edu.uniquindio.poo;

/**
 * Clase que representa a un empleado, que hereda de la clase {@link Persona}.
 * La clase Empleado agrega la funcionalidad de representar a un individuo que tiene
 * un rol específico dentro de la empresa, y su relación con un {@link Usuario}.
 */
public class Empleado extends Persona {

    /**
     * Constructor por defecto de la clase Empleado.
     * Inicializa una instancia de empleado sin valores predefinidos.
     */
    public Empleado() {
        super();
    }

    /**
     * Constructor que inicializa un empleado con los valores proporcionados.
     * 
     * @param id ID del empleado.
     * @param nombre Nombre del empleado.
     * @param apellido Apellido del empleado.
     * @param cedula Cédula del empleado.
     * @param edad Edad del empleado.
     * @param correo Correo electrónico del empleado.
     * @param telefono Número de teléfono del empleado.
     * @param rol Rol del empleado dentro de la empresa.
     * @param usuario Objeto de la clase {@link Usuario} que representa al usuario
     *                asociado al empleado.
     */
    public Empleado(int id, String nombre, String apellido, String cedula, int edad, String correo, String telefono, String rol, Usuario usuario) {
        super(id, nombre, apellido, cedula, edad, correo, telefono, rol, usuario);
    }
}
