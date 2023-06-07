package Controllers;

import Modelo.Animal.Seguimiento.EncuestaAnimal;
import Modelo.Animal.Seguimiento.EnumRespuesta;
import Modelo.Animal.Seguimiento.Visita;
import Modelo.Usuario.Usuario;

import java.util.Date;

public class EncuestaController {
    private static EncuestaController instancia;

    private EncuestaController(){}

    public EncuestaController getInstancia(){
        if (instancia == null){
            instancia = new EncuestaController();
        }
        return instancia;
    }

    public EncuestaAnimal crearEncuesta(Date fechaEncuesta, EnumRespuesta estadoAnimal, EnumRespuesta limpiezaLugar, EnumRespuesta ambiente, String comentarios, Usuario encuestador, Visita visita){
        return new EncuestaAnimal(fechaEncuesta, estadoAnimal, limpiezaLugar, ambiente, comentarios, encuestador, visita);
    }
}
