package modelo;

import java.util.ArrayList;
import modelo.ContenidoMultimedia;

public class Podcast extends ContenidoMultimedia {
    
    private String anfitrion;
    
    public Podcast(String titulo, int duracionMinutos, int anioLanzamiento, String anfitrion) {
        super(titulo, duracionMinutos, anioLanzamiento);
        this.anfitrion = anfitrion;
    }
    
    @Override
    public void iniciarReproduccion() {
        System.out.println("Conectando al servidor de audio y preparando el episodio del podcast...");
    }
     
}
