package Modelo.Alarma;

import java.util.ArrayList;

public class Control {

    private ArrayList<Accion> acciones;

    public Control(ArrayList<Accion> acciones) {
        this.acciones = acciones;
    }

    public ArrayList<Accion> getAcciones() {
        return acciones;
    }

    public void setAcciones(ArrayList<Accion> acciones) {
        this.acciones = acciones;
    }
}
