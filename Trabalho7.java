// ESTRUTURA DE REPETIÇAO: 1.Faça um programa que calcule a soma dos numeros inteiros de 1 a 100.
package com.mycompany.trabalho7;
public class Trabalho7 {
    public static void main(String[] args) {
        int soma = 0;

        for (int i = 1; i <= 100; i++) {
            soma += i;
        }

        System.out.println("A soma dos números de 1 a 100 é: " + soma);
    }
}
