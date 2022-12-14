package dio.junit.three;

public class Conta {

    private String numeroConta;

    private int saldo;

    public Conta(String numeroConta, int saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void lancaCredito(int valor) {
        this.saldo += valor;
    }

    public void lancaDebito(int valor) {
        this.saldo -= valor;
    }

    public void transferirEntreContas(Conta contaDestino, double valor){
        if (valor <= 0.0){
            throw new IllegalArgumentException("O valor deve ser maior do que zero!");
        }
    }
}