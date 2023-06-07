package Modelo.Alarma;

import java.util.ArrayList;
import java.util.Date;

public class Alarma{

    private int periocidad;
    private ArrayList<Control> controles;
    private iEstadoAlarma estadoAlarma;
    private Date ultimaEjecucion;

    public Alarma(int periocidad) {
        this.periocidad = periocidad;
        this.controles = new ArrayList<Control>();
        this.estadoAlarma = new NoAceptada();
        this.ultimaEjecucion = new Date();
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

    public void agregarControl(Control control) {
        this.controles.add(control);
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

    public void dispararAlarma(){
        System.out.println("La alarma ha sido disparada");
    }

    //Cambia el estado a no aceptada
    public void aceptarAlarma(){
        this.estadoAlarma = new Aceptada();
    }

    public void modificarAlarma(){}

    public void borrarAlarma(){}

}
