package co.edu.uniquindio.poo;

public class Combustible {
    private TipoCombustible tipo; // Enum para definir tipos de combustible
    private Integer autonomia; // Solo para eléctricos
    private Integer tiempoCarga; // Solo para eléctricos
    private Boolean enchufable; // Solo para híbridos
    private Boolean hibridoLigero; // Solo para híbridos

    // Constructor para combustibles básicos (Gasolina y Diésel)
    public Combustible(TipoCombustible tipo) {
        if (tipo != TipoCombustible.GASOLINA && tipo != TipoCombustible.DIESEL) {
            throw new IllegalArgumentException("El tipo debe ser 'GASOLINA' o 'DIESEL'.");
        }
        this.tipo = tipo;
        this.autonomia = null;
        this.tiempoCarga = null;
        this.enchufable = null;
        this.hibridoLigero = null;
    }

    // Constructor para eléctricos
    public Combustible(TipoCombustible tipo, Integer autonomia, Integer tiempoCarga) {
        if (tipo != TipoCombustible.ELECTRICO) {
            throw new IllegalArgumentException("Autonomía y tiempo de carga solo aplican a 'ELECTRICO'.");
        }
        if (autonomia <= 0 || tiempoCarga <= 0) {
            throw new IllegalArgumentException("Autonomía y tiempo de carga deben ser mayores a 0.");
        }
        this.tipo = tipo;
        this.autonomia = autonomia;
        this.tiempoCarga = tiempoCarga;
        this.enchufable = null;
        this.hibridoLigero = null;
    }

    // Constructor para híbridos
    public Combustible(TipoCombustible tipo, Boolean enchufable, Boolean hibridoLigero) {
        if (tipo != TipoCombustible.HIBRIDO) {
            throw new IllegalArgumentException("Enchufable y híbrido ligero solo aplican a 'HIBRIDO'.");
        }
        this.tipo = tipo;
        this.enchufable = enchufable;
        this.hibridoLigero = !enchufable && hibridoLigero; // Solo puede ser híbrido ligero si no es enchufable
        this.autonomia = null;
        this.tiempoCarga = null;
    }

    // Getters
    public TipoCombustible getTipo() {
        return tipo;
    }

    public Integer getAutonomia() {
        return autonomia;
    }

    public Integer getTiempoCarga() {
        return tiempoCarga;
    }

    public Boolean getEnchufable() {
        return enchufable;
    }

    public Boolean getHibridoLigero() {
        return hibridoLigero;
    }

    // Método toString para mostrar detalles del combustible
    @Override
    public String toString() {
        StringBuilder detalle = new StringBuilder("Tipo: " + tipo);
        if (tipo == TipoCombustible.ELECTRICO) {
            detalle.append(", Autonomía: ").append(autonomia).append(" km");
            detalle.append(", Tiempo de carga: ").append(tiempoCarga).append(" horas");
        } else if (tipo == TipoCombustible.HIBRIDO) {
            detalle.append(", ¿Enchufable?: ").append(enchufable);
            detalle.append(", ¿Híbrido ligero?: ").append(hibridoLigero);
        }
        return detalle.toString();
    }
}
