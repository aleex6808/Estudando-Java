package projetoSGC;

import java.util.Scanner;

public class Professor {
	private String nome;
	private String especializacao;
	Scanner entrada = new Scanner(System.in);
	
	public Professor() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecializacao() {
		return especializacao;
	}

	public void setEspecializacao(String especializacao) {
		this.especializacao = especializacao;
	}

	@Override
	public String toString() {
		return "\nNome: " + nome + "\nEspecializacao: " + especializacao;
	}
	
	public void adicionarProfessor() {
		System.out.println("Informe o nome: ");
		this.setNome(entrada.nextLine());
		System.out.println("Informe a especialização: ");
		this.setEspecializacao(entrada.nextLine());
	}
	
	public void removerProfessor() {
		System.out.println("Informe o nome: ");
		this.setNome(entrada.nextLine());
		System.out.println("Informe a especialização: ");
		this.setEspecializacao(entrada.nextLine());
	}
}
