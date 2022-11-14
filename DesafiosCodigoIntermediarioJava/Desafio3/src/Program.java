/*Desafio
Dado um inteiro positivo num, retorne o número de inteiros positivos menor ou igual
a num cuja soma de dígitos é par. A soma dos dígitos de um inteiro positivo é a
soma de todos os seus dígitos.

Entrada
Como entrada você recerá um valor inteiro e positivo.

Saída
Como saída, será impresso a soma de todos os numeros inteiros positivos menores
ou iguais ao num, como nos exemplos a baixo:*/

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        int num = Integer.parseInt(new Scanner(System.in).nextLine());
        int cont = 0;

        for (int i=1; i <= num; i++){
            String numToStr = String.valueOf(i);
            char[] strToChar = numToStr.toCharArray();

            int soma = 0;
            for (char c: strToChar) {
                int cint = c;
                soma += cint;
            }
            if (soma % 2 == 0) cont++;
        }

        System.out.println(cont);

    }
}