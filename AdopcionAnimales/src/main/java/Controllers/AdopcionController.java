package Controllers;

public class AdopcionController {
    private static AdopcionController instancia;

    private AdopcionController(){}

    public AdopcionController getInstancia(){
        if (instancia == null){
            instancia = new AdopcionController();
        }
        return instancia;
    }
}
