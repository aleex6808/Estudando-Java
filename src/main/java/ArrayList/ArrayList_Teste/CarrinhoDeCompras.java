package ArrayList_Teste;

import java.util.ArrayList;

public class CarrinhoDeCompras {
	private ArrayList<Produto> produtos;

	public CarrinhoDeCompras() {
		this.produtos = new ArrayList<Produto>();
	}

	public ArrayList<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(ArrayList<Produto> produtos) {
		this.produtos = produtos;
	}
	
	public void adicionarProduto(Produto produto) {
		produtos.add(produto);
	}
	
	public void removerProduto(Produto produto) {
		produtos.remove(produto);
	}
	
	public void exibirProdutos() {
		for (Produto produto : produtos) {
			System.out.println(produto);
		}
	}
	
	public double calcularTotal() {
		double total = 0;
		for (Produto produto : produtos) {
			total += produto.getPreco();
		}
		return total;
	}
}
