package proyecto;

import javax.swing.JOptionPane;

public class Proyecto {

    public static void main(String[] args) {
        int opcion = 0;
        int men = 0;
        int num1 = 0, num2 = 0, sum, res, mul, div;
        int validar = 0;
        int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0, g = 0, h = 0, x = 0, j = 0, k = 0, l = 0, m = 0, n = 0, y = 0, p = 0;
        operar menu = new operar();
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor de las siguientes opciones"
                        + "\n 1. Operaciones basicas"
                        + "\n 2. Arreglo"
                        + "\n 3. Matrices"
                        + "\n 4. Método Burbuja"
                        + "\n 5. Método Shell"
                        + "\n 6. Grafos"
                        + "\n 7. Salir"));
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Debe ingresar solo valores numericos");
            }

            switch (opcion) {

                case 1:
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

                    for (int ejeX = 0; ejeX < arreglo.length; ejeX++) {
                        arreglo[ejeX] = JOptionPane.showInputDialog("Ingrese el valor para la posición: " + ejeX);
                    }

                    for (int ejeX = 0; ejeX < arreglo.length; ejeX++) {
                        JOptionPane.showMessageDialog(null, "El valor ingresado para la posición " + ejeX + " es: " + arreglo[ejeX]);
                    }

                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Matrices");
                    String matriz[][] = new String[2][3];

                    for (int ejeX = 0; ejeX < matriz.length; ejeX++) {
                        for (int ejeY = 0; ejeY < matriz[ejeX].length; ejeY++) {
                            matriz[ejeX][ejeY] = JOptionPane.showInputDialog("Ingrese el valor para la posición [" + ejeX + "][" + ejeY + "]");
                        }
                    }

                    for (int ejeX = 0; ejeX < matriz.length; ejeX++) {
                        for (int ejeY = 0; ejeY < matriz[ejeX].length; ejeY++) {
                            JOptionPane.showMessageDialog(null, "El valor ingresado para la posición  [" + ejeX + "][" + ejeY + "]" + " es: " + matriz[ejeX][ejeY]);
                        }
                    }
                    break;
                case 4:
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
                        JOptionPane.showMessageDialog(null, "Su valores organizados de menor a mayor son:" + arregl[i]);
                    }
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Método Shell");
                    break;
                case 6:
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
                case 7:
                    JOptionPane.showMessageDialog(null, "Salir");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Ingresó una opción no valida");
                    break;
            }
        } while (opcion != 7);
    }
}
