
public class ContaCorrente extends Conta {
	
	private double taxaManutencao = 12.43;

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("\n=== Extrato Conta Corrente ===\n");
		super.imprimirInfoConta();
		System.out.print("\n");
		for (RegistroOperacao r : operacoes) {
			System.out.println(r.toString());
		}
	}	
}
