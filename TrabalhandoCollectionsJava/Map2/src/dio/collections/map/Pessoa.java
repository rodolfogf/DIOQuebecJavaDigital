package dio.collections.map;

import java.util.Date;
import java.util.Objects;

public class Pessoa {
    private String nome;
    private Date dataNascimento;

    public Pessoa(String nome, Date dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
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

    @Override
    public String toString() {
        return "dio.collections.map.Pessoa{" +
                "nome='" + nome +
                ", dataNascimento=" + dataNascimento +
                '}';
    }

    @Override
    public boolean equals(Object p) {
        if (this == p) return true;
        if (!(p instanceof Pessoa)) return false;
        Pessoa pessoa = (Pessoa) p;
        return nome.equals(pessoa.nome) && dataNascimento.equals(pessoa.dataNascimento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, dataNascimento);
    }


}
