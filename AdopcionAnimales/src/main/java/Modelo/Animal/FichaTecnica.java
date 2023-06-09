package Modelo.Animal;

import Modelo.Animal.Seguimiento.SeguimientoAnimal;

import java.util.ArrayList;

public class FichaTecnica {
    private int idFicha;
    private boolean enTratamiento;
    private ArrayList<TratamientoMedico> historialTratamientosMedicos;
    private ArrayList<SeguimientoAnimal> historialSeguimientoAnimal;
    private boolean adoptado;
    private EstrategiaExportar estrategiaExportar;

    public FichaTecnica(int idFicha,boolean enTratamiento, EstrategiaExportar estrategiaExportar) {
        this.idFicha = idFicha;
        this.enTratamiento = enTratamiento;
        this.historialTratamientosMedicos = new ArrayList<>();
        this.historialSeguimientoAnimal = new ArrayList<>();
        this.adoptado = false;
        this.estrategiaExportar = estrategiaExportar;
    }

    public int getIdFicha() {
        return idFicha;
    }

    public void setIdFicha(int idFicha) {
        this.idFicha = idFicha;
    }

    public boolean isEnTratamiento() {
        return enTratamiento;
    }

    public void setEnTratamiento(boolean enTratamiento) {
        this.enTratamiento = enTratamiento;
    }

    public ArrayList<TratamientoMedico> getHistorialTratamientosMedicos() {
        return historialTratamientosMedicos;
    }

    public void setHistorialTratamientosMedicos(ArrayList<TratamientoMedico> historialTratamientosMedicos) {
        this.historialTratamientosMedicos = historialTratamientosMedicos;
    }

    public ArrayList<SeguimientoAnimal> getHistorialSeguimientoAnimal() {
        return historialSeguimientoAnimal;
    }

    public void setHistorialSeguimientoAnimal(ArrayList<SeguimientoAnimal> historialSeguimientoAnimal) {
        this.historialSeguimientoAnimal = historialSeguimientoAnimal;
    }

    public boolean isAdoptado() {
        return adoptado;
    }

    public void setAdoptado(boolean adoptado) {
        this.adoptado = adoptado;
    }

    public EstrategiaExportar getEstrategiaExportar() {
        return estrategiaExportar;
    }

    public void setEstrategiaExportar(EstrategiaExportar estrategiaExportar) {
        this.estrategiaExportar = estrategiaExportar;
    }

    public void exportart(){
        estrategiaExportar.exportarFicha(this);
    }
}
