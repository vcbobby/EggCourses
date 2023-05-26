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
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida
//        al usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
//        numero y si se encuentra repetido

         Scanner input = new Scanner(System.in);
            
            System.out.println("Ingrese cantidad de numeros aleatorios");
            int num = input.nextInt();
            int[] vector = new int[num];
            System.out.println("que numero desea buscar");
            int buscar = input.nextInt();
            int contador = 0;
            for (int i = 0; i < num; i++) {
                vector[i] =  (int) (Math.random() * num);
            }
            
            for (int i = 0; i < num; i++) {
                
                if (buscar == vector[i]) {
                    
                    contador = contador + 1; 
                } 
                
            }
            
            if (contador > 0) {
            System.out.println("Su numero se encuentra dentro del vector " + contador + " veces");
        } else{
                System.out.println("Su numero no se encuentra dentro del contador");
            }
            
    }
    
}
