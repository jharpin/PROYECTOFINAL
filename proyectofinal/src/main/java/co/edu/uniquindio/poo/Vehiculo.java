package co.edu.uniquindio.poo;

public abstract class Vehiculo {
    private String marca;
    private int modelo;
    private boolean nuevo;
    private String transmision;
    private String tipoCombustible;

    // Constructor
    public Vehiculo(String marca, int modelo, boolean nuevo, String transmision, String tipoCombustible) {
        this.marca = marca;
        this.modelo = modelo;
        this.nuevo = nuevo;
        this.transmision = transmision;
        this.tipoCombustible = tipoCombustible;
    }

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

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }
}
