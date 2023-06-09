package Modelo.Recordatorio;

public class RecordatorioWhatsApp implements EstrategiaRecordatorio{
    @Override
    public void recordar(Notificacion notificacion) {
        System.out.println("Recordando por Whatsapp al numero: " + notificacion.getClienteARecordar().getTelefono());
        System.out.println("El dia " + notificacion.getFechaVisita().getDate() + "/" + notificacion.getFechaVisita().getMonth() +
                " será visitado por: " + notificacion.getVisitadorResponsable().getNombre() + " " + notificacion.getVisitadorResponsable().getApellido());
    }
}
