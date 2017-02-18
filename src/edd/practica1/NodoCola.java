
package edd.practica1;

/**
 *
 * @author Espina Molina
 */
public class NodoCola {
    NodoCola Siguiente;
    NodoCola Anterior;
    int Dato;
    NodoCola(int x , NodoCola Enlace){
        Siguiente=Anterior=Enlace;
        Dato=x;
    }
}
