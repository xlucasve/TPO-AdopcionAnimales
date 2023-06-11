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
    private ArrayList<EncuestaAnimal> encuestas;
    private boolean continuarSeguimiento;

    public SeguimientoAnimal(Adopcion adopcion, Cliente cliente, Usuario visitadorResponsable, CadenciaVisita cadenciaVisita){
        this.adopcion = adopcion;
        this.cliente = cliente;
        this.visitadorResponsable = visitadorResponsable;
        this.cadenciaVisita = cadenciaVisita;
        this.encuestas = new ArrayList<>(1000);
        this.continuarSeguimiento = true;
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


    public ArrayList<EncuestaAnimal> getEncuestas() {
        return encuestas;
    }

    public void agregarEncuesta(EncuestaAnimal encuestaAnimal){
        encuestas.add(encuestaAnimal);
    }

    public boolean isContinuarSeguimiento() {
        return continuarSeguimiento;
    }

    public void setContinuarSeguimiento(boolean continuarSeguimiento) {
        this.continuarSeguimiento = continuarSeguimiento;
    }
}
