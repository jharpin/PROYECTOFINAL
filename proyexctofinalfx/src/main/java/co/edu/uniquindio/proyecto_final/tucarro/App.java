package co.edu.uniquindio.proyecto_final.tucarro;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("Login.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("PROYECTO TU CARRO UQ");
        stage.setScene(scene);
        stage.setResizable(false);
        Image icono = new Image(getClass().getResourceAsStream("/co/edu/uniquindio/proyecto_final/img/proyecto/icono.png"));
        stage.getIcons().add(icono);
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}