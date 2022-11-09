package dio.collections.map;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<Pessoa, Double> pessoas = new HashMap<>();

        Calendar c1 = Calendar.getInstance();
        c1.set(1941, Calendar.JANUARY, 01);
        Date d1 = c1.getTime();
        Pessoa p1 = new Pessoa("Eustáquio", d1);

        Calendar c2 = Calendar.getInstance();
        c2.set(1951, Calendar.FEBRUARY, 02);
        Date d2 = c2.getTime();
        Pessoa p2 = new Pessoa("Genoveva", d2);

        Calendar c3 = Calendar.getInstance();
        c3.set(1948, Calendar.MARCH, 03);
        Date d3 = c3.getTime();
        Pessoa p3 = new Pessoa("Agripino", d3);

        pessoas.put(p1, 1.71d);
        pessoas.put(p2, 1.53);
        pessoas.put(p3, 1.79);



    }
}
