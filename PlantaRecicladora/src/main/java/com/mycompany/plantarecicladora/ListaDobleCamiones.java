
package com.mycompany.plantarecicladora;

public class ListaDobleCamiones {
    private NodoListaDoble cabeza;
    private NodoListaDoble ultimo;

    public void inserta(Camion camion)
    {
        //Paso 1. Validar si está vacío
        if(cabeza == null)
        {
            cabeza = new NodoListaDoble(camion);
            ultimo = cabeza;
            ultimo.setSiguiente(cabeza);
            ultimo.setAnterior(cabeza);
            cabeza.setSiguiente(ultimo);
            cabeza.setAnterior(ultimo);
        }
        else
        {
            //Paso 2. Insertamos un elemento antes de la cabeza
            //El elemento a insertar tiene un id menor a la cabeza actual
            if(camion.getId() < cabeza.getCamion().getId())
            {
                NodoListaDoble aux = new NodoListaDoble(camion);
                aux.setSiguiente(cabeza);
                cabeza.setAnterior(aux);
                cabeza = aux;
                ultimo.setSiguiente(cabeza);
                cabeza.setAnterior(ultimo);
            }
            else
            {
                //Paso 3. Si el nuevo elemento es mayor al último dato de la lista, en este caso se inserta al final
                if(camion.getId() > ultimo.getCamion().getId())
                {
                    NodoListaDoble aux = new NodoListaDoble(camion);
                    aux.setAnterior(ultimo);
                    ultimo.setSiguiente(aux);
                    ultimo = aux;
                    ultimo.setSiguiente(cabeza);
                    cabeza.setAnterior(ultimo);
                }
                else
                {
                    //Paso 4. El elemento a insertar va en medio de la lista (no es cabeza, ni es último)
                    NodoListaDoble aux = cabeza.getSiguiente();
                    while(camion.getId() > aux.getCamion().getId())
                    {
                        aux = aux.getSiguiente();
                    }
                    
                    NodoListaDoble nodoNuevo = new NodoListaDoble(camion);
                    nodoNuevo.setSiguiente(aux);
                    nodoNuevo.setAnterior(aux.getAnterior());
                    aux.getAnterior().setSiguiente(nodoNuevo);
                    aux.setAnterior(nodoNuevo);
                }
            }
        }
    }

 @Override
public String toString() {
    StringBuilder respuesta = new StringBuilder("Lista doble circular de camiones:\n");

    if (cabeza == null) {
        respuesta.append("Lista vacía\n");
    } else {
        NodoListaDoble aux = cabeza;

        do {
            respuesta.append(aux).append("\n");
            // Verificar si el camión tiene productos asociados
            if (aux.getCamion().getProductos() != null) {
                respuesta.append("Productos asociados:\n");
                respuesta.append(aux.getCamion().getProductos()).append("\n");
            }
            aux = aux.getSiguiente();
        } while (aux != cabeza);
    }

    return respuesta.toString();
}

    
    

    public NodoListaDoble getCabeza() {
        return cabeza;
    }

    public void setCabeza(NodoListaDoble cabeza) {
        this.cabeza = cabeza;
    }

    public NodoListaDoble getUltimo() {
        return ultimo;
    }

    public void setUltimo(NodoListaDoble ultimo) {
        this.ultimo = ultimo;
    }
    
    
}
