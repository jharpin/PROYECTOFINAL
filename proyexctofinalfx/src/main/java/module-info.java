module co.edu.uniquindio.proyecto_final.tucarro {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires itextpdf;
    requires org.jfree.jfreechart;
    requires  org.junit.jupiter.engine;
    requires org.junit.jupiter.api;
    requires org.testng;


    opens co.edu.uniquindio.proyecto_final.tucarro to javafx.fxml;
    opens co.edu.uniquindio.proyecto_final.tucarro.viewcontroller to javafx.fxml;
    exports co.edu.uniquindio.proyecto_final.tucarro;

}
