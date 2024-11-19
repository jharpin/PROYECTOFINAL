package co.edu.uniquindio.poo;

/**
 * Clase que representa un vehículo tipo Sedan, que extiende de la clase `Vehiculo`.
 * Un Sedan es un tipo de automóvil con características específicas como el número de pasajeros,
 * puertas, capacidad del maletero y varios sistemas de asistencia y seguridad.
 * Esta clase permite crear objetos que modelan automóviles Sedan con atributos adicionales
 * relacionados con la comodidad y la seguridad.
 */
public class Sedan extends Vehiculo {

    // Atributos específicos del Sedan
    private int numeroPasajeros;            // Número de pasajeros que puede transportar el vehículo.
    private int numeroPuertas;              // Número de puertas del vehículo.
    private double capacidadMaletero;       // Capacidad del maletero en litros.
    private boolean aireAcondicionado;      // Indica si el vehículo tiene aire acondicionado.
    private boolean camaraReversa;          // Indica si el vehículo tiene cámara de reversa.
    private boolean velocidadCrucero;       // Indica si el vehículo tiene control de velocidad crucero.
    private int numeroBolsasAire;           // Número de bolsas de aire del vehículo.
    private boolean abs;                    // Indica si el vehículo tiene frenos ABS.
    private boolean sensoresColision;       // Indica si el vehículo tiene sensores de colisión.
    private boolean sensorTraficoCruzado;   // Indica si el vehículo tiene sensor de tráfico cruzado.
    private boolean asistentePermanenciaCarril; // Indica si el vehículo tiene asistente de permanencia en carril.

    /**
     * Constructor de la clase Sedan que permite inicializar todos los atributos del vehículo.
     *
     * @param marca                       Marca del vehículo.
     * @param estado                      Estado del vehículo (nuevo, usado, etc.).
     * @param modelo                      Modelo del vehículo.
     * @param placa                       Placa del vehículo.
     * @param cambios                     Número de cambios del vehículo.
     * @param velocidadMaxima             Velocidad máxima del vehículo.
     * @param cilindraje                  Cilindraje del vehículo.
     * @param combustible                 Tipo de combustible que usa el vehículo.
     * @param transmisionAutomatica       Indica si el vehículo tiene transmisión automática.
     * @param numeroPasajeros             Número de pasajeros que puede transportar el vehículo.
     * @param numeroPuertas               Número de puertas del vehículo.
     * @param capacidadMaletero           Capacidad del maletero en litros.
     * @param aireAcondicionado           Indica si el vehículo tiene aire acondicionado.
     * @param camaraReversa               Indica si el vehículo tiene cámara de reversa.
     * @param velocidadCrucero            Indica si el vehículo tiene control de velocidad crucero.
     * @param numeroBolsasAire            Número de bolsas de aire del vehículo.
     * @param abs                         Indica si el vehículo tiene frenos ABS.
     * @param sensoresColision            Indica si el vehículo tiene sensores de colisión.
     * @param sensorTraficoCruzado        Indica si el vehículo tiene sensor de tráfico cruzado.
     * @param asistentePermanenciaCarril  Indica si el vehículo tiene asistente de permanencia en carril.
     */
    public Sedan(String marca, String estado, String modelo, String placa,
                 int cambios, double velocidadMaxima, double cilindraje,
                 String combustible, boolean transmisionAutomatica,
                 int numeroPasajeros, int numeroPuertas, double capacidadMaletero,
                 boolean aireAcondicionado, boolean camaraReversa, boolean velocidadCrucero, int numeroBolsasAire,
                 boolean abs, boolean sensoresColision, boolean sensorTraficoCruzado, boolean asistentePermanenciaCarril) {
        super(marca, estado, modelo, placa, cambios, velocidadMaxima, cilindraje, combustible, transmisionAutomatica);
        this.numeroPasajeros = numeroPasajeros;
        this.numeroPuertas = numeroPuertas;
        this.capacidadMaletero = capacidadMaletero;
        this.aireAcondicionado = aireAcondicionado;
        this.camaraReversa = camaraReversa;
        this.velocidadCrucero = velocidadCrucero;
        this.numeroBolsasAire = numeroBolsasAire;
        this.abs = abs;
        this.sensoresColision = sensoresColision;
        this.sensorTraficoCruzado = sensorTraficoCruzado;
        this.asistentePermanenciaCarril = asistentePermanenciaCarril;
    }

    /**
     * Constructor por defecto de la clase Sedan.
     * Inicializa el objeto con los valores por defecto de cada atributo.
     */
    public Sedan(){
    }

    // Métodos Getter y Setter para cada atributo

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

    public boolean isVelocidadCrucero() {
        return velocidadCrucero;
    }

    public void setVelocidadCrucero(boolean velocidadCrucero) {
        this.velocidadCrucero = velocidadCrucero;
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

    public boolean isSensoresColision() {
        return sensoresColision;
    }

    public void setSensoresColision(boolean sensoresColision) {
        this.sensoresColision = sensoresColision;
    }

    public boolean isSensorTraficoCruzado() {
        return sensorTraficoCruzado;
    }

    public void setSensorTraficoCruzado(boolean sensorTraficoCruzado) {
        this.sensorTraficoCruzado = sensorTraficoCruzado;
    }

    public boolean isAsistentePermanenciaCarril() {
        return asistentePermanenciaCarril;
    }

    public void setAsistentePermanenciaCarril(boolean asistentePermanenciaCarril) {
        this.asistentePermanenciaCarril = asistentePermanenciaCarril;
    }

    /**
     * Sobrescribe el método `toString()` para proporcionar una representación en cadena
     * del objeto `Sedan`, incluyendo todos sus atributos.
     *
     * @return Una cadena que representa al vehículo Sedan.
     */
    @Override
    public String toString() {
        return "Sedan{" +
                "numeroPasajeros=" + numeroPasajeros +
                ", numeroPuertas=" + numeroPuertas +
                ", capacidadMaletero=" + capacidadMaletero +
                ", aireAcondicionado=" + aireAcondicionado +
                ", camaraReversa=" + camaraReversa +
                ", velocidadCrucero=" + velocidadCrucero +
                ", numeroBolsasAire=" + numeroBolsasAire +
                ", abs=" + abs +
                ", sensoresColision=" + sensoresColision +
                ", sensorTraficoCruzado=" + sensorTraficoCruzado +
                ", asistentePermanenciaCarril=" + asistentePermanenciaCarril +
                '}';
    }
}
