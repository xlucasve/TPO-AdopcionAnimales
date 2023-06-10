package Modelo.Animal;

public class TratamientoMedico {
    private Accion tratamientoRealizado;
    private String comentario;
    private Usuario veterinarioActor;
    private Date fechaRealizacion;

    public Cliente(Accion tratamientoRealizado, String comentario, Usuario veterinarioActor, Date fechaRealizacion) {
        this.comentario = comentario;
        this.tratamientoRealizado = tratamientoRealizado;
        this.veterinarioActor = veterinarioActor;
        this.fechaRealizacion = fechaRealizacion;
    }

    public Accion getTratamientoRealizado() {
        return tratamientoRealizado;
    }

    public void setTratamientoRealizado(String tratamientoRealizado) {
        this.tratamientoRealizado = tratamientoRealizado;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Usuario getVeterinarioActor() {
        return veterinarioActor;
    }

    public void setComentario(Usuario veterinarioActor) {
        this.veterinarioActor = veterinarioActor;
    }

    public String getfechaRealizacion() {
        return fechaRealizacion;
    }

    public void setComentario(String comentario) {
        this.fechaRealizacion = fechaRealizacion;
    }
}
