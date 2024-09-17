package Exercicios.ex001;

public class Livro {
	// Atributos
	private String titulo;
	private String autor;
	
	// Método Construtor
	public Livro(String titulo, String autor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
	}

	// Métodos Getters & Setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	
	// Método toString
	@Override
	public String toString() {
		return "\n----------------------------"
				+ "\nDados do Livro \nTitulo: " + titulo 
				+ "\nAutor: " + autor + 
				"\n----------------------------";
	}

}
