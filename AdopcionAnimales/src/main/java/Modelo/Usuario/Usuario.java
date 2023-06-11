package Modelo.Usuario;

public class Usuario {

    private String nombre;
    private String apellido;
    private int telefono;
    private int edad;
    private int dni;
    private String estadoCivil;
    private TipoUsuario tipoUsuario;
    private iUsuarioAdapter usuarioAdapter;

    public Usuario(String nombre, String apellido, int telefono, int edad, int dni, String estadoCivil, TipoUsuario tipoUsuario, iUsuarioAdapter usuarioAdapter) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.edad = edad;
        this.dni = dni;
        this.estadoCivil = estadoCivil;
        this.tipoUsuario = tipoUsuario;
        this.usuarioAdapter = usuarioAdapter;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public void obtenerDatos(int contrasena){
        usuarioAdapter.obtenerDatos(contrasena);
    }
}
