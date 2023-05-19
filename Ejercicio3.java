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
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
//        en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en
//        Java.

            Scanner input = new Scanner(System.in);
            System.out.println("Ingrese una frase");
            String frase = input.nextLine();
            String mayus = frase.toUpperCase();
            String minus = frase.toLowerCase();
            System.out.println("su frase en mayusculas " + mayus);
            System.out.println("su frase en minusculas " + minus);
            
            
    }
    
}
