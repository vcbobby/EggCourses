/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Guia1.eggcourses;

/**
 *
 * @author vcbobby
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
//        muestre por pantalla en orden descendente
          int[] enteros = new int[100];
          
          for (int i = 0; i < 100; i++) {
            enteros[i] = i;
        }
          
        for (int i = 99; i > 0; i = i - 1) {
            System.out.println(enteros[i]);
        }  
    }
    
}
