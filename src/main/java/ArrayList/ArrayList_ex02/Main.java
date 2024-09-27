package ArrayList_ex02;

public class Main {
	public static void main(String[] args) {
		Biblioteca biblioteca = new Biblioteca();
		
		Livro l1 = new Livro("Livro 1", "Autor 1", 2004);
		Livro l2 = new Livro("Livro 2", "Autor 2", 2005);
		
		System.out.println("Livros na estante: ");
		biblioteca.listarLivros();
		
		
	}
}