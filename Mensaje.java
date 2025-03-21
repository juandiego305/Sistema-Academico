
public class Mensaje {
    private Usuario remitente;
    private Usuario destinatarios;
    private String asunto;
    private String contenido;
    private String fechaEnvio;
    private boolean leido;
    private String tipo; //mensaje interno o foro;

    public Mensaje(Usuario remitente, Usuario destinatarios, String asunto, String contenido, String fechaEnvio, String tipo) {
        this.remitente = remitente;
        this.destinatarios = destinatarios;
        this.asunto = asunto;
        this.contenido = contenido;
        this.fechaEnvio = fechaEnvio;
        this.leido = false;
        this.tipo = tipo;
    }

    public boolean enviarMensaje() {
        // logica para enviar mensaje
        return true;
    }

    public void marcarComoLeido() {
        this.leido = true;
    }

    public void responderMensaje(String nuevoContenido) {
        //logica para responder mensajes
    }

    // Getters y setters
    public Usuario getRemitente() {
        return remitente;
    }

    public Usuario getDestinatario() {
        return destinatarios;
    }

    public String getAsunto() {
        return asunto;
    }

    public String getContenido() {
        return contenido;
    }

    public String getFechaEnvio() {
        return fechaEnvio;
    }

    public boolean isLeido() {
        return leido;
    }

    public String getTipo() {
        return tipo;
    }
}