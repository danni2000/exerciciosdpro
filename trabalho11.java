// ESTRUTURA DE REPETIÇAO: 15. faça um programa que peça para o usuario ir informando numeros ate que ele informe 0(ZERO).
// APOS ISTO APRESENTE OS SEGUNITES DADOS SOBRE OS NUMEROS DIGITADOS: 1* O MAIOR NUMERO  2* O MENOR NUMERO  3* A SOMA DOS NUMEROS  4* A MEDIA DELES  5* A QUANTIDADE DE NUMEROS PARES  6* E OS IMPARES. 
package com.mycompany.trabalho11;
import java.util.Scanner;

public class Trabalho11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numero;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int soma = 0;
        int quantidade = 0;
        int pares = 0;
        int impares = 0;

        System.out.println("Digite números inteiros (0 para encerrar):");

        while (true) {
            System.out.print("Número: ");
            numero = scanner.nextInt();

            if (numero == 0) {
                break;
            }

            soma += numero;
            quantidade++;

            if (numero > maior) {
                maior = numero;
            }

            if (numero < menor) {
                menor = numero;
            }

            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        if (quantidade > 0) {
            double media = (double) soma / quantidade;

            System.out.println("\n--- Resultados ---");
            System.out.println("Maior número: " + maior);
            System.out.println("Menor número: " + menor);
            System.out.println("Soma dos números: " + soma);
            System.out.printf("Média dos números: %.2f%n", media);
            System.out.println("Quantidade de números pares: " + pares);
            System.out.println("Quantidade de números ímpares: " + impares);
        } else {
            System.out.println("\nNenhum número foi digitado.");
        }

        scanner.close();
    }
}

