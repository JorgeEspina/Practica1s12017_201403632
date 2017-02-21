/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd.practica1;

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
