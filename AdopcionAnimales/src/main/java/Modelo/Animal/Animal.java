package Modelo.Animal;

public class Animal {

    private int animalID;
    private float peso;
    private int edad;
    private float altura;
    private boolean domestico;
    private String especie;
    private String nombre;

    public Animal(int animalID, float peso,float altura, boolean domestico,String especie, int edad, String nombre) {
        this.animalID = animalID;
        this.peso = peso;
        this.altura = altura;
        this.domestico = domestico;
        this.especie = especie;
        this.edad = edad;
        this.nombre =nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getAnimalID() {
        return animalID;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public boolean isDomestico() {
        return domestico;
    }

    public void setDomestico(boolean domestico) {
        this.domestico = domestico;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
}
