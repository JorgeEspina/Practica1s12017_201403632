
package edd.practica1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import org.jdom2.Element;

/**
 *
 * @author Espina Molina
 */
public class ListaCD {
 Nodo Primero;
 Nodo Ultimo;
 int Posicion,DimensionLista =0;
 String Dat;
 int Turnos=0;
 Nodo Turno;
 public ListaCD(){
     Primero=null;
     Ultimo=null;
     
 }
     //Primero=null;
     //Primero=36;
     //Ultimo=null;
     //x=36
     // 36-->Primero
 
 public void IngresarNodo(String NombreJugador,ListaSimpleFichasJugador FichasJugadores){
    Nodo Nuevo = new Nodo();
    Nuevo.setDato(NombreJugador);
    Nuevo.setFichasJugadores(FichasJugadores);
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
     
     DimensionLista+=1;
 }
  public ListaSimpleFichasJugador getValorXPos(int Posicion){
       
       if(Posicion>=0 && Posicion<DimensionLista){
           if(Posicion==0){
               return Primero.getFichasJugadores();
           }else{
               Nodo aux = Primero;
               for(int i =0; i<Posicion;i++){
                   aux = aux.getSiguiente();
               }
               return aux.getFichasJugadores();
           }
       }else{
       //throw new Exception("Posicion inexistente en la lista");
       
   }
       return null;
   }
  public String getDat() {
        return Dat;
    }   
  
 public void setDat(String Dat) {
        this.Dat = Dat;
    }
 //Desplegar la lista
 //Primero hacia Ultimo
 public void Desplegar(){
     Nodo Actual = Primero;
          int a =0;
     do{
         System.out.println(Actual.Dato);
         if (a ==0){
              Dat=Actual.Dato;
                 a++;        
         }
         if(a<=a){
             Dat=Actual.Dato; 
             a++;       
         }
      
         Actual=Actual.Siguiente;
     }while(Actual!=Primero);
 }
 public void Turnos(){
     Turno = Primero;
       for ( int j = 0; j <= Turnos; j++ ){
        Dat=Turno.Dato; 
        Turno=Turno.Siguiente;        
      }        
    Turnos++;
 }
  public ListaSimpleFichasJugador getLista(String ValorReferido){
       ListaSimpleFichasJugador FichasJugador = new ListaSimpleFichasJugador();
       if(BuscarNodo(ValorReferido)){
           Nodo  aux = Primero;         
           while(!ValorReferido.contains(aux.getDato())){
                aux = aux.getSiguiente();
                
           }
           FichasJugador= aux.getFichasJugadores();
       }else{
           System.out.println("El dato no Exite en la lista circular");
           FichasJugador = null;
       }
       return FichasJugador;
   }
 String ReporteGraficaJugadores() throws IOException{
    FileWriter Escribir= null ;
    PrintWriter ImprimirEscribir = null;
    try{
        Escribir = new FileWriter("C:\\Users\\Jorge Espina\\Documents\\NetBeansProjects\\[EDD]Practica1\\src\\ListaCircularJugadores.txt",false);
        ImprimirEscribir = new PrintWriter(Escribir);
        Escribir.append("digraph ListaCircularJugadores{ ");
        Escribir.append("\trankkdir=LR \n ");
        Escribir.append("\n");
        if (Primero!=null){
            Nodo Actual = Primero;
            do{
                 if(Posicion==0){
                    Escribir.append("\n" + Actual.Dato);
                }
                if(Actual.Siguiente != null && Posicion !=0){
                    Escribir.append("->" + Actual.Dato);
                }
                Actual = Actual.Siguiente;
                Posicion+=1;
            } while (Actual != Primero);
              if(Actual == Primero){
                  Escribir.append("->" + Primero.Dato);
            }
        }
      ImprimirEscribir.append("\n }");          
   }catch(Exception e){
        // JOptionPane.showMessageDialog(null, e);
   }
      ImprimirEscribir.close();
      Escribir.close();
       
        return "ListaCircularJugadores";
    
}
 //Ultimo Hacia Primero
/* public void Desplegara(){
    Nodo Actual=new Nodo();
    Actual=Ultimo;
    do{
        System.out.println(Actual.Dato);
        Actual=Actual.Anterior;
    }while(Actual!=Ultimo);
}*/

boolean BuscarNodo(Object x){
    /*Nodo Actual= Primero;
    //Actual.Dato=x;
        boolean Encontrado=false;
       do{
        if(Actual.Dato ==  x){        
            Encontrado =true;
        }
        Actual=Actual.Anterior;
    }while(Actual!=Ultimo && Encontrado !=true);
    if(Encontrado==true){
        System.out.println("\n Nodo Encontrado");
    }else{
        System.out.println("\n Nodo No Encontrado");

    }
     return false;*/
    Nodo Actual = Primero;            
        if (Primero==null){
            return false;
        }else{
            for (int PosicionLista = 0; PosicionLista < DimensionLista; PosicionLista++) {
                if (Actual.Dato.toString().equals(x.toString())){                    
                    return true;
                }else{
                    Actual = Actual.Siguiente;
                }                
            }
            return false;
        }
}
}
