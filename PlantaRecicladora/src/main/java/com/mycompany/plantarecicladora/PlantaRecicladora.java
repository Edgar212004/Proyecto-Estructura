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
        
        Menu m = new Menu();
        m.setVisible(true); 

        ArbolBinario arbolOccidente = new ArbolBinario();

       arbolOccidente.insertar("Estación Atlántico", 40);
        arbolOccidente.insertar("Estación de Heredia", 20);
        arbolOccidente.insertar("San Joaquín", 15);
        arbolOccidente.insertar("San Francisco", 25);
        arbolOccidente.insertar("Estación Alajuela", 60);
        arbolOccidente.insertar("Río Segund", 55);
        arbolOccidente.insertar("Santa Marta", 65);
        
        System.out.println("Preorden de Occidente:");
        arbolOccidente.recorridoPreorden(arbolOccidente.raiz);
        System.out.println("\nInorden de Occidente:");
        arbolOccidente.recorridoInorden(arbolOccidente.raiz);
        System.out.println("\nPostorden de Occidente:");
        arbolOccidente.recorridoPostorden(arbolOccidente.raiz);
        System.out.println();
        
        ArbolBinario arbolOriente = new ArbolBinario();
        
        arbolOriente.insertar("Estación Pacífico", 80);
        arbolOriente.insertar("Estación Atlántico", 40); 
        arbolOriente.insertar("CFIA", 30);
        arbolOriente.insertar("San Pedro", 70);
        arbolOriente.insertar("Estación Cartago", 90);
        arbolOriente.insertar("Tres Ríos", 95);
        
        System.out.println("\nRecorrido Preorden de Oriente:");
        arbolOriente.recorridoPreorden(arbolOriente.raiz);

        System.out.println("\nRecorrido Inorden de Oriente:");
        arbolOriente.recorridoInorden(arbolOriente.raiz);

        System.out.println("\nRecorrido Postorden de Oriente:");
        arbolOriente.recorridoPostorden(arbolOriente.raiz);
    }
}

