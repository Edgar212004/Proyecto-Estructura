/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.plantarecicladora;

/**
 *
 * @author Pablo
 */
public class NodoListaSimpleCircular {
    
    private ProductoReciclado datoProducto;
    private NodoListaSimpleCircular siguiente; 

    public NodoListaSimpleCircular() {
    }

    public NodoListaSimpleCircular(ProductoReciclado datoProducto, NodoListaSimpleCircular siguiente) {
        this.datoProducto = datoProducto;
        this.siguiente = siguiente;
    }

    public ProductoReciclado getDatoProducto() {
        return datoProducto;
    }

    public void setDatoProducto(ProductoReciclado datoProducto) {
        this.datoProducto = datoProducto;
    }

    public NodoListaSimpleCircular getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoListaSimpleCircular siguiente) {
        this.siguiente = siguiente;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Producto Empaquetado= ").append(datoProducto);
        sb.append('}');
        return sb.toString();
    }
}
