/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.plantarecicladora;

/**
 *
 * @author aubog
 */
public class NodoPila {
    
    private residuo residuoactual;
    private NodoPila siguiente;

    public NodoPila() {
    }

    public NodoPila(residuo residuoactual, NodoPila siguiente) {
        this.residuoactual = residuoactual;
        this.siguiente = siguiente;
    }

    public NodoPila getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPila siguiente) {
        this.siguiente = siguiente;
    }

    public residuo getResiduoactual() {
        return residuoactual;
    }

    public void setResiduoactual(residuo residuoactual) {
        this.residuoactual = residuoactual;
    }
    
    public String imprimirContenido()
    {
        return this.residuoactual.imprimirDetalleResiduo();
    }
    
    
}
