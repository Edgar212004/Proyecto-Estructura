
package com.mycompany.plantarecicladora;

public class ListaSimpleCircular {
    private NodoListaSimpleCircular cabeza;
    private NodoListaSimpleCircular ultimo;

    public NodoListaSimpleCircular getCabeza() {
        return cabeza;
    }

    public void setCabeza(NodoListaSimpleCircular cabeza) {
        this.cabeza = cabeza;
    }

    public NodoListaSimpleCircular getUltimo() {
        return ultimo;
    }

    public void setUltimo(NodoListaSimpleCircular ultimo) {
        this.ultimo = ultimo;
    }
    
    public void insertar(ProductoReciclado nuevoProducto) {
    //1. La lista está vacía
    if (cabeza == null) {
        cabeza = new NodoListaSimpleCircular(nuevoProducto, null);
        ultimo = cabeza;
        ultimo.setSiguiente(cabeza);
    } else {
        //2. Si insertamos un elemento con un id menor al id de la cabeza
        if (nuevoProducto.getId() < cabeza.getDatoProducto().getId()) {
            NodoListaSimpleCircular auxiliar = new NodoListaSimpleCircular(nuevoProducto, cabeza);
            cabeza = auxiliar;
            ultimo.setSiguiente(cabeza);
        } else {
            //3. Si insertamos un elemento con un id mayor al último
            if (nuevoProducto.getId() > ultimo.getDatoProducto().getId()) {
                NodoListaSimpleCircular auxiliar = new NodoListaSimpleCircular(nuevoProducto, cabeza);
                ultimo.setSiguiente(auxiliar);
                ultimo = auxiliar;
            } else {
                //4. Insertar en medio de la lista
                NodoListaSimpleCircular auxiliar = cabeza;
                while (auxiliar.getSiguiente().getDatoProducto().getId() < nuevoProducto.getId()) {
                    auxiliar = auxiliar.getSiguiente();
                }
                
                //Actualizar los enlaces
                NodoListaSimpleCircular nuevoAuxiliar = new NodoListaSimpleCircular(nuevoProducto, auxiliar.getSiguiente());
                auxiliar.setSiguiente(nuevoAuxiliar);
                }
            }
        }
    }
    
    public void empacar (ListaSimple listaSimple) {
    NodoListaSimple auxiliar = listaSimple.getCabeza();

        while (auxiliar != null) {
            ProductoReciclado producto = auxiliar.getDatoProducto();
            // Agregar la letra 'E' antes del número de lote
            String nuevoNumeroLote = "E" + producto.getNumeroLote();
            producto.setNumeroLote(nuevoNumeroLote);

            insertar(producto);
            auxiliar = auxiliar.getSiguiente();
        }
    }



    @Override
    public String toString() {
        StringBuilder respuesta = new StringBuilder("Lista circular: \n");
        
        NodoListaSimpleCircular auxiliar = cabeza;
        
        if (auxiliar != null) {
            respuesta.append("Cabeza: ").append(auxiliar).append("\n");
            auxiliar = auxiliar.getSiguiente();
            
            while (auxiliar != cabeza) {
                if (auxiliar == ultimo) {
                    respuesta.append("Último: ").append(auxiliar).append("\n");
                } else {
                    respuesta.append(auxiliar).append("\n");
                }
                auxiliar = auxiliar.getSiguiente();
            }
        } else {
            respuesta.append("Lista circular vacía");
        }
        
        return respuesta.toString();
    }
}
