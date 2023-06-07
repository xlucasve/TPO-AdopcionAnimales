package Modelo.Animal.Seguimiento;

import Modelo.Usuario.Usuario;

import java.util.Date;

public class EncuestaAnimal {
    private Date fechaEncuesta;
    private EnumRespuesta estadoAnimal;
    private EnumRespuesta limpiezaLugar;
    private EnumRespuesta ambiente;
    private String comentarios;
    private Usuario encuestador;

    private Visita visita;

    public EncuestaAnimal(Date fechaEncuesta, EnumRespuesta estadoAnimal, EnumRespuesta limpiezaLugar, EnumRespuesta ambiente, String comentarios, Usuario encuestador, Visita visita) {
        this.fechaEncuesta = fechaEncuesta;
        this.estadoAnimal = estadoAnimal;
        this.limpiezaLugar = limpiezaLugar;
        this.ambiente = ambiente;
        this.comentarios = comentarios;
        this.encuestador = encuestador;
        this.visita = visita;
    }
}
