package co.edu.uniquindio.poo;

/**
 * Enumeración que define un conjunto de preguntas de seguridad utilizadas en el sistema
 * para la recuperación de contraseñas o validación de identidad.
 * Cada valor en el enum tiene una pregunta asociada.
 */
public enum PreguntasSeguridad {

    // Definición de las preguntas de seguridad posibles
    ANIMALFAVORITO("¿CUAL ES TU ANIMAL FAVORITO ?"),
    MATERIAFAVORITA("¿ CUAKL ES TU MATERI AFAVORITA  ?"),
    ACTIVIDADPREFERIDA("¿CUAL ES TU ACTIVIDAD PREFERIDA?"),
    CUALESTUPIRMERAMASCOTA("¿ CUAL FUE TU PRIMERA MASCOTA ?");
    
    

    // Atributo que almacena la pregunta asociada a cada valor del enum
    private final String pregunta;

    /**
     * Constructor de la enumeración. Inicializa el atributo pregunta con el valor proporcionado.
     *
     * @param pregunta La pregunta que será asociada con el valor del enum.
     */
    PreguntasSeguridad(String pregunta) {
        this.pregunta = pregunta;
    }

    /**
     * Sobrescribe el método `toString()` para devolver la pregunta asociada a cada valor del enum
     * cuando se convierta a una cadena de texto.
     *
     * @return La pregunta asociada a la constante del enum.
     */
    @Override
    public String toString() {
        return pregunta;
    }
}
