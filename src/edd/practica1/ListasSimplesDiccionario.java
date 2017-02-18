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

public class ListasSimplesDiccionario {
    NodoListaSimpleDiccionario Primero;
    NodoListaSimpleDiccionario Ultimo;
public ListasSimplesDiccionario(){
    Primero=null;
    Ultimo=null;
}
public void IngresarNodo(String Dato){
    NodoListaSimpleDiccionario NodoNuevo = new NodoListaSimpleDiccionario();
    NodoNuevo.Dato=Dato;
    if (Primero==null){
        Primero = NodoNuevo;
        Primero.Siguiente=null;
        Ultimo=Primero;        
    }else{
        Ultimo.Siguiente=NodoNuevo;
        NodoNuevo.Siguiente=null;
        Ultimo=NodoNuevo;
    }
}
   public void VerLista(){
       NodoListaSimpleDiccionario Actual=new NodoListaSimpleDiccionario();
       Actual = Primero;
       while(Actual!=null){
           System.out.println(Actual.Dato);
           Actual =Actual.Siguiente;
       }
   }
    
}
