// ESTRUTURA SEQUENCIAL: 6.Faça um programa que leia o numero inteiro; leia o segundo numero inteiro; efetue a adiçao dos dois; e apresente o valor calculado em java;


package com.mycompany.mavenproject1;
import java.util.Scanner;

public class trabalho3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do primeiro número
        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();

        // Leitura do segundo número
        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = scanner.nextInt();

        // Efetua a soma
        int soma = numero1 + numero2;

        // Apresenta o resultado
        System.out.println("A soma dos dois números é: " + soma);

        scanner.close();
    }
}


