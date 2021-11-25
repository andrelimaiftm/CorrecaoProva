package q2;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) throws Exception {
        int[][] matriz = new int[5][5];
        Scanner texto = new Scanner(System.in);
        int somaDiagP = 0;
        int somaSemDiag = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.printf("\nDigite um numero para Matriz[%d][%d]: ", i + 1, j + 1);
                matriz[i][j] = texto.nextInt();
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i == j) {
                    somaDiagP += matriz[i][j];
                } else if (((i + j) + 1) != (matriz.length + 1)) {
                    somaSemDiag += matriz[i][j];
                }
                System.out.print(" " + matriz[i][j]);
            }
            System.out.println();
        }
        System.out.printf("\nSoma dos valores da diagonal Principal: %d", somaDiagP);
        System.out.printf("\nSoma dos valores que não pertence a nenhuma das diagonais: %d", somaSemDiag);
        System.out.printf("\nDiferença entre os valores é: %d", somaSemDiag - somaDiagP);
    }
}
