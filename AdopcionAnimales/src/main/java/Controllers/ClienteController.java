package Controllers;

import Modelo.Cliente.Cliente;

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
}
