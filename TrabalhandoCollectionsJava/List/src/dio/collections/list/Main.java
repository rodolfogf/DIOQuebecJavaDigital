package dio.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Double> valores = new ArrayList<>();
        valores.add(1.4);
        valores.add(2.5);
        valores.add(4.3);
        valores.add(3.2);
        valores.add(7.6);

        System.out.println(valores.toString()); //impressão da lista

        System.out.println(valores.indexOf(3.2d)); //posição do valor 3.2

        valores.add(3, 6.9); //adição do valor 6.9 na posição 3
        System.out.println(valores.toString());

        valores.set(valores.indexOf(6.9), 6.7);
        System.out.println(valores.toString()); //substituição do valor 6.9 pelo valor 6.7

        System.out.println(valores.contains(6.7)); //verificação da existência do valor 6.7

        System.out.println(valores.get(2)); //valor na posição 2

        System.out.println(Collections.min(valores)); // valor mínimo

        System.out.println(Collections.max(valores)); //valor máximo

        Iterator<Double> iterator = valores.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for (double valor: valores) {
            System.out.println(valor);
        }

        System.out.println(valores.size()); //quantidade de elementos

        valores.remove(1.4d); //remoção do item de valor 1.4
        System.out.println(valores.toString());

        valores.remove(3); //remoção do item na poisção 3
        System.out.println(valores.toString());

        System.out.println(valores.isEmpty()); //verifica se a lista é vazia

    }
}
