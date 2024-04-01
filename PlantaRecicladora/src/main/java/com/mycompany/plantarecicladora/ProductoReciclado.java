
package com.mycompany.plantarecicladora;


public class ProductoReciclado extends residuo{
    
     private int idProducto;
    private String descripcion;
    private String materialBase;
    private int numeroLote;
    private String fechaProduccion;

    public ProductoReciclado() {
    }

    public ProductoReciclado(int idProducto, String descripcion, String materialBase, int numeroLote, String fechaProduccion) {
        this.idProducto = idProducto;
        this.descripcion = descripcion;
        this.materialBase = materialBase;
        this.numeroLote = numeroLote;
        this.fechaProduccion = fechaProduccion;
    }

    public int getId() {
        return idProducto;
    }

    public void setId(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMaterialBase() {
        return materialBase;
    }

    public void setMaterialBase(String materialBase) {
        this.materialBase = materialBase;
    }

    public int getNumeroLote() {
        return numeroLote;
    }

    public void setNumeroLote(int numeroLote) {
        this.numeroLote = numeroLote;
    }

    public String getFechaProduccion() {
        return fechaProduccion;
    }

    public void setFechaProduccion(String fechaProduccion) {
        this.fechaProduccion = fechaProduccion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ProductoReciclado");
        sb.append(" id=").append(idProducto);
        sb.append(", descripcion=").append(descripcion);
        sb.append(", materialBase=").append(materialBase);
        sb.append(", numeroLote=").append(numeroLote);
        sb.append(", fechaProduccion=").append(fechaProduccion);
       
        return sb.toString();
    }
    
}
