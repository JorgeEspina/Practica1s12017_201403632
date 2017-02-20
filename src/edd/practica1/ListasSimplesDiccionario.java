/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd.practica1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author Jorge Espina
 */
public class ListasSimplesDiccionario {
    NodoListaSimpleDiccionario Primero;
    NodoListaSimpleDiccionario Ultimo;
    int Posicion = 0;
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
String ReporteGraficaDiccionario() throws IOException{
    FileWriter Escribir= null ;
    PrintWriter ImprimirEscribir = null;
    try{
        Escribir = new FileWriter("C:\\Users\\Jorge Espina\\Documents\\NetBeansProjects\\[EDD]Practica1\\src\\ListaSimplesDiccionarioReporte.txt",false);
        ImprimirEscribir = new PrintWriter(Escribir);
        Escribir.append("digraph ListaSimplesDiccionarioReporte{ ");
        Escribir.append("\trankkdir=LR \n ");
        Escribir.append("\n");
        if (Primero!=null){
            NodoListaSimpleDiccionario Actual = Primero;
            do{
                if(Posicion==0){
                    Escribir.append("\n" + Actual.Dato);
                }
                if(Actual.Siguiente != null && Posicion !=0){
                    Escribir.append("->" + Actual.Dato);
                }
                Actual = Actual.Siguiente;
                Posicion++;
            } while (Actual != Primero);
            if(Actual == Actual.Siguiente){
                Actual=null;
                              
            }
            if (Actual.Siguiente==null){
               Escribir.append("->" + Actual.Dato);
           
            }
        }
              
   }catch(Exception e){
        // JOptionPane.showMessageDialog(null, e);
   }
      ImprimirEscribir.append("\n }");
      ImprimirEscribir.close();
      Escribir.close();
       
        return "ListaSimplesDiccionarioReporte";
    
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
