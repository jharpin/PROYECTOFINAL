package co.edu.uniquindio.poo;



public class Combustible {
    private String tipo; // 
    private Integer autonomia; // Solo para eléctricos
    private Integer tiempoCarga; // Solo para eléctricos
    private Boolean enchufable; // Solo para híbridos
    private Boolean hibridoLigero; // Solo para híbridos

    // Constructor para combustibles básicos
    public Combustible(String tipo) {
        if (!tipo.equalsIgnoreCase("Gasolina") && !tipo.equalsIgnoreCase("Diésel")) {
            throw new IllegalArgumentException("El tipo debe ser 'Gasolina' o 'Diésel'.");
        }
        this.tipo = tipo;
    }

    // Constructor para eléctricos
    public Combustible(String tipo, Integer autonomia, Integer tiempoCarga) {
        if (!tipo.equalsIgnoreCase("Eléctrico")) {
            throw new IllegalArgumentException("Autonomía y tiempo de carga solo aplican a 'Eléctrico'.");
        }
        this.tipo = tipo;
        this.autonomia = autonomia;
        this.tiempoCarga = tiempoCarga;
    }

    // Constructor para híbridos
    public Combustible(String tipo, Boolean enchufable, Boolean hibridoLigero) {
        if (!tipo.equalsIgnoreCase("Híbrido")) {
            throw new IllegalArgumentException("Enchufable y híbrido ligero solo aplican a 'Híbrido'.");
        }
        this.tipo = tipo;
        this.enchufable = enchufable;
        this.hibridoLigero = hibridoLigero;
    }

    // Getters y setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
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
