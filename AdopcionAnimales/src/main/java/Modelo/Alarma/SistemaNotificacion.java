package Modelo.Alarma;

import Modelo.Usuario.TipoUsuario;
import Modelo.Usuario.Usuario;

import java.util.ArrayList;

public class SistemaNotificacion implements iAlarmaAdapter{
    private static SistemaNotificacion instancia;
    private ArrayList<Usuario> usuarios;

    private SistemaNotificacion(){
        this.usuarios = new ArrayList<>();
    }

    public static SistemaNotificacion getInstancia(){
        if (instancia == null){
            instancia = new SistemaNotificacion();
        }
        return instancia;
    }

    @Override
    public void disparAlarma(Alarma alarma) {
        enviarPush(alarma);
    }

    private void enviarPush(Alarma alarma){
        System.out.println("El sistema de notificacion esta alertando a los veterinarios...");
        System.out.println("Alarma disparada, controlar animal de ficha tecnica: " + alarma.getFichaTecnica().getIdFicha());
        for (Usuario usuario: usuarios){
            if (usuario.getTipoUsuario() == TipoUsuario.VETERINARIO){
                System.out.println("Notificando al veterinario: " + usuario.getNombre());
            }
        }
    }

    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }
}
