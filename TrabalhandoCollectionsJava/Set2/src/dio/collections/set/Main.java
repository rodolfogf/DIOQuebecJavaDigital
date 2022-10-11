package dio.collections.set;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Calendar d1 = Calendar.getInstance();
        d1.set(1990, Calendar.JANUARY, 01);
        Date data1 = d1.getTime();
        Calendar d2 = Calendar.getInstance();
        d2.set(1980, Calendar.FEBRUARY, 02);
        Date data2 = d2.getTime();
        Calendar d3 = Calendar.getInstance();
        d3.set(1970, Calendar.MARCH, 03);
        Date data3 = d3.getTime();

        Set<Pessoa> pessoas = new HashSet<>(){{
        add(new Pessoa("Ayrton", 1.7d, "Masculino", data1));
    }};
        pessoas.add(new Pessoa("Conceicão", 1.5d, "Feminino", data2));
        pessoas.add(new Pessoa("Bartolomeu", 1.85, "Marculino", data3));

        System.out.println(pessoas);

        //linkedhashset
        Set<Pessoa> pessoas2 = new LinkedHashSet<>(){{
            add(new Pessoa("Alcebiades", 1.8d, "Masculino", data1));
        }};
        pessoas2.add(new Pessoa("Cremilda", 1.6d, "Feminino", data2));
        pessoas2.add(new Pessoa("Berenice", 1.55, "Feminino", data3));

        System.out.println(pessoas2);

        //treeset - impressao em ordem baseado no compareTo.
        //nesse caso, a primeira comparação é por nome, e depois data de nascimento
        Set<Pessoa> pessoas3 = new TreeSet<>();
        pessoas3.add(new Pessoa("Cinthia", 1.68, "Feminino", data1));
        pessoas3.add(new Pessoa("Anton", 1.8d, "Masculino", data3));
        pessoas3.add(new Pessoa("Cinthia", 1.7d, "Feminino", data2));

        System.out.println(pessoas3);
    }
}
