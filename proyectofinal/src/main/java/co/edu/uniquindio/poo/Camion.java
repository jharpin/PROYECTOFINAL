package co.edu.uniquindio.poo;

public class Camion extends Vehiculo {
    private int capacidadCarga;
    private boolean aireAcondicionado;
    private boolean frenosDeAire;
    private boolean ABS;
    private int numeroEjes;
    private TipoCamion tipoCamion;

    // Constructor
    public Camion(String marca, int modelo, boolean nuevo, Transmision transmision, String tipoCombustible,
                  int capacidadCarga, boolean aireAcondicionado, boolean frenosDeAire, boolean ABS,
                  int numeroEjes, TipoCamion tipoCamion) {
        super(marca, modelo, nuevo, transmision, tipoCombustible);
        this.capacidadCarga = capacidadCarga;
        this.aireAcondicionado = aireAcondicionado;
        this.frenosDeAire = frenosDeAire;
        this.ABS = ABS;
        this.numeroEjes = numeroEjes;
        this.tipoCamion = tipoCamion; // Corrección: usar el atributo tipoCamion correctamente
    }
    @Override
    public boolean revisionTecnica() {
       
        System.out.println("Revisión técnica realizada para la camion.");
        return true; // Por ejemplo: devuelve true si la camioneta pasa la revisión
    }

    // Métodos getters y setters
    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    public boolean isFrenosDeAire() {
        return frenosDeAire;
    }

    public void setFrenosDeAire(boolean frenosDeAire) {
        this.frenosDeAire = frenosDeAire;
    }

    public boolean isABS() {
        return ABS;
    }

    public void setABS(boolean ABS) {
        this.ABS = ABS;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    public TipoCamion getTipoCamion() {
        return tipoCamion; // Corrección: devolver el objeto TipoCamion
    }

    public void setTipoCamion(TipoCamion tipoCamion) {
        this.tipoCamion = tipoCamion; // Corrección: asignar correctamente el objeto TipoCamion
    }

    @Override
    public String toString() {
        return  super.toString()+"Camion{" +
                "marca='" + getMarca() + '\'' +
                ", modelo=" + getModelo() +
                ", nuevo=" + isNuevo() +
                ", transmision='" + getTransmision() + '\'' +
                ", tipoCombustible='" + getTipoCombustible() + '\'' +
                ", capacidadCarga=" + capacidadCarga +
                ", aireAcondicionado=" + aireAcondicionado +
                ", frenosDeAire=" + frenosDeAire +
                ", ABS=" + ABS +
                ", numeroEjes=" + numeroEjes +
                ", tipoCamion=" + tipoCamion + // Corrección: incluir el tipoCamion en el toString
                '}';
    }
}