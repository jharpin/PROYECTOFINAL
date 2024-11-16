package co.edu.uniquindio.poo;

public class Moto extends Vehiculo {
    private int cilindraje;
    private int velocidadMaxima;
    private TipoMoto tipoMoto;

    // Constructor
    public Moto(String marca, int modelo, boolean nuevo, String transmision, String tipoCombustible,
                int cilindraje, int velocidadMaxima, TipoMoto tipoMoto) {
        super(marca, modelo, nuevo, transmision, tipoCombustible);
        this.cilindraje = cilindraje;
        this.velocidadMaxima = velocidadMaxima;
        this.tipoMoto = tipoMoto;
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

    public TipoMoto getTipoMoto() {
        return tipoMoto;
    }

    public void setTipoMoto(TipoMoto tipoMoto) {
        this.tipoMoto = tipoMoto;
    }
}

