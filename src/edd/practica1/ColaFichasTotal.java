package edd.practica1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Espina Molina
 */
public class ColaFichasTotal {
    private NodoCola siguiente, Anterior,Nuevo,Aux,Inicio,Fin;
    int Dato,Posicion;
    IngresoJugadores IngresoJugadores = new IngresoJugadores();
    ColaFichasTotal(){
        Inicio=Fin=null;
        Dato=0;        
    }
    void InsertarCola(String x){
        if(Inicio==null){
            Inicio=Fin=new NodoCola(x , null);            
        }else{
            Nuevo= new NodoCola(x,null);
            Fin.Siguiente=Nuevo;
            Nuevo.Anterior=Fin;
            Fin=Nuevo;
        }
    }
    
     String Imprimir(){
        String Salida="";
        Aux=Inicio;
        while(Aux!=null){
            System.out.println(Aux.Dato);
            //Salida+=Aux.Dato+"|";
            Aux=Aux.Siguiente;
        }
        return Salida;
    }
     String  Sacar(){
        String Salida="";
        Inicio=Inicio.Siguiente;
        //System.out.println(Inicio.Dato);
        IngresoJugadores.setLetraSacada(Inicio.Dato); 
        return Salida;      
    }
     String ColaFichasTotalReporte() throws IOException{
    FileWriter Escribir= null ;
    PrintWriter ImprimirEscribir = null;
    try{
        Escribir = new FileWriter("C:\\Users\\Jorge Espina\\Documents\\NetBeansProjects\\[EDD]Practica1\\src\\ColaFichasTotalReporte.txt",false);
        ImprimirEscribir = new PrintWriter(Escribir);
        Escribir.append("digraph ColaFichasTotalReporte{ ");
        Escribir.append("\trankkdir=LR \n ");
        Escribir.append("\n");
        if (Inicio!=null){
            NodoCola Actual = Inicio;
            do{
                if(Posicion==0){
                    Escribir.append("\n" + Actual.Dato);
                }
                if(Actual.Siguiente != null && Posicion !=0){
                    Escribir.append("->" + Actual.Dato);
                }
                Actual = Actual.Siguiente;
                Posicion++;
            } while (Actual != Inicio);
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
       
        return "ColaFichasTotalReporte";
    
}
     void Buscar(NodoCola cab){
      
         
     }
}
