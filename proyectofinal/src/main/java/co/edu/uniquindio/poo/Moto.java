package co.edu.uniquindio.poo;

public class Moto extends Vehiculo {
    private int cilindraje;
    private int velocidadMaxima;
    
    

    // Constructor
    public Moto(String marca, int modelo, boolean nuevo,Transmision transmision, String tipoCombustible,
                int cilindraje, int velocidadMaxima) {
        super(marca, modelo, nuevo, transmision, tipoCombustible);
        this.cilindraje = cilindraje;
        this.velocidadMaxima = velocidadMaxima;
       
    }
    @Override
    public boolean revisionTecnica() {
       
        System.out.println("Revisión técnica realizada para la moto.");
        return true; // Por ejemplo: devuelve true si la camioneta pasa la revisión
    }

    // Métodos getters y setters
    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

   

    @Override
    public String toString() {
        return  super.toString()+"Moto [cilindraje=" + cilindraje + ", velocidadMaxima=" + velocidadMaxima + ", tipoMoto=" 
                + "]";
    }

    
}

