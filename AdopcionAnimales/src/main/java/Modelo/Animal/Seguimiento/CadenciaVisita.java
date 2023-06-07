package Modelo.Animal.Seguimiento;

import java.util.Date;

public class CadenciaVisita {
    private Date horarioInicio;
    private Date horarioTermino;
    private int cadenciaDias;

    public CadenciaVisita(Date horarioInicio, Date horarioTermino, int cadenciaDias) {
        this.horarioInicio = horarioInicio;
        this.horarioTermino = horarioTermino;
        this.cadenciaDias = cadenciaDias;
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

    public int getCadenciaDias() {
        return cadenciaDias;
    }

    public void setCadenciaDias(int cadenciaDias) {
        this.cadenciaDias = cadenciaDias;
    }
}
