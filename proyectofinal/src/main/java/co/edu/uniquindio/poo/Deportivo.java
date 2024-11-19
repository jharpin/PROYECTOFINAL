package co.edu.uniquindio.poo;

/**
 * Clase que representa un vehículo de tipo Deportivo, el cual hereda de la clase {@link Vehiculo}.
 * Esta clase define atributos específicos de un vehículo deportivo, tales como el número de pasajeros,
 * el número de puertas, la cantidad de bolsas de aire, la potencia en caballos de fuerza y el tiempo en que
 * alcanza los 100 km/h.
 */
public class Deportivo extends Vehiculo {
    private int numeroPasajeros;
    private int numeroPuertas;
    private int numeroBolsasAire;
    private double caballosFuerza;
    private double tiempoCienKmh;

    /**
     * Constructor que inicializa un vehículo deportivo con los valores proporcionados.
     * 
     * @param marca Marca del vehículo deportivo.
     * @param estado Estado del vehículo (nuevo, usado, etc.).
     * @param modelo Modelo del vehículo.
     * @param placa Placa del vehículo.
     * @param cambios Número de cambios o marchas.
     * @param velocidadMaxima Velocidad máxima del vehículo en km/h.
     * @param cilindraje Cilindraje del motor.
     * @param combustible Tipo de combustible que utiliza (gasolina, diésel, etc.).
     * @param transmisionAutomatica Indica si la transmisión es automática.
     * @param numeroPasajeros Número de pasajeros que puede transportar.
     * @param numeroPuertas Número de puertas del vehículo.
     * @param numeroBolsasAire Número de bolsas de aire con las que cuenta el vehículo.
     * @param caballosFuerza Potencia del motor en caballos de fuerza.
     * @param tiempoCienKmh Tiempo en segundos que tarda el vehículo en alcanzar los 100 km/h.
     */
    public Deportivo(String marca, String estado, String modelo, String placa, int cambios, double velocidadMaxima, double cilindraje, String combustible, boolean transmisionAutomatica, int numeroPasajeros, int numeroPuertas, int numeroBolsasAire, double caballosFuerza, double tiempoCienKmh) {
        super(marca, estado, modelo, placa, cambios, velocidadMaxima, cilindraje, combustible, transmisionAutomatica);
        this.numeroPasajeros = numeroPasajeros;
        this.numeroPuertas = numeroPuertas;
        this.numeroBolsasAire = numeroBolsasAire;
        this.caballosFuerza = caballosFuerza;
        this.tiempoCienKmh = tiempoCienKmh;
    }

    /**
     * Constructor por defecto de la clase Deportivo.
     * Inicializa una instancia de vehículo deportivo sin valores predefinidos.
     */
    public Deportivo() {
    }

    /**
     * Obtiene el número de pasajeros que puede transportar el vehículo.
     * 
     * @return Número de pasajeros.
     */
    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    /**
     * Establece el número de pasajeros que puede transportar el vehículo.
     * 
     * @param numeroPasajeros Número de pasajeros.
     */
    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    /**
     * Obtiene el número de puertas del vehículo.
     * 
     * @return Número de puertas.
     */
    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    /**
     * Establece el número de puertas del vehículo.
     * 
     * @param numeroPuertas Número de puertas.
     */
    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    /**
     * Obtiene el número de bolsas de aire del vehículo.
     * 
     * @return Número de bolsas de aire.
     */
    public int getNumeroBolsasAire() {
        return numeroBolsasAire;
    }

    /**
     * Establece el número de bolsas de aire del vehículo.
     * 
     * @param numeroBolsasAire Número de bolsas de aire.
     */
    public void setNumeroBolsasAire(int numeroBolsasAire) {
        this.numeroBolsasAire = numeroBolsasAire;
    }

    /**
     * Obtiene la cantidad de caballos de fuerza del vehículo.
     * 
     * @return Caballos de fuerza.
     */
    public double getCaballosFuerza() {
        return caballosFuerza;
    }

    /**
     * Establece la cantidad de caballos de fuerza del vehículo.
     * 
     * @param caballosFuerza Caballos de fuerza.
     */
    public void setCaballosFuerza(double caballosFuerza) {
        this.caballosFuerza = caballosFuerza;
    }

    /**
     * Obtiene el tiempo que tarda el vehículo en alcanzar los 100 km/h.
     * 
     * @return Tiempo en segundos para llegar a 100 km/h.
     */
    public double getTiempoCienKmh() {
        return tiempoCienKmh;
    }

    /**
     * Establece el tiempo que tarda el vehículo en alcanzar los 100 km/h.
     * 
     * @param tiempoCienKmh Tiempo en segundos.
     */
    public void setTiempoCienKmh(double tiempoCienKmh) {
        this.tiempoCienKmh = tiempoCienKmh;
    }

    /**
     * Método que devuelve una representación en formato de texto del vehículo deportivo.
     * 
     * @return Una cadena de texto con todos los atributos del vehículo deportivo.
     */
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
