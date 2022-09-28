package dio.collections.lists;

import java.util.Comparator;

public class Pergunta{

    private int numeroPergunta;
    private String textoPergunta;
    private boolean respostaPergunta;

    public Pergunta(int numeroPergunta, String textoPergunta) {
        this.numeroPergunta = numeroPergunta;
        this.textoPergunta = textoPergunta;
    }

    public int getNumeroPergunta() {
        return numeroPergunta;
    }

    public void setNumeroPergunta(int numeroPergunta) {
        this.numeroPergunta = numeroPergunta;
    }

    public String getTextoPergunta() {
        return textoPergunta;
    }

    public void setTextoPergunta(String textoPergunta) {
        this.textoPergunta = textoPergunta;
    }

    public boolean isRespostaPergunta() {
        return respostaPergunta;
    }

    public void setRespostaPergunta(boolean respostaPergunta) {
        this.respostaPergunta = respostaPergunta;
    }

    @Override
    public String toString() {
        return "Interrogatorio{" +
                "numeroPergunta=" + numeroPergunta +
                ", textoPergunta='" + textoPergunta + '\'' +
                ", respostaPergunta=" + respostaPergunta +
                '}';
    }
}

class ComparatorRespostaPergunta implements Comparator<Pergunta>{

    @Override
    public int compare(Pergunta p1, Pergunta p2) {
        return Boolean.compare(p1.isRespostaPergunta(), p2.isRespostaPergunta());
    }
}
