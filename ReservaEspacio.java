public class ReservaEspacio {
    private EspacioAcademico espacio;
    private Usuario usuario;
    private String fecha;
    private String horaInicio;
    private String horaFin;
    private String estado; // "pendiente", "confirmada", "cancelada"

    public ReservaEspacio(EspacioAcademico espacio, Usuario usuario, String fecha, String horaInicio, String horaFin) {
        this.espacio = espacio;
        this.usuario = usuario;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.estado = "pendiente";
    }

    public void reportarReserva() {
        // Lógica para reportar la reserva
    }

    public void cancelarReserva() {
        // Lógica para cancelar la reserva
    }

    // Getters
    public EspacioAcademico getEspacio() {
        return espacio;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public String getEstado() {
        return estado;
    }
}