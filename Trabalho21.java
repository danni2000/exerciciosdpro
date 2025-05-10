// MATRIZES: 4. FAÇA UM PROGRAMA QUE DADA A MATRIZ A, GERE A MATRIZ OPOSTA -A.
package com.mycompany.trabalho21;
import java.util.Scanner;

public class Trabalho21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do tamanho da matriz
        System.out.print("Digite o número de linhas: ");
        int linhas = scanner.nextInt();

        System.out.print("Digite o número de colunas: ");
        int colunas = scanner.nextInt();

        int[][] A = new int[linhas][colunas];
        int[][] oposta = new int[linhas][colunas];

        // Leitura da matriz A
        System.out.println("Digite os elementos da matriz A:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                A[i][j] = scanner.nextInt();
            }
        }

        // Geração da matriz oposta -A
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                oposta[i][j] = -A[i][j];
            }
        }

        // Impressão da matriz oposta
        System.out.println("Matriz oposta (-A):");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(oposta[i][j] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}

