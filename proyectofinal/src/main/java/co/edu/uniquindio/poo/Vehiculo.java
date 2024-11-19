package co.edu.uniquindio.poo;

/**
 * Clase abstracta que representa un vehículo en general.
 * La clase Vehiculo contiene atributos y métodos comunes para cualquier tipo de vehículo
 * como marca, modelo, velocidad máxima, tipo de combustible, transmisión, etc.
 * Esta clase es la base para otras clases de vehículos más específicos como Van, Auto, Camioneta, etc.
 */
public abstract class Vehiculo {

    // Atributos de la clase Vehiculo, comunes para todos los vehículos
    private String marca;                // Marca del vehículo
    private String estado;               // Estado del vehículo (nuevo, usado, etc.)
    private String modelo;               // Modelo del vehículo
    private String placa;                // Placa del vehículo
    private int cambios;                 // Número de cambios de la transmisión
    private double velocidadMaxima;      // Velocidad máxima que puede alcanzar el vehículo
    private double cilindraje;           // Cilindraje del motor del vehículo
    private String combustible;          // Tipo de combustible que utiliza el vehículo (Gasolina, Diesel, Eléctrico, etc.)
    private boolean transmisionAutomatica; // Si el vehículo tiene transmisión automática

    /**
     * Constructor que inicializa todos los atributos de la clase Vehiculo.
     * 
     * @param marca                Marca del vehículo
     * @param estado               Estado del vehículo (nuevo, usado, etc.)
     * @param modelo               Modelo del vehículo
     * @param placa                Placa del vehículo
     * @param cambios              Número de cambios de la transmisión
     * @param velocidadMaxima      Velocidad máxima del vehículo
     * @param cilindraje           Cilindraje del motor
     * @param combustible          Tipo de combustible utilizado por el vehículo
     * @param transmisionAutomatica Indica si el vehículo tiene transmisión automática
     */
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

    /**
     * Constructor por defecto que inicializa una instancia sin valores.
     * Este constructor puede ser utilizado por las clases hijas para crear objetos sin necesidad de pasar valores.
     */
    public Vehiculo() {

    }

    // Métodos Getter y Setter para acceder y modificar los atributos

    /**
     * Obtiene la marca del vehículo.
     *
     * @return Marca del vehículo.
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Establece la marca del vehículo.
     *
     * @param marca Marca del vehículo.
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Obtiene el estado del vehículo.
     *
     * @return Estado del vehículo (nuevo, usado, etc.).
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Establece el estado del vehículo.
     *
     * @param estado Estado del vehículo.
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * Obtiene la placa del vehículo.
     *
     * @return Placa del vehículo.
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * Establece la placa del vehículo.
     *
     * @param placa Placa del vehículo.
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * Obtiene el modelo del vehículo.
     *
     * @return Modelo del vehículo.
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Establece el modelo del vehículo.
     *
     * @param modelo Modelo del vehículo.
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Obtiene el número de cambios de la transmisión.
     *
     * @return Número de cambios.
     */
    public int getCambios() {
        return cambios;
    }

    /**
     * Establece el número de cambios de la transmisión.
     *
     * @param cambios Número de cambios de la transmisión.
     */
    public void setCambios(int cambios) {
        this.cambios = cambios;
    }

    /**
     * Obtiene la velocidad máxima que puede alcanzar el vehículo.
     *
     * @return Velocidad máxima del vehículo.
     */
    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    /**
     * Establece la velocidad máxima del vehículo.
     *
     * @param velocidadMaxima Velocidad máxima del vehículo.
     */
    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    /**
     * Obtiene el cilindraje del motor del vehículo.
     *
     * @return Cilindraje del motor del vehículo.
     */
    public double getCilindraje() {
        return cilindraje;
    }

    /**
     * Establece el cilindraje del motor del vehículo.
     *
     * @param cilindraje Cilindraje del motor.
     */
    public void setCilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
    }

    /**
     * Obtiene el tipo de combustible utilizado por el vehículo.
     *
     * @return Tipo de combustible (Gasolina, Diesel, Eléctrico, etc.).
     */
    public String getCombustible() {
        return combustible;
    }

    /**
     * Establece el tipo de combustible utilizado por el vehículo.
     *
     * @param combustible Tipo de combustible.
     */
    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    /**
     * Obtiene si el vehículo tiene transmisión automática.
     *
     * @return true si tiene transmisión automática, false si no.
     */
    public boolean isTransmisionAutomatica() {
        return transmisionAutomatica;
    }

    /**
     * Establece si el vehículo tiene transmisión automática.
     *
     * @param transmisionAutomatica true si tiene transmisión automática, false si no.
     */
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
















    /**
     * Método toString que devuelve una representación en texto del vehículo.
     *
     * @return Una cadena con los atributos del vehículo.
     */
    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", estado='" + estado + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cambios=" + cambios +
                ", velocidadMaxima=" + velocidadMaxima +
                ", cilindraje=" + cilindraje +
                ", combustible='" + combustible + '\'' +
                ", transmisionAutomatica=" + transmisionAutomatica +
                '}'; // Devuelve la representación en forma de cadena de los atributos.
    }
}
