package Modelo.Alarma;

public class Accion {
    private String accionRealizar;
    private String descripcion;

    public Accion(String accionRealizar, String descripcion) {
        this.accionRealizar = accionRealizar;
        this.descripcion = descripcion;
    }


    public String getAccionRealizar() {
        return accionRealizar;
    }

    public void setAccionRealizar(String accionRealizar) {
        this.accionRealizar = accionRealizar;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
