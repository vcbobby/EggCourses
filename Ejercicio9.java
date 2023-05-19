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
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
//        es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla
//        que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota:
//        investigar la función Substring y equals() de Java.

             Scanner input = new Scanner(System.in);
            System.out.println("Ingrese una frase");
            String frase = input.nextLine();
            
            String primeraLetra = frase.substring(0,1);
            
            if(primeraLetra.equals("A")){
                System.out.println("Correcto");
            }else {
                System.out.println("Incorrecto!!");
            }
    }
    
}
