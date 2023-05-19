/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Guia1.eggcourses;

import java.util.Scanner;

/**
 *
 * @author vcbobby
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Escribir un programa que lea un número entero por teclado y muestre por pantalla el
//        doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
//        Math.sqrt().

            Scanner input = new Scanner(System.in);
            System.out.println("Ingrese un numero");
            int num = input.nextInt();
            
            int doble = doble(num);
            int triple = triple(num);
            double cuadrada = cuadrada(num);
            System.out.println("EL doble, triple y raiz cuadrada de su numero es: " + doble + ", " + triple + ", " + cuadrada);
    }
    
    public static int doble(int num){
        int resultado = num * 2;
        return resultado;
    }
    public static int triple(int num){
        int resultado = num * 3;
        return resultado;
    }
    
    public static double cuadrada(int num){ 
        double raizCuadrada = Math.sqrt(num);
        return raizCuadrada;
    }
    
}
