import java.util.Date;

public class Mantenimiento {
    private Equipo equipo;
    private Date fechaInicio;
    private Date fechaFin;
    private String descripcion;
    private boolean finalizado;

    public Mantenimiento(Equipo equipo, Date fechaInicio, String descripcion) {
        this.equipo = equipo;
        this.fechaInicio = fechaInicio;
        this.descripcion = descripcion;
        this.finalizado = false;
    }

    // Método para finalizar el mantenimiento
    public void finalizarMantenimiento(Date fechaFin) {
        
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isFinalizado() {
        return finalizado;
    }

    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }

   
}