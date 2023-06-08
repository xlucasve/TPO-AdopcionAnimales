package Controllers;

import Modelo.Animal.Adopcion;
import Modelo.Animal.Seguimiento.CadenciaVisita;
import Modelo.Animal.Seguimiento.SeguimientoAnimal;
import Modelo.Cliente.Cliente;
import Modelo.Recordatorio.Recordador;
import Modelo.Usuario.Usuario;

public class SeguimientoAnimalController {
    private static SeguimientoAnimalController instancia;

    private SeguimientoAnimalController(){}

    public static SeguimientoAnimalController getInstancia(){
        if (instancia == null){
            instancia = new SeguimientoAnimalController();
        }
        return instancia;
    }

    public void crearSeguimientoAnimal(Adopcion adopcion, Cliente cliente, Usuario visitadorResponsable, CadenciaVisita cadenciaVisita, Recordador recordador){
        SeguimientoAnimal seguimientoAnimal = new SeguimientoAnimal(adopcion, cliente, visitadorResponsable, cadenciaVisita, recordador);
    }
}
