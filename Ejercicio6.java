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
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
//        Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).

            Scanner input = new Scanner(System.in);
            System.out.println("Ingrese un grado centigrado");
            int grados = input.nextInt();
            
            double far = 32 + (9 * (grados / 5));
            System.out.println("Los grados fahrenheit son: " + far);
    }
    
}
