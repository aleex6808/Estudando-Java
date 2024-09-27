package Exercicios.ex001;

public class Main {
	public static void main(String[] args) {
		Biblioteca biblioteca = new Biblioteca();
		
		Livro l1 = new Livro("O Príncipe", "Nicolau Maquiavel");
		Livro l2 = new Livro("O Contrato Social ", "Jean-Jacques Rousseau");
		
		biblioteca.adicionarLivro("978-3-16-148410-0", l1);
		biblioteca.adicionarLivro("978-2-02-395781-5", l2);
		
		biblioteca.listarLivros();
		
		System.out.println();
		System.out.println("---------REMOVENDO O LIVRO-----------");
		
		biblioteca.removerLivro("978-2-02-395781-5");
		
		biblioteca.listarLivros();
		
		System.out.println();
		System.out.println("-----BUSCANDO O LIVRO----------");
		
		biblioteca.buscarLivro("978-3-16-148410-0");
		
		
	}
}
