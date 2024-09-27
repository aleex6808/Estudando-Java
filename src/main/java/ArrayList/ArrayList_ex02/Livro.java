package ArrayList_ex02;

public class Livro {
	private String titulo;
	private String autor;
	private int anoPublicacao;
	
	public Livro(String titulo, String autor, int anoPublicacao) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
	}

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

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

	@Override
	public String toString() {
		return "\n======================================="
				+ "\nDados do Livro \nTitulo: " + titulo +  
				"\nAutor: " + autor + 
				" \nAno de Publicação: " + anoPublicacao
				+ "\n=======================================";
	}
	
	
}
