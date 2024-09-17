package POO.Exercicios.Exercicio02;

public class Livro {
	private String titulo;
	private String autor;
	private int ano;
	private boolean disponivel;

	public Livro(String titulo, String autor, int ano) {
		this.titulo = titulo;
		this.autor = autor;
		this.ano = ano;
		this.disponivel = true;
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

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public void emprestarLivro() {
		if (disponivel) {
			disponivel = false;
		} else {
			System.out.println("Livro não está disponível.");
		}
	}

	public void devolverLivro() {
		disponivel = true;
	}

	@Override
	public String toString() {
		String dados = "--------------------" + "\nTítulo: " + titulo + "\nAutor: " + autor + "\nAno: " + ano
				+ "\nDisponível: ";

		if (disponivel == true) {
			dados += "Sim";
		} else {
			dados += "Não \n--------------------";
		}
		return dados;
	}
}
