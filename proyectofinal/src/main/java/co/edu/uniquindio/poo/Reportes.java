package co.edu.uniquindio.poo;
import java.time.LocalDate;

public class Reportes {

    private String nombreEmpleado;
    private int total;
    private LocalDate inicio;
    private LocalDate fin;

    public Reportes(){

    }
    public Reportes(String nombreEmpleado, int total, LocalDate inicio, LocalDate fin) {
        this.nombreEmpleado = nombreEmpleado;
        this.total = total;
        this.inicio = inicio;
        this.fin = fin;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public LocalDate getInicio() {
        return inicio;
    }

    public void setInicio(LocalDate inicio) {
        this.inicio = inicio;
    }

    public LocalDate getFin() {
        return fin;
    }

    public void setFin(LocalDate fin) {
        this.fin = fin;
    }

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
