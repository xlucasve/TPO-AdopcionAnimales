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

    public SeguimientoAnimal(Adopcion adopcion, Cliente cliente, Usuario visitadorResponsable, CadenciaVisita cadenciaVisita, Recordador metodoRecordatorio) {
        this.adopcion = adopcion;
        this.cliente = cliente;
        this.visitadorResponsable = visitadorResponsable;
        this.cadenciaVisita = cadenciaVisita;
        this.metodoRecordatorio = metodoRecordatorio;
    }
}
