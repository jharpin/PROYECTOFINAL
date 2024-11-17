package co.edu.uniquindio.poo;

public class Combustible {
    private TipoCombustible tipoCombustible; // Enum TipoCombustible
    private Integer autonomia; // Solo para eléctricos
    private Integer tiempoCarga; // Solo para eléctricos
    private Boolean enchufable; // Solo para híbridos
    private Boolean hibridoLigero; // Solo para híbridos

    // Constructor para combustibles básicos
    public Combustible(TipoCombustible tipoCombustible) {
        if (tipoCombustible != TipoCombustible.GASOLINA && tipoCombustible != TipoCombustible.DIESEL) {
            throw new IllegalArgumentException("El tipo debe ser 'Gasolina' o 'Diésel'.");
        }
        this.tipoCombustible = tipoCombustible;
    }

    // Constructor para eléctricos
    public Combustible(TipoCombustible tipoCombustible, Integer autonomia, Integer tiempoCarga) {
        if (tipoCombustible != TipoCombustible.ELECTRICO) {
            throw new IllegalArgumentException("Autonomía y tiempo de carga solo aplican a 'Eléctrico'.");
        }
        this.tipoCombustible = tipoCombustible;
        this.autonomia = autonomia;
        this.tiempoCarga = tiempoCarga;
    }

    // Constructor para híbridos
    public Combustible(TipoCombustible tipoCombustible, Boolean enchufable, Boolean hibridoLigero) {
        if (tipoCombustible != TipoCombustible.HIBRIDO) {
            throw new IllegalArgumentException("Enchufable y híbrido ligero solo aplican a 'Híbrido'.");
        }
        this.tipoCombustible = tipoCombustible;
        this.enchufable = enchufable;
        this.hibridoLigero = hibridoLigero;
    }

    // Getters y setters
    public TipoCombustible getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(TipoCombustible tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
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
