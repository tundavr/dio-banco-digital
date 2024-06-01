public class Conta implements IBanco {

	protected static final int AGENCIA_PADRAO = 0001;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	
	
	@Override
	public void sacar(double valor) {
		saldo = saldo - valor;
		
	}

	
	
	
	@Override
	public void depositar(double valor) {
		saldo = saldo + valor;
		
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
		
	}

	public int getAgencia() {
		return agencia;
	}

	
	

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}


	protected void imprimirInfosComuns () {
		
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero Conta: %d", this.numero));
		System.out.println(String.format("Titular Conta: %s", this.cliente.getNome()));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}

	@Override
	public void imprimirExtrato() {
		// TODO Auto-generated method stub
		
	}

	
	
	
	
}
