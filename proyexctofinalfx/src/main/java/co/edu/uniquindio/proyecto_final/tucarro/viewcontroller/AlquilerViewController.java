package co.edu.uniquindio.proyecto_final.tucarro.viewcontroller;

import java.io.*;
import java.net.URL;
import java.time.LocalDate;
import java.util.List;
import java.util.ResourceBundle;

import co.edu.uniquindio.proyecto_final.tucarro.model.Alquiler;
import co.edu.uniquindio.proyecto_final.tucarro.model.Vehiculo;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import co.edu.uniquindio.proyecto_final.tucarro.model.Empresa;

public class AlquilerViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnGenerarReporteAlquiler;

    @FXML
    private DatePicker dtpFinAlquiler;

    @FXML
    private DatePicker dtpInicioAlquiler;

    private PrincipalViewController principalViewController;


    private void validar(){
        LocalDate fechaInicio = dtpInicioAlquiler.getValue();
        LocalDate fechaFinal = dtpFinAlquiler.getValue();
        if (fechaInicio != null && fechaFinal != null && fechaInicio.isBefore(fechaFinal)) {
            generarReportePDFAlquiler(fechaInicio, fechaFinal);
        } else {
            principalViewController.mostrarAlerta(Alert.AlertType.WARNING, "Fechas no válidas", "Por favor selecciona un rango de fechas válido.");
        }
    }

    private void generarReportePDFAlquiler(LocalDate fechaInicio, LocalDate fechaFinal) {
        try {
            String projectDir = new File("").getAbsolutePath();
            String reportPath = projectDir + "/src/main/resources/co/edu/uniquindio/proyecto_final/reportes";
            File reportesDir = new File(reportPath);
            if (!reportesDir.exists()) {
                reportesDir.mkdirs();
            }
            File pdfFile = new File(reportesDir, "Reporte_Alquileres.pdf");
            Document documento = new Document();
            OutputStream outputStream = new FileOutputStream(pdfFile);
            PdfWriter.getInstance(documento, outputStream);
            documento.open();
            Font titleFont = new Font(Font.FontFamily.HELVETICA, 20, Font.BOLD);
            Paragraph title = new Paragraph("Reporte de Alquileres", titleFont);
            title.setAlignment(Element.ALIGN_CENTER);
            documento.add(title);
            documento.add(new Paragraph(" "));
            PdfPTable table = new PdfPTable(9);
            table.setWidthPercentage(100);
            table.addCell("ID Alquiler");
            table.addCell("Cliente");
            table.addCell("Empleado");
            table.addCell("Marca");
            table.addCell("Modelo");
            table.addCell("Placa");
            table.addCell("Fecha Inicio");
            table.addCell("Fecha Fin");
            table.addCell("Total");
            List<Alquiler> alquileres = Empresa.getInstancia().getListaAlquileres();
            for (Alquiler alquiler : alquileres) {
                if (!alquiler.getFechaInicio().isBefore(fechaInicio) && !alquiler.getFechaFin().isAfter(fechaFinal)) {
                    table.addCell(String.valueOf(alquiler.getIdAlquiler()));
                    table.addCell(alquiler.getCliente().getNombre());
                    table.addCell(alquiler.getEmpleado().getNombre());
                    Vehiculo vehiculo = alquiler.getVehiculo();
                    table.addCell(vehiculo.getMarca());
                    table.addCell(vehiculo.getModelo());
                    table.addCell(vehiculo.getPlaca());
                    table.addCell(alquiler.getFechaInicio().toString());
                    table.addCell(alquiler.getFechaFin().toString());
                    String formattedTotal = String.format("%.2f", alquiler.getTotal());
                    table.addCell(formattedTotal);
                }
            }
            documento.add(table);
            documento.close();
            outputStream.close();
            principalViewController.mostrarAlerta(Alert.AlertType.INFORMATION, "Éxito", "El reporte de alquileres ha sido generado en: " + pdfFile.getAbsolutePath());
        } catch (DocumentException | IOException e) {
            principalViewController.mostrarAlerta(Alert.AlertType.ERROR, "Error", "No se pudo generar el reporte de alquileres: " + e.getMessage());
            e.printStackTrace();
        }

    }


    @FXML
    void onGenerar(ActionEvent event) {
        validar();
    }

    @FXML
    void initialize() {
        principalViewController = new PrincipalViewController();
        btnGenerarReporteAlquiler.setOnAction(this::onGenerar);
    }

}
