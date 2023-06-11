package Modelo.Usuario;

public class UsuarioAdapter implements  iUsuarioAdapter{

    @Override
    public void obtenerDatos(int contraseña) {
        System.out.println("Realizando Llamado a API...");
        System.out.println("Obteniendo Datos de API....");
        System.out.println("Logueado exitosamente");
    }
}
