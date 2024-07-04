package DesafioProjeto;

public class Main {

	public static void main(String[] args) {
		Cliente Fernando = new Cliente();
		Fernando.setNome("Fernando");
		Fernando.setSobrenome("Santos");
		
		
		Conta cc = new ContaCorrente(Fernando);
		Conta poupanca = new ContaPoupanca(Fernando);

		cc.depositar(200);
		cc.transferir(120, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}