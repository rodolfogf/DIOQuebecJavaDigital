package dio.junit.one;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Pessoa {

    private String nome;
    private LocalDate nascimento;

    public Pessoa(String nome, LocalDate nascimento) {
        this.nome = nome;
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getNascimento() {return nascimento;}

    public void setNascimento(LocalDate nascimento) {this.nascimento = nascimento;}

    public int getIdade(){return (int) ChronoUnit.YEARS.between(this.nascimento, LocalDate.now());
    }
}
