package associacoes.agregacao;

public class Comprador {
	private float investido;

	public float getVerba() {
		return investido;
	}

	public void setVerba(float investido) {
		this.investido = investido;
	}

	public void compra(){
		System.out.println("Comprado!");
	}
}
