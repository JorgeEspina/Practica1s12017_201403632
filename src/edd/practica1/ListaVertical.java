package edd.practica1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jorge Espina
 */
public class ListaVertical {
    
    NodoMatrizOrtogonal Primero;
    NodoMatrizOrtogonal Ultimo;
    
    ListaVertical(){
        Primero = null;
        Ultimo=null;
    }
   
    void Insertar(NodoMatrizOrtogonal Inserta ){
       if(Primero == null){
           Primero=Ultimo=Inserta;
       }else{
           if( Inserta.y < Primero.y){
              InsertarFrente(Inserta); 
            }else if (Inserta.y > Ultimo.y ){
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
     Primero.Arriba = Inserta;
     Inserta.Abajo = Primero;
     Primero=Primero.Arriba;
 }
 void InsertarFinal(NodoMatrizOrtogonal Inserta){
     Ultimo.Abajo=Inserta;
     Inserta.Arriba=Ultimo;
     Ultimo=Ultimo.Abajo;
 }
 void InsertarMedio(NodoMatrizOrtogonal Inserta){
     NodoMatrizOrtogonal Temporal1;
     NodoMatrizOrtogonal Temporal2;
     Temporal1=Primero;
     while(Temporal1.y < Inserta.y){
         Temporal1=Temporal1.Abajo;
         
     }
     Temporal2=Temporal1.Arriba;
     Temporal2.Abajo=Inserta;
     Temporal1.Arriba=Inserta;
     Inserta.Abajo=Temporal1;
     Inserta.Arriba=Temporal2;
     
 }
 void Recorrer(){
     if (Primero != null){
         NodoMatrizOrtogonal Temporal = Primero;
     while(Temporal!=null){
            System.out.println("Y = "+ Temporal.y);
            Temporal=Temporal.Abajo;
         //count<<"y="<<Temporal.y<<end1;
     }
 
     
     }
 }
}
