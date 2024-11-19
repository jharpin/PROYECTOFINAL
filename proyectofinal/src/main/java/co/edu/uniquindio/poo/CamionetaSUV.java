package co.edu.uniquindio.poo;

/**
 * Clase que representa una Camioneta SUV, un tipo específico de vehículo que extiende la clase {@link Vehiculo}.
 * Esta clase incluye características específicas para una camioneta SUV, como el número de pasajeros, puertas, 
 * capacidad del maletero, sistemas de seguridad y otros atributos relevantes.
 */
public class CamionetaSUV extends Vehiculo {
    private int numeroPasajeros;                // Número de pasajeros que puede transportar la camioneta.
    private int numeroPuertas;                  // Número de puertas en la camioneta.
    private double capacidadMaletero;           // Capacidad del maletero en litros.
    private boolean aireAcondicionado;          // Indica si la camioneta tiene aire acondicionado.
    private boolean camaraReversa;              // Indica si la camioneta tiene cámara de reversa.
    private boolean velocidadCrucero;           // Indica si la camioneta tiene control de velocidad crucero.
    private int numeroBolsasAire;               // Número de bolsas de aire que tiene la camioneta.
    private boolean abs;                        // Indica si la camioneta tiene sistema de frenos ABS.
    private boolean sensoresColision;           // Indica si la camioneta tiene sensores de colisión.
    private boolean sensorTraficoCruzado;       // Indica si la camioneta tiene sensor de tráfico cruzado.
    private boolean asistentePermanenciaCarril; // Indica si la camioneta tiene asistente de permanencia en carril.
    private boolean esCuatroPorCuatro;          // Indica si la camioneta es de tracción en las cuatro ruedas.

    /**
     * Constructor que inicializa los atributos de la camioneta SUV.
     * 
     * @param marca Marca del vehículo.
     * @param estado Estado del vehículo.
     * @param modelo Modelo del vehículo.
     * @param placa Placa del vehículo.
     * @param cambios Número de cambios del vehículo.
     * @param velocidadMaxima Velocidad máxima del vehículo en km/h.
     * @param cilindraje Cilindraje del motor del vehículo.
     * @param combustible Tipo de combustible que utiliza el vehículo.
     * @param transmisionAutomatica Indica si el vehículo tiene transmisión automática.
     * @param numeroPasajeros Número de pasajeros que puede transportar la camioneta.
     * @param numeroPuertas Número de puertas de la camioneta.
     * @param capacidadMaletero Capacidad del maletero de la camioneta en litros.
     * @param aireAcondicionado Indica si la camioneta tiene aire acondicionado.
     * @param camaraReversa Indica si la camioneta tiene cámara de reversa.
     * @param velocidadCrucero Indica si la camioneta tiene control de velocidad crucero.
     * @param numeroBolsasAire Número de bolsas de aire en la camioneta.
     * @param abs Indica si la camioneta tiene sistema de frenos ABS.
     * @param sensoresColision Indica si la camioneta tiene sensores de colisión.
     * @param sensorTraficoCruzado Indica si la camioneta tiene sensor de tráfico cruzado.
     * @param asistentePermanenciaCarril Indica si la camioneta tiene asistente de permanencia en carril.
     * @param esCuatroPorCuatro Indica si la camioneta tiene tracción en las cuatro ruedas.
     */
    public CamionetaSUV(String marca, String estado, String modelo, String placa, int cambios, double velocidadMaxima, double cilindraje, String combustible, boolean transmisionAutomatica, int numeroPasajeros, int numeroPuertas, double capacidadMaletero, boolean aireAcondicionado, boolean camaraReversa, boolean velocidadCrucero, int numeroBolsasAire, boolean abs, boolean sensoresColision, boolean sensorTraficoCruzado, boolean asistentePermanenciaCarril, boolean esCuatroPorCuatro) {
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
        this.esCuatroPorCuatro = esCuatroPorCuatro;
    }

    // Constructor por defecto
    public CamionetaSUV(){
    }

    // Métodos getter y setter para los atributos.

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

    public boolean isEsCuatroPorCuatro() {
        return esCuatroPorCuatro;
    }

    public void setEsCuatroPorCuatro(boolean esCuatroPorCuatro) {
        this.esCuatroPorCuatro = esCuatroPorCuatro;
    }

    /**
     * Método toString que devuelve una representación en forma de cadena de texto de la camioneta SUV.
     * 
     * @return Representación en cadena de texto de la camioneta SUV.
     */
    @Override
    public String toString() {
        return "CamionetaSUV{" +
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
                ", esCuatroPorCuatro=" + esCuatroPorCuatro +
                '}';
    }
}
