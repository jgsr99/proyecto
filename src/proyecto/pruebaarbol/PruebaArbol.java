
package proyecto.pruebaarbol;

import javax.swing.JOptionPane;
import proyecto.pruebaarbol.model.Nodo;

public class PruebaArbol {

    public static void main(String[] args) {
        
        Nodo raiz = new Nodo(1);  
        Nodo nodo2 = new Nodo(2);  
        Nodo nodo3 = new Nodo(3); 

        nodo2.setNodoIzquierdo(new Nodo(4)); 
        nodo3.setNodoIzquierdo(new Nodo(5)); 
        nodo3.setNodoDerecho(new Nodo(6)); 

        raiz.setNodoIzquierdo(nodo2); 
        raiz.setNodoDerecho(nodo3);

        JOptionPane.showMessageDialog(null, "Pre Orden:  ");
        preOrden(raiz);
        JOptionPane.showMessageDialog(null, "In Orden:  ");
        inOrden(raiz);
        JOptionPane.showMessageDialog(null, "Post Orden:  ");
        postOrden(raiz);
    }

    private static void preOrden(Nodo raiz) {  //  raiz es 1  ///  luego el nodo izquierdo pasa hacer la raiz(2)  // nodo iz pasa hacer el 4
        if (raiz != null) {//La raiz es distento de null si
            JOptionPane.showMessageDialog(null, "[" + raiz.getDato() + "]");   //  Muestro el 1     // lo muestro  2   // muestro 4
            preOrden(raiz.getNodoIzquierdo());  // llamo al nodo izquiero de 1  //  llamo al nodo izquierdo de 2  -- que seria 4  // llamo al nodo izquierdo de 4 que es null
            preOrden(raiz.getNodoDerecho());  // como el lado iz de 4 es vacio y el lado derecho de 4 es vacio se sale  y llega a 1. y luego continua  con el lado derecho del 1
        }

    }

    private static void inOrden(Nodo raiz) {
        if (raiz != null) {
            inOrden(raiz.getNodoIzquierdo());
            JOptionPane.showMessageDialog(null, "[" + raiz.getDato() + " ] ");
            inOrden(raiz.getNodoDerecho());
        }
    }

    private static void postOrden(Nodo raiz) {
        if (raiz != null) {
            postOrden(raiz.getNodoIzquierdo());
            postOrden(raiz.getNodoDerecho());
            JOptionPane.showMessageDialog(null, "[" + raiz.getDato() + " ] ");

        }
    }
}
