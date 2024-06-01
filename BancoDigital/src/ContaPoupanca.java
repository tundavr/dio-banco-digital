public class ContaPoupanca extends Conta {

	private static int SEQUENCIAL = 1;

	public ContaPoupanca(Cliente cliente) {
		super.agencia = AGENCIA_PADRAO;
		super.numero = SEQUENCIAL ++;
		super.cliente = cliente;
		
	}
	public void imprimirExtrato() {
		System.out.println("===Extrato Conta Poupanca===");
		super.imprimirInfosComuns();
	}
	
	
	
	}