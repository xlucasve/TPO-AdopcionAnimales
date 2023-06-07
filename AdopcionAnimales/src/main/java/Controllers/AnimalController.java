package Controllers;

public class AnimalController {
    private static AnimalController instancia;

    private AnimalController(){}

    public AnimalController getInstancia(){
        if (instancia == null){
            instancia = new AnimalController();
        }
        return instancia;
    }
}
