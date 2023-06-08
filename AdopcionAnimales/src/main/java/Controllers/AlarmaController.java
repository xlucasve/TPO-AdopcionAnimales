package Controllers;

import Modelo.Alarma.Alarma;
import Modelo.Alarma.Control;

import java.util.Date;

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
        System.out.println("El controlador esta disparando la alarma");
        alarma.dispararAlarma();
    }

    public Alarma crearAlarma(){
        return new Alarma(0, new Date());
    }

    public void agregarControl(Alarma alarma, Control control){
        alarma.agregarControl(control);
    }
}
