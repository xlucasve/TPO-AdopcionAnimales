package Controllers;

import Modelo.Animal.Adopcion;
import Modelo.Animal.Animal;

import java.util.ArrayList;

public class AnimalController {
    private static AnimalController instancia;
    private ArrayList<Animal> animales = new ArrayList<>();

    private AnimalController(){}

    public static AnimalController getInstancia(){
        if (instancia == null){
            instancia = new AnimalController();
        }
        return instancia;
    }

    public Animal crearAnimal(float peso, float altura,boolean domestico,String especie, int edad, String nombre) {
        int animalID = animales.size()+1;
        Animal animal = new Animal(animalID,peso,altura,domestico,especie,edad,nombre);
        animales.add(animal);
        return animal;
    }

    public Animal getByID(int id){
        for (Animal animal : animales){
            if (animal.getAnimalID() == id){
                return animal;
            }
        }
        return null;
    }
}