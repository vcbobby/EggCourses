/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Guia1.eggcourses;

/**
 *
 * @author vcbobby
 */
public class Extra1 {

    /**
     * @param args the command line arguments
     */
   
        
    public static void main(String[] args) {
        // Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
        // usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.

        int tiempo = 1440;

        calcularTiempo(tiempo);
    
    }
    

    public static void calcularTiempo(int tiempo) {
        
        
        
        int minutosEnUnDia = 24 * 60; // 24 horas * 60 minutos

        int dias = tiempo / minutosEnUnDia;
        int horas = (tiempo % minutosEnUnDia) / 60;

        System.out.println(tiempo + " minutos equivalen a:");
        System.out.println(dias + " día(s) y " + horas + " hora(s).");

    }
}
    

