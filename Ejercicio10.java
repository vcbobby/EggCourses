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
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
//        solicite números al usuario hasta que la suma de los números introducidos supere el
//        límite inicial. 

        Scanner input = new Scanner(System.in);
        
        int limit = 1000;
        int suma = 0;
        do {
           System.out.println("Ingrese un numero");
           int num = input.nextInt(); 
           suma += num;
           System.out.println(suma);
        } while (suma < limit);
    }
    
}
