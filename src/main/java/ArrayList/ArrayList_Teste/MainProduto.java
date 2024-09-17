package ArrayList_Teste;

public class MainProduto {
	public static void main(String[] args) {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		Produto p1 = new Produto("Celular", 1200.00);
		Produto p2 = new Produto("Fone de Ouvido", 150.00);
		
		carrinho.adicionarProduto(p1);
		carrinho.adicionarProduto(p2);
		
		System.out.println("Produtos no carrinho:");
		carrinho.exibirProdutos();
		
		System.out.println("Total: R$ " + carrinho.calcularTotal());
	}
}
