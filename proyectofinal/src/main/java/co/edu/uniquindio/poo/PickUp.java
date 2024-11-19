package co.edu.uniquindio.poo;

/**
 * Clase que representa un vehículo de tipo PickUp, que es una extensión de la clase abstracta Vehiculo.
 * La clase PickUp incluye atributos específicos como el número de pasajeros, puertas, sistemas de seguridad
 * y características adicionales como la capacidad de la caja de carga.
 */
public class PickUp extends Vehiculo {

    // Atributos específicos de la clase PickUp
    private int numeroPasajeros;       // Número de pasajeros que puede transportar la PickUp
    private int numeroPuertas;         // Número de puertas del vehículo
    private boolean aireAcondicionado; // Indica si el vehículo tiene aire acondicionado
    private boolean camaraReversa;     // Indica si el vehículo tiene cámara de reversa
    private int numeroBolsasAire;     // Número de bolsas de aire disponibles en el vehículo
    private boolean abs;              // Indica si el vehículo tiene sistema de frenos ABS
    private boolean esCuatroPorCuatro; // Indica si el vehículo es de tracción 4x4
    private double capacidadCajaCarga; // Capacidad de la caja de carga de la PickUp, en litros o metros cúbicos

    /**
     * Constructor que inicializa todos los atributos de la clase PickUp, utilizando el constructor de la clase base Vehiculo.
     * 
     * @param marca Marca del vehículo
     * @param estado Estado del vehículo (nuevo, usado, etc.)
     * @param modelo Modelo del vehículo
     * @param placa Placa del vehículo
     * @param cambios Número de cambios o marchas del vehículo
     * @param velocidadMaxima Velocidad máxima del vehículo
     * @param cilindraje Cilindraje del motor del vehículo
     * @param combustible Tipo de combustible (gasolina, diésel, etc.)
     * @param transmisionAutomatica Indica si la transmisión es automática o manual
     * @param numeroPasajeros Número de pasajeros que puede transportar
     * @param numeroPuertas Número de puertas del vehículo
     * @param aireAcondicionado Si el vehículo tiene aire acondicionado
     * @param camaraReversa Si el vehículo tiene cámara de reversa
     * @param numeroBolsasAire Número de bolsas de aire en el vehículo
     * @param abs Si el vehículo tiene frenos ABS
     * @param esCuatroPorCuatro Si el vehículo es de tracción 4x4
     * @param capacidadCajaCarga Capacidad de la caja de carga
     */
    public PickUp(String marca, String estado, String modelo, String placa, int cambios, double velocidadMaxima, double cilindraje, String combustible, boolean transmisionAutomatica, int numeroPasajeros, int numeroPuertas, boolean aireAcondicionado, boolean camaraReversa, int numeroBolsasAire, boolean abs, boolean esCuatroPorCuatro, double capacidadCajaCarga) {
        super(marca, estado, modelo, placa, cambios, velocidadMaxima, cilindraje, combustible, transmisionAutomatica);
        this.numeroPasajeros = numeroPasajeros;
        this.numeroPuertas = numeroPuertas;
        this.aireAcondicionado = aireAcondicionado;
        this.camaraReversa = camaraReversa;
        this.numeroBolsasAire = numeroBolsasAire;
        this.abs = abs;
        this.esCuatroPorCuatro = esCuatroPorCuatro;
        this.capacidadCajaCarga = capacidadCajaCarga;
    }

    // Constructor vacío necesario para algunas instancias, como cuando se crean objetos de forma más general.
    public PickUp() {}

    // Métodos getter y setter para los atributos

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

    public int getNumeroBolsasAire() {
        return numeroBolsasAire;
    }

    public void setNumeroBolsasAire(int numeroBolsasAire) {
        this.numeroBolsasAire = numeroBolsasAire;
    }

    public boolean isAbs() {
        return abs;
    }

    public void setAbs(boolean abs) {
        this.abs = abs;
    }

    public boolean isEsCuatroPorCuatro() {
        return esCuatroPorCuatro;
    }

    public void setEsCuatroPorCuatro(boolean esCuatroPorCuatro) {
        this.esCuatroPorCuatro = esCuatroPorCuatro;
    }

    public double getCapacidadCajaCarga() {
        return capacidadCajaCarga;
    }

    public void setCapacidadCajaCarga(double capacidadCajaCarga) {
        this.capacidadCajaCarga = capacidadCajaCarga;
    }

    /**
     * Método sobrescrito para obtener una representación en cadena del objeto PickUp.
     * 
     * @return Cadena de texto con los detalles del PickUp, incluyendo los atributos específicos de la clase.
     */
    @Override
    public String toString() {
        return "PickUp{" +
                "numeroPasajeros=" + numeroPasajeros +
                ", numeroPuertas=" + numeroPuertas +
                ", aireAcondicionado=" + aireAcondicionado +
                ", camaraReversa=" + camaraReversa +
                ", numeroBolsasAire=" + numeroBolsasAire +
                ", abs=" + abs +
                ", esCuatroPorCuatro=" + esCuatroPorCuatro +
                ", capacidadCajaCarga=" + capacidadCajaCarga +
                '}';
    }
}
