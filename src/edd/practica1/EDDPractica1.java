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
public class EDDPractica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.print ("Prueba de sincronizacion de cambios");
        /* Principal Menu= new Principal();
       Menu.setVisible(true);*/
        ListaVertical Lista =new ListaVertical();
        Lista.Insertar(new NodoMatrizOrtogonal(1,0,0));
        Lista.Insertar(new NodoMatrizOrtogonal(1,0,3));
        Lista.Insertar(new NodoMatrizOrtogonal(1,0,1));
        Lista.Insertar(new NodoMatrizOrtogonal(1,0,5));
        Lista.Insertar(new NodoMatrizOrtogonal(1,0,2));
   
        Lista.Recorrer();
        }
    
}
