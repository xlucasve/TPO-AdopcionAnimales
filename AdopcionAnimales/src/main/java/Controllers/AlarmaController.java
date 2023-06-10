package Controllers;

import Modelo.Alarma.Alarma;
import Modelo.Alarma.Control;
import Modelo.Animal.FichaTecnica;
import Modelo.Usuario.Usuario;

import java.util.ArrayList;
import java.util.Date;

public class AlarmaController {

    private static AlarmaController instancia;
    private ArrayList<Alarma> alarmas = new ArrayList<>();

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

    public Alarma crearAlarma(FichaTecnica fichaTecnica){
        Alarma alarma = new Alarma(0, new Date(), fichaTecnica);
        alarmas.add(alarma);
        return alarma;
    }

    public void agregarControl(Alarma alarma, Control control){
        alarma.agregarControl(control);
    }

    public void aceptarAlarma(Alarma alarma, Usuario usuario){
        alarma.aceptarAlarma(usuario);

    }
}
