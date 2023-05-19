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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crear un programa que dado un numero determine si es par o impar.
         
        Scanner input = new Scanner(System.in);
            System.out.println("Ingrese un numero");
            int num = input.nextInt();
            
            boolean esPar = parOImpar(num);
            System.out.println("el numero ingresado es par? " + esPar);
        
    }
    
    public static boolean parOImpar(int num){
        boolean resultado;
        
        if(num%2 == 0){
            resultado = true;
        } else {
            resultado = false;
        }
        
        return resultado;
    }
    
}
