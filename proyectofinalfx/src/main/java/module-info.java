module co.edu.uniquindio.poo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires itextpdf;
    requires org.jfree.jfreechart;

    opens co.edu.uniquindio.poo to javafx.fxml;
    opens co.edu.uniquindio.poo.viewcontroller to javafx.fxml;
    exports co.edu.uniquindio.poo;
}

