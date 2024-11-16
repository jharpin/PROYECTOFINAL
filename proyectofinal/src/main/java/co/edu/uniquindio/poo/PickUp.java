package co.edu.uniquindio.poo;

public class PickUp extends Vehiculo {
    private int numeroPasajeros;
    private int numeroPuertas;
    private boolean aireAcondicionado;
    private boolean camaraReversa;
    private int bolsasDeAire;
    private boolean ABS;
    private boolean traccion4x4;
    private int capacidadCajaCarga;

    // Constructor
    public PickUp(String marca, int modelo, boolean nuevo, String transmision, String tipoCombustible,
                  int numeroPasajeros, int numeroPuertas, boolean aireAcondicionado, boolean camaraReversa,
                  int bolsasDeAire, boolean ABS, boolean traccion4x4, int capacidadCajaCarga) {
        super(marca, modelo, nuevo, transmision, tipoCombustible);
        this.numeroPasajeros = numeroPasajeros;
        this.numeroPuertas = numeroPuertas;
        this.aireAcondicionado = aireAcondicionado;
        this.camaraReversa = camaraReversa;
        this.bolsasDeAire = bolsasDeAire;
        this.ABS = ABS;
        this.traccion4x4 = traccion4x4;
        this.capacidadCajaCarga = capacidadCajaCarga;
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

    public boolean isTraccion4x4() {
        return traccion4x4;
    }

    public void setTraccion4x4(boolean traccion4x4) {
        this.traccion4x4 = traccion4x4;
    }

    public int getCapacidadCajaCarga() {
        return capacidadCajaCarga;
    }

    public void setCapacidadCajaCarga(int capacidadCajaCarga) {
        this.capacidadCajaCarga = capacidadCajaCarga;
    }
}
