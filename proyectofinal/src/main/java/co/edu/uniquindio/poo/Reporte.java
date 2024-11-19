package co.edu.uniquindio.poo;
import java.time.LocalDate;

/**
 * Clase que representa un reporte de transacciones o actividades realizadas por un empleado
 * durante un periodo de tiempo específico. Contiene información sobre el nombre del empleado,
 * el total de transacciones o actividades, y las fechas de inicio y fin del periodo del reporte.
 */
public class Reporte {

    // Atributos de la clase
    private String nombreEmpleado;  // Nombre del empleado asociado al reporte
    private int total;              // Total de transacciones o actividades en el reporte
    private LocalDate inicio;       // Fecha de inicio del periodo del reporte
    private LocalDate fin;          // Fecha de fin del periodo del reporte

    /**
     * Constructor por defecto de la clase Reporte.
     */
    public Reporte(){
    }

    /**
     * Constructor de la clase Reporte con parámetros para inicializar todos los atributos.
     *
     * @param nombreEmpleado Nombre del empleado asociado al reporte.
     * @param total Total de transacciones o actividades en el reporte.
     * @param inicio Fecha de inicio del periodo del reporte.
     * @param fin Fecha de fin del periodo del reporte.
     */
    public Reporte(String nombreEmpleado, int total, LocalDate inicio, LocalDate fin) {
        this.nombreEmpleado = nombreEmpleado;
        this.total = total;
        this.inicio = inicio;
        this.fin = fin;
    }

    /**
     * Obtiene el nombre del empleado asociado al reporte.
     *
     * @return El nombre del empleado.
     */
    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    /**
     * Establece el nombre del empleado asociado al reporte.
     *
     * @param nombreEmpleado El nombre del empleado.
     */
    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    /**
     * Obtiene el total de transacciones o actividades del reporte.
     *
     * @return El total de transacciones o actividades.
     */
    public int getTotal() {
        return total;
    }

    /**
     * Establece el total de transacciones o actividades del reporte.
     *
     * @param total El total de transacciones o actividades.
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * Obtiene la fecha de inicio del periodo del reporte.
     *
     * @return La fecha de inicio del reporte.
     */
    public LocalDate getInicio() {
        return inicio;
    }

    /**
     * Establece la fecha de inicio del periodo del reporte.
     *
     * @param inicio La fecha de inicio del reporte.
     */
    public void setInicio(LocalDate inicio) {
        this.inicio = inicio;
    }

    /**
     * Obtiene la fecha de fin del periodo del reporte.
     *
     * @return La fecha de fin del reporte.
     */
    public LocalDate getFin() {
        return fin;
    }

    /**
     * Establece la fecha de fin del periodo del reporte.
     *
     * @param fin La fecha de fin del reporte.
     */
    public void setFin(LocalDate fin) {
        this.fin = fin;
    }

    /**
     * Sobrescribe el método `toString()` para proporcionar una representación en forma de cadena
     * del objeto Reporte, incluyendo el nombre del empleado, el total de transacciones o actividades,
     * y las fechas de inicio y fin del reporte.
     *
     * @return Una cadena que representa el reporte.
     */
    @Override
    public String toString() {
        return "Reportes{" +
                "nombreEmpleado='" + nombreEmpleado + '\'' +
                ", total=" + total +
                ", inicio=" + inicio +
                ", fin=" + fin +
                '}';
    }
}
