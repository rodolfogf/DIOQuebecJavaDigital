package dio.collections.lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<Pergunta> perguntas = new ArrayList<>();
        Scanner ler = new Scanner(System.in);
        perguntas.add(new Pergunta(1, "Telefonou para a vitima"));
        perguntas.add(new Pergunta(2, "Esteve no local do crime"));
        perguntas.add(new Pergunta(3, "Mora perto da vitima"));
        perguntas.add(new Pergunta(4, "Devia dinheiro para a vitima"));
        perguntas.add(new Pergunta(5, "Ja trabalhou com a vitima"));

        System.out.println("\n");
        for (Pergunta p : perguntas) {

            System.out.print(p.getTextoPergunta() + ": ");
            boolean resposta = ler.nextBoolean();
            p.setRespostaPergunta(resposta);
        }

        int classificacao = 0;

        Iterator<Pergunta> iterator = perguntas.iterator();
            while (iterator.hasNext()){

                if (iterator.next().isRespostaPergunta()) classificacao ++;
            }

        System.out.print("\nO interrogatório concluiu que a pessoa é ");
        if (classificacao == 5) System.out.println("assassina");
        else if (classificacao < 5 && classificacao >= 3) System.out.println("cumplice");
        else if (classificacao == 2) System.out.println("suspeita");
        else System.out.println("inocente");

    }

}
