package co.edu.uniquindio.proyecto_final.tucarro.model;

import javafx.beans.property.SimpleStringProperty;

public class PreguntaSeguridad {
    private final SimpleStringProperty pregunta;

    public PreguntaSeguridad(String pregunta) {
        this.pregunta = new SimpleStringProperty(pregunta);
    }

    public String getPregunta() {
        return pregunta.get();
    }

    public SimpleStringProperty preguntaProperty() {
        return pregunta;
    }


}