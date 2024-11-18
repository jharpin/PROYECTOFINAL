package co.edu.uniquindio.poo.viewcontroller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class PrincipalViewController {

    public void mostrarAlerta(Alert.AlertType tipo, String title, String content) {
        Alert alert = new Alert(tipo);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }

    public void navegarDatos(String nombreArchivoFxml) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(nombreArchivoFxml));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setTitle("TuCarroUQ");
            stage.setScene(scene);
            stage.setResizable(true);

            Image icono = new Image(getClass().getResourceAsStream("/co/edu/uniquindio/proyecto_final/img/proyecto/icono.png"));
            stage.getIcons().add(icono);

            // Centrar la ventana
            stage.setOnShown(event -> {
                stage.setX((java.awt.Toolkit.getDefaultToolkit().getScreenSize().getWidth() - stage.getWidth()) / 2);
                stage.setY((java.awt.Toolkit.getDefaultToolkit().getScreenSize().getHeight() - stage.getHeight()) / 2);
            });

            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }





}


