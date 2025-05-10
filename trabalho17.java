// VETORES: 3.FAÇA UM PROGRAMA QUE SOME O CONTEUDO DE DOIS VETORES E ARMAZENE O RESULTADO EM UM TERCEIRO VETOR.
package com.mycompany.trabalho17;
public class Trabalho17{
    public static void main(String[] args) {
        // Exemplo de dois vetores
        int[] vetorA = {1, 2, 3, 4, 5};
        int[] vetorB = {5, 4, 3, 2, 1};

        // Verifica se os vetores têm o mesmo tamanho
        if (vetorA.length != vetorB.length) {
            System.out.println("Os vetores devem ter o mesmo tamanho.");
            return;
        }

        // Cria o terceiro vetor para armazenar a soma
        int[] vetorSoma = new int[vetorA.length];

        // Soma os elementos
        for (int i = 0; i < vetorA.length; i++) {
            vetorSoma[i] = vetorA[i] + vetorB[i];
        }

        // Exibe o resultado
        System.out.print("Vetor soma: ");
        for (int valor : vetorSoma) {
            System.out.print(valor + " ");
        }
    }
}

