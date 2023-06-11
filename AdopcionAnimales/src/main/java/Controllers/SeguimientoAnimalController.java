package Controllers;

import Modelo.Animal.Adopcion;
import Modelo.Animal.Seguimiento.CadenciaVisita;
import Modelo.Animal.Seguimiento.SeguimientoAnimal;
import Modelo.Cliente.Cliente;
import Modelo.Recordatorio.Recordador;
import Modelo.Usuario.Usuario;

import java.util.ArrayList;
import java.util.Date;

public class SeguimientoAnimalController {
    private static SeguimientoAnimalController instancia;
    private ArrayList<SeguimientoAnimal> seguimientos = new ArrayList<>();

    private SeguimientoAnimalController(){}

    public static SeguimientoAnimalController getInstancia(){
        if (instancia == null){
            instancia = new SeguimientoAnimalController();
        }
        return instancia;
    }

    public SeguimientoAnimal crearSeguimientoAnimal(Adopcion adopcion, Cliente cliente, Usuario visitadorResponsable, Date horaInicio,Date horaFinal, int dias){
        CadenciaVisita cadenciaVisita = new CadenciaVisita(horaInicio,horaFinal,dias);
        SeguimientoAnimal seguimientoAnimal = new SeguimientoAnimal(adopcion, cliente, visitadorResponsable, cadenciaVisita);
        seguimientos.add(seguimientoAnimal);
        return  seguimientoAnimal;
    }
}
