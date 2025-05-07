// ESTRUTURA DE DECISAO: 3.Faça um programa que receba como entrada tres valores e os imprima em ordem crescente.
package com.mycompany.trabalho6;
import java.util.Scanner;

public class Trabalho6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Recebe os três números
        System.out.print("Digite o primeiro número: ");
        int a = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int b = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        int c = scanner.nextInt();

        // Ordena os números
        int menor, meio, maior;

        if (a <= b && a <= c) {
            menor = a;
            if (b <= c) {
                meio = b;
                maior = c;
            } else {
                meio = c;
                maior = b;
            }
        } else if (b <= a && b <= c) {
            menor = b;
            if (a <= c) {
                meio = a;
                maior = c;
            } else {
                meio = c;
                maior = a;
            }
        } else {
            menor = c;
            if (a <= b) {
                meio = a;
                maior = b;
            } else {
                meio = b;
                maior = a;
            }
        }

        // Imprime em ordem crescente
        System.out.println("Números em ordem crescente: " + menor + ", " + meio + ", " + maior);

        scanner.close();
    }
}

