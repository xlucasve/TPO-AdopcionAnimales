package Modelo.Recordatorio;

public class RecordatorioSMS implements EstrategiaRecordatorio{
    @Override
    public void recordar(Notificacion notificacion) {
        System.out.println("Recordando por SMS al numero: " + notificacion.getClienteARecordar().getTelefono());
    }
}
