package co.edu.uniquindio.poo;

public abstract class Vehiculo {
    private String marca;
    private String estado;
    private String modelo;
    private String placa;
    private int cambios;
    private double velocidadMaxima;
    private double cilindraje;
    private String combustible;
    private boolean transmisionAutomatica;

    public Vehiculo(String marca, String estado, String modelo, String placa,
                    int cambios, double velocidadMaxima,
                    double cilindraje, String combustible, boolean transmisionAutomatica) {
        this.marca = marca;
        this.estado = estado;
        this.modelo = modelo;
        this.placa = placa;
        this.cambios = cambios;
        this.velocidadMaxima = velocidadMaxima;
        this.cilindraje = cilindraje;
        this.combustible = combustible;
        this.transmisionAutomatica = transmisionAutomatica;
    }

    public Vehiculo(){

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getEstado() {
        return estado;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCambios() {
        return cambios;
    }

    public void setCambios(int cambios) {
        this.cambios = cambios;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public double getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public boolean isTransmisionAutomatica() {
        return transmisionAutomatica;
    }

    public void setTransmisionAutomatica(boolean transmisionAutomatica) {
        this.transmisionAutomatica = transmisionAutomatica;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", estado=" + estado +
                ", modelo='" + modelo + '\'' +
                ", cambios=" + cambios +
                ", velocidadMaxima=" + velocidadMaxima +
                ", cilindraje=" + cilindraje +
                ", combustible='" + combustible + '\'' +
                ", transmisionAutomatica=" + transmisionAutomatica +
                '}';
    }
}

