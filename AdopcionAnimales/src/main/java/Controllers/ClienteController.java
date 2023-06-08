package Controllers;

public class ClienteController {

    private static ClienteController instancia;

    private ClienteController(){}

    public static ClienteController getInstancia(){
        if (instancia == null){
            instancia = new ClienteController();
        }
        return instancia;
    }
}
