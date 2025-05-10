// VETORES: 9.faça um programa que leia o vetor com N elementos formado por valores do tipo inteiro. Crie entao  dois novos vetores, um com valores pares e outro com valores impares do vetor original.
package com.mycompany.trabalho18;
import java.util.ArrayList;
import java.util.Scanner;

public class Trabalho18{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lê o tamanho do vetor
        System.out.print("Digite o número de elementos: ");
        int n = sc.nextInt();

        int[] vetorOriginal = new int[n];

        // Lê os elementos do vetor
        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < n; i++) {
            vetorOriginal[i] = sc.nextInt();
        }

        // Listas para armazenar pares e ímpares
        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();

        // Separa os valores
        for (int num : vetorOriginal) {
            if (num % 2 == 0) {
                pares.add(num);
            } else {
                impares.add(num);
            }
        }

        // Exibe os vetores
        System.out.println("Valores pares: " + pares);
        System.out.println("Valores ímpares: " + impares);

        sc.close();
    }
}
