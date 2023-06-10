package Controllers;

import Modelo.Animal.EstrategiaExportar;
import Modelo.Animal.FichaTecnica;
import Modelo.Animal.Seguimiento.SeguimientoAnimal;
import Modelo.Animal.TratamientoMedico;

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

    public void exportarFicha(FichaTecnica fichaTecnica){
        fichaTecnica.exportar();
    }

    public void agregarTratamientoMedico(FichaTecnica fichaTecnica, TratamientoMedico tratamientoMedico){
        fichaTecnica.agregarTratamientoMedico(tratamientoMedico);
    }

    public void agregarSeguimientoAnimal(FichaTecnica fichaTecnica, SeguimientoAnimal seguimientoAnimal){
        fichaTecnica.agregarSeguimientoAnimal(seguimientoAnimal);
    }
}
