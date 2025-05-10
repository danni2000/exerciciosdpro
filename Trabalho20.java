// MATEIZES: 2. DADA A SEGUINTE MATRIZ, CALCULE:
// 1. A SOMA DOS ELEMENTOS DA PRIMEIRA COLUNA; 2. O PROUTO DOS ELEMENTOS DA PRIMEIRA LIINHA; 3. A SOMA DE TODOS OS ELEMENTOS; 4. 0 PRODUTO DA DIAGONAL PRINCIPAL.
package com.mycompany.trabalho20;
public class Trabalho20 {
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int somaPrimeiraColuna = 0;
        int produtoPrimeiraLinha = 1;
        int somaTotal = 0;
        int produtoDiagonalPrincipal = 1;

        int linhas = matriz.length;
        int colunas = matriz[0].length;

        for (int i = 0; i < linhas; i++) {
            somaPrimeiraColuna += matriz[i][0]; // primeira coluna
            for (int j = 0; j < colunas; j++) {
                somaTotal += matriz[i][j];
            }
        }

        for (int j = 0; j < colunas; j++) {
            produtoPrimeiraLinha *= matriz[0][j]; // primeira linha
        }

        for (int i = 0; i < linhas; i++) {
            produtoDiagonalPrincipal *= matriz[i][i]; // diagonal principal
        }

        System.out.println("1. Soma da primeira coluna: " + somaPrimeiraColuna);
        System.out.println("2. Produto da primeira linha: " + produtoPrimeiraLinha);
        System.out.println("3. Soma de todos os elementos: " + somaTotal);
        System.out.println("4. Produto da diagonal principal: " + produtoDiagonalPrincipal);
    }
}

