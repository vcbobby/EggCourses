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
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
//        de 2 dígitos, etcétera (hasta 5 dígitos).

            Scanner input = new Scanner(System.in);
          System.out.println("Ingrese cantidad de numeros aleatorios");
            int num = input.nextInt();
            int[] vector = new int[num];
            int oneDigit = 0;
            int twoDigit = 0;
            int trheeDigit = 0;
            int fourDigit = 0;
            int fiveDigit = 0;
            
            
            for (int i = 0; i < num; i++) {
                vector[i] =  (int) (Math.random() * num);
            }
            
            for (int i = 0; i < num; i++) {
                
                if (vector[i] < 10) {
                    
                    oneDigit = oneDigit + 1; 
                } else if (vector[i] < 100 && (vector[i] > 10)) {
                    
                    twoDigit = twoDigit + 1; 
                } else if (vector[i] < 1000 && (vector[i] > 100)) {
                    
                    trheeDigit = trheeDigit + 1; 
                } else if (vector[i] < 10000 && (vector[i] > 1000)) {
                    
                    fourDigit = fourDigit + 1; 
                } else if (vector[i] < 100000 && (vector[i] > 10000)) {
                    
                    fiveDigit = fiveDigit + 1; 
                }
                
            }
            
            System.out.println(oneDigit + " " + twoDigit + " " + trheeDigit + " " + fourDigit + " " + fiveDigit + " ");
    }
    
}
