package dio.collections.list;

import java.util.Comparator;
import java.util.Date;

public class RegistroTemperatura implements Comparable<RegistroTemperatura>{

    private String mes;
    private int ano;
    private double temperatura;

    public RegistroTemperatura(String mes, int ano, double temperatura) {
        this.mes = mes;
        this.ano = ano;
        this.temperatura = temperatura;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public String toString() {
        return "RegistroTemperatura{" +
                "mes='" + mes + '\'' +
                ", ano=" + ano +
                ", temperatura=" + temperatura +
                '}';
    }

    @Override
    public int compareTo(RegistroTemperatura temperatura) {
        return this.compareTo(temperatura);
    }

    class ComparatorTemperatura implements Comparator<RegistroTemperatura>{

        @Override
        public int compare(RegistroTemperatura t1, RegistroTemperatura t2) {
            return Double.compare(t1.getTemperatura(), t2.getTemperatura());
        }
    }
}
