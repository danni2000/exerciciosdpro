// STRINGS: 5. ESSCREVA UM PROGRAMA QUE DADO UM VALOR NUMERICO DIGITADO PELO USUARIO (ARMAZENADO EM UMA VARIAVEL INTEIRA),IMPRIMA CADA UM DOS SEUS DIGITOS POR EXTENSO. 
package com.mycompany.trabalho14;
import java.util.Scanner;

public class Trabalho14{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        scanner.close();

        // Vetor com os nomes dos dígitos de 0 a 9
        String[] nomesDigitos = {
            "zero", "um", "dois", "três", "quatro",
            "cinco", "seis", "sete", "oito", "nove"
        };

        // Converte o número para String para facilitar a iteração sobre os dígitos
        String numeroStr = Integer.toString(numero);

        System.out.print("Dígitos por extenso: ");
        for (int i = 0; i < numeroStr.length(); i++) {
            char c = numeroStr.charAt(i);
            if (Character.isDigit(c)) {
                int digito = Character.getNumericValue(c);
                System.out.print(nomesDigitos[digito]);
                if (i < numeroStr.length() - 1) {
                    System.out.print(" ");
                }
            } else {
                System.out.print("Caractere inválido");
            }
        }
        System.out.println();
    }
}
