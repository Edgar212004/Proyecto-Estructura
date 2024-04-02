package com.mycompany.plantarecicladora;

public class NodoListaDoble {
    private Camion camion;
    private NodoListaDoble siguiente;
    private NodoListaDoble anterior;

    public NodoListaDoble() {
    }
    
    
    public NodoListaDoble(Camion camion) {
        this.camion = camion;
        this.siguiente = null;
        this.anterior = null;
    }

    public NodoListaDoble getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoListaDoble siguiente) {
        this.siguiente = siguiente;
    }

    public NodoListaDoble getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoListaDoble anterior) {
        this.anterior = anterior;
    }

    public Camion getCamion() {
        return camion;
    }

    public void setCamion(Camion camion) {
        this.camion = camion;
    }
    
    @Override
    public String toString() {
        return this.camion.toString();
    }
}
