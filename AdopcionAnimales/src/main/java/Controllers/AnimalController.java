package Controllers;

import Modelo.Animal.Animal;

public class AnimalController {
    private static AnimalController instancia;

    private AnimalController(){}

    public static AnimalController getInstancia(){
        if (instancia == null){
            instancia = new AnimalController();
        }
        return instancia;
    }

    public Animal crearAnimal(int animalID, float peso, float altura,boolean domestico,String especie, int edad, String nombre) {
        Animal animal = new Animal(animalID,peso,altura,domestico,especie,edad,nombre);
        return animal;
    }
}


//    public FichaTecnica crearFichaTecnica(Animal animal, int idFicha, boolean enTratamiento, EstrategiaExportar estrategiaExportar){
//        FichaTecnica fichaTecnica = new FichaTecnica(animal,idFicha,enTratamiento, estrategiaExportar);
//        return fichaTecnica;
//    }