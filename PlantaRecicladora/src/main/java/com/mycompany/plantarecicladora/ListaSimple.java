package com.mycompany.plantarecicladora;

public class ListaSimple {
    private NodoListaSimple cabeza;

    public NodoListaSimple getCabeza() {
        return cabeza;
    }

    public void setCabeza(NodoListaSimple cabeza) {
        this.cabeza = cabeza;
    }
    
    public void insertar(ProductoReciclado nuevoProducto)
    {
        //1. La lista está vacía
        if(cabeza == null)
        {
            cabeza = new NodoListaSimple(nuevoProducto, null);
        }
        else
        {
            //2.
            //El producto a insertar tiene un id menor al que referencia la cabeza (el primero y menor de la lista)
            //Se debe insertar a la izquierda de la cabeza.
            if(nuevoProducto.getId() < cabeza.getDatoProducto().getId())
            {
                //Definimos un nodo auxiliar para almacenar temporalmente la cabeza actual
                //Antes de cambiarla a la nueva cabeza
                NodoListaSimple auxiliar = new NodoListaSimple(nuevoProducto, cabeza); // Insertamos el nuevo producto antes de la cabeza actual
                cabeza = auxiliar; // El nuevo nodo o auxiliar, se convierte en la nueva cabeza
            }
            else
            {
                //3.
                //La lista solo tiene un elemento y se debe insertar a la derecha de la cabeza
                //Aquí el id del producto es mayor a la cabeza
                if(cabeza.getSiguiente() == null) //Solo tenemos un elemento en la lista y ese elemento es la cabeza
                {
                    NodoListaSimple auxiliar = new NodoListaSimple(nuevoProducto, null); // Insertamos el nuevo producto después de la cabeza actual
                    cabeza.setSiguiente(auxiliar);
                }
                else
                {
                    NodoListaSimple auxiliar = cabeza;
                    
                    while(auxiliar.getSiguiente() != null //Debe haber un siguiente, si no lo hay, insertamos al final
                            && auxiliar.getSiguiente().getDatoProducto().getId() < nuevoProducto.getId()) //El nuevo elemento debe ser menor al siguiente, si no, insertamos en el medio
                    {
                        auxiliar = auxiliar.getSiguiente();
                    }
                    
                    NodoListaSimple nuevoNodo = new NodoListaSimple(nuevoProducto, auxiliar.getSiguiente()); //Vamos a almacenar el nuevo nodo, con el nuevo producto
                    auxiliar.setSiguiente(nuevoNodo);
                }
            }
        }
    }
    
    @Override
    public String toString() {
        StringBuilder respuesta = new StringBuilder("Lista de productos reciclados:\n");
        
        NodoListaSimple auxiliar = cabeza;
        
        while(auxiliar != null)
        {
            respuesta.append(auxiliar.toString()).append("\n");
            auxiliar = auxiliar.getSiguiente();
        }
        
        return respuesta.toString();
    }
}
