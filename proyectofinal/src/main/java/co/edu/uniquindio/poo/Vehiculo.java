package co.edu.uniquindio.poo;

public abstract class Vehiculo {
    private String marca;
    private String estado; // Ejemplo: "Nuevo", "Usado"
    private String modelo;
    private String placa;
    private int cambios;
    private double velocidadMaxima; // Velocidad máxima en km/h
    private double cilindraje; // Tamaño del motor
    private String combustible; // Ejemplo: "Gasolina", "Diesel", "Eléctrico"
    private boolean transmisionAutomatica; // Automática o Manual

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

    public Vehiculo() {
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

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
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

    // Método para determinar si la revisión técnica está aprobada
    public boolean isRevisionTecnicaAprobada() {
        // La revisión técnica es aprobada si:
        // - El vehículo está en buen estado ("Nuevo" o "Usado").
        // - La velocidad máxima no supera 300 km/h.
        // - El cilindraje es mayor a 1.0 (ejemplo: motores muy pequeños no cumplen).
        // - Combustibles aceptados: "Gasolina", "Diesel". "Eléctrico" no pasa por ejemplo.

        return (estado.equalsIgnoreCase("Nuevo") || estado.equalsIgnoreCase("Usado"))
                && velocidadMaxima <= 300
                && cilindraje > 1.0
                && (combustible.equalsIgnoreCase("Gasolina") || combustible.equalsIgnoreCase("Diesel"));
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", estado='" + estado + '\'' +
                ", modelo='" + modelo + '\'' +
                ", placa='" + placa + '\'' +
                ", cambios=" + cambios +
                ", velocidadMaxima=" + velocidadMaxima +
                ", cilindraje=" + cilindraje +
                ", combustible='" + combustible + '\'' +
                ", transmisionAutomatica=" + transmisionAutomatica +
                '}';
    }
}

