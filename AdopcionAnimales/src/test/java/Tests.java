import Controllers.AlarmaController;
import Modelo.Alarma.*;
import Modelo.Usuario.TipoUsuario;
import Modelo.Usuario.Usuario;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

public class Tests {
    @Test
    public void tiraError(){
        assertEquals(1, 2);
    }

    @Test
    public void tiraCorrecto(){
        assertEquals(1, 1);
    }

    @Test
    public void pruebaFechas(){
        AlarmaController alarmaController = AlarmaController.getInstancia();
        Alarma alarma1 = alarmaController.crearAlarma();

        Control control = new Control();
        control.agregarAccionIndividual(new Accion("Chequear oreja perro", "Mirar si el perro tiene hongos en la oreja"));
        alarmaController.agregarControl(alarma1, control);

        Usuario usuario1 = new Usuario("Diego", "Matias", 1010, 30, 40123542, "Soltero", TipoUsuario.VETERINARIO);
        SistemaNotificacion sistemaNotificacion = SistemaNotificacion.getInstancia();
        sistemaNotificacion.agregarUsuario(usuario1);

        EjecutadorAlarma ejc = EjecutadorAlarma.getInstancia();
        ejc.agregarAlarma(alarma1);
        ejc.ejecutar();
    }
}
