package Modelo.Alarma;

import Controllers.AlarmaController;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class EjecutadorAlarma {

    private static EjecutadorAlarma instancia;
    private ArrayList<Alarma> listadoAlarmas;
    private Integer cuantoMin;
    private Date ultimaBarrida;

    private EjecutadorAlarma() {
        this.listadoAlarmas = new ArrayList<>();
        this.cuantoMin = 0;
        this.ultimaBarrida = new Date();
    }

    public static EjecutadorAlarma getInstancia(){
        if (instancia == null){
            instancia = new EjecutadorAlarma();
        }
        return instancia;
    }

    public ArrayList<Alarma> getListadoAlarmas() {
        return listadoAlarmas;
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

    public void agregarAlarma(Alarma alarma){
        listadoAlarmas.add(alarma);
    }

    public void ejecutar(){

        Date dateNow = new Date();
        long tiempoActualInMs = dateNow.getTime();
        long diferenciaDesdeUltimaBarrida = calcularTiempoDesdeUltimaBarrida(tiempoActualInMs);

        if (diferenciaDesdeUltimaBarrida >= cuantoMin){

            long diferenciaInMs;
            long diferenciaInMin;
            long ultimaEjecucionAlarmaInMs;
            AlarmaController alarmaController = AlarmaController.getInstancia();

            for (Alarma alarma : listadoAlarmas){

                ultimaEjecucionAlarmaInMs = alarma.getUltimaEjecucion().getTime();
                diferenciaInMs = tiempoActualInMs - ultimaEjecucionAlarmaInMs;
                diferenciaInMin = TimeUnit.MILLISECONDS.toMinutes(diferenciaInMs); //Calculo minutos desde que se disparo

                if (diferenciaInMin >= alarma.getPeriocidad()){ //Chequeo si disparo la alarma
                    alarmaController.dispararAlarma(alarma);
                }
            }
        }
    }

    private long calcularTiempoDesdeUltimaBarrida(long tiempoActualInMs){

        long tiempoActualInMin = TimeUnit.MILLISECONDS.toMinutes(tiempoActualInMs);
        long tiempoUltimaBarridaInMs = ultimaBarrida.getTime();
        long tiempoUltimaBarridaInMin = TimeUnit.MILLISECONDS.toMinutes(tiempoUltimaBarridaInMs);

        return tiempoActualInMin - tiempoUltimaBarridaInMin;
    }
}
