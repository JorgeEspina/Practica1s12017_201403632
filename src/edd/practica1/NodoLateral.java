package edd.practica1;


import edd.practica1.ListaHorizontal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jorge Espina
 */
public class NodoLateral {
 int y;
 NodoLateral Siguiente;
 NodoLateral Anterior;
ListaHorizontal Filas;
NodoLateral(int y){
     this.y =y;
     Filas = new ListaHorizontal();
     Siguiente=null;
     Anterior=null;
     
 
}   
}
