/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primerparcial_automatas;

/**
 *
 * @author david
 */
public class listaCircular {

 private Nodo ultimo;
    private Nodo primero;
    private int size;
     
    //Constructor
    public listaCircular() {
        ultimo = null;
        primero = null;
    }
    public int getSize() {
        return this.size;
    }
 
       //Metodos
    
    public boolean isEmpty() {
        return this.ultimo == null && this.primero == null;
    }
    
       //Agregar elemento

    public void addElement(Imagen v) {
           Nodo nuevo = new Nodo(v);
    nuevo.setImagen(v);
    if(primero ==null) {
        primero = nuevo;
        ultimo = primero;
    }else {
        Nodo temporal = ultimo;
        ultimo = nuevo;
        ultimo.setAnterior(temporal);
        temporal.setSiguiente(nuevo);
        //falta setearle a ultimo, para que apunte al primero!
        ultimo.setSiguiente(primero);
    }
    }
    
    public Nodo primero() {
        return primero;
    }
}