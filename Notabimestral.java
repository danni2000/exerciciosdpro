// Estrutura Sequencial: 2.faça um programa que peça as 4 notas bimestrais e mostre a media

package com.mycompany.notabimestral;
import java.util.Scanner;

public class Notabimestral {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double soma = 0;
        for (int i = 1; i <= 4; i++) {
            System.out.print("Digite a nota do " + i + "º bimestre: ");
            double nota = scanner.nextDouble();
            soma += nota;
        }

        double media = soma / 4;
        System.out.println("A média das notas é: " + media);

        scanner.close();
    }
}


        
    

