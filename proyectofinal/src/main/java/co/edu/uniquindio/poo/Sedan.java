package co.edu.uniquindio.poo;

public class Sedan extends Vehiculo {
    private int numeroPasajeros;
    private int numeroPuertas;
    private int capacidadMaletero;
    private boolean aireAcondicionado;
    private boolean camaraReversa;
    private boolean velocidadCrucero;
    private int bolsasDeAire;
    private boolean ABS;
    private boolean sensoresColision;
    private boolean sensorTraficoCruzado;
    private boolean asistentePermanenciaCarril;

    // Constructor
    public Sedan(String marca, int modelo, boolean nuevo, String transmision, String tipoCombustible,
                 int numeroPasajeros, int numeroPuertas, int capacidadMaletero, boolean aireAcondicionado,
                 boolean camaraReversa, boolean velocidadCrucero, int bolsasDeAire, boolean ABS,
                 boolean sensoresColision, boolean sensorTraficoCruzado, boolean asistentePermanenciaCarril) {
        super(marca, modelo, nuevo, transmision, tipoCombustible);
        this.numeroPasajeros = numeroPasajeros;
        this.numeroPuertas = numeroPuertas;
        this.capacidadMaletero = capacidadMaletero;
        this.aireAcondicionado = aireAcondicionado;
        this.camaraReversa = camaraReversa;
        this.velocidadCrucero = velocidadCrucero;
        this.bolsasDeAire = bolsasDeAire;
        this.ABS = ABS;
        this.sensoresColision = sensoresColision;
        this.sensorTraficoCruzado = sensorTraficoCruzado;
        this.asistentePermanenciaCarril = asistentePermanenciaCarril;
    }

    // Métodos getters y setters
    public String tieneAireAcondicionado() {
        return aireAcondicionado ? "Sí" : "No";
    }
    public String tieneCamaraReversa() {
        return camaraReversa ? "Sí" : "No";
    }
    public String tieneVelocidadCrucero() {
        return velocidadCrucero? "Sí" : "No";
    }
    public String tieneABS() {
        return ABS? "Sí" : "No";
    }
    public String TieneSensoresColision() {
        return sensoresColision? "Sí" : "No";
    }
    public String tieneSensorTraficoCruzado() {
        return sensorTraficoCruzado? "Sí" : "No";
    }
    public String  asistentePermanenciaCarril() {
        return  asistentePermanenciaCarril? "Sí" : "No";
    }
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

    public int getCapacidadMaletero() {
        return capacidadMaletero;
    }

    public void setCapacidadMaletero(int capacidadMaletero) {
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

    public int getBolsasDeAire() {
        return bolsasDeAire;
    }

    public void setBolsasDeAire(int bolsasDeAire) {
        this.bolsasDeAire = bolsasDeAire;
    }

    public boolean isABS() {
        return ABS;
    }

    public void setABS(boolean ABS) {
        this.ABS = ABS;
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

    @Override
    public String toString() {
        return  super.toString()+"Sedan [numeroPasajeros=" + numeroPasajeros + ", numeroPuertas=" + numeroPuertas + ", capacidadMaletero="
                + capacidadMaletero + ", aireAcondicionado=" + aireAcondicionado + ", camaraReversa=" + camaraReversa
                + ", velocidadCrucero=" + velocidadCrucero + ", bolsasDeAire=" + bolsasDeAire + ", ABS=" + ABS
                + ", sensoresColision=" + sensoresColision + ", sensorTraficoCruzado=" + sensorTraficoCruzado
                + ", asistentePermanenciaCarril=" + asistentePermanenciaCarril + "]";
    }



    
}
