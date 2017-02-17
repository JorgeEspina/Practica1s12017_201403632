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
public class ListaHorizontal {
      
    NodoMatrizOrtogonal Primero;
    NodoMatrizOrtogonal Ultimo;
    
    ListaHorizontal(){
        Primero = null;
        Ultimo=null;
    }
   
    void Insertar(NodoMatrizOrtogonal Inserta ){
       if(Primero == null){
           Primero=Ultimo=Inserta;
       }else{
           if( Inserta.x < Primero.x){
              InsertarFrente(Inserta); 
            }else if (Inserta.x > Ultimo.x ){
              InsertarFinal(Inserta); 
       }else{
             InsertarMedio(Inserta);
        }
    }     
   }
      boolean Vacio(){ 
     if (Primero == null){
         return true;
         
     }  else{
         return false;
     } 
    }


 void InsertarFrente(NodoMatrizOrtogonal Inserta){
     Primero.Izquierda = Inserta;
     Inserta.Derecha = Primero;
     Primero=Primero.Izquierda;
 }
 void InsertarFinal(NodoMatrizOrtogonal Inserta){
     Ultimo.Derecha=Inserta;
     Inserta.Izquierda=Ultimo;
     Ultimo=Ultimo.Derecha;
 }
 void InsertarMedio(NodoMatrizOrtogonal Inserta){
     NodoMatrizOrtogonal Temporal1;
     NodoMatrizOrtogonal Temporal2;
     Temporal1=Primero;
     while(Temporal1.x < Inserta.x){
         Temporal1=Temporal1.Derecha;         
     }
     Temporal2=Temporal1.Izquierda;
     Temporal2.Derecha=Inserta;
     Temporal1.Izquierda=Inserta;
     Inserta.Derecha=Temporal1;
     Inserta.Izquierda=Temporal2;
     
 }
 void Recorrer(){
     if (Primero != null){
         NodoMatrizOrtogonal Temporal = Primero;
     while(Temporal!=null){
            System.out.println( "X = "+ Temporal.x);
            Temporal=Temporal.Derecha;
         //count<<"y="<<Temporal.y<<end1;
     }
 
     
     }
 }
    
}
