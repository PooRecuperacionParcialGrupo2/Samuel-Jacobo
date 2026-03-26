/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tipo2;

import java.util.ArrayList;
/**
 *
 * @author Usuario
 */
public class AppStreaming {
    
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
        ArrayList<Pelicula> arregloPelicula = new ArrayList<>();
        ArrayList<Podcast> arregloPodcast = new ArrayList<>();
    }
    
}
