package co.edu.uniquindio.poo;

public abstract class Vehiculo {
    private String marca;
    private int modelo;
    private boolean nuevo;
    private Transmision transmision;
    private TipoCombustible tipoCombustible;
    private Combustible combustible;

    // Constructor
    public Vehiculo(String marca, int modelo, boolean nuevo, Transmision transmision, TipoCombustible tipoCombustible) {
        this.marca = marca;
        this.modelo = modelo;
        this.nuevo = nuevo;
        this.transmision=transmision;
        this.tipoCombustible = tipoCombustible;
    }
    public String Estado() {
        return nuevo ? "Sí" : "No";
    }

    public abstract boolean revisionTecnica();

    // Métodos getters y setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public boolean isNuevo() {
        return nuevo;
    }

    public void setNuevo(boolean nuevo) {
        this.nuevo = nuevo;
    }

   
    public Combustible getCombustible() {
        return combustible;
    }

    public void setCombustible(Combustible combustible) {
        this.combustible = combustible;
    }

    @Override
    public String toString() {
        return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", nuevo=" + nuevo + ", transmision=" + transmision
                + ", tipoCombustible=" + tipoCombustible + ", combustible=" + combustible + "]";
    }
    public Transmision getTransmision() {
        return transmision;
    }
    public void setTransmision(Transmision transmision) {
        this.transmision = transmision;
    }
    public TipoCombustible getTipoCombustible() {
        return tipoCombustible;
    }
    public void setTipoCombustible(TipoCombustible tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }
    



}
