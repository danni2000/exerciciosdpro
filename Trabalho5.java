// ESTRUTURA DE DECISAO: 2. Faça um programa que leia tres numeros e mostre o maior deles.

package com.mycompany.trabalho5;
import java.util.Scanner;

public class Trabalho5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura dos três números
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        int num3 = scanner.nextInt();

        // Verifica qual é o maior número
        int maior = num1;

        if (num2 > maior) {
            maior = num2;
        }

        if (num3 > maior) {
            maior = num3;
        }

        // Exibe o maior número
        System.out.println("O maior número é: " + maior);

        scanner.close();
    }
}
