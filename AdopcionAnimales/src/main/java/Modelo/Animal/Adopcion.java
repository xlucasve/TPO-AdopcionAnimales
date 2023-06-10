package Modelo.Animal;


import Modelo.Cliente.Cliente;

import java.util.Date;

public class Adopcion {

    private Cliente cliente;
    private boolean maxMascotas;
    private Date fechaAdopcion;
    private int animalAdoptado;

    public Adopcion(Cliente cliente, boolean maxMascotas, Date fechaAdopcion, int idfichaTecnica){
        this.cliente = cliente;
        this.maxMascotas = maxMascotas;
        this.fechaAdopcion = fechaAdopcion;
        this.animalAdoptado = idfichaTecnica;
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

    public int getAnimalAdoptado() {
        return animalAdoptado;
    }
}
