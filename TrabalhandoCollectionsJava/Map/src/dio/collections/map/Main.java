package dio.collections.map;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<String, Double> pessoas = new HashMap<>();
        pessoas.put("Epaminondas", 1.85);
        pessoas.put("Alcebíades", 1.73);
        pessoas.put("Leontina", 1.55);
        pessoas.put("Marieta", 1.64);
        pessoas.put("Geraldina", 1.70);

        System.out.println(pessoas);

        //no Mpa caso a chave possua o mesmo valor esta substituirá a anterior
        pessoas.put("Epaminondas", 1.83);

        System.out.println(pessoas.containsKey("Leontina"));

        System.out.println(pessoas.get("Marieta"));

        System.out.println(pessoas.keySet());

        System.out.println(pessoas.values());

        System.out.println(Collections.max(pessoas.values()));

        Double maiorAltura = Collections.max((pessoas.values()));
        //é preciso criar um Map.Entry pois o for não é aplicável ao Map
        Set<Map.Entry<String, Double>> entries = pessoas.entrySet();
        for (Map.Entry<String, Double> entry: entries) {
            if(entry.getValue().equals(maiorAltura))
                System.out.println("Pessoa mais alta: " + entry.getKey());
        }

        Set<Double> alturas = new HashSet<>();
        Double soma = 0d;
        alturas.addAll(pessoas.values());
        for (Double altura : alturas) {
            soma += altura;
        }
        System.out.println(soma);

        Double media = soma/pessoas.size();
        System.out.println(media);

        pessoas.values().removeIf(altura -> altura < 1.60);
        System.out.println(pessoas);

        //LinkedHashMap
        Map<String, Double> pessoas2 = new LinkedHashMap<>();
        pessoas2.put("Leontina", 1.55);
        pessoas2.put("Epaminondas", 1.85);
        pessoas2.put("Geraldina", 1.70);
        pessoas2.put("Marieta", 1.64);
        pessoas2.put("Alcebíades", 1.73);

        System.out.println(pessoas2);

        Map<String, Double> pessoas3 = new TreeMap<>();
        pessoas3.put("Leontina", 1.55);
        pessoas3.put("Epaminondas", 1.85);
        pessoas3.put("Geraldina", 1.70);
        pessoas3.put("Marieta", 1.64);
        pessoas3.put("Alcebíades", 1.73);

        System.out.println(pessoas3);

        pessoas.clear();
        pessoas2.clear();
        pessoas3.clear();

        System.out.println(pessoas.isEmpty());
    }
}
