import Controllers.*;
import Modelo.Alarma.*;
import Modelo.Animal.*;
import Modelo.Cliente.Cliente;
import Modelo.Recordatorio.*;
import Modelo.Usuario.TipoUsuario;
import Modelo.Usuario.Usuario;
import org.junit.jupiter.api.Test;
import java.util.Date;


public class Tests {
    UsuarioController usuarioController = UsuarioController.getInstancia();
    AlarmaController alarmaController = AlarmaController.getInstancia();
    AnimalController animalController = AnimalController.getInstancia();
    FichaTecnicaController fichaTecnicaController = FichaTecnicaController.getInstancia();
    ClienteController clienteController = ClienteController.getInstancia();
    Usuario veterinario1 = usuarioController.crearUsuario("Diego", "Gutierrez", 1010, 30, 40123542, "Soltero", TipoUsuario.VETERINARIO);
    Usuario visitador1 = usuarioController.crearUsuario("Lucas", "Ricardos", 1010, 30, 40123542, "Soltero", TipoUsuario.VISITADOR);
    Animal animaldomestico1 = animalController.crearAnimal(2F, (float) 0.1,true,"Gato",1,"Tomas");
    Animal animalNoDomestico1 = animalController.crearAnimal(2F, (float) 0.1,false,"Gato",1,"Tomas");


    FichaTecnica fichaTecnica1 = fichaTecnicaController.crearFichaTecnica(animaldomestico1,false,new ExportarPDF());
    FichaTecnica fichaTecnica2 = fichaTecnicaController.crearFichaTecnica(animalNoDomestico1,false,new ExportarPDF());

    Cliente cliente1 = clienteController.crearCliente("ClienteNombre", "ClienteApellido", 13434343, "Cliente@email.com", 1184302340, "Soltero", "Programador", 1, "Quiero un animal", "Perros y gatos");
    Alarma alarma1 = alarmaController.crearAlarma(fichaTecnica1);
    Cliente cliente2 = clienteController.crearCliente("ClienteNombre", "ClienteApellido", 13434343, "Cliente@email.com", 1184302340, "Soltero", "Programador", 3, "Quiero un animal", "Perros y gatos");

    @Test
    public void pruebaFechas(){
        Control control = new Control();
        control.agregarAccionIndividual(new Accion("Chequear oreja perro", "Mirar si el perro tiene hongos en la oreja"));
        alarmaController.agregarControl(alarma1, control);

        EjecutadorAlarma ejc = EjecutadorAlarma.getInstancia();
        ejc.agregarAlarma(alarma1);
        ejc.ejecutar();
    }
    @Test
    public void testAceptarAlarma(){
        System.out.println("Probando a aceptar alarma...");
        alarmaController.aceptarAlarma(alarma1, veterinario1);
        System.out.println("Probrando a aceptar alarma previamente aceptada...");
        alarmaController.aceptarAlarma(alarma1, veterinario1);
    }

    @Test
    public void testRealizarEncuesta(){

    }

    @Test
    public void testRealizarSeguimiento(){

    }

    @Test
    public void testRealizarTratamientoMedico(){

    }

    @Test
    public void testRecordatorioCambiando(){
        Recordador recordador = new Recordador(new RecordatorioSMS());
        Notificacion notificacion =  new Notificacion(new Date(2020, 8, 10), veterinario1, new Date(), new Date(), cliente1);
        recordador.recordar(notificacion);

        recordador.cambiarEstrategia(new RecordatorioEmail());
        recordador.recordar(notificacion);

        recordador.cambiarEstrategia(new RecordatorioWhatsApp());
        recordador.recordar(notificacion);
    }

    @Test
    public void testRealizarAdopcion(){
        clienteController.realizarAdopcion(1,cliente1);
    }

    @Test
    public void testAdoptarAnimalMaxMascotas(){
        clienteController.realizarAdopcion(1, cliente2);
    }

    @Test
    public void testAdoptarAnimalNoDomestico(){
        clienteController.realizarAdopcion(2, cliente1);
    }

    @Test
    public void testExportarFicha(){
        fichaTecnica1.exportar();
    }
}