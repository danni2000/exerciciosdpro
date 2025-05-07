// ESTRUTURA DE DECISAO: 1.Faça um programa que peça dois numeros e imprima o maior deles.

package com.mycompany.trabalho4;
import java.util.Scanner;

public class Trabalho4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita os dois números
        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        // Verifica e imprime o maior número
        if (numero1 > numero2) {
            System.out.println("O maior número é: " + numero1);
        } else if (numero2 > numero1) {
            System.out.println("O maior número é: " + numero2);
        } else {
            System.out.println("Os dois números são iguais.");
        }

        scanner.close();
    }
}


