package Controllers;

import Modelo.Animal.EstrategiaExportar;
import Modelo.Animal.FichaTecnica;

public class FichaTecnicaController {
    private static FichaTecnicaController instancia;

    private FichaTecnicaController(){}

    public static FichaTecnicaController getInstancia(){
        if (instancia == null){
            instancia = new FichaTecnicaController();
        }
        return instancia;
    }

    public FichaTecnica crearFichaTecnica(int idFicha, boolean enTratamiento, EstrategiaExportar estrategiaExportar){
        FichaTecnica fichaTecnica = new FichaTecnica(idFicha,enTratamiento, estrategiaExportar);
        return fichaTecnica;
    }
}
