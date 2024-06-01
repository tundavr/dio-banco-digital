public class Rum {

	public static void main (String [] args) {
		
		Cliente nomeCliente = new Cliente();
		nomeCliente.setNome("carlos");
		
		
		Conta cc = new ContaCorrente(nomeCliente);
		cc.depositar(200);
		
		
		Conta cp = new ContaPoupanca(nomeCliente);
		
		cc.transferir(100, cp);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
	}
}
