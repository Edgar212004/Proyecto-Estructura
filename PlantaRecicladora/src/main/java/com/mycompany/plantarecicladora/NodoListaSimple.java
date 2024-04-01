package com.mycompany.plantarecicladora;

public class NodoListaSimple {
    private ProductoReciclado datoProducto;
    private NodoListaSimple siguiente;

    public NodoListaSimple() {
    }

    public NodoListaSimple(ProductoReciclado datoProducto, NodoListaSimple siguiente) {
        this.datoProducto = datoProducto;
        this.siguiente = siguiente;
    }

    public NodoListaSimple getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoListaSimple siguiente) {
        this.siguiente = siguiente;
    }

    public ProductoReciclado getDatoProducto() {
        return datoProducto;
    }

    public void setDatoProducto(ProductoReciclado datoProducto) {
        this.datoProducto = datoProducto;
    }
    
    @Override
    public String toString() {
        return this.datoProducto.toString();
    }   
}


