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

    public Camion() {
    }
    
    
    public Camion(int id, String placa, int kilometraje, ListaSimpleCircular productos) {
        this.id = id;
        this.placa = placa;
        this.kilometraje = kilometraje;
        this.productos = productos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public ListaSimpleCircular getProductos() {
        return productos;
    }

    public void setProductos(ListaSimpleCircular productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Camion{");
        sb.append("id=").append(id);
        sb.append(", placa=").append(placa);
        sb.append(", kilometraje=").append(kilometraje);
        sb.append(", productos=").append(productos);
        sb.append('}');
        return sb.toString();
    }
    
    

}
