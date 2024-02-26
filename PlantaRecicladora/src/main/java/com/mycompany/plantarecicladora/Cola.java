/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.plantarecicladora;

/**
 *
 * @author Moises
 */
public class Cola {
    private NodoCola frente;
    private NodoCola ultimo;

    public NodoCola getFrente() {
        return frente;
    }

    public void setFrente(NodoCola frente) {
        this.frente = frente;
    }

    public NodoCola getUltimo() {
        return ultimo;
    }

    public void setUltimo(NodoCola ultimo) {
        this.ultimo = ultimo;
    }
    
    public boolean esVacia()
    {
        if(frente == null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public void agregar(residuo nuevoResiduo) {
        NodoCola nuevoNodo = new NodoCola(nuevoResiduo);
        if (esVacia()) {
            frente = nuevoNodo;
        } else {
            ultimo.setSiguiente(nuevoNodo);
        }
        ultimo = nuevoNodo;
        
}
    
    public NodoCola desencolar() 
    {
        if(esVacia())
        {
        frente = frente.getSiguiente();
        if (frente == null){
            ultimo = null;
        }
        else
        {
            System.out.println("Cola vacía");
        }
    }
        return null;
}
    public String imprimirCola()
    {
        String respuesta = "";
        
        if(esVacia())
        {
            respuesta = "No se puede imprimir la cola porque no tiene residuos";
        }
        else
        {
            NodoCola auxiliar = frente;
            
            while(auxiliar != null)
            {
                respuesta += auxiliar.imprimirContenido() + "\n";
                auxiliar = auxiliar.getSiguiente();
            }
        }
        
        return respuesta;
    }
    

    public void agregarR(residuo nuevoResiduo) {
        NodoCola nuevoNodo = new NodoCola(nuevoResiduo);
        if (esVacia()) {
            frente = nuevoNodo;
        } else {
            ultimo.setSiguiente(nuevoNodo);
        }
        ultimo = nuevoNodo;
    }
}



