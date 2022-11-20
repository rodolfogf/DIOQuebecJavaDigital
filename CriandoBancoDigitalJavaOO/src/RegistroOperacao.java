import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RegistroOperacao {
	
	public LocalDateTime momentoOperacao;	
	public double valor;
	public Conta contaRelacionada;
	
	public RegistroOperacao(LocalDateTime momentoOperacao, double valor) {
		super();
		this.momentoOperacao = momentoOperacao;
		this.valor = valor;
	}
	
	public RegistroOperacao(LocalDateTime momentoOperacao, double valor, Conta contaRelacionada) {
		super();
		this.momentoOperacao = momentoOperacao;
		this.valor = valor;
		this.contaRelacionada = contaRelacionada;		
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
