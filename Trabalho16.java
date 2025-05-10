// VETORES: 2. faça um programa que copie o conteudo de um vetor em um segundo vetor.
package com.mycompany.trabalho16;
public class Trabalho16 {
    public static void main(String[] args) {
        int[] vetorOriginal = {10, 20, 30, 40, 50};
        int[] vetorCopia = new int[vetorOriginal.length];

        for (int i = 0; i < vetorOriginal.length; i++) {
            vetorCopia[i] = vetorOriginal[i];
        }

        System.out.println("Vetor original:");
        for (int valor : vetorOriginal) {
            System.out.print(valor + " ");
        }

        System.out.println("\nVetor copiado:");
        for (int valor : vetorCopia) {
            System.out.print(valor + " ");
        }
    }
}

