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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
//        Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
//        dos. El programa deberá después mostrar el resultado de la suma

        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        int num1 = leer.nextInt();
        
        System.out.println("Ingrese un numero");
        int num2 = leer.nextInt();
        
        suma(num1, num2);
        
    }

    
    
    public static void suma (int valor1, int valor2 ) {
        int resultado = valor1 + valor2;
        System.out.println("El resultado de la suma es: " + resultado);          
    }
    
}
