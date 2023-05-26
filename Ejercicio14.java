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
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Crea una aplicación que a través de una función nos convierta una cantidad de euros
//        introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
//        función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
//        una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
//        (void).
//        El cambio de divisas es:
//         * 0.86 libras es un 1 €
//         * 1.28611 $ es un 1 €
//         * 129.852 yenes es un 1 €

            Scanner input = new Scanner(System.in);
            System.out.println("Ingrese a que tipo de moneda quisiera cambiar: libras; dolar; yenes");
            String moneda = input.nextLine();
            System.out.println("Ingrese cantidad de euros");
            int euros = input.nextInt();
            
          
            
            conversion(euros, moneda);
    }
    
    public static void conversion(int euros, String moneda){
        double resultado;
        int entero = euros;
        if(moneda.equals("libras")){
            resultado = entero * 0.86; 
            System.out.println(euros + "euros, son: " + resultado + "libras");
        } else if(moneda.equals("dolar")){
            resultado = entero * 1.28611; 
            System.out.println(euros + "euros, son: " + resultado + "dolares");
        } else if(moneda.equals("yenes")){
            resultado = entero * 129.852; 
            System.out.println(euros + "euros, son: " + resultado + "yenes");
        } else{
            System.out.println("Ingrese opcion valida");
        }
    }
    
}
