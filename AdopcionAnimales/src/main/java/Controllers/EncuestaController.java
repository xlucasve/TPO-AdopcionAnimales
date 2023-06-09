package Controllers;

import Modelo.Animal.Seguimiento.EncuestaAnimal;
import Modelo.Animal.Seguimiento.EnumRespuesta;
import Modelo.Animal.Seguimiento.Visita;
import Modelo.Usuario.Usuario;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class EncuestaController {
    private static EncuestaController instancia;
    private ArrayList<EncuestaAnimal> encuestas = new ArrayList<>();

    private EncuestaController(){}

    public static EncuestaController getInstancia(){
        if (instancia == null){
            instancia = new EncuestaController();
        }
        return instancia;
    }

    public EncuestaAnimal crearEncuesta(Date fechaEncuesta, EnumRespuesta estadoAnimal, EnumRespuesta limpiezaLugar, EnumRespuesta ambiente,String comentarios, Usuario encuestador, Visita visita){

        EncuestaAnimal encuestaAnimal = new EncuestaAnimal(fechaEncuesta, estadoAnimal, limpiezaLugar, ambiente, comentarios, encuestador, visita);
        encuestas.add(encuestaAnimal);
        return encuestaAnimal;
    }
}
