import Controllers.*;
import Modelo.Alarma.*;
import Modelo.Animal.*;
import Modelo.Animal.Seguimiento.EncuestaAnimal;
import Modelo.Animal.Seguimiento.EnumRespuesta;
import Modelo.Animal.Seguimiento.SeguimientoAnimal;
import Modelo.Animal.Seguimiento.Visita;
import Modelo.Cliente.Cliente;
import Modelo.Recordatorio.*;
import Modelo.Usuario.TipoUsuario;
import Modelo.Usuario.Usuario;
import Modelo.Usuario.UsuarioAdapter;
import org.junit.jupiter.api.Test;

import java.util.Date;


public class Tests {

    UsuarioController usuarioController = UsuarioController.getInstancia();
    AlarmaController alarmaController = AlarmaController.getInstancia();
    AnimalController animalController = AnimalController.getInstancia();
    FichaTecnicaController fichaTecnicaController = FichaTecnicaController.getInstancia();
    ClienteController clienteController = ClienteController.getInstancia();

    EncuestaController encuestaController = EncuestaController.getInstancia();

    SeguimientoAnimalController seguimientoAnimalController = SeguimientoAnimalController.getInstancia();
    Usuario veterinario1 = usuarioController.crearUsuario("Diego", "Gutierrez", 1010, 30, 40123542, "Soltero", TipoUsuario.VETERINARIO, new UsuarioAdapter());
    Usuario visitador1 = usuarioController.crearUsuario("Lucas", "Ricardos", 1010, 30, 40123542, "Soltero", TipoUsuario.VISITADOR, new UsuarioAdapter());
    Animal animaldomestico1 = animalController.crearAnimal(2F, (float) 0.1,true,"Gato",1,"Tomas");
    Animal animalNoDomestico1 = animalController.crearAnimal(2F, (float) 0.1,false,"Gato",1,"Tomas");


    FichaTecnica fichaTecnica1 = fichaTecnicaController.crearFichaTecnica(animaldomestico1,false,new ExportarPDF());
    FichaTecnica fichaTecnica2 = fichaTecnicaController.crearFichaTecnica(animalNoDomestico1,false,new ExportarPDF());

    Cliente cliente1 = clienteController.crearCliente("ClienteNombre", "ClienteApellido", 13434343, "Cliente@email.com", 1184302340, "Soltero", "Programador", 1, "Quiero un animal", "Perros y gatos", new Recordador(new RecordatorioWhatsApp()));
    Alarma alarma1 = alarmaController.crearAlarma(fichaTecnica1);
    Cliente cliente2 = clienteController.crearCliente("ClienteNombre", "ClienteApellido", 13434343, "Cliente@email.com", 1184302340, "Soltero", "Programador", 3, "Quiero un animal", "Perros y gatos", new Recordador(new RecordatorioWhatsApp()));


    @Test
    public void testFechasDeAlarma(){
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
        //Scanner scanner = new Scanner(System.in);
        //System.out.println("Señor/a visitador/a, introduzca sus comentarios: ");
        //String comentarios = scanner.nextLine();

        String comentarios = "La vista de tests no nos dejo escribir el comentario, pero funciona";
        EncuestaAnimal encuestaAnimal1 = encuestaController.crearEncuesta(new Date(), EnumRespuesta.MALO, EnumRespuesta.BUENO, EnumRespuesta.REGULAR, comentarios, visitador1, new Visita(new Date(), visitador1));
    }

    @Test
    public void testRealizarSeguimiento(){
        Adopcion adopcion = clienteController.realizarAdopcion(1,cliente1);

        SeguimientoAnimal seguimientoAnimal1 = seguimientoAnimalController.crearSeguimientoAnimal(adopcion, adopcion.getCliente(), visitador1, new Date(), new Date(), 5);
        String comentarios = "La vista de tests no nos dejo escribir el comentario, pero funciona";
        EncuestaAnimal encuestaAnimal1 = encuestaController.crearEncuesta(new Date(), EnumRespuesta.MALO, EnumRespuesta.BUENO, EnumRespuesta.REGULAR, comentarios, visitador1, new Visita(new Date(), visitador1));
        seguimientoAnimal1.agregarEncuesta(encuestaAnimal1);
        fichaTecnica1.agregarSeguimientoAnimal(seguimientoAnimal1);
        System.out.println("El seguimiento se realizo correctamente");
    }

    @Test
    public void testRealizarTratamientoMedico() {

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
        Adopcion adopcion = clienteController.realizarAdopcion(1,cliente1);

        SeguimientoAnimal seguimientoAnimal1 = seguimientoAnimalController.crearSeguimientoAnimal(adopcion, adopcion.getCliente(), visitador1, new Date(), new Date(), 5);
        String comentarios = "La vista de tests no nos dejo escribir el comentario, pero funciona";
        EncuestaAnimal encuestaAnimal1 = encuestaController.crearEncuesta(new Date(), EnumRespuesta.MALO, EnumRespuesta.BUENO, EnumRespuesta.REGULAR, comentarios, visitador1, new Visita(new Date(), visitador1));
        seguimientoAnimal1.agregarEncuesta(encuestaAnimal1);
        fichaTecnicaController.agregarSeguimientoAnimal(fichaTecnica1, seguimientoAnimal1);
        fichaTecnica1.exportar();
    }

    @Test
    public void testLoguearUsuario(){
        usuarioController.obtenerDatos(152351, veterinario1);
    }
}