/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.plantarecicladora;
   import javax.swing.JOptionPane;

import javax.swing.JOptionPane;

/**
 *
 * @author aubog
 */
public class Pila {
    
   private NodoPila cima; //Top
   
   public boolean esVacia()
    {
        //Como sé si la pila está vacía?
        if(cima == null) //Si no hay nada
        {
            return true;
        }
        else
        {
            return false;
        }
    }

//    public void pedirDatosYApilar() {
//        // Pedir datos al usuario
//        String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del residuo:", "Entrada de Datos", JOptionPane.INFORMATION_MESSAGE);
//        String tipo = JOptionPane.showInputDialog(null, "Ingrese el tipo del residuo:", "Entrada de Datos", JOptionPane.INFORMATION_MESSAGE);
//
//        residuo nuevoResiduo = new residuo(nombre, tipo);
//       
//        apilar(nuevoResiduo);
//
//        
//    }

   public void apilar(residuo nuevoResiduo) // Insertar
    {
        NodoPila nuevo = new NodoPila();
        nuevo.setResiduoactual(nuevoResiduo);
        
        if(esVacia())
        {
            cima = nuevo;
        }
        else
        {
            
            nuevo.setSiguiente(cima);
            cima = nuevo;
        }
    }

   public void desapilar()
    {
        if(esVacia())
        {
            System.out.println("Pila vacía, no se pueden extraer elementos");
        }
        else
        {
            cima = cima.getSiguiente();
        }
    }
   
   
   public String imprimirPila()
    {
        String respuesta = "";
        
        if(esVacia())
        {
            respuesta = "Pila vacía! No se pueden imprimir elementos";
        }
        else
        {
            NodoPila auxiliar = cima;
            while(auxiliar != null)
            {
                respuesta += auxiliar.imprimirContenido() + "\n";
                auxiliar = auxiliar.getSiguiente();
            }
        }
        
        return respuesta;
    }
}
