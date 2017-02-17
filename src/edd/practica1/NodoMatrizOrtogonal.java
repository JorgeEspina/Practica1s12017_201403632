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
public class NodoMatrizOrtogonal {
    int Dato,x,y; 
    NodoMatrizOrtogonal Arriba; 
    NodoMatrizOrtogonal Abajo;
    NodoMatrizOrtogonal Derecha; 
    NodoMatrizOrtogonal Izquierda;
 
  NodoMatrizOrtogonal (int Dato , int x , int y){
     this.Dato = Dato;
     this.x = x;
     this.y=y;
     Arriba=null;
     Abajo=null;
     Derecha = null;
     Izquierda = null;
 }
}
