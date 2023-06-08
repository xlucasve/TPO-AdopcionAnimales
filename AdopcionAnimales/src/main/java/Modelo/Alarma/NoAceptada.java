package Modelo.Alarma;

import Modelo.Usuario.Usuario;

public class NoAceptada implements iEstadoAlarma {
    public void aceptarAlarma(Alarma alarma, Usuario usuario) {
        Aceptada aceptada = new Aceptada();
        aceptada.setUsuario(usuario);
        alarma.setEstadoAlarma(aceptada);
        System.out.println("La alarma ha sido aceptada correctamente");
    }
}
