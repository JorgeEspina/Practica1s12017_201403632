/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd.practica1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JButton;

/**
 *
 * @author Jorge Espina
 */
public class MatrizOrtogonal {
    Cabeceras Cabecera = new Cabeceras();
    ListaLateral ListaLaterales = new ListaLateral();
    int x,y,Posx,Posy=0;
    Tablero Tablero = new Tablero() ;
    IngresoJugadores IngresoJugadores = new IngresoJugadores();
    JButton MatOrt;
    
    NodoMatrizOrtogonal Abajo;
    NodoMatrizOrtogonal Izquierda;
    NodoMatrizOrtogonal Derecha;
  void Insertar(int x , int y , Object Inserta){
      NodoMatrizOrtogonal Insercion;
      Insercion = new NodoMatrizOrtogonal(Inserta,x,y);
      
      if(Cabecera.Existe(x)==false){
          Cabecera.Insertar(new NodoCabecera(x));
          
      }
      if(ListaLaterales.Existe(y)==false){
          ListaLaterales.Insertar(new NodoLateral(y));
      }
      NodoCabecera CabeceraTemporal;
      NodoLateral LateralTemporal;
      CabeceraTemporal=Cabecera.Busqueda(x);
      LateralTemporal = ListaLaterales.Busqueda(y);
      CabeceraTemporal.Columna.Insertar(Insercion);
      LateralTemporal.Filas.Insertar(Insercion);
      System.out.println("Inserto : " + Inserta + " en " + x +" "+y); 

  }
 String MatrizOrtogonalrReporte() throws IOException{
    FileWriter Escribir= null ;
    PrintWriter ImprimirEscribir = null;
    try{
        Escribir = new FileWriter("C:\\Users\\Jorge Espina\\Documents\\NetBeansProjects\\[EDD]Practica1\\src\\MatrizOrtogonal.txt",false);
        ImprimirEscribir = new PrintWriter(Escribir);
        Escribir.append("digraph MatrizOrtogonal{ ");
        Escribir.append("\trankkdir=LR \n ");
        Escribir.append("\n");
         
        NodoMatrizOrtogonal Arriba = Cabecera.Ultimo.Columna.Ultimo;        
      /*  Auxiliar3 = Arriba;
            while (Arriba != null) {
                Izquierda = ListaLaterales.Ultimo.Filas.Ultimo;
                while (Izquierda != null) {
                    pos3 = (OTablero) Auxiliar3.getDato();
                    if (x == 0) {
                        Escribir.append("\n" + pos3.getNum());
                    } else {
                        Escribir.append("->" + pos3.getNum());
                    }
                    Izquierda = Izquierda.Izquierda;
                    Auxiliar3 = Auxiliar3.getIzquierda();
                    x++;
                }

                Arriba = Arriba.Arriba;
                Auxiliar3 = Arriba;
                y++;
            }            */

         }catch(Exception e){
        // JOptionPane.showMessageDialog(null, e);
   }
      ImprimirEscribir.append("\n }");
      ImprimirEscribir.close();
      Escribir.close();
       
        return "MatrizOrtogonal";
  }
  void Llenar (int x , int y){
      int ValorExtra=0;
      for(int j = 0;j<x;j++){
          for(int i = 0;i<x;i++){
             Posx = i;
             Posy=j;
              Insertar(i,j,ValorExtra);
              ValorExtra++;
          }
      }
  }
  
   void RecorrerMatrizGenerar(){
      NodoMatrizOrtogonal Derecha=null;
      NodoMatrizOrtogonal Abajo=null;
      NodoMatrizOrtogonal Actual=null;
      Derecha = ListaLaterales.Primero.Filas.Primero;
      Actual= Derecha;
     while(Derecha!=null){
          Abajo=Cabecera.Primero.Columna.Primero;
          while(Abajo!=null){
              Actual =Abajo;              
              //JButton Matriz = Actual.Dato;
              JButton Matriz  = new JButton(); 
              Matriz.setBounds(x*65,y*30,65,30);
              Matriz.setText(x+","+y);
              Tablero.add(Matriz);
              x+=1;
              Abajo = Abajo.Abajo;
              Actual =Actual.Abajo;
          }
          y+=1;
          x=0;
          Derecha = Derecha.Derecha;
          Actual = Derecha;
          Tablero.show();
          IngresoJugadores.show();     
     }
              
  }        
}
