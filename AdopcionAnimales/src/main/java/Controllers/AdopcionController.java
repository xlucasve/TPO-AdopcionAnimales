package Controllers;

import Modelo.Cliente.Cliente;
import Modelo.Animal.Adopcion;

import java.util.ArrayList;
import java.util.Date;

public class AdopcionController {
    private static AdopcionController instancia;
    private ArrayList<Adopcion> adopciones = new ArrayList<>();

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
        adopciones.add(adopcion);
        return adopcion;
    }

    public Adopcion getByDNI(int dni){
            for (Adopcion adop : adopciones){
                if (adop.getCliente().getDni() == dni){
                    return adop;
                }
            }
            return null;
    }
}