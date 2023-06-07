package Modelo.Alarma;

import java.util.ArrayList;

public class Control {

    private ArrayList<Accion> acciones;

    public Control() {
        this.acciones = new ArrayList<Accion>();
    }

    public ArrayList<Accion> getAcciones() {
        return acciones;
    }

    public void agregarAccionIndividual(Accion accion){
        acciones.add(accion);
    }

    public void agregarAccionesPorLista(ArrayList<Accion> listaAcciones){
        acciones.addAll(listaAcciones);
    }
}
