/*Esta classe foi criada para registrar cada operação feita, seu valor e as conta envolvidas quando este for o caso, 
 * para que tais operações fosse exibidas no extrato. Além disso, também serve para auxiliar no cálculo do rendimento da poupança, 
 * uma vez que a depender do tempo em que o valor foi adicionado na conta, fará ou não parte do cálculo de rendimentos.
A princípio seria um método da classe "Conta" apenas. Porém, percebeu-se que sendo um classe, suas funções seriam desempenhadas 
da melhor forma no contexto do desafio.*/

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class RegistroOperacao {
	
	public LocalDateTime momentoOperacao;	
	public double valor;
	public Conta contaRelacionada;
	
	public RegistroOperacao(LocalDateTime momentoOperacao, double valor) {
		super();
		this.momentoOperacao = momentoOperacao;
		this.valor = valor;
	}
	
	//sobrecarga do construtor para quando houver outra conta envolvida na operação
	public RegistroOperacao(LocalDateTime momentoOperacao, double valor, Conta contaRelacionada) {
		super();
		this.momentoOperacao = momentoOperacao;
		this.valor = valor;
		this.contaRelacionada = contaRelacionada;		
	}
	
	public int getMeses() {
		return (int) ChronoUnit.MONTHS.between(this.momentoOperacao, LocalDateTime.now());
	}

	@Override
	public String toString() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");		
		
		if (contaRelacionada != null) {
			return momentoOperacao.format(formatter) + " " + 
					valor + " " + 				
					contaRelacionada.cliente.getNome() + " " +
					contaRelacionada.getAgencia() + " " +
					contaRelacionada.getNumero();
		}else {
			return momentoOperacao.format(formatter) + " " +  valor + "\n";
		}				
	}	
}
