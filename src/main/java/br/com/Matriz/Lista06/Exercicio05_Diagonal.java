package br.com.Matriz.Lista06;

import java.util.Scanner;
//5. Diagonal principal. Ler uma matriz 3x3 de números inteiros e mostrar os elementos da
//diagonal principal, que são as posições em que a linha é igual à coluna: [0][0], [1][1] e [2][2].
//Dica: basta um for usando m[i][i].
//Entrada: 1 2 3 4 5 6 7 8 9
//Saída: Diagonal principal: 1 5 9
public class Exercicio05_Diagonal {
    static void main() {

        Scanner sc = new Scanner(System.in);

        int[][] matriz =  new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("informe um numero [" + i + "][" + j + "]:");
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.print("Diagonal principal: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }
        System.out.println();
    }
}
