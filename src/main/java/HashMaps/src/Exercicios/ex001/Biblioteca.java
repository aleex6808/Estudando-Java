package Exercicios.ex001;

import java.util.HashMap;
import java.util.Map;

public class Biblioteca {
	private Map<String, Livro> livros;

	public Biblioteca() {
		this.livros = new HashMap<>();
	}
	
	public void adicionarLivro(String ISBN, Livro livro) {
		livros.put(ISBN, livro);
	}
	
	public void removerLivro(String ISBN) {
		livros.remove(ISBN);
	}
	
	public void buscarLivro(String ISBN) {
		Livro livro = livros.getOrDefault(ISBN, null);
		if (livro!= null) {
			System.out.println("Livro encontrado: " + livro);
		} else {
			System.out.println("Livro não encontrado.");
		}
		
	}
	
	public void listarLivros() {
		if (livros.size() > 0) {
			for (Map.Entry<String, Livro> entrada : livros.entrySet()) {
				
				System.out.println("ISBN: " + entrada.getKey() + "Livro: " + entrada.getValue());
			}
		} else {
			System.out.println("Nenhum livro encontrado.");
		}
	}
}
