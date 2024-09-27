package Projeto_SGB;

public class Membro {
	// Atributos
	
	private String nome;
	private String IdMembro;
	private int livrosEmprestados;

	// Método construtor
	
	public Membro(String nome, String idMembro) {
		super();
		this.nome = nome;
		IdMembro = idMembro;
		this.livrosEmprestados = 0;
	}
	
	// Métodos Getters & Setters

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdMembro() {
		return IdMembro;
	}

	public void setIdMembro(String idMembro) {
		IdMembro = idMembro;
	}

	public int getLivrosEmprestados() {
		return livrosEmprestados;
	}

	public void setLivrosEmprestados(int livrosEmprestados) {
		this.livrosEmprestados = livrosEmprestados;
	}
	
	// Método toString()
	
	@Override
	public String toString() {
		return "\n------------------------\n"
				+ "Nome: " + nome + "\nId: " + IdMembro  
				+ "\nLivros emprestados: " + livrosEmprestados
				+ "\n------------------------\n";
	}

	
	
	

}
