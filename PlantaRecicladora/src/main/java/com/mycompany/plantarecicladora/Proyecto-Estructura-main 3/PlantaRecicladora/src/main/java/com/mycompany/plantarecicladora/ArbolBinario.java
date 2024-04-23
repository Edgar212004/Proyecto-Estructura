/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.plantarecicladora;

/**
 *
 * @author Moises
 */
public class ArbolBinario {
    public NodoArbol raiz;

    public ArbolBinario() {
        this.raiz = null;
    }
    
    public void insertar(String nombre, int valor)
    {
        raiz = insertarNodo(raiz, nombre, valor);
    }
    
    private NodoArbol insertarNodo(NodoArbol nodo, String nombre, int valor)
    {
        if(nodo == null){
            return new NodoArbol(nombre, valor);
        }
        
        if (valor < nodo.getValor()) {
            nodo.setIzquierdo(insertarNodo(nodo.getIzquierdo(), nombre, valor));
        } 
        else if (valor > nodo.getValor())
        {
            nodo.setDerecho(insertarNodo(nodo.getDerecho(), nombre, valor));
        }
        
        return nodo;
    }
    
    public void recorridoPreorden(NodoArbol nodo)
    {
        if (nodo != null)
        {
            System.out.println(nodo);
            recorridoPreorden(nodo.getIzquierdo());
            recorridoPreorden(nodo.getDerecho());
        }
    }
    
    public void recorridoInorden(NodoArbol nodo)
    {
        if (nodo != null) 
        {
            recorridoInorden(nodo.getIzquierdo());
            System.out.println(nodo);
            recorridoInorden(nodo.getDerecho());
         }
     }
    
    public void recorridoPostorden(NodoArbol nodo)
    {
        if(nodo != null)
        {
            recorridoPostorden(nodo.getIzquierdo());
            recorridoPostorden(nodo.getDerecho());
            System.out.println(nodo);
        }
    }
}
