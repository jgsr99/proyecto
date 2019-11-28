package proyecto;

import javax.swing.JOptionPane;
import proyecto.pruebaarbol.PruebaArbol;

public class Proyecto {

    public static void main(String[] args) {
        int opcion = 0;
        int men = 0, arr = 0, mat = 0, sh = 0, or = 0;
        int num1 = 0, num2 = 0, sum, res, mul, div;
        int validar = 0;
        int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0, g = 0, h = 0, x = 0, j = 0, k = 0, l = 0, m = 0, n = 0, y = 0, p = 0;
        operar menu = new operar();
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor de las siguientes opciones"
                        + "\n 1. Operaciones Basicas"
                        + "\n 2. Arreglo"
                        + "\n 3. Matrices"
                        + "\n 4. Ordenamientos"
                        + "\n 5. Listas"
                        + "\n 6. Pilas"
                        + "\n 7. Colas"
                        + "\n 8. Arboles"
                        + "\n 9. Grafos"
                        + "\n 10. Salir"));
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Debe ingresar solo valores numericos");
            }

            switch (opcion) {

                case 1:
                    JOptionPane.showMessageDialog(null, "Operaciones Basicas");
                    do {
                        try {
                            men = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor de las siguientes opciones"
                                    + "\n 1. Suma"
                                    + "\n 2. Resta"
                                    + "\n 3. Multiplicacion"
                                    + "\n 4. Division"
                                    + "\n 5. volver"));
                        } catch (Exception ex) {
                            JOptionPane.showMessageDialog(null, "Debe ingresar solo valores numericos");
                        }
                        switch (men) {

                            case 1:
                                do {
                                    try {
                                        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su primer valor: "));
                                        validar = 1;
                                    } catch (Exception ex) {
                                        JOptionPane.showMessageDialog(null, "Debe ingresar solo valores numericos");
                                        validar = 0;
                                    }
                                } while (validar == 0);
                                do {
                                    try {
                                        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su segundo valor: "));
                                        validar = 1;
                                    } catch (Exception ex) {
                                        JOptionPane.showMessageDialog(null, "Debe ingresar solo valores numericos");
                                        validar = 0;
                                    }
                                } while (validar == 0);

                                JOptionPane.showMessageDialog(null, "El resultado de la suma es " + menu.sumar(num1, num2));
                                break;
                            case 2:
                                do {
                                    try {
                                        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su primer valor: "));
                                        validar = 1;
                                    } catch (Exception ex) {
                                        JOptionPane.showMessageDialog(null, "Debe ingresar solo valores numericos");
                                        validar = 0;
                                    }
                                } while (validar == 0);
                                do {
                                    try {
                                        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su segundo valor: "));
                                        validar = 1;
                                    } catch (Exception ex) {
                                        JOptionPane.showMessageDialog(null, "Debe ingresar solo valores numericos");
                                        validar = 0;
                                    }
                                } while (validar == 0);
                                JOptionPane.showMessageDialog(null, "El resultado de la resta es " + menu.restar(num1, num2));
                                break;
                            case 3:
                                do {
                                    try {
                                        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su primer valor: "));
                                        validar = 1;
                                    } catch (Exception ex) {
                                        JOptionPane.showMessageDialog(null, "Debe ingresar solo valores numericos");
                                        validar = 0;
                                    }
                                } while (validar == 0);
                                do {
                                    try {
                                        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su segundo valor: "));
                                        validar = 1;
                                    } catch (Exception ex) {
                                        JOptionPane.showMessageDialog(null, "Debe ingresar solo valores numericos");
                                        validar = 0;
                                    }
                                } while (validar == 0);
                                JOptionPane.showMessageDialog(null, "El resultado de la multiplicacion es " + menu.multiplicar(num1, num2));
                                break;
                            case 4:
                                do {
                                    try {
                                        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su primer valor: "));
                                        validar = 1;
                                    } catch (Exception ex) {
                                        JOptionPane.showMessageDialog(null, "Debe ingresar solo valores numericos");
                                        validar = 0;
                                    }
                                } while (validar == 0);
                                do {
                                    try {
                                        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su segundo valor: "));
                                        validar = 1;
                                    } catch (Exception ex) {
                                        JOptionPane.showMessageDialog(null, "Debe ingresar solo valores numericos");
                                        validar = 0;
                                    }
                                } while (validar == 0);
                                JOptionPane.showMessageDialog(null, "El resultado de la division es " + menu.dividir(num1, num2));
                                break;
                            case 5:
                                JOptionPane.showMessageDialog(null, "volver");
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Ingresó una opción no valida");
                                break;
                        }
                    } while (men != 5);
                    break;
                case 2:
                    String arreglo[] = new String[3];
                    do {
                        try {
                            arr = Integer.parseInt(JOptionPane.showInputDialog("2. Arreglos \n"
                                    + "\n A. Cargar Datos"
                                    + "\n B. Mostrar Datos"
                                    + "\n C. volver"));
                        } catch (Exception ex) {
                            JOptionPane.showMessageDialog(null, "Debe ingresar solo valores numericos");
                        }
                        switch (arr) {
                            case 1:
                                JOptionPane.showMessageDialog(null, "Cargar Datos");
                                for (int ejeX = 0; ejeX < arreglo.length; ejeX++) {
                                    arreglo[ejeX] = JOptionPane.showInputDialog("Ingrese el valor para la posición: " + ejeX);
                                }
                                break;
                            case 2:
                                JOptionPane.showMessageDialog(null, "Mostrar Datos");
                                for (int ejeX = 0; ejeX < arreglo.length; ejeX++) {
                                    JOptionPane.showMessageDialog(null, "El valor ingresado para la posición " + ejeX + " es: " + arreglo[ejeX]);
                                }
                                break;
                            case 3:
                                JOptionPane.showMessageDialog(null, "Salir");
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Ingresó una opción no valida");
                                break;
                        }
                    } while (arr != 3);
                    break;
                case 3:
                    String matriz[][] = new String[2][3];
                    do {
                        try {
                            mat = Integer.parseInt(JOptionPane.showInputDialog("2. Matrices \n"
                                    + "\n A. Cargar Datos"
                                    + "\n B. Mostrar Datos"
                                    + "\n C. volver"));
                        } catch (Exception ex) {
                            JOptionPane.showMessageDialog(null, "Debe ingresar solo valores numericos");
                        }
                        switch (mat) {
                            case 1:
                                JOptionPane.showMessageDialog(null, "Cargar Datos");
                                for (int ejeX = 0; ejeX < matriz.length; ejeX++) {
                                    for (int ejeY = 0; ejeY < matriz[ejeX].length; ejeY++) {
                                        matriz[ejeX][ejeY] = JOptionPane.showInputDialog("Ingrese el valor para la posición [" + ejeX + "][" + ejeY + "]");
                                    }
                                }
                                break;
                            case 2:
                                JOptionPane.showMessageDialog(null, "Mostrar Datos");
                                for (int ejeX = 0; ejeX < matriz.length; ejeX++) {
                                    for (int ejeY = 0; ejeY < matriz[ejeX].length; ejeY++) {
                                        JOptionPane.showMessageDialog(null, "El valor ingresado para la posición  [" + ejeX + "][" + ejeY + "]" + " es: " + matriz[ejeX][ejeY]);
                                    }
                                }
                                break;
                            case 3:
                                JOptionPane.showMessageDialog(null, "Salir");
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Ingresó una opción no valida");
                                break;
                        }
                    } while (mat != 3);
                    break;
                case 4:
                    do {
                        try {
                            or = Integer.parseInt(JOptionPane.showInputDialog("Ordenamien \n"
                                    + "\n A. Método Burbuja"
                                    + "\n B. Método Shell"
                                    + "\n C. Volver"));
                        } catch (Exception ex) {
                            JOptionPane.showMessageDialog(null, "Debe ingresar solo valores numericos");
                        }

                        switch (or) {
                            case 2:
                                clase ordenar = new clase();
                                do {
                                    try {
                                        sh = Integer.parseInt(JOptionPane.showInputDialog("B. Metodo Shell \n"
                                                + "\n 1. Cargar Datos"
                                                + "\n 2. Mostrar Datos"
                                                + "\n 3. Ordenar"
                                                + "\n 4. Salir"));
                                    } catch (Exception ex) {
                                        JOptionPane.showInternalMessageDialog(null, "Debe ingresar solo valores numericos: ");
                                    }
                                    int[] vector1 = {a, b, c, d};
                                    switch (sh) {
                                        case 1:
                                            JOptionPane.showMessageDialog(null, "Cargar Datos");
                                            do {
                                                try {
                                                    a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su primer valor: "));
                                                    validar = 1;
                                                } catch (Exception ex) {
                                                    JOptionPane.showMessageDialog(null, "Debe ingresar solo valores numericos");
                                                    validar = 0;
                                                }
                                            } while (validar == 0);
                                            do {
                                                try {
                                                    b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su segundo valor: "));
                                                    validar = 1;
                                                } catch (Exception ex) {
                                                    JOptionPane.showMessageDialog(null, "Debe ingresar solo valores numericos");
                                                    validar = 0;
                                                }
                                            } while (validar == 0);
                                            do {
                                                try {
                                                    c = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su tercer valor: "));
                                                    validar = 1;
                                                } catch (Exception ex) {
                                                    JOptionPane.showMessageDialog(null, "Debe ingresar solo valores numericos");
                                                    validar = 0;
                                                }
                                            } while (validar == 0);
                                            do {
                                                try {
                                                    d = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su cuarto valor: "));
                                                    validar = 1;
                                                } catch (Exception ex) {
                                                    JOptionPane.showMessageDialog(null, "Debe ingresar solo valores numericos");
                                                    validar = 0;
                                                }
                                            } while (validar == 0);
                                            break;

                                        case 2:
                                            JOptionPane.showMessageDialog(null, "Arreglo original");
                                            ordenar.mostrarArreglo(vector1);
                                            break;
                                        case 3:
                                            ordenar.shell(vector1);
                                            break;
                                        case 4:
                                            JOptionPane.showMessageDialog(null, "Salir");
                                            break;
                                        default:
                                            JOptionPane.showMessageDialog(null, "Ingreso una opcion no valida");
                                            break;
                                    }
                                } while (sh != 4);
                                break;
                            case 1:
                                JOptionPane.showMessageDialog(null, "Método Burbuja");
                                do {
                                    try {
                                        a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su primer valor: "));
                                        validar = 1;
                                    } catch (Exception ex) {
                                        JOptionPane.showMessageDialog(null, "Debe ingresar solo valores numericos");
                                        validar = 0;
                                    }
                                } while (validar == 0);
                                do {
                                    try {
                                        b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su segundo valor: "));
                                        validar = 1;
                                    } catch (Exception ex) {
                                        JOptionPane.showMessageDialog(null, "Debe ingresar solo valores numericos");
                                        validar = 0;
                                    }
                                } while (validar == 0);
                                do {
                                    try {
                                        c = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su tercer valor: "));
                                        validar = 1;
                                    } catch (Exception ex) {
                                        JOptionPane.showMessageDialog(null, "Debe ingresar solo valores numericos");
                                        validar = 0;
                                    }
                                } while (validar == 0);
                                do {
                                    try {
                                        d = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su cuarto valor: "));
                                        validar = 1;
                                    } catch (Exception ex) {
                                        JOptionPane.showMessageDialog(null, "Debe ingresar solo valores numericos");
                                        validar = 0;
                                    }
                                } while (validar == 0);
                                int[] arregl = {a, b, c, d};
                                ordenar o = new ordenar();
                                o.ordenarBurbuja(arregl);

                                for (int i = 0; i < arregl.length; i++) {
                                    JOptionPane.showMessageDialog(null, "Su valores organizados de menor a mayor es:" + arregl[i]);
                                }
                                break;
                            case 3:
                                JOptionPane.showMessageDialog(null, "Volver");
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Ingresó una opción no valida");
                                break;
                        }

                    } while (or != 3);
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Listas");
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Pilas");
                    break;
                case 7:
                    int opcion1 = 0,
                     elemento = 0;
                    cola colita = new cola();

                    do {

                        try {
                            opcion1 = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Insertar un elemento en la Cola\n"
                                    + "2. Quitar un elemento en la Cola\n"
                                    + "3. ¿La cola está vacia?\n"
                                    + "4. Elemento ubicado al inicio de la cola\n"
                                    + "5. Tamaño de la cola\n"
                                    + "6. Salir", "Menú de opciones de una Cola",
                                    JOptionPane.QUESTION_MESSAGE));

                            switch (opcion1) {
                                case 1:
                                    elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el elemento", "Insertando en la Cola", JOptionPane.QUESTION_MESSAGE));
                                    colita.insertar(elemento);
                                    break;
                                case 2:
                                    if (!colita.estaVacia()) {
                                        JOptionPane.showMessageDialog(null, "El elemento atendido es " + colita.quitar(), "Quitando elemento de la cola", JOptionPane.INFORMATION_MESSAGE);
                                    } else {
                                        JOptionPane.showMessageDialog(null, "La cola está vacia", "Cola Vacia", JOptionPane.INFORMATION_MESSAGE);
                                    }

                                    break;
                                case 3:
                                    if (colita.estaVacia()) {
                                        JOptionPane.showMessageDialog(null, "La Cola está Vacia", "Cola Vacia", JOptionPane.INFORMATION_MESSAGE);

                                    } else {
                                        JOptionPane.showMessageDialog(null, "La Cola no está Vacia", "Cola no Vacia", JOptionPane.INFORMATION_MESSAGE);
                                    }
                                    break;
                                case 4:
                                    if (!colita.estaVacia()) {
                                        JOptionPane.showMessageDialog(null, "El elemento ubicado al inicio de la Cola es " + colita.inicioCola(), "Cola Vacia", JOptionPane.INFORMATION_MESSAGE);
                                    } else {
                                        JOptionPane.showMessageDialog(null, "La Cola está Vacia", "Cola Vacia", JOptionPane.INFORMATION_MESSAGE);
                                    }

                                    break;
                                case 5:
                                    JOptionPane.showMessageDialog(null, "El tamaño de la Cola es " + colita.tamanioCola(), "Cola Vacia", JOptionPane.INFORMATION_MESSAGE);

                                    break;

                                case 6:
                                    JOptionPane.showMessageDialog(null, "Aplicación Finalizada", "Fin", JOptionPane.INFORMATION_MESSAGE);
                                    break;

                                default:
                                    JOptionPane.showMessageDialog(null, "Opción incorrecta", "¡Cuidado!", JOptionPane.INFORMATION_MESSAGE);

                            }

                        } catch (NumberFormatException nnn) {
                            JOptionPane.showMessageDialog(null, "Error" + nnn.getMessage());

                        }

                    } while (opcion1 != 6);
                    break;
                case 8:
                    JOptionPane.showMessageDialog(null, "Arboles");
                    PruebaArbol arbol = new PruebaArbol();
                    
                    JOptionPane.showMessageDialog(null, arbol);
                    break;
                case 9:
                    do {
                        try {
                            a = Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor en la posición [1][1]"));
                            validar = 1;
                        } catch (Exception ex) {
                            validar = 0;
                            JOptionPane.showMessageDialog(null, "Ingrese un valor numerico");
                        }

                    } while (validar == 0);
                    do {
                        try {
                            b = Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor en la posición [1][2]"));
                            validar = 1;
                        } catch (Exception ex) {
                            validar = 0;
                            JOptionPane.showMessageDialog(null, "Ingrese un valor numerico");
                        }
                    } while (validar == 0);
                    do {
                        try {
                            c = Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor en la posición [1][3]"));
                            validar = 1;
                        } catch (Exception ex) {
                            validar = 0;
                            JOptionPane.showMessageDialog(null, "Ingrese un valor numerico");
                        }
                    } while (validar == 0);
                    do {
                        try {
                            d = Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor en la posición [1][4]"));
                            validar = 1;
                        } catch (Exception ex) {
                            validar = 0;
                            JOptionPane.showMessageDialog(null, "Ingrese un valor numerico");
                        }
                    } while (validar == 0);
                    do {
                        try {
                            e = Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor en la posición [2][1]"));
                            validar = 1;
                        } catch (Exception ex) {
                            validar = 0;
                            JOptionPane.showMessageDialog(null, "Ingrese un valor numerico");
                        }
                    } while (validar == 0);
                    do {
                        try {
                            f = Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor en la posición [2][2]"));
                            validar = 1;
                        } catch (Exception ex) {
                            validar = 0;
                            JOptionPane.showMessageDialog(null, "Ingrese un valor numerico");
                        }
                    } while (validar == 0);
                    do {
                        try {
                            g = Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor en la posición [2][3]"));
                            validar = 1;
                        } catch (Exception ex) {
                            validar = 0;
                            JOptionPane.showMessageDialog(null, "Ingrese un valor numerico");
                        }
                    } while (validar == 0);
                    do {
                        try {
                            h = Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor en la posición [2][4]"));
                            validar = 1;
                        } catch (Exception ex) {
                            validar = 0;
                            JOptionPane.showMessageDialog(null, "Ingrese un valor numerico");
                        }
                    } while (validar == 0);
                    do {
                        try {
                            x = Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor en la posición [3][1]"));
                            validar = 1;
                        } catch (Exception ex) {
                            validar = 0;
                            JOptionPane.showMessageDialog(null, "Ingrese un valor numerico");
                        }
                    } while (validar == 0);
                    do {
                        try {
                            j = Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor en la posición [3][2]"));
                            validar = 1;
                        } catch (Exception ex) {
                            validar = 0;
                            JOptionPane.showMessageDialog(null, "Ingrese un valor numerico");
                        }
                    } while (validar == 0);
                    do {
                        try {
                            k = Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor en la posición [3][3]"));
                            validar = 1;
                        } catch (Exception ex) {
                            validar = 0;
                            JOptionPane.showMessageDialog(null, "Ingrese un valor numerico");
                        }
                    } while (validar == 0);
                    do {
                        try {
                            l = Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor en la posición [3][4]"));
                            validar = 1;
                        } catch (Exception ex) {
                            validar = 0;
                            JOptionPane.showMessageDialog(null, "Ingrese un valor numerico");
                        }
                    } while (validar == 0);
                    do {
                        try {
                            m = Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor en la posición [4][1]"));
                            validar = 1;
                        } catch (Exception ex) {
                            validar = 0;
                            JOptionPane.showMessageDialog(null, "Ingrese un valor numerico");
                        }
                    } while (validar == 0);
                    do {
                        try {
                            n = Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor en la posición [4][2]"));
                            validar = 1;
                        } catch (Exception ex) {
                            validar = 0;
                            JOptionPane.showMessageDialog(null, "Ingrese un valor numerico");
                        }
                    } while (validar == 0);
                    do {
                        try {
                            y = Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor en la posición [4][3]"));
                            validar = 1;
                        } catch (Exception ex) {
                            validar = 0;
                            JOptionPane.showMessageDialog(null, "Ingrese un valor numerico");
                        }
                    } while (validar == 0);
                    do {
                        try {
                            p = Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor en la posición [4][4]"));
                            validar = 1;
                        } catch (Exception ex) {
                            validar = 0;
                            JOptionPane.showMessageDialog(null, "Ingrese un valor numerico");
                        }
                    } while (validar == 0);
                    int matrizA[][] = {{a, b, c, d}, {e, f, g, h}, {x, j, k, l}, {m, n, y, p}};
                    CaminosMinimos ruta = new CaminosMinimos();
                    JOptionPane.showMessageDialog(null, ruta.algoritmoFloy(matrizA));
                    break;
                case 10:
                    JOptionPane.showMessageDialog(null, "Salir");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Ingresó una opción no valida");
                    break;
            }
        } while (opcion != 10);
    }
}
