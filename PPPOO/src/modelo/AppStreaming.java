/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Jacobo Rico y Samuel Cardenas
 */

import java.util.ArrayList;
import modelo.Pelicula;
import modelo.Podcast;

public class AppStreaming {
    
    ArrayList<Pelicula> arregloPelicula = new ArrayList<>();
    ArrayList<Podcast> arregloPodcast = new ArrayList<>();
        
    public boolean insertarPelicula (Pelicula peli){
        if (arregloPelicula.isEmpty() || arregloPelicula.contains(peli)){
            arregloPelicula.add(peli);
            return true;
        }
        return false;
    }
    
    public boolean insertarPodcast (Podcast pod){
        if (arregloPodcast.isEmpty() || arregloPodcast.contains(pod)){
            arregloPodcast.add(pod);
            return true;
        }
        return false;
    }
    
    public static void main (String[] args){
        
        AppStreaming metodos = new AppStreaming();
        
        Pelicula peli = new Pelicula("Cars", 120, 2007, "Robert de Niro");
        metodos.insertarPelicula(peli);
        peli = new Pelicula("Batman", 100, 2015, "James Gunn");
        metodos.insertarPelicula(peli);
        peli = new Pelicula("Bastardos sin Gloria", 190, 2018, "Henry Cavill");
        metodos.insertarPelicula(peli);
        peli = new Pelicula("En busqueda de la felicidad", 180, 2004, "Will Smith");
        metodos.insertarPelicula(peli);
        
        Podcast pod = new Podcast("Redes Sociales", 40, 2024, "WestCol");
        metodos.insertarPodcast(pod);
        pod = new Podcast("Cambio Climatico", 60, 2021, "Blessd");
        metodos.insertarPodcast(pod);
        pod = new Podcast("Como ganar plata", 90, 2025, "Yeferson Cossio");
        metodos.insertarPodcast(pod);
        pod = new Podcast("Que estudiar", 40, 2025, "Jordi Wild");
        metodos.insertarPodcast(pod);
        
        System.out.println("=== RESUMEN DEL CONTENIDO ===");
        
        for (Pelicula p: metodos.arregloPelicula){
            System.out.println(p.obtenerResumen());
            p.iniciarReproduccion();
        }
        
        for (Podcast p: metodos.arregloPodcast){
            System.out.println(p.obtenerResumen());
            p.iniciarReproduccion();
        }
        
        System.out.println("=== CONFIGURACION PELICULAS ===");
        
        for (Pelicula p: metodos.arregloPelicula){
            p.configurarVisualizacion();
            p.configurarVisualizacion("4K");
            p.configurarVisualizacion("1080p", "Español");
        }
        
    }
    
}
