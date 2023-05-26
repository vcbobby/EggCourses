/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Guia1.eggcourses;

/**
 *
 * @author vcbobby
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
//        3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
//        dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3
//        que se pueden formar en la matriz M, desplazándose por filas o columnas, existe al
//        menos una que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la
//        columna de la matriz M en la cual empieza el primer elemento de la submatriz P.

        int[][] matrizM = {
            {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15, 16, 17, 18, 19, 20},
            {21, 22, 23, 24, 25, 26, 27, 28, 29, 30},
            {31, 32, 33, 34, 35, 36, 37, 38, 39, 40},
            {41, 42, 43, 44, 45, 46, 47, 48, 49, 50},
            {51, 52, 53, 54, 55, 56, 57, 58, 59, 60},
            {61, 62, 63, 64, 65, 66, 67, 68, 69, 70},
            {71, 72, 73, 74, 75, 76, 77, 78, 79, 80},
            {81, 82, 83, 84, 85, 86, 87, 88, 89, 90},
            {91, 92, 93, 94, 95, 96, 97, 98, 99, 100}
        };

        int[][] matrizP = {
            {11, 12, 13},
            {21, 22, 23},
            {31, 32, 33}
        };

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (matrizP[0][0] == matrizM[i][j]) {
                    if (matrizP[0][1] == matrizM[i][j + 1]) {
                        if (matrizP[0][2] == matrizM[i][j + 2]) {
                            if (matrizP[1][0] == matrizM[i + 1][j]) {
                                if (matrizP[1][1] == matrizM[i + 1][j + 1]) {
                                    if (matrizP[1][2] == matrizM[i + 1][j + 2]) {
                                        if (matrizP[2][0] == matrizM[i + 2][j]) {
                                            if (matrizP[2][1] == matrizM[i + 2][j + 1]) {
                                                if (matrizP[2][2] == matrizM[i + 2][j + 2]) {
                                                    System.out.println("El subindice de la columna donde inicia la matriz p en la matriz M es: " + j);
                                                    System.out.println("El subindice de la fila donde inicia la matriz p en la matriz M es: " + i);
                                                } else {
                                                    System.out.println("Ninguno coincide");
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

    }

}
