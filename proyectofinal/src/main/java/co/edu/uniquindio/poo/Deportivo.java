package co.edu.uniquindio.poo;

public class Deportivo extends Vehiculo {
    private int numeroPasajeros;
    private int numeroPuertas;
    private int numeroBolsasAire;
    private double caballosFuerza;
    private double tiempoCienKmh;

    public Deportivo(String marca, String estado, String modelo, String placa, int cambios, double velocidadMaxima, double cilindraje, String combustible, boolean transmisionAutomatica, int numeroPasajeros, int numeroPuertas, int numeroBolsasAire, double caballosFuerza, double tiempoCienKmh) {
        super(marca, estado, modelo, placa, cambios, velocidadMaxima, cilindraje, combustible, transmisionAutomatica);
        this.numeroPasajeros = numeroPasajeros;
        this.numeroPuertas = numeroPuertas;
        this.numeroBolsasAire = numeroBolsasAire;
        this.caballosFuerza = caballosFuerza;
        this.tiempoCienKmh = tiempoCienKmh;
    }

    public Deportivo(){

    }

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

    public int getNumeroBolsasAire() {
        return numeroBolsasAire;
    }

    public void setNumeroBolsasAire(int numeroBolsasAire) {
        this.numeroBolsasAire = numeroBolsasAire;
    }

    public double getCaballosFuerza() {
        return caballosFuerza;
    }

    public void setCaballosFuerza(double caballosFuerza) {
        this.caballosFuerza = caballosFuerza;
    }

    public double getTiempoCienKmh() {
        return tiempoCienKmh;
    }

    public void setTiempoCienKmh(double tiempoCienKmh) {
        this.tiempoCienKmh = tiempoCienKmh;
    }

    @Override
    public String toString() {
        return "Deportivo{" +
                "numeroPasajeros=" + numeroPasajeros +
                ", numeroPuertas=" + numeroPuertas +
                ", numeroBolsasAire=" + numeroBolsasAire +
                ", caballosFuerza=" + caballosFuerza +
                ", tiempoCienKmh=" + tiempoCienKmh +
                '}';
    }
}