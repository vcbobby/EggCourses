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
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que
//        una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada
//        de signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
//        denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).

        
            
            int[][] matriz = new int[4][4];
            
            
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                   matriz[i][j] =  (int) (Math.random() * 10); 
                }
                
            }
            
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print(matriz[i][j] + " "); 
                }
                System.out.println("");
            }
            
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print(((matriz[j][i]) * (-1)) + " "); 
                }
                System.out.println("");
            }
            
    }
    
}
