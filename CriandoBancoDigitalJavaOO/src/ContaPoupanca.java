
public class ContaPoupanca extends Conta {
	
	double taxaRendimento = 0.005d;

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("\n=== Extrato Conta Poupança ===\n");
		super.imprimirInfoConta();
		System.out.print("\n");
		for (RegistroOperacao r : operacoes) {
			System.out.println(r.toString());
		}
	}
	
	public void teste() {
		
	}
	
	public void aplicarRendimento(){
		
		double saldoRentavel = saldo;
		double valorNaoRentavel = 0.0d;
		
		for (RegistroOperacao ro : operacoes) {
			
			if (ro.getMeses() < 0 && ro.valor > 0) {
				saldoRentavel -= ro.valor;
				valorNaoRentavel += ro.valor;
			}			
		}
		
		saldo = saldoRentavel*(1+taxaRendimento) + valorNaoRentavel;		
	}
}
