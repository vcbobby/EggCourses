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
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
//        dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
//        fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que
//        ser X y el último tiene que ser una O.
//        Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
//        especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia
//        distinta de FDE, que no respete el formato se considera incorrecta.
//        Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas
//        e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
//        siguientes funciones de Java Substring(), Length(), equals().
            Scanner input = new Scanner(System.in);
            boolean dispositivo = true;
            String respuesta;
            int incorrecta = 0;
            int correcta = 0;
          do {
            
            System.out.println("Ingrese una cadena");
            respuesta = input.nextLine();
            
            
            if(respuesta.equals("&&&&&")){
                dispositivo = false;
                System.out.println(dispositivo);                               
            } else if((respuesta.length() == 5)){
                if(respuesta.substring(0,1).equals("x") && respuesta.substring(4).equals("o")){
                    correcta = correcta + 1;
                    System.out.println(correcta);
                } else{
                    incorrecta = incorrecta + 1;
                    System.out.println(incorrecta);
                }
            } else if((respuesta.length() < 5) || (respuesta.length() > 5)){
                incorrecta = incorrecta + 1;
                System.out.println(incorrecta);                
            }
            
            
        } while (dispositivo);
          
          System.out.println("Las respuestas correctas fueron: " + correcta + " Y las incorrectas: " + incorrecta);
    }
    
}
