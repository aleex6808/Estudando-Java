package Projeto_SGB;

public class Livro {
	// Atributos
	
	private String titulo;
	private String autor;
	private String codigoISBN;
	private int quantidadeDisp;

	// Método construtor
	
	public Livro(String titulo, String autor, String codigoISBN, int quantidadeDisp) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.codigoISBN = codigoISBN;
		this.quantidadeDisp = quantidadeDisp;
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

	public String getCodigoISBN() {
		return codigoISBN;
	}

	public void setCodigoISBN(String codigoISBN) {
		this.codigoISBN = codigoISBN;
	}

	public int getQuantidadeDisp() {
		return quantidadeDisp;
	}

	public void setQuantidadeDisp(int quantidadeDisp) {
		this.quantidadeDisp = quantidadeDisp;
	}

	// Método toString()
	
	@Override
	public String toString() {
		return "\n------------------------\n"
				+ "\nTitulo: " + titulo + 
				"\nAutor: " + autor + 
				"\nCódigo ISBN: " + codigoISBN + 
				"\nQuantidade Disponível: " + quantidadeDisp + 
				"\n------------------------\n";
	}

}
