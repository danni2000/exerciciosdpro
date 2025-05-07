// ESTRUTURA DE REPETIÇAO: 4. CONSTRUA UM PROGRAMA QUE EXIBA A TABUADA DE 1 A N, ONDE N É INFORMADO PELO USUARIO. EX: ATE A TABUADA DE 3, IRA IMPRIMIR AS TA TABUADAS DE 1,2 E 3.
package com.mycompany.trabalho9;
import java.util.Scanner;

public class Trabalho9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo (N): ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("\nTabuada do " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }

        scanner.close();
    }
}

