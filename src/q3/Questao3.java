package q3;

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {

        int[] vetor = new int[10];
        Scanner texto = new Scanner(System.in);

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("vetor[%d]: ", i + 1);
            vetor[i] = texto.nextInt();
        }

        System.out.println("Os valores repetidos são: ");
        for (int i = 0; i < vetor.length; i++) {
            for (int j = i + 1; j < vetor.length; j++) {
                
                if (vetor[i] == vetor[j]) {
                    System.out.println(vetor[i]);
                }
            }
        }

    }

}
