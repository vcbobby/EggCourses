/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Guia1.eggcourses;

/**
 *
 * @author vcbobby
 */
public class Extra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
//una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, 
//C tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
//iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.


        int a = 2;
        int b = 3;
        int c = 4;
        int d = 5;
        System.out.println(a + ", " +b + ", " +c + ", " +d);
        
        cambio(a,b,c,d);
    }
    public static void cambio(int a, int b, int c, int d){
        int aux = b;
        b = c;
        c = aux;
        c = a;
        a = aux;
        a = d;
        d = aux;
        
        System.out.println("b: " + b + " c: " + c + " a: " + a + " d:" + d + " " + aux);
    }
}
