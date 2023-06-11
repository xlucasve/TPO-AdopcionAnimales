package Modelo.Animal;

public class ExportarExcel implements  EstrategiaExportar{
    public void exportarFicha(FichaTecnica fichaTecnica) {
        System.out.println(fichaTecnica.toString());
    }
}
