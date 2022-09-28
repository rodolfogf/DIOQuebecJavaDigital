package dio.collections.list;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<RegistroTemperatura> registrosTemperaturas = new ArrayList<>();

        registrosTemperaturas.add(new RegistroTemperatura("janeiro", 2022, 25.4));
        registrosTemperaturas.add(new RegistroTemperatura("fevereiro", 2022, 28.8));
        registrosTemperaturas.add(new RegistroTemperatura("março", 2022, 24.1));
        registrosTemperaturas.add(new RegistroTemperatura("abril", 2022, 22.8));
        registrosTemperaturas.add(new RegistroTemperatura("junho", 2022, 21.5));
        registrosTemperaturas.add(new RegistroTemperatura("julho", 2022, 21.1));

        double soma = 0.0d;
        double media = 0.0d;
        for (RegistroTemperatura registro: registrosTemperaturas ) {

            soma += registro.getTemperatura();
            media = soma/registrosTemperaturas.size();
        }

        System.out.println("\nMédia das temperaturas: " + String.format("%.2f", media));

        System.out.println("\nMeses em que a temperatura foi superior à media semestral:");
        for (RegistroTemperatura registro: registrosTemperaturas ) {

            if (registro.getTemperatura() > media) System.out.println(registro.getMes());
        }

    }
}
