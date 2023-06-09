package Modelo.Animal;

public class TipoAnimal {
    private String especie;
    private boolean esDomestico;

    public TipoAnimal(String especie, boolean esDomestico) {
        this.especie = especie;
        this.esDomestico = esDomestico;
    }

    public String getEspecie() {
        return especie;
    }

    public boolean isEsDomestico() {
        return esDomestico;
    }
}
