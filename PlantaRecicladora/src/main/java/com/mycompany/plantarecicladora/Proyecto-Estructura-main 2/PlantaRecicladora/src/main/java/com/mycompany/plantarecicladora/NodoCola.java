/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.plantarecicladora;

/**
 *
 * @author Moises
 */
public class NodoCola {
    private residuo actual;
    private NodoCola siguiente;
    
    public NodoCola(residuo actual) {
        this.actual = actual;
        this.siguiente = null;
    }

    public residuo getActual() {
        return actual;
    }

    public NodoCola getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCola siguiente) {
        this.siguiente = siguiente;
    }
    
    public String imprimirContenido() {
        return actual.imprimirDetalleResiduo();
    }
}
