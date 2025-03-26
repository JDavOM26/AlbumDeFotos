/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primerparcial_automatas;

/**
 *
 * @author david
 */
public class Imagen {
       public Imagen(String nombre, String ruta, Album album) {
        this.nombre = nombre;
        this.ruta = ruta;
        this.album = album;
    }
  public Imagen() {}
  
    public String getNombre() {
        return nombre;
    }

 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
  private String nombre;
    /**
     * @return the album
     */
    public Album getAlbum() {
        return album;
    }
    

    /**
     * @param album the album to set
     */
    public void setAlbum(Album album) {
        this.album = album;
    }
private Album album;
    
    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
    private String ruta;

    public Imagen(String ruta) {
        this.ruta = ruta;
    }
    
}
