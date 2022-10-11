package dio.collections.set;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Set<Double> valores = new HashSet<>(Arrays.asList(2d, 3d, 3.5, 5d, 7d, 6d, 4.3));
        System.out.println(valores.toString());

        System.out.println(valores.contains(7d));

        System.out.println(Collections.min(valores));

        System.out.println(Collections.max(valores));

        Iterator<Double> iterator = valores.iterator();
        Double soma = 0d;
        while (iterator.hasNext()){

            soma += iterator.next();
        }
        System.out.println(soma);

        double media = soma/valores.size();
        System.out.println(media);

        valores.remove(5d);
        System.out.println(valores.toString());

        Iterator<Double> iterator2 = valores.iterator();
        while(iterator2.hasNext()){

            if (iterator2.next() > 5d) iterator2.remove();
        }

        System.out.println(valores.toString());

        Set<Double> valores2 = new LinkedHashSet<>();
        valores2.add(1d);
        valores2.add(3d);
        valores2.add(2.5);
        valores2.add(5.4);
        valores2.add(4.8);

        System.out.println(valores2);

        Set<Double> valores3 = new TreeSet<>(valores2);
        System.out.println(valores3); // A ipressão será na ordem crescente

        valores.clear();
        System.out.println(valores.isEmpty());

        valores2.clear();
        System.out.println(valores2.isEmpty());
    }
}
