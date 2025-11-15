package associacoes.composicao;

public class Poupanca {
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
