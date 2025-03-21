import java.util.Date;

public class PrestamoMaterial {
    private RecursoEducativo recursoEducativo;
    private Usuario usuario;
    private Date fechaPrestamo;
    private Date fechaDevolucion;
    private boolean devuelto;

    public PrestamoMaterial(RecursoEducativo recursoEducativo, Usuario usuario, Date fechaPrestamo) {
        this.recursoEducativo = recursoEducativo;
        this.usuario = usuario;
        this.fechaPrestamo = fechaPrestamo;
        this.devuelto = false;
    }

    // Método para registrar la devolución
    public void registrarDevolucion(Date fechaDevolucion, String estadoRecurso) {
        
    }

    public RecursoEducativo getRecursoEducativo() {
        return recursoEducativo;
    }

    public void setRecursoEducativo(RecursoEducativo recursoEducativo) {
        this.recursoEducativo = recursoEducativo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public boolean isDevuelto() {
        return devuelto;
    }

    public void setDevuelto(boolean devuelto) {
        this.devuelto = devuelto;
    }

    
}