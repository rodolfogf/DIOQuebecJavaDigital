/*Crie um conjunto contendo as cores do arco-íris e:
        A. Exiba todas as cores uma abaixo da outra
        B. A quantidade de cores que o arco-íris tem
        C. Exiba as cores em ordem alfabética
        D. Exiba as cores na ordem inversa da que foi informada
        E. Exiba todas as cores que começam com a letra ”v”
        F. Remova todas as cores que não começam com a letra “v”
        G. Limpe o conjunto
        H. Confira se o conjunto está vazio*/

package dio.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Set<Cor> cores = new HashSet<>();

        cores.add(new Cor("vermelho",  new int[]{625, 740}));
        cores.add(new Cor("laranja",  new int[]{590, 625}));
        cores.add(new Cor("amarelo",  new int[]{565, 590}));
        cores.add(new Cor("verde",  new int[]{500, 565}));
        cores.add(new Cor("azul",  new int[]{440, 485}));
        cores.add(new Cor("violeta",  new int[]{380, 440}));

        Iterator<Cor> iterator1 = cores.iterator();
        while(iterator1.hasNext()){
            System.out.println(iterator1.next());
        }

        int qtd_cores = cores.size();
        System.out.println("\nQuantidade de cores no arco-iris: " + qtd_cores + "\n");

        //TreeSet impressao na ordem alfabética baseada no compareTo
        TreeSet<Cor> cores_tree = new TreeSet<>();
        cores_tree.addAll(cores);

        Iterator<Cor> iterator2 = cores_tree.iterator();
        while (iterator2.hasNext()){
            System.out.println(iterator2.next());
        }

        //impressão na ordem inversa usando o método descendingIterator da classe TreeSet
        System.out.println("\n");
        Iterator<Cor> iterator3 = cores_tree.descendingIterator();
        while (iterator3.hasNext()){

            System.out.println(iterator3.next());
        }

        System.out.println("\nCores que começam com 'v':");
        for (Cor cor:cores_tree) {

            if (cor.getNome().startsWith("v")) System.out.println(cor);
        }

        //remoção das cores que não começam com "v"
        Iterator<Cor> iterator4 = cores_tree.iterator();
        while(iterator4.hasNext()){

            if (!iterator4.next().getNome().startsWith("v"))
                iterator4.remove();
        }

        cores_tree.clear();
        System.out.println("\nConjunto vazio: " + cores_tree.isEmpty());

    }
}
