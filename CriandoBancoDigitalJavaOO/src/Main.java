
public class Main {

	public static void main(String[] args) {
		Cliente epaminondas = new Cliente();
		epaminondas.setNome("Epaminondas Martins");
		
		Conta cc = new ContaCorrente(epaminondas);
		Conta poupanca = new ContaPoupanca(epaminondas);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();		
		
	}

}
