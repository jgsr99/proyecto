
package proyecto;

import javax.swing.JOptionPane;

public class Proyecto {

    public static void main(String[] args) {
      int opcion = 0;
        int men =0;
        int num1=0, num2=0, sum, res, mul, div;
        int validar=0;
        int a=0, b=0, c=0, d=0;
        operar menu = new operar(); 
        do{
            try{
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor de las siguientes opciones"
                    + "\n 1. Operaciones basicas"
                    + "\n 2. Arreglo"
                    + "\n 3. Matrices"
                    + "\n 4. Método Burbuja"
                    + "\n 5. Método Shell"
                    + "\n 6. Salir"));
            }catch(Exception ex){
               JOptionPane.showMessageDialog(null, "Debe ingresar solo valores numericos");
            }

            switch(opcion){
                
                case 1:
                    do{
                        try{
                    men = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor de las siguientes opciones"
                    + "\n 1. Suma"
                    + "\n 2. Resta"
                    + "\n 3. Multiplicacion"
                    + "\n 4. Division"
                    +"\n 5. volver"));
                        }catch(Exception ex){
                            JOptionPane.showMessageDialog(null, "Debe ingresar solo valores numericos");
                        }
                    switch (men){
                        
                        case 1:
                            do{
                            try{
                        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su primer valor: "));
                        validar =1;
                        }catch(Exception ex){
                               JOptionPane.showMessageDialog(null, "Debe ingresar solo valores numericos");
                               validar =0;
                            }
                            }while(validar==0);
                            do{
                          try{
                        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su segundo valor: "));
                        validar=1;
                        }catch(Exception ex){
                               JOptionPane.showMessageDialog(null, "Debe ingresar solo valores numericos");
                               validar=0;
                            }
                            }while(validar==0);
                          
                            JOptionPane.showMessageDialog(null,"El resultado de la suma es "+menu.sumar(num1, num2));
                         break;
                        case 2:
                            do{
                            try{
                        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su primer valor: "));
                        validar =1;
                        }catch(Exception ex){
                               JOptionPane.showMessageDialog(null, "Debe ingresar solo valores numericos");
                               validar =0;
                            }
                            }while(validar==0);
                            do{
                          try{
                        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su segundo valor: "));
                        validar=1;
                        }catch(Exception ex){
                               JOptionPane.showMessageDialog(null, "Debe ingresar solo valores numericos");
                               validar=0;
                            }
                            }while(validar==0);
                            JOptionPane.showMessageDialog(null,"El resultado de la resta es "+menu.restar(num1, num2));
                    break;
                    case 3:
                        do{
                            try{
                        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su primer valor: "));
                        validar =1;
                        }catch(Exception ex){
                               JOptionPane.showMessageDialog(null, "Debe ingresar solo valores numericos");
                               validar =0;
                            }
                            }while(validar==0);
                            do{
                          try{
                        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su segundo valor: "));
                        validar=1;
                        }catch(Exception ex){
                               JOptionPane.showMessageDialog(null, "Debe ingresar solo valores numericos");
                               validar=0;
                            }
                            }while(validar==0);
                      JOptionPane.showMessageDialog(null,"El resultado de la multiplicacion es "+menu.multiplicar(num1, num2));
                    break;
                    case 4:
                        do{
                            try{
                        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su primer valor: "));
                        validar =1;
                        }catch(Exception ex){
                               JOptionPane.showMessageDialog(null, "Debe ingresar solo valores numericos");
                               validar =0;
                            }
                            }while(validar==0);
                            do{
                          try{
                        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su segundo valor: "));
                        validar=1;
                        }catch(Exception ex){
                               JOptionPane.showMessageDialog(null, "Debe ingresar solo valores numericos");
                               validar=0;
                            }
                            }while(validar==0);
                        JOptionPane.showMessageDialog(null,"El resultado de la division es "+menu.dividir(num1, num2));
                    break;
                    case 5:
                    JOptionPane.showMessageDialog(null, "volver");
                    break;
                    default:
                    JOptionPane.showMessageDialog(null, "Ingresó una opción no valida");
                    break;
                    }
                 }while(men!= 5);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Arreglos");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Matrices");
                    break;
                case 4:
                                do{
                            try{
                        a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su primer valor: "));
                        validar =1;
                        }catch(Exception ex){
                               JOptionPane.showMessageDialog(null, "Debe ingresar solo valores numericos");
                               validar =0;
                            }
                            }while(validar==0);
                            do{
                            try{
                        b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su segundo valor: "));
                        validar =1;
                        }catch(Exception ex){
                               JOptionPane.showMessageDialog(null, "Debe ingresar solo valores numericos");
                               validar =0;
                            }
                            }while(validar==0);
                            do{
                            try{
                        c = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su tercer valor: "));
                        validar =1;
                        }catch(Exception ex){
                               JOptionPane.showMessageDialog(null, "Debe ingresar solo valores numericos");
                               validar =0;
                            }
                            }while(validar==0);
                            do{
                            try{
                        d = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su cuarto valor: "));
                        validar =1;
                        }catch(Exception ex){
                               JOptionPane.showMessageDialog(null, "Debe ingresar solo valores numericos");
                               validar =0;
                            }
                            }while(validar==0);
        int []arreglo = {a,b,c,d};
        ordenar o = new ordenar();
        o.ordenarBurbuja(arreglo);
        
        for (int i=0;i<arreglo.length;i++){
         JOptionPane.showMessageDialog(null, "Su valores organizados de menor a mayor son:"+arreglo[i]);   
        }
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Método Shell");
                    break;        
                case 6:
                    JOptionPane.showMessageDialog(null, "Salir");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Ingresó una opción no valida");
                    break;
            }
            }while(opcion != 6);
        }
    }
    

