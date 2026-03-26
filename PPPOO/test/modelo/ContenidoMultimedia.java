package modelo;

public abstract class ContenidoMultimedia {
    
    protected String titulo;
    protected int duracionMinutos;
    protected int anioLanzamiento;
    
    public ContenidoMultimedia(String titulo, int duracionMinutos, int anioLanzamiento) {
        this.titulo = titulo;
        this.duracionMinutos = duracionMinutos;
        this.anioLanzamiento = anioLanzamiento;
    }
    
    public abstract void iniciarReproduccion();
    
    public String obtenerResumen() {
        return "Titulo: " + titulo + " - Año: " + anioLanzamiento;
    }
    
}
