
package proyecto;

import javax.swing.JOptionPane;

public class clase {

    public void shell(int[] tam) {
        int salto, h, j, k, auxiliar;
        salto = tam.length / 2;
        while (salto > 0) {
            for (h = salto; h < tam.length; h++) {
                j = h - salto;
                while (j >= 0) {
                    k = j + salto;
                    if (tam[j] <= tam[k]) {
                        j = -1;
                    } else {
                        auxiliar = tam[j];
                        tam[j] = tam[k];
                        tam[k] = auxiliar;
                        j = j - salto;
                    }
                }
            }
            salto = salto / 2;
        }
        JOptionPane.showMessageDialog(null, "Arreglo ordenado con shell");
        mostrarArreglo(tam);
    }

    public void mostrarArreglo(int[] tam) {
        int k;
        for (k = 0; k < tam.length; k++) {
            JOptionPane.showMessageDialog(null, "[" + tam[k] + "]");
        }
    }

}
