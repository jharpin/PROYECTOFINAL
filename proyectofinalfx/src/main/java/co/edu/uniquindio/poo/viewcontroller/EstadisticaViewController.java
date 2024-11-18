package co.edu.uniquindio.poo.viewcontroller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;
import java.time.LocalDate;
import java.util.List;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.model.Empresa;
import co.edu.uniquindio.poo.model.Vehiculo;
import co.edu.uniquindio.poo.model.Venta;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;

public class EstadisticaViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnGenerar;

    @FXML
    private DatePicker dtpFin;

    @FXML
    private DatePicker dtpInicio;

    private PrincipalViewController principalViewController;

    @FXML
    void onGenerar(ActionEvent event) {
        validarFechas();
    }

    private void validarFechas(){
        LocalDate startDate = dtpInicio.getValue();
        LocalDate endDate = dtpFin.getValue();
        if (startDate != null && endDate != null && startDate.isBefore(endDate)) {
            generarReportePDFVentas(startDate, endDate);
        } else {
            principalViewController.mostrarAlerta(Alert.AlertType.WARNING, "Fechas no válidas", "Por favor selecciona un rango de fechas válido.");
        }
    }

    private void generarReportePDFVentas(LocalDate startDate, LocalDate endDate) {
        try {
            String projectDir = new File("").getAbsolutePath();
            String reportPath = projectDir + "/src/main/resources/co/edu/uniquindio/proyecto_final/reportes";
            File reportesDir = new File(reportPath);
            if (!reportesDir.exists()) {
                reportesDir.mkdirs();
            }
            File pdfFile = new File(reportesDir, "Reporte_Ventas.pdf");
            Document documento = new Document();
            OutputStream outputStream = new FileOutputStream(pdfFile);
            PdfWriter.getInstance(documento, outputStream);
            documento.open();
            Font titleFont = new Font(Font.FontFamily.HELVETICA, 20, Font.BOLD);
            Paragraph title = new Paragraph("Reporte de Ventas", titleFont);
            title.setAlignment(Element.ALIGN_CENTER);
            documento.add(title);
            documento.add(new Paragraph(" "));
            PdfPTable table = new PdfPTable(9);
            table.setWidthPercentage(100);
            table.addCell("ID Venta");
            table.addCell("Cliente");
            table.addCell("Empleado");
            table.addCell("Marca");
            table.addCell("Modelo");
            table.addCell("Estado");
            table.addCell("Placa");
            table.addCell("Fecha");
            table.addCell("Precio");
            List<Venta> ventas = Empresa.getInstancia().getListaVentas();
            for (Venta venta : ventas) {
                if (!venta.getFecha().isBefore(startDate) && !venta.getFecha().isAfter(endDate)) {
                    table.addCell(String.valueOf(venta.getIdVenta()));
                    table.addCell(venta.getCliente().getNombre());
                    table.addCell(venta.getEmpleado().getNombre());
                    Vehiculo vehiculo = venta.getVehiculo();
                    table.addCell(vehiculo.getMarca());
                    table.addCell(vehiculo.getModelo());
                    table.addCell(vehiculo.getEstado());
                    table.addCell(vehiculo.getPlaca());
                    table.addCell(venta.getFecha().toString());
                    String formattedPrice = String.format("%.2f", venta.getPrecio());
                    table.addCell(formattedPrice);
                }
            }
            documento.add(table);
            documento.close();
            outputStream.close();
            principalViewController.mostrarAlerta(Alert.AlertType.INFORMATION, "Éxito", "El reporte ha sido generado en: " + pdfFile.getAbsolutePath());
        } catch (DocumentException | IOException e) {
           principalViewController.mostrarAlerta(Alert.AlertType.ERROR, "Error", "No se pudo generar el reporte: " + e.getMessage());
            e.printStackTrace();
        }
    }

    @FXML
    void initialize() {
        principalViewController = new PrincipalViewController();
        btnGenerar.setOnAction(this::onGenerar);
    }

}
