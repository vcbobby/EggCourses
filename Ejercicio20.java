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
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//         Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
//        suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
//        permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
//        El programa deberá comprobar que los números introducidos son correctos, es decir,
//        están entre el 1 y el 9.
            Scanner input = new Scanner(System.in);
           int[][] matriz = new int[3][3];
            
            
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.println("ingrese numero");
                    int num = input.nextInt();
                   matriz[i][j] =  num;
                }  
            }
            
            if ((matriz[0][0]+ matriz[0][1] + matriz[0][2]) == (matriz[1][0]+ matriz[1][1] + matriz[1][2]) && (matriz[2][0]+ matriz[2][1] + matriz[2][2]) == (matriz[1][0]+ matriz[1][1] + matriz[1][2]) && (matriz[0][0]+ matriz[1][1] + matriz[2][2]) == (matriz[0][2]+ matriz[1][1] + matriz[2][0])) {
                System.out.println("Matriz magica");
            
            } else{
                System.out.println("No es magica");
            }
    }
    
}
