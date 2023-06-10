package Controllers;

import Modelo.Alarma.SistemaNotificacion;
import Modelo.Cliente.Cliente;
import Modelo.Usuario.TipoUsuario;
import Modelo.Usuario.Usuario;

import java.util.ArrayList;

public class UsuarioController {
    private static UsuarioController instancia;
    private  ArrayList<Usuario> usuarios = new ArrayList<>();

    private UsuarioController(){

    }

    public static UsuarioController getInstancia(){
        if (instancia == null){
            instancia = new UsuarioController();
        }
        return instancia;
    }

    public Usuario crearUsuario(String nombre, String apellido, int telefono, int edad, int dni, String estadoCivil, TipoUsuario tipoUsuario){
       Usuario usuario = new Usuario(nombre, apellido, telefono, edad, dni, estadoCivil, tipoUsuario);
       usuarios.add(usuario);
       SistemaNotificacion sistemaNotificacion = SistemaNotificacion.getInstancia();
       sistemaNotificacion.agregarUsuario(usuario);
       return usuario;
    }

    public Usuario getByDNI(int dni){
        for (Usuario usuar : usuarios){
            if (usuar.getDni() == dni){
                return usuar;
            }
        }
        return null;
    }
}
