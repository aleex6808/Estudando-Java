package Exercicios.ex003;

import java.util.HashMap;
import java.util.Map;

public class Estoque {
	private Map<String, Produto> estoque;

	public Estoque() {
		this.estoque = new HashMap<>();
	}
	
	public void adicionarProduto(String codigo, Produto produto) {
		estoque.put(codigo, produto);
	}
	
	public void removerProduto(String codigo) {
		estoque.remove(codigo);
	}
	
	public Produto buscarProduto(String codigo) {
		return estoque.get(codigo);
	}
	
	public void listarProdutos() {
		if (!estoque.isEmpty()) {
			estoque.entrySet()
			.stream()
			.sorted(Map.Entry.comparingByKey())
			.forEach(entrada -> System.out.println("Código: " + entrada.getKey() + "\nProduto: " + entrada.getValue()));
		} else {
			System.out.println("Nenhum produto encontrado.");
		}
	}
}
