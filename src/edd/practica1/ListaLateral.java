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
public class ListaLateral {
    NodoLateral Primero;
    NodoLateral Ultimo;
       
     ListaLateral(){
        Primero = null;
        Ultimo=null;
    }
   
    void Insertar(NodoLateral Inserta ){
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


 void InsertarFrente(NodoLateral Inserta){
     Primero.Anterior = Inserta;
     Inserta.Siguiente = Primero;
     Primero=Primero.Anterior;
 }
 void InsertarFinal(NodoLateral Inserta){
     Ultimo.Siguiente=Inserta;
     Inserta.Anterior=Ultimo;
     Ultimo=Ultimo.Siguiente;
 }
 void InsertarMedio(NodoLateral Inserta){
     NodoLateral Temporal1;
     NodoLateral Temporal2;
     Temporal1=Primero;
     while(Temporal1.y < Inserta.y){
         Temporal1=Temporal1.Siguiente;         
     }
     Temporal2=Temporal1.Anterior;
     Temporal2.Siguiente=Inserta;
     Temporal1.Anterior=Inserta;
     Inserta.Siguiente=Temporal1;
     Inserta.Anterior=Temporal2;
     
 }
 void Recorrer(){
     if (Primero != null){
         NodoLateral Temporal = Primero;
     while(Temporal!=null){
            System.out.println( "Y = "+ Temporal.y);
            Temporal=Temporal.Siguiente;
         //count<<"y="<<Temporal.y<<end1;
     }     
 
     
     }
 }
   boolean Existe (int y ){
     if (Primero == null){
        System.out.println("No Existe Lista Vacia"); 
         return false;
     }else{
         NodoLateral Temporal;
         Temporal = Primero;
         while(Temporal!=null){
             if(Temporal.y ==y){
                 System.out.println("Existe"); 
                 return true;
             }else if (Temporal.Siguiente == null){
                 System.out.println("No se Encontro"); 
                 return false;
             }
             Temporal= Temporal.Siguiente;
         }         
     }
        return false;
 }
  NodoLateral Busqueda(int y){
      if(Existe(y)){
          NodoLateral Temporal;
          Temporal=Primero;
          while(Temporal.y!=y){
              Temporal= Temporal.Siguiente;
          }
          System.out.println("Retornando"); 
          return Temporal;
      }else {
          System.out.println("No Existe"); 
          return(new NodoLateral(-1));
      }
      
  }  
}
