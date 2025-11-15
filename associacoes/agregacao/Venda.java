package associacoes.agregacao;

public class Venda {
	private Comprador comprador;
	private Vendedor vendedor;
	private Produto produto;

	public void realizaVenda(){
		System.out.println("Venda Efetuada!");
		comprador.setVerba(comprador.getVerba() - produto.getPreco());
		venda.setComissao(venda.getComissao() + (produto.getPreco() * 0.1f));
        System.out.println("Valor da Comissao:");
        System.out.println(venda.getComissao());
		produto.vendido();
	}
	
	public void cancelaVenda(){
		System.out.println("Venda cancelada!");
	}
}