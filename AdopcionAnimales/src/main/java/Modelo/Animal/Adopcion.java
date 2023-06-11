package Modelo.Animal;


import Modelo.Cliente.Cliente;

import java.util.Date;

public class Adopcion {

    private Cliente cliente;
    private boolean maxMascotas;
    private Date fechaAdopcion;
    private FichaTecnica animalAdoptado;

    public Adopcion(Cliente cliente, boolean maxMascotas, Date fechaAdopcion, FichaTecnica fichaTecnica){
        this.cliente = cliente;
        this.maxMascotas = maxMascotas;
        this.fechaAdopcion = fechaAdopcion;
        this.animalAdoptado = fichaTecnica;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public boolean isMaxMascotas() {
        return maxMascotas;
    }

    public Date getFechaAdopcion() {
        return fechaAdopcion;
    }

    public FichaTecnica getAnimalAdoptado() {
        return animalAdoptado;
    }
}
