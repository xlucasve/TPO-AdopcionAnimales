package Controllers;

import Modelo.Alarma.Alarma;

public class AlarmaController {

    private static AlarmaController instancia;

    private AlarmaController() {
    }

    public static AlarmaController getInstancia(){
        if (instancia == null){
            instancia = new AlarmaController();
        }
        return instancia;
    }

    public void dispararAlarma(Alarma alarma){
        alarma.dispararAlarma();
    }
}
