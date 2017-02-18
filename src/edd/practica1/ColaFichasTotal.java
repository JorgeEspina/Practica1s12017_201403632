package edd.practica1;

/**
 *
 * @author Espina Molina
 */
public class ColaFichasTotal {
    private NodoCola siguiente, Anterior,Nuevo,Aux,Inicio,Fin;
    int Dato;
    ColaFichasTotal(){
        Inicio=Fin=null;
        Dato=0;        
    }
    void InsertarCola(int x){
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
}
