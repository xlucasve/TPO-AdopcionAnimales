package Modelo.Recordatorio;

public class RecordatorioEmail implements EstrategiaRecordatorio{
    @Override
    public void recordar(Notificacion notificacion) {
        System.out.println("Recordando por Email a través de la dirección: " + notificacion.getClienteARecordar().getEmail());
    }
}
