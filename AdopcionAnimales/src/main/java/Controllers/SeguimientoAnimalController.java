package Controllers;

public class SeguimientoAnimalController {
    private static SeguimientoAnimalController instancia;

    private SeguimientoAnimalController(){}

    public static SeguimientoAnimalController getInstancia(){
        if (instancia == null){
            instancia = new SeguimientoAnimalController();
        }
        return instancia;
    }
}
