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

    public void setAdopcion(Adopcion adopcion) {
        this.adopcion = adopcion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Usuario getVisitadorResponsable() {
        return visitadorResponsable;
    }

    public void setVisitadorResponsable(Usuario visitadorResponsable) {
        this.visitadorResponsable = visitadorResponsable;
    }

    public CadenciaVisita getCadenciaVisita() {
        return cadenciaVisita;
    }

    public void setCadenciaVisita(CadenciaVisita cadenciaVisita) {
        this.cadenciaVisita = cadenciaVisita;
    }

    public Recordador getMetodoRecordatorio() {
        return metodoRecordatorio;
    }

    public void setMetodoRecordatorio(Recordador metodoRecordatorio) {
        this.metodoRecordatorio = metodoRecordatorio;
    }

    public ArrayList<EncuestaAnimal> getEncuestas() {
        return encuestas;
    }

}
