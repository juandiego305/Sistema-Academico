public class Equipo extends RecursoEducativo {
    private String tipo; // "computadora", "proyector", etc.
    private String numeroSerie;
    private String marca;

    public Equipo(String id, String nombre, String tipo, String numeroSerie,String marca) {
        super(id, nombre);
        this.tipo = tipo;
        this.numeroSerie = numeroSerie;
        this.marca = marca;
    }

    // Getters y setters
    public String getTipo() {
        return tipo;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}