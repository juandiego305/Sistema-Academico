public class EspacioAcademico {
    private String nombre;
    private int capacidad;
    private String tipo; // "aula", "laboratorio", "virtual"
    private boolean disponible;

    public EspacioAcademico(String nombre, int capacidad, String tipo) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.tipo = tipo;
        this.disponible = true; 
    }
    
    public void actualizarDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean isDisponible() {
        return disponible;
    }

    
}