package proyecto;

import javax.swing.JOptionPane;

public class Proyecto {

    public static void main(String[] args) {
        int opcion = 0;
         
        String men = null, arr = null, mat = null, or = null, sh = null, bur = null;
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
            int w = 1;
            switch (opcion) {

                case 1:
                    JOptionPane.showMessageDialog(null, "Operaciones Basicas");
                    while (w == 1) {
                        try {
                            men = JOptionPane.showInputDialog("Ingrese un valor de las siguientes opciones"
                                    + "\n A. Suma"
                                    + "\n B. Resta"
                                    + "\n C. Multiplicacion"
                                    + "\n D. Division"
                                    + "\n E. volver");
                        } catch (Exception ex) {
                            JOptionPane.showMessageDialog(null, "Debe ingresar solo valores numericos");
                        }
                        switch (men) {

                            case "A":
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
                            case "B":
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
                            case "C":
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
                            case "D":
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
                            case "E":
                                JOptionPane.showMessageDialog(null, "volver");
                                w++;
                                break;

                            default:
                                JOptionPane.showMessageDialog(null, "Ingresó una opción no valida");
                                break;

                        }
                    }
                    break;
                    
                case 2:
                     int ñ = 1; 
                    String arreglo[] = new String[3];
                    while (ñ==1){
                        try {
                            arr = JOptionPane.showInputDialog("2. Arreglos \n"
                                    + "\n A. Cargar Datos"
                                    + "\n B. Mostrar Datos"
                                    + "\n C. volver");
                        } catch (Exception ex) {
                            JOptionPane.showMessageDialog(null, "Debe ingresar solo valores numericos");
                        }
                        switch (arr) {
                            case "A":
                                JOptionPane.showMessageDialog(null, "Cargar Datos");
                                for (int ejeX = 0; ejeX < arreglo.length; ejeX++) {
                                    arreglo[ejeX] = JOptionPane.showInputDialog("Ingrese el valor para la posición: " + ejeX);
                                }
                                break;
                            case "B":
                                JOptionPane.showMessageDialog(null, "Mostrar Datos");
                                for (int ejeX = 0; ejeX < arreglo.length; ejeX++) {
                                    JOptionPane.showMessageDialog(null, "El valor ingresado para la posición " + ejeX + " es: " + arreglo[ejeX]);
                                }
                                break;
                            case "C":
                                JOptionPane.showMessageDialog(null, "Salir");
                                ñ++;
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Ingresó una opción no valida");
                                break;
                        }
                    } 
                    break;
                case 3:
                    int z=1;
                    String matriz[][] = new String[2][3];
                    while (z==1){
                        try {
                            mat = JOptionPane.showInputDialog("2. Matrices \n"
                                    + "\n A. Cargar Datos"
                                    + "\n B. Mostrar Datos"
                                    + "\n C. volver");
                        } catch (Exception ex) {
                            JOptionPane.showMessageDialog(null, "Debe ingresar solo valores numericos");
                        }
                        switch (mat) {
                            case "A":
                                JOptionPane.showMessageDialog(null, "Cargar Datos");
                                for (int ejeX = 0; ejeX < matriz.length; ejeX++) {
                                    for (int ejeY = 0; ejeY < matriz[ejeX].length; ejeY++) {
                                        matriz[ejeX][ejeY] = JOptionPane.showInputDialog("Ingrese el valor para la posición [" + ejeX + "][" + ejeY + "]");
                                    }
                                }
                                break;
                            case "B":
                                JOptionPane.showMessageDialog(null, "Mostrar Datos");
                                for (int ejeX = 0; ejeX < matriz.length; ejeX++) {
                                    for (int ejeY = 0; ejeY < matriz[ejeX].length; ejeY++) {
                                        JOptionPane.showMessageDialog(null, "El valor ingresado para la posición  [" + ejeX + "][" + ejeY + "]" + " es: " + matriz[ejeX][ejeY]);
                                    }
                                }
                                break;
                            case "C":
                                JOptionPane.showMessageDialog(null, "Salir");
                                z++;
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Ingresó una opción no valida");
                                break;
                        }
                    } 
                    break;
                case 4:
                    int ll=1;
                            
                    while (ll==1){
                        try {
                            or = JOptionPane.showInputDialog("Ordenamien \n"
                                    + "\n A. Método Burbuja"
                                    + "\n B. Método Shell"
                                    + "\n C. Volver");
                        } catch (Exception ex) {
                            JOptionPane.showMessageDialog(null, "Debe ingresar solo valores numericos");
                        }

                        switch (or) {
                            case "B":
                                int rr=1;
                                clase ordenar = new clase();
                                 while (rr== 1){
                                    try {
                                        sh = JOptionPane.showInputDialog("B. Metodo Shell \n"
                                                + "\n a. Cargar Datos"
                                                + "\n b. Mostrar Datos"
                                                + "\n c. Ordenar"
                                                + "\n d. Salir");
                                    } catch (Exception ex) {
                                        JOptionPane.showInternalMessageDialog(null, "Debe ingresar solo valores numericos: ");
                                    }
                                    int[] vector1 = {a, b, c, d};
                                    switch (sh) {
                                        case "a":
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

                                        case "b":
                                            JOptionPane.showMessageDialog(null, "Arreglo original");
                                            ordenar.mostrarArreglo(vector1);
                                            break;
                                        case "c":
                                            ordenar.shell(vector1);
                                            break;
                                        case "d":
                                            JOptionPane.showMessageDialog(null, "Salir");
                                            rr++;
                                            break;
                                        default:
                                            JOptionPane.showMessageDialog(null, "Ingreso una opcion no valida");
                                            break;
                                    }
                                }
                                break;
                            case "A":
                                int ch=1;
                                JOptionPane.showMessageDialog(null, "Método Burbuja");
                               while (ch==1){
                                    try {
                                        bur = JOptionPane.showInputDialog("B. Metodo Shell \n"
                                                + "\n a. Cargar Datos"
                                                + "\n b. Mostrar Datos"
                                                + "\n c. Ordenar"
                                                + "\n d. Salir");
                                    } catch (Exception ex) {
                                        JOptionPane.showInternalMessageDialog(null, "Debe ingresar solo valores numericos: ");
                                    }

                                    switch (bur) {
                                        case "a":
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
                                        case "b":
                                            JOptionPane.showMessageDialog(null, "Mostrar Dato: \n" + " [ " + a + " ] " + " [ " + b + " ] " + " [ " + c + " ] " + " [ " + d + " ] "
                                            );
                                            break;
                                        case "c":
                                            ordenar o = new ordenar();
                                            int[] arregl = {a, b, c, d};
                                            o.ordenarBurbuja(arregl);

                                            for (int i = 0; i < arregl.length; i++) {
                                                JOptionPane.showMessageDialog(null, "Su valores organizados de menor a mayor es:" + arregl[i]);
                                            }
                                            break;
                                        case "d":
                                            JOptionPane.showMessageDialog(null, "Salir");
                                            ch++;
                                            break;
                                        default:
                                            JOptionPane.showMessageDialog(null, "Ingresó una opción no valida");
                                            break;
                                    }
                                } 
                                break;
                            case "C":
                                JOptionPane.showMessageDialog(null, "Volver");
                                ll++;
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Ingresó una opción no valida");
                                break;
                        }

                    } 
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
