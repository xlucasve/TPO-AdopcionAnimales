package Modelo.Alarma;

import java.util.ArrayList;
import java.util.Date;

public class EjecutadorAlarma {

    private ArrayList<Alarma> listadoAlarmas;
    private Integer cuantoMin;
    private Date ultimaBarrida;

    public EjecutadorAlarma(ArrayList<Alarma> listadoAlarmas, Integer cuantoMin, Date ultimaBarrida) {
        this.listadoAlarmas = listadoAlarmas;
        this.cuantoMin = cuantoMin;
        this.ultimaBarrida = ultimaBarrida;
    }

    public ArrayList<Alarma> getListadoAlarmas() {
        return listadoAlarmas;
    }

    public void setListadoAlarmas(ArrayList<Alarma> listadoAlarmas) {
        this.listadoAlarmas = listadoAlarmas;
    }

    public Integer getCuantoMin() {
        return cuantoMin;
    }

    public void setCuantoMin(Integer cuantoMin) {
        this.cuantoMin = cuantoMin;
    }

    public Date getUltimaBarrida() {
        return ultimaBarrida;
    }

    public void setUltimaBarrida(Date ultimaBarrida) {
        this.ultimaBarrida = ultimaBarrida;
    }
}
