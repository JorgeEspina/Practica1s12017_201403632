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
public class MatrizOrtogonal {
    Cabeceras Cabecera = new Cabeceras();
    ListaLateral ListaLaterales = new ListaLateral();
    
    
  void Insertar(int x , int y , int Inserta){
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
              Insertar(i,j,ValorExtra);
              ValorExtra++;
          }
      }
  }
            
}
