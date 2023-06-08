package Modelo.Alarma;

import Modelo.Usuario.Usuario;

import java.util.ArrayList;
import java.util.Date;

public class Alarma{

    private int periocidad;
    private ArrayList<Control> controles;
    private iEstadoAlarma estadoAlarma;
    private Date ultimaEjecucion;
    private iAlarmaAdapter notificador;

    public Alarma(int periocidad, Date ultimaEjecucion) {
        this.periocidad = periocidad;
        this.controles = new ArrayList<Control>();
        this.estadoAlarma = new NoAceptada();
        this.ultimaEjecucion = ultimaEjecucion;
        this.notificador = SistemaNotificacion.getInstancia();
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
        notificador.disparAlarma(this);
    }

    //Cambia el estado a no aceptada
    public void aceptarAlarma(Usuario usuario){
        this.estadoAlarma.aceptarAlarma(this, usuario);
    }

    public void modificarAlarma(){}

    public void borrarAlarma(){}

}
