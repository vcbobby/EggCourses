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
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Realizar un programa que pida dos números enteros positivos por teclado y muestre por
//        pantalla el siguiente menú:
//        MENU
//        1. Sumar
//        2. Restar
//        3. Multiplicar
//        4. Dividir
//        5. Salir
//        Elija opción:
//        El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
//        pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
//        opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del
//        programa directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está
//        seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale
//        del programa, caso contrario se vuelve a mostrar el menú.

            Scanner input = new Scanner(System.in);
            System.out.println("Ingrese un numero");
            int num = input.nextInt();
            System.out.println("Ingrese un segundo numero");
            int num2 = input.nextInt();
            
            menu(num, num2);
    }
    
    public static void menu(int num1, int num2){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese una opcion del menu");
//        1. Sumar
//        2. Restar
//        3. Multiplicar
//        4. Dividir
//        5. Salir
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        int opcion = input.nextInt();
        
        switch (opcion) {
            case 1:
                sumar( num1, num2);
                break;
            case 2:
                restar( num1, num2);
                break;
            case 3:
                multiplicar(num1, num2);
                break;
            case 4:
                dividir( num1, num2);
                break;
            case 5:
                salir(num1, num2);
                break;
            default:
                System.out.println("Ingreso una opcion invalida");
                menu(num1, num2);
        }
        
    }
    
    public static void sumar(int num1, int num2){
        System.out.println("El resultado es: " + (num1 + num2));
        menu(num1, num2);
    }
    public static void restar(int num1, int num2){
        System.out.println("El resultado es: " + (num1 - num2));
        menu(num1, num2);
    }
    public static void multiplicar(int num1, int num2){
        System.out.println("El resultado es: " + (num1 * num2));
        menu(num1, num2);
    }
    public static void dividir(int num1, int num2){
        System.out.println("El resultado es: " + (num1 / num2));
        menu(num1, num2);
    }
    public static void salir(int num1, int num2){
        System.out.println("Seguro que quiere salir? escriba " + "s " + "o " + "n");
        Scanner respuesta = new Scanner(System.in);
        String letra = respuesta.nextLine();
        if(letra.equals("s")) {
            System.out.println("Fin del programa");
        } else if(letra.equals("n")){
            menu(num1, num2);
        } else {
            System.out.println("opcion invalida");
            salir(num1, num2);
        }
        
    }
    
}
