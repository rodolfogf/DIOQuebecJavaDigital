
public class Main {

	public static void main(String[] args) {
		Cliente epaminondas = new Cliente();
		epaminondas.setNome("Epaminondas Martins");
		
		Cliente alcebiades = new Cliente();
		alcebiades.setNome("Alcebiades Souza");
		
		Conta c1 = new ContaCorrente(epaminondas);
		Conta p1 = new ContaPoupanca(epaminondas);
		
		Conta c2 = new ContaCorrente(alcebiades);
		
		c1.depositar(100);
		c1.transferir(50, p1);
		
		c1.transferir(25, c2);
		
		p1.aplicarRendimento();
		
		c1.imprimirExtrato();
		p1.imprimirExtrato();
		c2.imprimirExtrato();		
	}

}
