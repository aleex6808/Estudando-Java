package ArrayList_ex02;

import java.util.ArrayList;

public class Biblioteca {
	private ArrayList<Livro> estante;

	public Biblioteca() {
		this.estante = new ArrayList<Livro>();
	}

	public void adicionarLivro(Livro livro) {
		estante.add(livro);
	}

	public void removerLivro(Livro livro) {
		if (estante.contains(livro)) {
			estante.remove(livro);
			System.out.println("Livro removido: " + livro.getTitulo());
		} else {
			System.out.println("Livro não encontrado na estante.");
		}
	}

	public void listarLivros() {
		if (estante.size() > 0) {
			for (Livro livro : estante) {
				System.out.println(livro);
			} 
		} else {
			System.out.println("A estante está vazia.");
		}
	}

}
