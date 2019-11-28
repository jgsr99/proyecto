/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author TOSHIBA
 */
public class cola {
    
    //
    NodoCola inicio;
    NodoCola fin;
    int tama;
    public cola(){
    inicio = fin = null;
    tama = 0;
    
    }
    
    public boolean estaVacia (){
    return inicio == null; 
    }
    
    public void insertar(int ele){
        //Puntero para recordar que siempre se inserta por el final
     NodoCola nuevo = new NodoCola(ele);
     
     if(estaVacia()){
     inicio = nuevo;
     
     
     }else{
      fin.siguiente = nuevo;
      }
     fin = nuevo;
     tama++;
    
    }
    public int quitar(){
    int aux = inicio.dato;
    inicio=inicio.siguiente;
    tama--;
    return aux;
    
    }
    public int inicioCola(){
    return inicio.dato;
    }
    
    public int tamanioCola(){
    return tama;
    }
    
}
