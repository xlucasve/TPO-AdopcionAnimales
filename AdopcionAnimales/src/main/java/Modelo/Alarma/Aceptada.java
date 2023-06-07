package Modelo.Alarma;

public class Aceptada implements iEstadoAlarma{
    private Usuario aceptadaPor;

    //private Usuario aceptadaPor;
    public void aceptarAlarma(Usuario usuario) {
        this.aceptadaPor = usuario;
        System.out.println("La alarma ya fue aceptada previamente por" + this.aceptadaPor.getNombre());
    }

    public Usuario getUsuario() {
        return aceptadaPor;
    }

    public void setUsuario(Usuario usuario) {
        this.aceptadaPor = usuario;
    }
}
