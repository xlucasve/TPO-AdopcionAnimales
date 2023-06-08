import Modelo.Alarma.Alarma;
import Modelo.Alarma.EjecutadorAlarma;
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
        ArrayList<Alarma> listaAlarmas = new ArrayList<>();
        Alarma alarma1 = new Alarma(0, new Date());
        listaAlarmas.add(alarma1);
        EjecutadorAlarma ejc = new EjecutadorAlarma(listaAlarmas, 0, new Date());
        ejc.ejecutar();
    }
}
