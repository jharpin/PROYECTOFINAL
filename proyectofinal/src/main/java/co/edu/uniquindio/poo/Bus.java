package co.edu.uniquindio.poo;

/**
 * La clase <code>Bus</code> representa un vehículo tipo bus en el sistema. Hereda de la clase <code>Vehiculo</code>
 * y agrega propiedades específicas para describir un bus, como la cantidad de pasajeros, puertas, capacidades
 * adicionales y características de seguridad.
 * 
 * @author [Tu nombre]
 */
public class Bus extends Vehiculo {

    private int numeroPasajeros;
    private int numeroPuertas;
    private double capacidadMaletero;
    private boolean aireAcondicionado;
    private boolean camaraReversa;
    private int numeroBolsasAire;
    private boolean abs;
    private int numeroEjes;
    private int numeroSalidasEmergencia;

    /**
     * Constructor de la clase <code>Bus</code> que recibe todos los parámetros necesarios
     * para inicializar un bus con información específica.
     * 
     * @param marca El marca del vehículo.
     * @param estado El estado del vehículo (nuevo, usado, etc.).
     * @param modelo El modelo del vehículo.
     * @param placa La placa del vehículo.
     * @param cambios El número de cambios de velocidad.
     * @param velocidadMaxima La velocidad máxima del vehículo.
     * @param cilindraje El cilindraje del vehículo.
     * @param combustible El tipo de combustible que usa el vehículo.
     * @param transmisionAutomatica Indica si el vehículo tiene transmisión automática.
     * @param numeroPasajeros El número de pasajeros que puede transportar el bus.
     * @param numeroPuertas El número de puertas del bus.
     * @param capacidadMaletero La capacidad del maletero del bus en litros.
     * @param aireAcondicionado Indica si el bus tiene aire acondicionado.
     * @param camaraReversa Indica si el bus tiene cámara de reversa.
     * @param numeroBolsasAire El número de bolsas de aire del bus.
     * @param abs Indica si el bus tiene sistema de frenos ABS.
     * @param numeroEjes El número de ejes del bus.
     * @param numeroSalidasEmergencia El número de salidas de emergencia del bus.
     */
    public Bus(String marca, String estado, String modelo, String placa, int cambios, double velocidadMaxima, double cilindraje, String combustible, boolean transmisionAutomatica, int numeroPasajeros, int numeroPuertas, double capacidadMaletero, boolean aireAcondicionado,
               boolean camaraReversa, int numeroBolsasAire, boolean abs, int numeroEjes, int numeroSalidasEmergencia) {
        super(marca, estado, modelo, placa, cambios, velocidadMaxima, cilindraje, combustible, transmisionAutomatica);
        this.numeroPasajeros = numeroPasajeros;
        this.numeroPuertas = numeroPuertas;
        this.capacidadMaletero = capacidadMaletero;
        this.aireAcondicionado = aireAcondicionado;
        this.camaraReversa = camaraReversa;
        this.numeroBolsasAire = numeroBolsasAire;
        this.abs = abs;
        this.numeroEjes = numeroEjes;
        this.numeroSalidasEmergencia = numeroSalidasEmergencia;
    }

    // Métodos getter y setter
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

    public double getCapacidadMaletero() {
        return capacidadMaletero;
    }

    public void setCapacidadMaletero(double capacidadMaletero) {
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

    public int getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    public int getNumeroSalidasEmergencia() {
        return numeroSalidasEmergencia;
    }

    public void setNumeroSalidasEmergencia(int numeroSalidasEmergencia) {
        this.numeroSalidasEmergencia = numeroSalidasEmergencia;
    }

    /**
     * Devuelve una representación en forma de cadena del objeto <code>Bus</code>.
     * Esta cadena incluye todos los detalles clave del bus.
     * 
     * @return Una cadena con los detalles del bus.
     */
    @Override
    public String toString() {
        return "Bus{" +
                "numeroPasajeros=" + numeroPasajeros +
                ", numeroPuertas=" + numeroPuertas +
                ", capacidadMaletero=" + capacidadMaletero +
                ", aireAcondicionado=" + aireAcondicionado +
                ", camaraReversa=" + camaraReversa +
                ", numeroBolsasAire=" + numeroBolsasAire +
                ", abs=" + abs +
                ", numeroEjes=" + numeroEjes +
                ", numeroSalidasEmergencia=" + numeroSalidasEmergencia +
                '}';
    }
}
