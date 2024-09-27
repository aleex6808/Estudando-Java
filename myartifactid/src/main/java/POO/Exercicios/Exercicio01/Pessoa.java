package POO.Exercicios.Exercicio01;

public class Pessoa {
	private static int contPessoa = 0;
	private String nome;
	private int idade;
	private char genero;
	private Endereco endereco;
	
	public Pessoa() {
		contPessoa++;
	}
	
	public static int getContador() {
		return contPessoa;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setIdade(int idade) {
		if (idade > 0) {
			this.idade = idade;
		} else {
			System.out.println("Idade inválida. Digite um valor positivo.");
		}
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setGenero(char genero) {
		this.genero = genero;
	}
	
	public char getGenero() {
		return genero;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	
	public String toString() {
		return "\nNome: " + nome + "\n Idade: " + idade + "\n Gênero: " + genero;
	}
}
