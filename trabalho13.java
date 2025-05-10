//STRINGS: 2. Dado uma string com uma frase informada pelo usuario (incluindo espaços em branco),conte:
// 1* quantos espaços em branco existem na frase. 2* quantas vezes aparecem as vogais a,e,i,o,u.

package com.mycompany.trabalho13;
import java.util.Scanner;

public class Trabalho13{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        int espacos = 0;
        int[] vogais = new int[5]; // Índices: 0 - a, 1 - e, 2 - i, 3 - o, 4 - u

        for (int i = 0; i < frase.length(); i++) {
            char c = Character.toLowerCase(frase.charAt(i));
            if (c == ' ') {
                espacos++;
            } else if (c == 'a') {
                vogais[0]++;
            } else if (c == 'e') {
                vogais[1]++;
            } else if (c == 'i') {
                vogais[2]++;
            } else if (c == 'o') {
                vogais[3]++;
            } else if (c == 'u') {
                vogais[4]++;
            }
        }

        System.out.println("\nResultado da análise:");
        System.out.println("Espaços em branco: " + espacos);
        System.out.println("Vogais:");
        System.out.println("a: " + vogais[0]);
        System.out.println("e: " + vogais[1]);
        System.out.println("i: " + vogais[2]);
        System.out.println("o: " + vogais[3]);
        System.out.println("u: " + vogais[4]);

        scanner.close();
    }
}
