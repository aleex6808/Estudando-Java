package POO.Exercicios.Exercicio02;

public class Main {
	public static void main(String[] args) {
		Biblioteca biblioteca = new Biblioteca();
		
		Livro livro1 = new Livro("Sociedade do cansaço","Byung-Chul Han", 2015);
		Livro livro2 = new Livro("O Senhor dos anéis","J.R.R Tolkien", 1954);
		
		Usuario usuario1 = new Usuario("Alice", 30, "U001");
		Usuario usuario2 = new Usuario("Alice", 25, "U002");
		
		biblioteca.adicionarLivro(livro1);
		biblioteca.adicionarLivro(livro2);
		
		biblioteca.adicionarUsuario(usuario1);
		biblioteca.adicionarUsuario(usuario2);
		
		System.out.println("Lista de Livros:");
		biblioteca.listarLivros();
		
		System.out.println("\nLista de Usuários:");
		biblioteca.listarUsuarios();
		
		System.out.println("\nEmprestando Livro:");
		biblioteca.emprestarLivro("U001", "Sociedade do cansaço");
		
		System.out.println("\nLista de livros após o empréstimo");
		biblioteca.listarLivros();
		
		System.out.println("\nDevolvendo Livro:");
		biblioteca.devolverLivro("Sociedade do cansaço");
		
		System.out.println("\nLista de livros após devolução: ");
		biblioteca.listarLivros();
	}
}
