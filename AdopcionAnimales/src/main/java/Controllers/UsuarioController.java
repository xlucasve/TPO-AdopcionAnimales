package Controllers;

import Modelo.Alarma.SistemaNotificacion;
import Modelo.Usuario.TipoUsuario;
import Modelo.Usuario.Usuario;

public class UsuarioController {
    private static UsuarioController instancia;

    private UsuarioController(){}

    public static UsuarioController getInstancia(){
        if (instancia == null){
            instancia = new UsuarioController();
        }
        return instancia;
    }

    public void crearUsuario(String nombre, String apellido, int telefono, int edad, int dni, String estadoCivil, TipoUsuario tipoUsuario){
       Usuario usuario = new Usuario(nombre, apellido, telefono, edad, dni, estadoCivil, tipoUsuario);
        SistemaNotificacion sistemaNotificacion = SistemaNotificacion.getInstancia();
        sistemaNotificacion.agregarUsuario(usuario);
    }
}
