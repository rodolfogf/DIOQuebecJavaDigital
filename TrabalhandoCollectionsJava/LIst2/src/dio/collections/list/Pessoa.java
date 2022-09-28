package dio.collections.list;

import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

public class Pessoa implements Comparable<Pessoa>{

    private String nome;
    private Date dataNascimento;
    private double altura;

    public Pessoa(String nome, Date dataNascimento, double altura) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", dataNascimento=" + sdf.format(dataNascimento) +
                ", altura=" + altura +
                '}';
    }

    @Override
    public int compareTo(Pessoa pessoa) {
        return this.getNome().compareToIgnoreCase(pessoa.getNome());
    }
}

class ComparatorNome implements Comparator<Pessoa>{

    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return p1.getNome().compareToIgnoreCase(p2.getNome());
    }
}

class ComparatorAltura implements Comparator<Pessoa>{

    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return Double.compare(p1.getAltura(), p2.getAltura());
    }
}

class ComparatorDataNascimento implements Comparator<Pessoa>{

    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return p1.getDataNascimento().compareTo(p2.getDataNascimento()); //Um Date possui nativamente um método de comparação
    }
}

class ComparatorNomeAlturaDataNasc implements Comparator<Pessoa>{

    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        int nome = p1.getNome().compareToIgnoreCase(p2.getNome());
        if (nome != 0) return nome;

        int altura = Double.compare(p1.getAltura(), p2.getAltura());
        if (altura != 0) return altura;

        return p1.getDataNascimento().compareTo(p2.getDataNascimento());
    }
}
