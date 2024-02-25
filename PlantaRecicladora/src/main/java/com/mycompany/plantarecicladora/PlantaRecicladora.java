/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.plantarecicladora;

/**
 *
 * @author aubog
 */
public class PlantaRecicladora {

    public static void main(String[] args) {
        Pila pila = new Pila();
        Cola cola = new Cola ();
        
        residuo residuo1 = new residuo("Botella", "Plastico");
        residuo residuo2 = new residuo("Caja", "Carton");
        residuo residuo3 = new residuo("Bolsa", "Plastico");
        
        pila.apilar(residuo1);
        pila.apilar(residuo2);
        pila.apilar(residuo3);
        
        System.out.println(pila.imprimirPila());
    }
}
