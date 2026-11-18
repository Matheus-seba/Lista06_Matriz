package br.com.Matriz.Lista06;

import java.util.Scanner;
//2. Soma de todos. Ler uma matriz 3x3 de números inteiros e mostrar a soma de todos os
//elementos.
//Dica: crie int soma = 0 antes dos for e vá somando cada m[i][j].
//Entrada: 1 2 3 4 5 6 7 8 9
//Saída: Soma: 45
public class Exercicio02_soma {
    static void main() {

        Scanner sc = new Scanner(System.in);

        int[][] matriz =  new int[3][3];
        int soma = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("informe um numero [" + i + "][" + j + "]:");
                matriz[i][j] = sc.nextInt();
                soma += matriz[i][j];
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("A soma da matriz: " + soma);
    }
}
