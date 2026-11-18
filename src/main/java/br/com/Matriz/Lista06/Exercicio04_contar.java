package br.com.Matriz.Lista06;

import java.util.Scanner;
//4. Contar pares. Ler uma matriz 2x3 (2 linhas e 3 colunas) de números inteiros e mostrar
//quantos números pares foram digitados.
//Dica: número par é aquele em que m[i][j] % 2 == 0.
//Entrada: 4 7 10 3 8 5
//Saída: Quantidade de pares: 3
public class Exercicio04_contar {
    static void main() {

        Scanner sc = new Scanner(System.in);

        int[][] matriz =  new int[2][3];
        int contador = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("informe um numero [" + i + "][" + j + "]:");
                matriz[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if ((matriz[i][j] % 2) == 0) {
                    contador++;
                }
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("a quantidade de numeros pares é: " + contador);
    }
}
