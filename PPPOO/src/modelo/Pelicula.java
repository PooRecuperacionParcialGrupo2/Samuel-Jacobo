package modelo;

import modelo.ContenidoMultimedia;
import java.util.ArrayList;

public class Pelicula extends ContenidoMultimedia {
    
    private String director;
    
    public Pelicula(String titulo, int duracionMinutos, int anioLanzamiento, String director) {
        super(titulo, duracionMinutos, anioLanzamiento);
        this.director = director;
    }
    
    @Override
    public void iniciarReproduccion() {
        System.out.println("Cargando video y ajustando subtítulos para la película...");
    }
    
    public void configurarVisualizacion() {
        System.out.println("Reproduciendo en calidad automática, idioma original.");
    }
    
    public void configurarVisualizacion(String calidad) {
        System.out.println("Reproduciendo en calidad " + calidad);
    }
    
    public void configurarVisualizacion(String calidad, String idiomaSubtitulos) {
        System.out.println("Reproduciendo en calidad " + calidad + " con subtitulos en " + idiomaSubtitulos);
    }
    
}
