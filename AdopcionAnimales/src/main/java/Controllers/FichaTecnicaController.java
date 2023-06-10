package Controllers;

import Modelo.Animal.*;
import Modelo.Animal.Seguimiento.SeguimientoAnimal;

import java.util.ArrayList;

public class FichaTecnicaController {
    private static FichaTecnicaController instancia;
    private ArrayList<FichaTecnica> fichas = new ArrayList<>();

    private FichaTecnicaController(){}

    public static FichaTecnicaController getInstancia(){
        if (instancia == null){
            instancia = new FichaTecnicaController();
        }
        return instancia;
    }

    public FichaTecnica crearFichaTecnica(Animal animal, boolean enTratamiento, EstrategiaExportar estrategiaExportar){
        int idFicha = fichas.size()+1;
        FichaTecnica fichaTecnica = new FichaTecnica(animal,idFicha,enTratamiento, estrategiaExportar);
        fichas.add(fichaTecnica);
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

    public FichaTecnica getByID(int id){
        for (FichaTecnica fichaTecnica : fichas){
            if (fichaTecnica.getIdFicha() == id){
                return fichaTecnica;
            }
        }
        return null;
    }
}
