package one.dio.basecamp;

import java.text.NumberFormat;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.print(saudacao());
        System.out.print("Valor do empréstímo: ");
        double valor_emprestimo = ler.nextDouble();
        System.out.print("\nNúmero de parcelas: ");
        int num_parcelas = ler.nextInt();
        double valor_final_emprestimo = calcularValorEmprestimo(valor_emprestimo, num_parcelas);
        System.out.println("Valor final do empréstimo: " + NumberFormat.getCurrencyInstance().format(valor_final_emprestimo));
    }

    private static double soma(double a, double b){

        return a + b;
    }

    private static double subtracao(double a, double b){

        return a-b;
    }

    private static double multiplicacao(double a, double b){

        return a*b;
    }

    private static double divisao(double a, double b){

        return a/b;
    }

    private static String saudacao(){

        int hora = LocalTime.now().getHour();
        if (hora > 0 && hora < 12){
            return "\nBom dia!\n";
        }
        else if (hora > 12 && hora < 18){
            return "\nBoa tarde!\n";
        }
        else
            return "\nBoa noite!\n";
    }

    private static double calcularValorEmprestimo(double valor, int numero_parcelas){

        double taxa = 0.10;
        double valor_final;

        if (numero_parcelas < 6){

            valor_final = Math.pow(soma(1, taxa), numero_parcelas) * valor;
        }
        else if(numero_parcelas > 6 && numero_parcelas < 12){

            taxa = 0.15;
            valor_final = Math.pow(soma(1, taxa), numero_parcelas) * valor;
        }
        else {
            taxa = 0.2;
            valor_final = Math.pow(soma(1, taxa), numero_parcelas) * valor;
        }

        return valor_final;
    }
}
