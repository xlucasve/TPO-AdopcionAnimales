package Modelo.Cliente;

import Controllers.AdopcionController;
import Modelo.Animal.Adopcion;

import java.util.Date;

public class Cliente {
    private String nombre;
    private String apellido;
    private int dni;
    private String email;
    private int telefono;
    private String estadoCivil;
    private String ocupacion;
    private int mascotas;
    private String motivoAdopcion;
    private String animalesInteresados;

    public Cliente(String nombre, String apellido, int dni, String email, int telefono, String estadoCivil, String ocupacion, int mascotas, String motivoAdopcion, String animalesInteresados) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.email = email;
        this.telefono = telefono;
        this.estadoCivil = estadoCivil;
        this.ocupacion = ocupacion;
        this.mascotas = mascotas;
        this.motivoAdopcion = motivoAdopcion;
        this.animalesInteresados = animalesInteresados;
    }

    public void adoptar(int idFicha){
        // aca hacer que fecha sea la del momento de la ejecucion pero nose jaja
        Date fecha = new Date();
        AdopcionController adopcionController = AdopcionController.getInstancia();
        Adopcion adopcion = adopcionController.crearAdopcion(this,false, fecha, idFicha);
        this.mascotas = this.mascotas + 1;
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

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public int getMascotas() {
        return mascotas;
    }

    public void setMascotas(int mascotas) {
        this.mascotas = mascotas;
    }

    public String getMotivoAdopcion() {
        return motivoAdopcion;
    }

    public void setMotivoAdopcion(String motivoAdopcion) {
        this.motivoAdopcion = motivoAdopcion;
    }

    public String getAnimalesInteresados() {
        return animalesInteresados;
    }

    public void setAnimalesInteresados(String animalesInteresados) {
        this.animalesInteresados = animalesInteresados;
    }
}
