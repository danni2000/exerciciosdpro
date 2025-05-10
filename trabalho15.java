// VETORES: 1. Fazer um algaritimo que calcule e imprima a soma, a media, o maior e o menor dos valores armazenados em um vetor de 10 elementos numericos a serem lidos do dispositivo de entrada padrao.
package com.mycompany.trabalho15;
import java.util.Scanner;

public class Trabalho15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int soma = 0;
        int maior, menor;

        // Leitura dos 10 números e cálculo da soma
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();
            soma += numeros[i];
        }

        // Inicializa maior e menor com o primeiro elemento do vetor
        maior = numeros[0];
        menor = numeros[0];

        // Determina o maior e o menor valor
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        double media = (double) soma / numeros.length;

        // Exibe os resultados
        System.out.println("\nResultados:");
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);

        scanner.close();
    }
}

