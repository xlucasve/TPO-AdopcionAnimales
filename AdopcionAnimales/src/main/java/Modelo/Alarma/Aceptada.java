package Modelo.Alarma;

import Modelo.Usuario.Usuario;

public class Aceptada implements iEstadoAlarma{
    private Usuario aceptadaPor;

    //private Usuario aceptadaPor;
    public void aceptarAlarma(Alarma alarma, Usuario usuario) {
        System.out.println("La alarma ya fue aceptada previamente por " + this.aceptadaPor.getNombre() + " " + this.aceptadaPor.getApellido());
    }

    public Usuario getUsuario() {
        return aceptadaPor;
    }

    public void setUsuario(Usuario usuario) {
        this.aceptadaPor = usuario;
    }
}
