package dio.collections.list;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Pessoa> pessoas = new ArrayList<>();

        Calendar d1 = Calendar.getInstance();
        d1.set(1989, Calendar.JANUARY, 01);
        Date data1 = d1.getTime();
        Pessoa p1 = new Pessoa("Antonio", data1, 1.75d);
        pessoas.add(p1);

        Calendar d2 = Calendar.getInstance();
        d2.set(1995, Calendar.MARCH, 03);
        Date data2 = d2.getTime();
        Pessoa p2 = new Pessoa("Clovis", data2, 1.68d);
        pessoas.add(p2);

        Calendar d3 = Calendar.getInstance();
        d3.set(2000, Calendar.FEBRUARY, 02);
        Date data3 = d3.getTime();
        Pessoa p3 = new Pessoa("Benjamin", data3, 1.83d);
        pessoas.add(p3);

        System.out.println(pessoas);

        Collections.sort(pessoas);
        System.out.println(pessoas); //ordenação pelo nome

        pessoas.sort(new ComparatorAltura()); //ordenação pela altura
//        Collections.sort(pessoas, new ComparatorAltura());
        System.out.println(pessoas);

//        pessoas.sort(new ComparatorDataNascimento());
        Collections.sort(pessoas, new ComparatorDataNascimento()); //ordenação pela data de nascimento
        System.out.println(pessoas);

//        pessoas.sort(new ComparatorNomeAlturaDataNasc()); //ordenação por nome, altura e depois por data de nascimento
        Collections.sort(pessoas, new ComparatorNomeAlturaDataNasc());
        System.out.println(pessoas);
    }
}
