package co.edu.uniquindio.poo;

public class Bus extends Vehiculo {
    private int numeroPasajeros;
    private int numeroPuertas;
    private int capacidadMaletero;
    private boolean aireAcondicionado;
    private boolean camaraReversa;
    private int bolsasDeAire;
    private boolean ABS;
    private int numeroEjes;
    private int salidasEmergencia;

    // Constructor
    public Bus(String marca, int modelo, boolean nuevo, String transmision, String tipoCombustible,
               int numeroPasajeros, int numeroPuertas, int capacidadMaletero, boolean aireAcondicionado,
               boolean camaraReversa, int bolsasDeAire, boolean ABS, int numeroEjes, int salidasEmergencia) {
        super(marca, modelo, nuevo, transmision, tipoCombustible);
        this.numeroPasajeros = numeroPasajeros;
        this.numeroPuertas = numeroPuertas;
        this.capacidadMaletero = capacidadMaletero;
        this.aireAcondicionado = aireAcondicionado;
        this.camaraReversa = camaraReversa;
        this.bolsasDeAire = bolsasDeAire;
        this.ABS = ABS;
        this.numeroEjes = numeroEjes;
        this.salidasEmergencia = salidasEmergencia;
    }

    // Métodos getters y setters
    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public int getCapacidadMaletero() {
        return capacidadMaletero;
    }

    public void setCapacidadMaletero(int capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }

    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    public boolean isCamaraReversa() {
        return camaraReversa;
    }

    public void setCamaraReversa(boolean camaraReversa) {
        this.camaraReversa = camaraReversa;
    }

    public int getBolsasDeAire() {
        return bolsasDeAire;
    }

    public void setBolsasDeAire(int bolsasDeAire) {
        this.bolsasDeAire = bolsasDeAire;
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

    public int getSalidasEmergencia() {
        return salidasEmergencia;
    }

    public void setSalidasEmergencia(int salidasEmergencia) {
        this.salidasEmergencia = salidasEmergencia;
    }
}
