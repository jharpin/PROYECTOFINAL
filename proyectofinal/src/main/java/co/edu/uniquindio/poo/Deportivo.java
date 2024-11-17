package co.edu.uniquindio.poo;

public class Deportivo extends Vehiculo {
    private int numeroPasajeros;
    private int numeroPuertas;
    private int bolsasDeAire;
    private int caballosDeFuerza;
    private double tiempo0a100kmh;

    // Constructor
    public Deportivo(String marca, int modelo, boolean nuevo, String transmision, String tipoCombustible,
                     int numeroPasajeros, int numeroPuertas, int bolsasDeAire, int caballosDeFuerza, double tiempo0a100kmh) {
        super(marca, modelo, nuevo, transmision, tipoCombustible);
        this.numeroPasajeros = numeroPasajeros;
        this.numeroPuertas = numeroPuertas;
        this.bolsasDeAire = bolsasDeAire;
        this.caballosDeFuerza = caballosDeFuerza;
        this.tiempo0a100kmh = tiempo0a100kmh;
    }
    @Override
    public boolean revisionTecnica() {
       
        System.out.println("Revisión técnica realizada para el deportivo.");
        return true; // Por ejemplo: devuelve true si la camioneta pasa la revisión
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

    public int getBolsasDeAire() {
        return bolsasDeAire;
    }

    public void setBolsasDeAire(int bolsasDeAire) {
        this.bolsasDeAire = bolsasDeAire;
    }

    public int getCaballosDeFuerza() {
        return caballosDeFuerza;
    }

    public void setCaballosDeFuerza(int caballosDeFuerza) {
        this.caballosDeFuerza = caballosDeFuerza;
    }

    public double getTiempo0a100kmh() {
        return tiempo0a100kmh;
    }

    public void setTiempo0a100kmh(double tiempo0a100kmh) {
        this.tiempo0a100kmh = tiempo0a100kmh;
    }

    @Override
    public String toString() {
        return  super.toString()+"Deportivo [numeroPasajeros=" + numeroPasajeros + ", numeroPuertas=" + numeroPuertas + ", bolsasDeAire="
                + bolsasDeAire + ", caballosDeFuerza=" + caballosDeFuerza + ", tiempo0a100kmh=" + tiempo0a100kmh + "]";
    }
    
}
