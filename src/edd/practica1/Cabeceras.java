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
public class Cabeceras {
    NodoCabecera Primero;
    NodoCabecera Ultimo;
    
     Cabeceras(){
        Primero = null;
        Ultimo=null;
    }
   
    void Insertar(NodoCabecera Inserta ){
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


 void InsertarFrente(NodoCabecera Inserta){
     Primero.Anterior = Inserta;
     Inserta.Siguiente = Primero;
     Primero=Primero.Anterior;
 }
 void InsertarFinal(NodoCabecera Inserta){
     Ultimo.Siguiente=Inserta;
     Inserta.Anterior=Ultimo;
     Ultimo=Ultimo.Siguiente;
 }
 void InsertarMedio(NodoCabecera Inserta){
     NodoCabecera Temporal1;
     NodoCabecera Temporal2;
     Temporal1=Primero;
     while(Temporal1.x < Inserta.x){
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
         NodoCabecera Temporal = Primero;
     while(Temporal!=null){
            System.out.println( "X = "+ Temporal.x);
            Temporal=Temporal.Siguiente;
         //count<<"y="<<Temporal.y<<end1;
     }
 
     
     }
 }
    boolean Existe (int x ){
     if (Primero == null){
        System.out.println("No Existe Lista Vacia"); 
         return false;
     }else{
         NodoCabecera Temporal;
         Temporal = Primero;
         while(Temporal!=null){
             if(Temporal.x ==x){
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
  NodoCabecera Busqueda(int x){
      if(Existe(x)){
          NodoCabecera Temporal;
          Temporal=Primero;
          while(Temporal.x!=x){
              Temporal= Temporal.Siguiente;
          }
          System.out.println("Retornando"); 
          return Temporal;
      }else {
          System.out.println("No Existe"); 
          return(new NodoCabecera(-1));
      }
      
  }  

}
