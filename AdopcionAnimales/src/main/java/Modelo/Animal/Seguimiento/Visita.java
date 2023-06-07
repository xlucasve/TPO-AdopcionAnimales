package Modelo.Animal.Seguimiento;

import Modelo.Usuario.Usuario;

import java.util.Date;

public class Visita {

    private Date fecha;
    private Usuario visitador;

    public Visita(Date fecha, Usuario visitador) {
        this.fecha = fecha;
        this.visitador = visitador;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Usuario getVisitador() {
        return visitador;
    }

    public void setVisitador(Usuario visitador) {
        this.visitador = visitador;
    }
}
