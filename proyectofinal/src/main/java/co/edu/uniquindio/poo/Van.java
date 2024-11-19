package co.edu.uniquindio.poo;

/**
 * Clase que representa una Van, que es un tipo de vehículo específico.
 * Esta clase hereda de la clase abstracta Vehiculo e incluye atributos específicos
 * para las Vans, como número de pasajeros, número de puertas, capacidad del maletero,
 * características de seguridad, entre otras.
 */
public class Van extends Vehiculo {

    // Atributos específicos de la clase Van
    private int numeroPasajeros;   // Número de pasajeros que puede transportar la Van
    private int numeroPuertas;     // Número de puertas de la Van
    private double capacidadMaletero; // Capacidad del maletero en litros
    private boolean aireAcondicionado; // Indica si la Van tiene aire acondicionado
    private boolean camaraReversa;    // Indica si la Van tiene cámara de reversa
    private int numeroBolsasAire;    // Número de bolsas de aire en la Van
    private boolean abs;             // Indica si la Van tiene sistema de frenos ABS

    /**
     * Constructor para inicializar una instancia de la clase Van.
     * Este constructor establece los atributos de la Van y los de la clase base Vehiculo.
     *
     * @param marca              Marca del vehículo.
     * @param estado             Estado del vehículo (nuevo, usado, etc.).
     * @param modelo             Modelo del vehículo.
     * @param placa              Placa del vehículo.
     * @param cambios            Número de cambios de la transmisión.
     * @param velocidadMaxima    Velocidad máxima que puede alcanzar la Van.
     * @param cilindraje         Cilindraje del motor de la Van.
     * @param combustible        Tipo de combustible que usa la Van.
     * @param transmisionAutomatica  Indica si la Van tiene transmisión automática.
     * @param numeroPasajeros    Número de pasajeros que puede transportar la Van.
     * @param numeroPuertas      Número de puertas de la Van.
     * @param capacidadMaletero  Capacidad del maletero en litros.
     * @param aireAcondicionado  Si tiene o no aire acondicionado.
     * @param camaraReversa      Si tiene o no cámara de reversa.
     * @param numeroBolsasAire   Número de bolsas de aire de la Van.
     * @param abs                Si tiene o no el sistema de frenos ABS.
     */
    public Van(String marca, String estado, String modelo, String placa, int cambios, double velocidadMaxima, 
               double cilindraje, String combustible, boolean transmisionAutomatica, int numeroPasajeros, 
               int numeroPuertas, double capacidadMaletero, boolean aireAcondicionado, boolean camaraReversa, 
               int numeroBolsasAire, boolean abs) {
        super(marca, estado, modelo, placa, cambios, velocidadMaxima, cilindraje, combustible, transmisionAutomatica);
        this.numeroPasajeros = numeroPasajeros;
        this.numeroPuertas = numeroPuertas;
        this.capacidadMaletero = capacidadMaletero;
        this.aireAcondicionado = aireAcondicionado;
        this.camaraReversa = camaraReversa;
        this.numeroBolsasAire = numeroBolsasAire;
        this.abs = abs;
    }

    // Métodos Getter y Setter para cada uno de los atributos

    /**
     * Obtiene el número de pasajeros que puede transportar la Van.
     *
     * @return El número de pasajeros.
     */
    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    /**
     * Establece el número de pasajeros que puede transportar la Van.
     *
     * @param numeroPasajeros El número de pasajeros a establecer.
     */
    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    /**
     * Obtiene el número de puertas de la Van.
     *
     * @return El número de puertas.
     */
    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    /**
     * Establece el número de puertas de la Van.
     *
     * @param numeroPuertas El número de puertas a establecer.
     */
    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    /**
     * Obtiene la capacidad del maletero de la Van.
     *
     * @return La capacidad del maletero en litros.
     */
    public double getCapacidadMaletero() {
        return capacidadMaletero;
    }

    /**
     * Establece la capacidad del maletero de la Van.
     *
     * @param capacidadMaletero La capacidad a establecer.
     */
    public void setCapacidadMaletero(double capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }

    /**
     * Obtiene si la Van tiene aire acondicionado.
     *
     * @return true si tiene aire acondicionado, false en caso contrario.
     */
    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    /**
     * Establece si la Van tiene aire acondicionado.
     *
     * @param aireAcondicionado true si tiene aire acondicionado, false en caso contrario.
     */
    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    /**
     * Obtiene si la Van tiene cámara de reversa.
     *
     * @return true si tiene cámara de reversa, false en caso contrario.
     */
    public boolean isCamaraReversa() {
        return camaraReversa;
    }

    /**
     * Establece si la Van tiene cámara de reversa.
     *
     * @param camaraReversa true si tiene cámara de reversa, false en caso contrario.
     */
    public void setCamaraReversa(boolean camaraReversa) {
        this.camaraReversa = camaraReversa;
    }

    /**
     * Obtiene el número de bolsas de aire de la Van.
     *
     * @return El número de bolsas de aire.
     */
    public int getNumeroBolsasAire() {
        return numeroBolsasAire;
    }

    /**
     * Establece el número de bolsas de aire de la Van.
     *
     * @param numeroBolsasAire El número de bolsas de aire a establecer.
     */
    public void setNumeroBolsasAire(int numeroBolsasAire) {
        this.numeroBolsasAire = numeroBolsasAire;
    }

    /**
     * Obtiene si la Van tiene sistema de frenos ABS.
     *
     * @return true si tiene ABS, false en caso contrario.
     */
    public boolean isAbs() {
        return abs;
    }

    /**
     * Establece si la Van tiene sistema de frenos ABS.
     *
     * @param abs true si tiene ABS, false en caso contrario.
     */
    public void setAbs(boolean abs) {
        this.abs = abs;
    }

    /**
     * Método que devuelve una representación en cadena del objeto Van.
     *
     * @return Una cadena que describe el objeto Van con sus atributos específicos.
     */
    @Override
    public String toString() {
        return "Van{" +
                "numeroPasajeros=" + numeroPasajeros +
                ", numeroPuertas=" + numeroPuertas +
                ", capacidadMaletero=" + capacidadMaletero +
                ", aireAcondicionado=" + aireAcondicionado +
                ", camaraReversa=" + camaraReversa +
                ", numeroBolsasAire=" + numeroBolsasAire +
                ", abs=" + abs +
                '}'; // Devuelve la representación de los atributos en forma de cadena.
    }
}
