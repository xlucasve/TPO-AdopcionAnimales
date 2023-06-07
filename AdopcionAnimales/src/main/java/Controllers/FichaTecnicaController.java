package Controllers;

public class FichaTecnicaController {
    private static FichaTecnicaController instancia;

    private FichaTecnicaController(){}

    public FichaTecnicaController getInstancia(){
        if (instancia == null){
            instancia = new FichaTecnicaController();
        }
        return instancia;
    }
}
