package Modelo.Animal;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.*;
import java.util.ArrayList;

public class ExportarPDF implements EstrategiaExportar {

    public void exportarFicha(FichaTecnica fichaTecnica) {
        try {
            Document documento = new Document();
            PdfWriter escritor = PdfWriter.getInstance(documento, new FileOutputStream("fichasExportadas/FichaAnimal" + fichaTecnica.getIdFicha() + ".pdf"));
            documento.open();
            Paragraph paragrafo = new Paragraph("Ficha exportada a PDF");
            documento.add(paragrafo);

            paragrafo = new Paragraph("\nEsta el animal adoptado? " + fichaTecnica.isAdoptado());
            documento.add(paragrafo);

            documento.close();

            System.out.println("Se exporto a PDF correctamente");
        } catch (DocumentException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
