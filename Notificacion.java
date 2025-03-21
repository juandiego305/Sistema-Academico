
public class Notificacion {
    private EventoAcademico eventoRelacionado;
    private String fechaProgramacion;
    private String canal; // "correo", "sms", "push"
    private boolean enviada;

    public Notificacion(EventoAcademico eventoRelacionado, String fechaProgramacion, String canal) {
        this.eventoRelacionado = eventoRelacionado;
        this.fechaProgramacion = fechaProgramacion;
        this.canal = canal;
        this.enviada = false;
    }

    
    public boolean programarNotificacion() {
        // Lógica para programar la notificación
        return true;
    }

    public boolean enviarNotificacion() {
        // logica para enviar notificación
        return true;
    }

    // Método para verificar si la notificación fue enviada
    public boolean verificarEnvio() {
        return enviada;
    }

    public EventoAcademico getEventoRelacionado() {
        return eventoRelacionado;
    }

    public void setEventoRelacionado(EventoAcademico eventoRelacionado) {
        this.eventoRelacionado = eventoRelacionado;
    }

    public String getFechaProgramacion() {
        return fechaProgramacion;
    }

    public void setFechaProgramacion(String fechaProgramacion) {
        this.fechaProgramacion = fechaProgramacion;
    }

    public String getCanal() {
        return canal;
    }

    public void setCanal(String canal) {
        this.canal = canal;
    }

    public boolean isEnviada() {
        return enviada;
    }

    public void setEnviada(boolean enviada) {
        this.enviada = enviada;
    }

}