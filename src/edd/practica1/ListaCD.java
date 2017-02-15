
package edd.practica1;
/**
 *
 * @author Espina Molina
 */
public class ListaCD {
 Nodo Primero;
 Nodo Ultimo;
 public ListaCD(){
     Primero=null;
     Ultimo=null;
 }
     //Primero=null;
     //Primero=36;
     //Ultimo=null;
     //x=36
     // 36-->Primero
 public void IngresarNodo(String x){
     Nodo Nuevo = new Nodo();
     Nuevo.Dato=x;
     if (Primero ==null){
         Primero= Nuevo;
         Primero.Siguiente=Primero;
         Nuevo.Anterior=Ultimo;
         Ultimo=Nuevo;
     }else{
         Ultimo.Siguiente=Nuevo;
         Nuevo.Siguiente=Primero;
         Nuevo.Anterior=Ultimo;
         Ultimo=Nuevo;
         Primero.Anterior=Ultimo;         
     }
 }
 //Desplegar la lista
 //Primero hacia Ultimo
 public void Desplegar(){
     Nodo Actual = new Nodo();
     Actual=Primero;
     do{
         System.out.println(Actual.Dato);
         Actual=Actual.Siguiente;
     }while(Actual!=Primero);
 }
 //Ultimo Hacia Primero
 public void Desplegara(){
    Nodo Actual=new Nodo();
    Actual=Ultimo;
    do{
        System.out.println(Actual.Dato);
        Actual=Actual.Anterior;
    }while(Actual!=Ultimo);
}
 
public void BuscarNodo(String x){
    Nodo Actual=new Nodo();
    Actual=Ultimo;
    boolean Encontrado=false;
    do{
        if(Actual.Dato==x){
            Encontrado =true;
        }
        Actual=Actual.Anterior;
    }while(Actual!=Ultimo && Encontrado !=true);
    if(Encontrado==true){
        System.out.println("\n Nodo Encontrado");
    }else{
        System.out.println("\n Nodo No Encontrado");

    }
}
  
}
