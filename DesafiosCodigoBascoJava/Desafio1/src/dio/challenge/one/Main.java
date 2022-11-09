package dio.challenge.one;

public class Main {
    public static void main(String[] args) {
        int[] vetor = {2,3,5,7,11,13,18,34};

        for(int i=0; i<vetor.length ; i++){
            if (vetor[i] % 2 == 0) {
                System.out.println(vetor[i]);
            }
        }
    }

}
