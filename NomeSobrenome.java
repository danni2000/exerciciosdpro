//ESTRUTURA SEQUENCIAL:5. faça um programa que: 1. leia o nome; 2.leia o sobrenome; 3. concatene o nome com o sobrenome; 4. apresente o nome completo.

package com.mycompany.nomesobrenome;
import java.util.Scanner;
public class NomeSobrenome {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // 1. Ler o nome
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();

        // 2. Ler o sobrenome
        System.out.print("Digite o sobrenome: ");
        String sobrenome = scanner.nextLine();

        // 3. Concatenar o nome com o sobrenome
        String nomeCompleto = nome + " " + sobrenome;

        // 4. Apresentar o nome completo
        System.out.println("Nome completo: " + nomeCompleto);

        scanner.close();
        
        
        
    }
}










