package br.com.Matriz.Lista06;

import java.util.Scanner;
//3. Maior valor. Ler uma matriz 3x3 de números inteiros e mostrar o maior valor digitado.
//Dica: comece com int maior = m[0][0] e compare com todos os outros.
//Entrada: 4 7 1 9 2 6 3 8 5
//Saída: Maior valor: 9
public class Exercicio03_maior {
    static void main() {

        Scanner sc = new Scanner(System.in);

        int[][] matriz =  new int[3][3];
        int maior = matriz[0][0];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("informe um numero [" + i + "][" + j + "]:");
                matriz[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("maior: " + maior);
    }
}
