package Controllers;

import Modelo.Animal.Adopcion;
import Modelo.Cliente.Cliente;

import java.util.Date;

public class ClienteController {

    private static ClienteController instancia;

    private ClienteController(){}

    public static ClienteController getInstancia(){
        if (instancia == null){
            instancia = new ClienteController();
        }
        return instancia;
    }

    public Cliente crearCliente(String nombre, String apellido, int dni, String email, int telefono, String estadoCivil, String ocupacion, int mascotas, String motivoAdopcion, String animalesInteresados){
        return new Cliente(nombre, apellido, dni, email, telefono, estadoCivil, ocupacion, mascotas, motivoAdopcion,animalesInteresados);
    }
    public void realizarAdopcion(int idFicha, Cliente cliente){
        if (cliente.getMascotas() == 2){
            System.out.println("Maximo de mascotas, no se puede adoptar");
        }
        else {
            System.out.println("Pasa validacion max mascotas");
            cliente.adoptar(idFicha);
            System.out.println("El cliente tiene " + cliente.getMascotas() + " mascota/s" );
        }
    }
}
