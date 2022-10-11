package dio.collections.set;

import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.Objects;

public class Pessoa implements Comparable<Pessoa>{

    private String nome;
    private double altura;
    private String genero;
    private Date dataNascimento;

    public Pessoa(String nome, double altura, String genero, Date dataNascimento) {
        this.nome = nome;
        this.altura = altura;
        this.genero = genero;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", altura=" + altura +
                ", genero='" + genero + '\'' +
                ", dataNascimento=" + sdf.format(dataNascimento) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return nome.equals(pessoa.nome) && dataNascimento.equals(pessoa.dataNascimento) && Double.compare(pessoa.altura, altura) == 0 && genero.equals(pessoa.genero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, altura, genero, dataNascimento);
    }

    @Override
    public int compareTo(Pessoa p) {

        int nome = this.getNome().compareTo(p.getNome());
        if(nome != 0) return nome;

        return this.getDataNascimento().compareTo(p.dataNascimento);
    }
}

class ComparatorNomeDataNascimento implements Comparator<Pessoa>{

    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        int nome = p1.getNome().compareTo(p2.getNome());
        if (nome !=0) return nome;

        int dataNasc = p1.getDataNascimento().compareTo(p2.getDataNascimento());
        return dataNasc;
    }
}
