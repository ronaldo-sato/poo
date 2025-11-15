package associacoes.composicao;

public class Banco {
	private Poupanca[] pops;
	private  ContaCorrente[] cc;
	private  int numConta, numPoupanca;
	
	public void iniciaBanco(){
		pops = new Poupanca[100];
		cc = new ContaCorrente[100];
		numConta = 1;
		numPoupanca = 1;
	}
	
	public void abreConta(){
		cc[numConta] = new ContaCorrente();
		numConta++;
	}
	
	public void abrePoupanca(){
		pops[numPoupanca] = new Poupanca();
		numPoupanca++;
	}
}
