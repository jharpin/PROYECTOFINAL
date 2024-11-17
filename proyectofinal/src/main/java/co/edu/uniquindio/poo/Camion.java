package co.edu.uniquindio.poo;

public class Camion extends Vehiculo {
    private int capacidadCarga;
    private boolean aireAcondicionado;
    private boolean frenosDeAire;
    private boolean ABS;
    private int numeroEjes;
    private String  TipoCamion;


    // Constructor
    public Camion(String marca, int modelo, boolean nuevo, String transmision, String tipoCombustible,
                  int capacidadCarga, boolean aireAcondicionado, boolean frenosDeAire, boolean ABS,
                  int numeroEjes, String tipoCamion) {
        super(marca, modelo, nuevo, transmision, tipoCombustible);
        this.capacidadCarga = capacidadCarga;
        this.aireAcondicionado = aireAcondicionado;
        this.frenosDeAire = frenosDeAire;
        this.ABS = ABS;
        this.numeroEjes = numeroEjes;
        this.TipoCamion = TipoCamion;
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

    public String getTipoCamion() {
        return TipoCamion;
    }

    public void setTipoCamion(String tipoCamion) {
        this.TipoCamion = tipoCamion;
    }
}
