/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.plantarecicladora;

/**
 *
 * @author Moises
 */
public class Camion {

    private int id;
    private String placa;
    private int kilometraje;
    private ListaSimpleCircular productos;

    public Camion(int id, String placa, int kilometraje, ListaSimpleCircular productos) {
        this.id = id;
        this.placa = placa;
        this.kilometraje = kilometraje;
        this.productos = productos;
    }

}
