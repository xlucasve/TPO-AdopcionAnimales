package Modelo.Recordatorio;

public class Recordador {

    private EstrategiaRecordatorio estrategiaRecordatorio;

    public Recordador(EstrategiaRecordatorio estrategiaRecordatorio) {
        this.estrategiaRecordatorio = estrategiaRecordatorio;
    }

    public EstrategiaRecordatorio getEstrategiaRecordatorio() {
        return estrategiaRecordatorio;
    }

    public void cambiarEstrategia(EstrategiaRecordatorio estrategiaRecordatorio) {
        this.estrategiaRecordatorio = estrategiaRecordatorio;
    }


    public void recordar(Notificacion notificacion){
        estrategiaRecordatorio.recordar(notificacion);
    }
}
