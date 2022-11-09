package dio.challenge.three;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int t = leitor.nextInt();

// TODO: Implemente uma condição onde possamos preencher o vetor de N.
// Lembre-se a sequência de valores é de 0 até T-1:
        int[] vetor = new int[1000];

        for(int i=0 ; i<1000 ; i++){
            int x = i % t;
            vetor[i] = x;
            System.out.println("N[" + i  + "] = "+ x);
        }
    }
}