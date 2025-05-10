// MATRIZES: 1. FAÇA UM PROGRAMA PARA LER E IMPRIMIR UMA MATRIZ 2X4 DE NUMEROS INTEIROS.

package com.mycompany.trabalho19;
import java.util.Scanner;

public class Trabalho19{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[2][4];

        // Leitura da matriz
        System.out.println("Digite os elementos da matriz 2x4:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("Elemento [%d][%d]: ", i, j);
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Impressão da matriz
        System.out.println("\nMatriz digitada:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}

