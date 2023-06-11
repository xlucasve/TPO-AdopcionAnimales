package Modelo.Animal;

import Modelo.Animal.Seguimiento.SeguimientoAnimal;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.*;

public class ExportarPDF implements EstrategiaExportar {

    public void exportarFicha(FichaTecnica fichaTecnica) {
        try {
            Document documento = new Document();
            PdfWriter escritor = PdfWriter.getInstance(documento, new FileOutputStream("fichasExportadas/FichaAnimal_nro" + fichaTecnica.getIdFicha() + ".pdf"));
            documento.open();


            Paragraph paragrafo = new Paragraph("ID de Ficha de animal: " + fichaTecnica.getIdFicha());
            documento.add(paragrafo);



            paragrafo = new Paragraph("\nEstado de adopcion de animal: " + fichaTecnica.isAdoptado());
            documento.add(paragrafo);

            paragrafo = new Paragraph("\nDatos generales del animal: ");
            documento.add(paragrafo);

            paragrafo = new Paragraph("\n       Nombre: " + fichaTecnica.getAnimal().getNombre());
            documento.add(paragrafo);
            paragrafo = new Paragraph("\n       Peso: " + fichaTecnica.getAnimal().getPeso() + "kg");
            documento.add(paragrafo);
            paragrafo = new Paragraph("\n       Altura: " + fichaTecnica.getAnimal().getAltura() + "m");
            documento.add(paragrafo);
            paragrafo = new Paragraph("\n       Edad: " + fichaTecnica.getAnimal().getEdad() + " años");
            documento.add(paragrafo);

            for (SeguimientoAnimal seguimientoAnimal : fichaTecnica.getHistorialSeguimientoAnimal()){
                for (int i = 0; i < seguimientoAnimal.getEncuestas().size(); i++) {

                    paragrafo = new Paragraph("\n");
                    documento.add(paragrafo);

                    paragrafo = new Paragraph("\n   Seguimiento numero " + (i+1) + ":");
                    documento.add(paragrafo);

                    paragrafo = new Paragraph("\n       Visitador encargado: " + seguimientoAnimal.getEncuestas().get(i).getEncuestador().getNombre()
                            + " " + seguimientoAnimal.getEncuestas().get(i).getEncuestador().getApellido());
                    documento.add(paragrafo);
                    paragrafo = new Paragraph("\n       Ambiente del animal: " + seguimientoAnimal.getEncuestas().get(i).getAmbiente());
                    documento.add(paragrafo);
                    paragrafo = new Paragraph("\n       Estado del animal: " + seguimientoAnimal.getEncuestas().get(i).getEstadoAnimal());
                    documento.add(paragrafo);
                    paragrafo = new Paragraph("\n       Limpieza del lugar: " + seguimientoAnimal.getEncuestas().get(i).getLimpiezaLugar());
                    documento.add(paragrafo);
                    paragrafo = new Paragraph("\n       Comentarios del visitador: " + seguimientoAnimal.getEncuestas().get(i).getComentarios());
                    documento.add(paragrafo);
                }

            }


            documento.close();
            escritor.close();

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
