package associacoes.composicao;

public class ContaCorrente {
	private float saldo;

	public void saque(double valor){
		saldo -= valor;
		System.out.println("Novo Saldo -> " + saldo);
	}

	public void deposito(double valor){
		saldo += valor;
		System.out.println("Novo Saldo -> " + saldo);
	}
}
