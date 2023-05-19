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
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
//        cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
//        * * * *
//        *     *
//        *     *
//        * * * *
            
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = input.nextInt();
        int i;
        int j;
        
        for(i = 0; i < num; i++){
            
            if(i == 0 || i == num-1){
                for(j = 0; j < num; j++){
                System.out.print("* ");
                }
                System.out.println("");
            } else {
                for(j = 0; j < num; j++){
                    if(j == 0 || j == num-1){
                    System.out.print("* ");
                    } else{
                        System.out.print("  ");
                    }
                    
                }
                System.out.println("");
            }
        }
    }
    
}
