/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primerparcial_automatas;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author david
 */
public class Album {
    private String nombre;
    private ArrayList<Imagen> imagenes = new ArrayList<>();
    
    public void asignarImagen(Imagen e){
        e.setAlbum(this);
        imagenes.add(e);
    }
 public ArrayList<Imagen> getImagen() {
        return imagenes;
    }

    public void setImagen(ArrayList<Imagen> imagenes) {
        this.imagenes = imagenes;
    }
  

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Imagen> getImagenes() {
        return imagenes;
    }

    public void agregarImagen(Imagen imagen) {
        this.imagenes.add(imagen);
    }
}
