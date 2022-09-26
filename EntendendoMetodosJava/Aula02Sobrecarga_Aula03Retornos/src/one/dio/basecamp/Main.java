package one.dio.basecamp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("\nDigite as medidas do quadrilátero para calcular sua área: ");
        System.out.println("\n-Quadrado: lado\n-Retângulo: lado 1 e lado 2\n-Trapézio: base maior, base menor e altura\n");
        double[] medidas = new double[3];

        for(double medida: medidas){
            medida = 0;
        }

        String answer = "s";
        for (int i=0; i<3; i++){
            System.out.print("Medida: ");
            medidas[i] = ler.nextDouble();
            if (i != 2){

                System.out.print("Adicionar outra medida? (s/n) ");
                answer = ler.next();
            }

            if (answer.equals("n")){
                break;
            }
        }

        double area;

        if (medidas[2] != 0){
            area = Quadrilatero.calcularArea(medidas[0], medidas[1], medidas[2]);
            System.out.println("\nArea do trapézio: " + area);
        }
        else if (medidas[1] != 0){
            area = Quadrilatero.calcularArea(medidas[0], medidas[1]);
            System.out.println("\nArea do retângulo: " + area);
        }
        else{
            area = Quadrilatero.calcularArea(medidas[0]);
            System.out.println("\nArea do quadrado: " + area);
        }
    }
}
