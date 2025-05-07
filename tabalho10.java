// ESTRUTURA DE REPETIÇAO: 7. Faça um programa que determine e escreva os numeros primos compreendidos entre um intervalo fornecido pelo usuario. 
package com.mycompany.trabalho10;
import java.util.Scanner;

public class Trabalho10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número do intervalo: ");
        int inicio = scanner.nextInt();

        System.out.print("Digite o segundo número do intervalo: ");
        int fim = scanner.nextInt();

        // Garante que o início seja menor ou igual ao fim
        if (inicio > fim) {
            int temp = inicio;
            inicio = fim;
            fim = temp;
        }

        System.out.println("Números primos entre " + inicio + " e " + fim + ":");
        for (int i = inicio; i <= fim; i++) {
            if (ehPrimo(i)) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }

    // Função para verificar se um número é primo
    public static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        // Verifica divisibilidade até a raiz quadrada do número
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}


