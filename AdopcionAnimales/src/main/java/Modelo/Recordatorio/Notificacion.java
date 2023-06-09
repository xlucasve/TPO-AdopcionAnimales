package Modelo.Recordatorio;

import Modelo.Cliente.Cliente;
import Modelo.Usuario.Usuario;

import java.util.Date;

public class Notificacion {
    private Date fechaVisita;
    private Usuario visitadorResponsable;
    private Date horarioInicio;
    private Date horarioTermino;
    private Cliente clienteARecordar;

    public Notificacion(Date fechaVisita, Usuario visitadorResponsable, Date horarioInicio, Date horarioTermino, Cliente clienteARecordar) {
        this.fechaVisita = fechaVisita;
        this.visitadorResponsable = visitadorResponsable;
        this.horarioInicio = horarioInicio;
        this.horarioTermino = horarioTermino;
        this.clienteARecordar = clienteARecordar;
    }

    public Date getFechaVisita() {
        return fechaVisita;
    }

    public void setFechaVisita(Date fechaVisita) {
        this.fechaVisita = fechaVisita;
    }

    public Usuario getVisitadorResponsable() {
        return visitadorResponsable;
    }

    public void setVisitadorResponsable(Usuario visitadorResponsable) {
        this.visitadorResponsable = visitadorResponsable;
    }

    public Date getHorarioInicio() {
        return horarioInicio;
    }

    public void setHorarioInicio(Date horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    public Date getHorarioTermino() {
        return horarioTermino;
    }

    public void setHorarioTermino(Date horarioTermino) {
        this.horarioTermino = horarioTermino;
    }

    public Cliente getClienteARecordar() {
        return clienteARecordar;
    }

}
