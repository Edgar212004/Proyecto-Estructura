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
        Cola cola = new Cola();

        residuo residuo1 = new residuo("Botella", "Plastico");
        residuo residuo2 = new residuo("Caja", "Carton");
        residuo residuo3 = new residuo("Bolsa", "Plastico");
        residuo residuo4 = new residuo("Lata", "Alunimio");
        
        pila.apilar(residuo1);
        pila.apilar(residuo2);
        pila.apilar(residuo3);
        pila.apilar(residuo4);
        
        System.out.println("Pila antes de pasar datos a la cola:");
        
        System.out.println(pila.imprimirPila());
        
        System.out.println("Cola antes de pasar datos desde la pila:");
        
        System.out.println(cola.imprimirCola());

        //datos de la pila a la cola
        pila.pasarDatosACola(cola);

        //pila y la cola después de pasar datos
        System.out.println("Pila después de pasar datos a la cola:");
        
        System.out.println(pila.imprimirPila());
        
        System.out.println("Cola después de pasar datos desde la pila:");
        
        System.out.println(cola.imprimirCola());
       

    }
}

