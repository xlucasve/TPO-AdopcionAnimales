import Controllers.AlarmaController;
import Controllers.ClienteController;
import Controllers.UsuarioController;
import Modelo.Alarma.*;
import Modelo.Cliente.Cliente;
import Modelo.Recordatorio.*;
import Modelo.Usuario.TipoUsuario;
import Modelo.Usuario.Usuario;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

public class Tests {
    @Test
    public void pruebaFechas(){
        AlarmaController alarmaController = AlarmaController.getInstancia();
        Alarma alarma1 = alarmaController.crearAlarma();

        Control control = new Control();
        control.agregarAccionIndividual(new Accion("Chequear oreja perro", "Mirar si el perro tiene hongos en la oreja"));
        alarmaController.agregarControl(alarma1, control);


        UsuarioController usuarioController = UsuarioController.getInstancia();
        usuarioController.crearUsuario("Diego", "Gutierrez", 1010, 30, 40123542, "Soltero", TipoUsuario.VETERINARIO);
        usuarioController.crearUsuario("Lucas", "Ricardos", 1010, 30, 40123542, "Soltero", TipoUsuario.VISITADOR);

        EjecutadorAlarma ejc = EjecutadorAlarma.getInstancia();
        ejc.agregarAlarma(alarma1);
        ejc.ejecutar();
    }
    @Test
    public void testAceptarAlarma(){
        AlarmaController alarmaController = AlarmaController.getInstancia();
        Alarma alarma1 = alarmaController.crearAlarma();

        UsuarioController usuarioController = UsuarioController.getInstancia();
        Usuario usuario1 = usuarioController.crearUsuario("Diego", "Gutierrez", 1010, 30, 40123542, "Soltero", TipoUsuario.VETERINARIO);

        System.out.println("Probando a aceptar alarma...");
        alarmaController.aceptarAlarma(alarma1, usuario1);
        System.out.println("Probrando a aceptar alarma previamente aceptada...");
        alarmaController.aceptarAlarma(alarma1, usuario1);
        
    }

    @Test
    public void testRealizarEncuesta(){
    }

    @Test
    public void testRecordatorioCambiando(){
        UsuarioController usuarioController = UsuarioController.getInstancia();
        Usuario usuario1 = usuarioController.crearUsuario("Diego", "Gutierrez", 1010, 30, 40123542, "Soltero", TipoUsuario.VETERINARIO);
        Recordador recordador = new Recordador(new RecordatorioSMS());

        ClienteController clienteController = ClienteController.getInstancia();
        Cliente cliente1 = clienteController.crearCliente("ClienteNombre", "ClienteApellido", 13434343, "Cliente@email.com", 1184302340, "Soltero", "Programador", 2, "Quiero un animal", "Perros y gatos");

        Notificacion notificacion =  new Notificacion(new Date(2020, 8, 10), usuario1, new Date(), new Date(), cliente1);
        recordador.recordar(notificacion);

        recordador.cambiarEstrategia(new RecordatorioEmail());
        recordador.recordar(notificacion);

        recordador.cambiarEstrategia(new RecordatorioWhatsApp());
        recordador.recordar(notificacion);
    }
}