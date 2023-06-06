package Modelo.Alarma;

import java.util.ArrayList;
import java.util.Date;

public class Alarma{

    private int periocidad;
    private ArrayList<Control> controles;
    private iEstadoAlarma estadoAlarma;
    private Date ultimaEjecucion;

    public Alarma(int periocidad, ArrayList<Control> controles, iEstadoAlarma estadoAlarma, Date ultimaEjecucion) {
        this.periocidad = periocidad;
        this.controles = controles;
        this.estadoAlarma = estadoAlarma;
        this.ultimaEjecucion = ultimaEjecucion;
    }

    public int getPeriocidad() {
        return periocidad;
    }

    public void setPeriocidad(int periocidad) {
        this.periocidad = periocidad;
    }

    public ArrayList<Control> getControles() {
        return controles;
    }

    public void setControles(ArrayList<Control> controles) {
        this.controles = controles;
    }

    public iEstadoAlarma getEstadoAlarma() {
        return estadoAlarma;
    }

    public void setEstadoAlarma(iEstadoAlarma estadoAlarma) {
        this.estadoAlarma = estadoAlarma;
    }

    public Date getUltimaEjecucion() {
        return ultimaEjecucion;
    }

    public void setUltimaEjecucion(Date ultimaEjecucion) {
        this.ultimaEjecucion = ultimaEjecucion;
    }

    public void dispararAlarma(){}

    //Cambia el estado a no aceptada
    public void aceptarAlarma(){
        this.estadoAlarma = new Aceptada();
    }

    public void modificarAlarma(){}

    public void borrarAlarma(){}

}
