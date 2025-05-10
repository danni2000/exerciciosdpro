// FUNÇAO: 6. CRIE UMA FUNÇAO QUE RETORNE VERDADEIRO OU FALSO SE O NUMERO PASSADO É PRIMO OU NÃO.
package com.mycompany.trabalho22;
public class Trabalho22 {

    public static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int numero = 17;
        System.out.println("O número " + numero + " é primo? " + ehPrimo(numero));
    }
}

