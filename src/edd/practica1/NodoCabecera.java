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
public class NodoCabecera {
 int x;
 NodoCabecera Siguiente;
 NodoCabecera Anterior;
 ListaVertical Columna;
 NodoCabecera(int x){
     this.x=x;
     Columna= new ListaVertical();
     Siguiente=null;
     Anterior=null;
     
 }
}
