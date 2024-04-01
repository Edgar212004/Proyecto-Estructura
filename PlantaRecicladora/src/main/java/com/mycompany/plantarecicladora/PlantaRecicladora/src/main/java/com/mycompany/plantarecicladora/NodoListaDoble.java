/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.plantarecicladora;

/**
 *
 * @author Moises
 */
public class NodoListaDoble {
    private Camion camion;
    public NodoListaDoble siguiente;
    public NodoListaDoble anterior;

    public NodoListaDoble(Camion camion) {
        this.camion = camion;
        this.siguiente = null;
        this.anterior = null;
    }
    
    
}
