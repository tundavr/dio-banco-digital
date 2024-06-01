public class ContaCorrente  extends Conta{

	private static int SEQUENCIAL = 0001;

	public ContaCorrente(Cliente cliente) {
		super.agencia = AGENCIA_PADRAO;
		super.numero = SEQUENCIAL ++;
		super.cliente = cliente;
	}
	public void imprimirExtrato() {
		System.out.println("===Extrato Conta Corrente===");
		super.imprimirInfosComuns();
	}
}
