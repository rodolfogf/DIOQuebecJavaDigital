
public class ContaPoupanca extends Conta {

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
}
