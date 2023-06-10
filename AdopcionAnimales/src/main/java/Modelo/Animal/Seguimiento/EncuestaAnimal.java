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

    public Date getFechaEncuesta() {
        return fechaEncuesta;
    }

    public void setFechaEncuesta(Date fechaEncuesta) {
        this.fechaEncuesta = fechaEncuesta;
    }

    public EnumRespuesta getEstadoAnimal() {
        return estadoAnimal;
    }

    public void setEstadoAnimal(EnumRespuesta estadoAnimal) {
        this.estadoAnimal = estadoAnimal;
    }

    public EnumRespuesta getLimpiezaLugar() {
        return limpiezaLugar;
    }

    public void setLimpiezaLugar(EnumRespuesta limpiezaLugar) {
        this.limpiezaLugar = limpiezaLugar;
    }

    public EnumRespuesta getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(EnumRespuesta ambiente) {
        this.ambiente = ambiente;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public Usuario getEncuestador() {
        return encuestador;
    }

    public void setEncuestador(Usuario encuestador) {
        this.encuestador = encuestador;
    }

    public Visita getVisita() {
        return visita;
    }

    public void setVisita(Visita visita) {
        this.visita = visita;
    }

}
