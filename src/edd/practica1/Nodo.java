
package edd.practica1;

/**
 *
 * @author Espina Molina
 */
public class Nodo  {
 /*Object Dato;
 Nodo Siguiente;
 Nodo Anterior; 
 //ListaSimpleFichasJugador ListaSimpleFichasJugador;
 
 public Nodo (Object Dato){
     this.Dato =Dato;
     Siguiente=null;
     //ListaSimpleFichasJugador = new ListaSimpleFichasJugador();
     //Dato = x;

 }*/
    ListaSimpleFichasJugador FichasJugadores;
    String Dato;
    Nodo Siguiente;
    Nodo Anterior; 
    public void Nodo(){
        this.setFichasJugadores(null);
        this.setDato(null);
    }
    public ListaSimpleFichasJugador getFichasJugadores() {
        return FichasJugadores;
    }

    public void setFichasJugadores(ListaSimpleFichasJugador FichasJugadores) {
        this.FichasJugadores = FichasJugadores;
    }

    public String getDato() {
        return Dato;
    }

   
    public void setDato(String Dato) {
        this.Dato = Dato;
    }

 
    public Nodo getSiguiente() {
        return Siguiente;
    }

  
    public void setSiguiente(Nodo Siguiente) {
        this.Siguiente = Siguiente;
    }
}
