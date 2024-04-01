/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.plantarecicladora;

/**
 *
 * @author Moises
 */
public class ListaDobleCamiones {
    private NodoListaDoble cabeza;
    private NodoListaDoble ultimo;

    public ListaDobleCamiones( ) {
        this.cabeza = null;
        this.ultimo = null;
    }
    
    public void insertarCamion(Camion camion)
    {
        NodoListaDoble aux = new NodoListaDoble (camion);
        if(cabeza == null)
        {
            cabeza = aux;
            ultimo = aux;
        }
        else
        {
            aux.anterior = ultimo;
            ultimo.siguiente = aux;
            ultimo = aux;
        }
    }
    
}
