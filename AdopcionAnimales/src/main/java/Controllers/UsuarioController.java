package Controllers;

public class UsuarioController {
    private static UsuarioController instancia;

    private UsuarioController(){}

    public UsuarioController getInstancia(){
        if (instancia == null){
            instancia = new UsuarioController();
        }
        return instancia;
    }
}
