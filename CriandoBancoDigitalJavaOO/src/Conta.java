import java.time.LocalDateTime;
import java.util.*;
import java.util.Random;

public abstract class Conta implements IConta {
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	protected String agencia;
	protected String numero;
	protected double saldo;
	public Cliente cliente;
	protected List<RegistroOperacao> operacoes = new ArrayList<RegistroOperacao>();

	public Conta(Cliente cliente) {
		
		String zeros = "";
		if (SEQUENCIAL < 10) {
			zeros = "0000";			
		}
		else if (SEQUENCIAL >= 10 && SEQUENCIAL < 100) {
			zeros = "000";
		}
		else if (SEQUENCIAL >= 100 && SEQUENCIAL < 1000) {
			zeros = "00";
		}
		else if (SEQUENCIAL >= 1000 && SEQUENCIAL < 10000) {
			zeros = "0";
		}
		Random gerador = new Random();
		int digito = gerador.nextInt(10);
		
		this.agencia = "0000" + String.valueOf(Conta.AGENCIA_PADRAO) ;
		this.numero = zeros + String.valueOf(SEQUENCIAL++) + "-" + digito;
		this.cliente = cliente;
		this.saldo = 0; //ao ser instanciada, toda conta começará com saldo 0
	}

	public void sacar(double valor) {
		saldo -= valor;
		
		RegistroOperacao registro = new RegistroOperacao(LocalDateTime.now(), -valor);
		operacoes.add(registro);
		
	}

	public void depositar(double valor) {
		saldo += valor;
				
		RegistroOperacao registro = new RegistroOperacao(LocalDateTime.now(), valor);
		operacoes.add(registro);
	}

	public void transferir(double valor, Conta contaDestino) {
		saldo -= valor;
		contaDestino.saldo += valor;
		
		RegistroOperacao registro = new RegistroOperacao(LocalDateTime.now(), -valor, contaDestino);
		operacoes.add(registro);
		
		RegistroOperacao registroContaDestino = new RegistroOperacao(LocalDateTime.now(), valor, this);		
		contaDestino.operacoes.add(registroContaDestino);
	}
	
	public String getCliente() {
		return cliente.getNome();
	}

	public String getAgencia() {
		return agencia;
	}

	public String getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	protected void imprimirInfoConta() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %s", this.agencia));
		System.out.println(String.format("Numero: %s", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}

	public void imprimirExtrato() {		
		
	}	
	
}
