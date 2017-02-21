/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd.practica1;

/**
 *
 * @author Jorge Espina
 */
public class NodoListaSimpleFichasJugador {
    String Dato;
    NodoListaSimpleFichasJugador Siguiente;
    
     public void NodoListaSimpleFichasJugador() {
    
       this.Dato = "";
       this.Siguiente = null;
}
    public NodoListaSimpleFichasJugador getSiguiente() {
        return Siguiente;
    }

   
    public void setSiguiente(NodoListaSimpleFichasJugador Siguiente) {
        this.Siguiente = Siguiente;
    }

   
    public String getDato() {
        return Dato;
    }

    public void setDato(String Dato) {
        this.Dato = Dato;
    }
}
