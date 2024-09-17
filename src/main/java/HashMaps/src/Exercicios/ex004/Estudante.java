package Exercicios.ex004;

public class Estudante {
	private String nome;
	private double nota;

	public Estudante(String nome, double nota) {
		this.nome = nome;
		this.nota = nota;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "Estudante [nome=" + nome + ", nota=" + nota + "]";
	}

}
