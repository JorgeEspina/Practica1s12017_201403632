/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd.practica1;

import static edd.practica1.IngresoJugadores.ListCD;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Jorge Espina
 */

public class ListaSimpleFichasJugador {
    NodoListaSimpleFichasJugador Primero;
    NodoListaSimpleFichasJugador Ultimo;
    int Posicion;
    String Letra,Letra1,Letra2,Letra3,Letra4,Letra5,Letra6;
public ListaSimpleFichasJugador(){
    Primero=null;
    Ultimo=null;
}
public String getLetra() {
        return Letra;
    }   
 public void setLetra(String Letra) {
        this.Letra = Letra;
    }
 public String getLetra1() {
        return Letra1;
    }   
 public void setLetra1(String Letra1) {
        this.Letra1 = Letra1;
    }
 public String getLetra2() {
        return Letra2;
    }   
 public void setLetra2(String Letra2) {
        this.Letra2 = Letra2;
    }
 public String getLetra3() {
        return Letra3;
    }   
 public void setLetra3(String Letra3) {
        this.Letra3 = Letra3;
    }
 public String getLetra4() {
        return Letra4;
    }   
 public void setLetra4(String Letra4) {
        this.Letra4 = Letra4;
    }
 public String getLetra5() {
        return Letra5;
    }   
 public void setLetra5(String Letra5) {
        this.Letra5 = Letra5;
    }
 public String getLetra6() {
        return Letra6;
    }   
 public void setLetra6(String Letra6) {
        this.Letra6 = Letra6;
    }
 
public void IngresarNodo(String Dato){
    NodoListaSimpleFichasJugador NodoNuevo = new NodoListaSimpleFichasJugador();
    NodoNuevo.setDato(Dato);
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
       NodoListaSimpleFichasJugador Actual=new NodoListaSimpleFichasJugador();
       Actual = Primero;
       int cont =0;
       while(Actual!=null){
           System.out.println(Actual.Dato);
            if(cont==0){
                   Letra = Actual.Dato; 
                }else if (cont==1){
                    Letra1 = Actual.Dato; 
                }else if (cont==2){
                    Letra2 = Actual.Dato; 
                }else if (cont==3){
                    Letra3 = Actual.Dato; 
                }else if (cont==4){
                    Letra4 = Actual.Dato; 
                }else if (cont==5){
                    Letra5 = Actual.Dato; 
                }else if (cont==6){
                    Letra6 = Actual.Dato; 
                }
            cont++;
           Actual =Actual.Siguiente;
       }
   }
     public void VaciarLista(){
         Primero=null;
         Ultimo=null;
         VerLista();
    }
  String ListaSimpleFichasJugadorReporte() throws IOException{
    FileWriter Escribir= null ;
    PrintWriter ImprimirEscribir = null;
    try{
        Escribir = new FileWriter("C:\\Users\\Jorge Espina\\Documents\\NetBeansProjects\\[EDD]Practica1\\src\\ListaSimpleFichasJugador.txt",false);
        ImprimirEscribir = new PrintWriter(Escribir);
        Escribir.append("digraph ListaSimpleFichasJugador{ ");
        Escribir.append("\trankkdir=LR \n ");
        Escribir.append("\n");
        if (Primero!=null){
            //NodoListaSimpleFichasJugador Actual = Primero;
           // do{
            int posicio=0;
                if(posicio==0){
                    Escribir.append("\n" + Letra);
                }
                  posicio++;
                if( posicio ==1){
                    Escribir.append("->" + Letra1);
                     posicio++;
                }
                if ( posicio ==2){
                    Escribir.append("->" + Letra2);
                     posicio++;
                }
                if (  posicio ==3){
                    Escribir.append("->" + Letra3);
                     posicio++;
                     }
                if ( posicio ==4){
                    Escribir.append("->" + Letra4);
                     posicio++;
                     }
                if ( posicio ==5){
                    Escribir.append("->" + Letra5);
                     posicio++;
                     }
                if ( posicio ==6){
                    Escribir.append("->" + Letra6);}
                    posicio++;
                    
//                Actual = Actual.Siguiente;
               
            /*} while (Actual != Primero);
            if(Actual == Actual.Siguiente){
                Actual=null;
                              
            }
            if (Actual.Siguiente==null){
               Escribir.append("->" + Actual.Dato);
           
            }*/
        } 
    
        }catch(Exception e){
        // JOptionPane.showMessageDialog(null, e);
   }
      ImprimirEscribir.append("\n }");
      ImprimirEscribir.close();
      Escribir.close();
       
        return "ListaSimpleFichasJugador";
  }
  }
