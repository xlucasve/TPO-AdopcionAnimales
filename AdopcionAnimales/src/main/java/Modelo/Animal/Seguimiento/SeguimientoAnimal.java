package Modelo.Animal.Seguimiento;

import Modelo.Animal.Adopcion;
import Modelo.Cliente.Cliente;
import Modelo.Recordatorio.Recordador;
import Modelo.Usuario.Usuario;

import java.util.ArrayList;

public class SeguimientoAnimal {

    private Adopcion adopcion;
    private Cliente cliente;
    private Usuario visitadorResponsable;
    private CadenciaVisita cadenciaVisita;
    private Recordador metodoRecordatorio;
    private ArrayList<EncuestaAnimal> encuestas;

    public SeguimientoAnimal(Adopcion adopcion, Cliente cliente, Usuario visitadorResponsable, CadenciaVisita cadenciaVisita, Recordador metodoRecordatorio){
        this.adopcion = adopcion;
        this.cliente = cliente;
        this.visitadorResponsable = visitadorResponsable;
        this.cadenciaVisita = cadenciaVisita;
        this.metodoRecordatorio = metodoRecordatorio;
        this.encuestas = new ArrayList<>(1000);
    }

    public Adopcion getAdopcion() {
        return adopcion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Usuario getVisitadorResponsable() {
        return visitadorResponsable;
    }

    public CadenciaVisita getCadenciaVisita() {
        return cadenciaVisita;
    }

    public Recordador getMetodoRecordatorio() {
        return metodoRecordatorio;
    }

    public ArrayList<EncuestaAnimal> getEncuestas() {
        return encuestas;
    }
}
