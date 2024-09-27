package Exercicios.ex003;

public class Produto {
	private String nome;
	private int quantidade;

	public Produto(String nome, int quantidade) {
		super();
		this.nome = nome;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "produto [nome=" + nome + ", quantidade=" + quantidade + "]";
	}

}
