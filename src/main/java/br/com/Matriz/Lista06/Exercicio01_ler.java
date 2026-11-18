package br.com.Matriz.Lista06;

import java.util.Scanner;
//1. Ler e mostrar. Ler uma matriz 3x3 de números inteiros e mostrar a matriz na tela em
//forma de tabela, uma linha embaixo da outra.
//Entrada: 1 2 3 4 5 6 7 8 9
//Saída: 1 2 3
       //4 5 6
       //7 8 9
public class Exercicio01_ler {
    static void main() {

        Scanner sc = new Scanner(System.in);

        int[][] matriz =  new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("informe um numero [" + i + "][" + j + "]:");
                matriz[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
