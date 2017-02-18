
package edd.practica1;

/**
 *
 * @author Espina Molina
 */
public class NodoCola {
    NodoCola Siguiente;
    NodoCola Anterior;
    String Dato;
    NodoCola(String x , NodoCola Enlace){
        Siguiente=Anterior=Enlace;
        Dato=x;
    }
}
