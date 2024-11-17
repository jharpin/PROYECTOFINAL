package co.edu.uniquindio.poo;

public class Combustible {
    private TipoCombustible tipo; // Enum para definir tipos de combustible
    private Integer autonomia; // Solo para eléctricos
    private Integer tiempoCarga; // Solo para eléctricos
    private Boolean enchufable; // Solo para híbridos
    private Boolean hibridoLigero; // Solo para híbridos

    // Constructor para combustibles básicos
    public Combustible(TipoCombustible tipo) {
        if (tipo != TipoCombustible.GASOLINA && tipo != TipoCombustible.DIESEL) {
            throw new IllegalArgumentException("El tipo debe ser 'GASOLINA' o 'DIESEL'.");
        }
        this.tipo = tipo;
    }

    // Constructor para eléctricos
    public Combustible(TipoCombustible tipo, Integer autonomia, Integer tiempoCarga) {
        if (tipo != TipoCombustible.ELECTRICO) {
            throw new IllegalArgumentException("Autonomía y tiempo de carga solo aplican a 'ELECTRICO'.");
        }
        this.tipo = tipo;
        this.autonomia = autonomia;
        this.tiempoCarga = tiempoCarga;
    }

    // Constructor para híbridos
    public Combustible(TipoCombustible tipo, Boolean enchufable, Boolean hibridoLigero) {
        if (tipo != TipoCombustible.HIBRIDO) {
            throw new IllegalArgumentException("Enchufable y híbrido ligero solo aplican a 'HIBRIDO'.");
        }
        this.tipo = tipo;
        this.enchufable = enchufable;
        this.hibridoLigero = hibridoLigero;
    }

    // Getters y setters
    public TipoCombustible getTipo() {
        return tipo;
    }

    public void setTipo(TipoCombustible tipo) {
        this.tipo = tipo;
    }

    public Integer getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(Integer autonomia) {
        this.autonomia = autonomia;
    }

    public Integer getTiempoCarga() {
        return tiempoCarga;
    }

    public void setTiempoCarga(Integer tiempoCarga) {
        this.tiempoCarga = tiempoCarga;
    }

    public Boolean getEnchufable() {
        return enchufable;
    }

    public void setEnchufable(Boolean enchufable) {
        this.enchufable = enchufable;
    }

    public Boolean getHibridoLigero() {
        return hibridoLigero;
    }

    public void setHibridoLigero(Boolean hibridoLigero) {
        this.hibridoLigero = hibridoLigero;
    }
}