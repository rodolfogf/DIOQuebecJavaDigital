package dio.collections.set;

import java.util.Arrays;
import java.util.Objects;

public class Cor implements Comparable<Cor>{

    private String nome;
    private int[] espectro;

    public Cor(String nome, int[] espectro) {
        this.nome = nome;
        this.espectro = espectro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getEspectro() {
        return espectro;
    }

    public void setEspectro(int[] espectro) {
        this.espectro = espectro;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cor)) return false;
        Cor cor = (Cor) o;
        return Objects.equals(nome, cor.nome) && Arrays.equals(espectro, cor.espectro);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(nome);
        result = 31 * result + Arrays.hashCode(espectro);
        return result;
    }

    @Override
    public String toString() {
        return "cor: " + nome +
                ", espectro: " + Arrays.toString(espectro);
    }

    @Override
    public int compareTo(Cor c) {

        return this.getNome().compareTo(c.nome);
    }

    /*@Override
    public int compareTo(Cor c) {

        int nome = this.getNome().compareTo(c.getNome());
        if(nome !=0) return nome;

        return this.getEspectro()[0];

        Como não há cores com mesmo nome e espectro diferentes, não há necessidade da compração de espectro
    }*/
}
