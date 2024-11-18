package co.edu.uniquindio.poo.model.Enum;

public enum PreguntasSeguridad {

    COLOR_FAVORITO("¿Cuál es tu color favorito?"),
    CIUDAD_NACIMIENTO("¿En qué ciudad naciste?"),
    COMIDA_FAVORITA("¿Cuál es tu comida favorita?"),
    DEPORTE_FAVORITO("¿Cuál es tu deporte favorito?");

    private final String pregunta;

    PreguntasSeguridad(String pregunta) {
        this.pregunta = pregunta;
    }

    @Override
    public String toString() {
        return pregunta;
    }
}
