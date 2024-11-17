package co.edu.uniquindio.poo;

public class Van extends Vehiculo {
    private int numeroPasajeros;
    private int numeroPuertas;
    private int capacidadMaletero;
    private boolean aireAcondicionado;
    private boolean camaraReversa;
    private int bolsasDeAire;
    private boolean ABS;

    // Constructor
    public Van(String marca, int modelo, boolean nuevo, String transmision, String tipoCombustible,
               int numeroPasajeros, int numeroPuertas, int capacidadMaletero, boolean aireAcondicionado,
               boolean camaraReversa, int bolsasDeAire, boolean ABS) {
        super(marca, modelo, nuevo, transmision, tipoCombustible);
        this.numeroPasajeros = numeroPasajeros;
        this.numeroPuertas = numeroPuertas;
        this.capacidadMaletero = capacidadMaletero;
        this.aireAcondicionado = aireAcondicionado;
        this.camaraReversa = camaraReversa;
        this.bolsasDeAire = bolsasDeAire;
        this.ABS = ABS;
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

    @Override
    public String toString() {
        return  super.toString()+"Van [numeroPasajeros=" + numeroPasajeros + ", numeroPuertas=" + numeroPuertas + ", capacidadMaletero="
                + capacidadMaletero + ", aireAcondicionado=" + aireAcondicionado + ", camaraReversa=" + camaraReversa
                + ", bolsasDeAire=" + bolsasDeAire + ", ABS=" + ABS + "]";
    }


    
}
