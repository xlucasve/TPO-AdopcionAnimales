package Controllers;

public class SeguimientoAnimalController {
    private static SeguimientoAnimalController instancia;

    private SeguimientoAnimalController(){}

    public SeguimientoAnimalController getInstancia(){
        if (instancia == null){
            instancia = new SeguimientoAnimalController();
        }
        return instancia;
    }
}
