// ESTRUTURA DE REPETIÇAO: 2.USUARIO INSERE UM NUMERO E MOSTRE A SOMA TOTAL DE 1 ATE O NUMERO ESCOLHIDO.
package com.mycompany.trabalho8;
import java.util.Scanner;

public class Trabalho8{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();
        
        if (numero < 1) {
            System.out.println("Por favor, digite um número inteiro positivo maior que zero.");
        } else {
            int soma = 0;
            for (int i = 1; i <= numero; i++) {
                soma += i;
            }
            System.out.println("A soma de 1 até " + numero + " é: " + soma);
        }
        
        scanner.close();
    }
}

