package Controllers;

import Modelo.Animal.FichaTecnica;
import Modelo.Cliente.Cliente;
import Modelo.Animal.Adopcion;

import java.util.Date;

public class AdopcionController {
    private static AdopcionController instancia;

    private AdopcionController() {
    }

    public static AdopcionController getInstancia() {
        if (instancia == null) {
            instancia = new AdopcionController();
        }
        return instancia;

    }
    public Adopcion crearAdopcion(Cliente cliente, boolean maxMascotas, Date fechaAdopcion, int idfichaTecnica){
        Adopcion adopcion = new Adopcion(cliente,maxMascotas,fechaAdopcion,idfichaTecnica);
        System.out.println("Adopcion creada");
        return adopcion;
    }
}