public class Libro extends RecursoEducativo {
    private String autor;
    private String ISBN;
    private String edicion;

    public Libro(String id, String nombre, String autor, String ISBN, String edicion) {
        super(id, nombre);
        this.autor = autor;
        this.ISBN = ISBN;
        this.edicion = edicion;
    }

    // Getters y setters
    public String getAutor() {
        return autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }
}