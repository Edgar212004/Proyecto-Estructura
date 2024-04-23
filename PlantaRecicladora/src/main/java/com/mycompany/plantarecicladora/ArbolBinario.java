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
    
    public void imprimeHojas() {
        if (raiz == null) {
            System.out.println("El árbol está vacío");
        } else {
            System.out.println("Los nodos sin hijos son:");
            imprimeHojasRecursivo(raiz);
        }
    }

    private void imprimeHojasRecursivo(NodoArbol n) {
        if (n != null) {
            if (n.getIzquierdo() == null && n.getDerecho() == null) {
                System.out.print(n.getValor() + ", ");
            } else {
                imprimeHojasRecursivo(n.getIzquierdo());
                imprimeHojasRecursivo(n.getDerecho());
            }
        }
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
    
    private boolean buscarRecursivo(NodoArbol nodo, int x) {
        if (nodo == null) {
            return false; 
        }

        if (nodo.getValor()== x) {
            return true;
        }

        if (x < nodo.getValor()) {
            return buscarRecursivo(nodo.getIzquierdo(), x);
        } else {
            return buscarRecursivo(nodo.getDerecho(), x);
        }
    }
    
    public void fusionarCon(ArbolBinario otroArbol) {
    fusionarNodos(this.raiz, otroArbol.raiz);
    }

    private void fusionarNodos(NodoArbol nodoActual, NodoArbol nodoAInsertar) {
        if (nodoAInsertar != null) {
            insertar(nodoAInsertar.getNombre(), nodoAInsertar.getValor());
            fusionarNodos(nodoActual, nodoAInsertar.getIzquierdo());
            fusionarNodos(nodoActual, nodoAInsertar.getDerecho());
        }
    }
    
    public ArbolBinario obtenerArbolDePequenosComercios() {
        ArbolBinario arbolPequenosComercios = new ArbolBinario();
        agregarPequenosComerciosRecursivo(this.raiz, arbolPequenosComercios);
        return arbolPequenosComercios;
    }

    private void agregarPequenosComerciosRecursivo(NodoArbol nodo, ArbolBinario arbolDestino) {
        if (nodo != null) {
            // Verificar si el nodo es una hoja y su nombre no comienza con "Estación"
            if (nodo.getIzquierdo() == null && nodo.getDerecho() == null && !nodo.getNombre().startsWith("Estación")) {
                arbolDestino.insertar(nodo.getNombre(), nodo.getValor());
            }
            // Recursividad para explorar todo el árbol
            agregarPequenosComerciosRecursivo(nodo.getIzquierdo(), arbolDestino);
            agregarPequenosComerciosRecursivo(nodo.getDerecho(), arbolDestino);
        }
    }
}
