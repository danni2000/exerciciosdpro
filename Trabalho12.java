// STRINGS: 1.FAÇA UM PROGRAMA QUE PERMITA AO USUARIO DIGITAR O SEU NOME E EM SEGUIDA MOSTRE O NOME DO USUARIO DE TRAS PARA FRENTE UTILZANDO SOMENTE LETRAS MAIUSCULAS.

package com.mycompany.trabalho12;
import java.util.Scanner;

public class Trabalho12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o nome do usuário
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        // Inverte o nome e converte para letras maiúsculas
        String nomeInvertido = new StringBuilder(nome).reverse().toString().toUpperCase();

        // Exibe o resultado
        System.out.println("Nome invertido: " + nomeInvertido);

        scanner.close();
    }
}
