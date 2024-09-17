package projetoSGC;

import java.util.Scanner;

public class Aluno {
	private String nomeAluno;
	private int matricula;
	private String curso;
	Scanner entrada = new Scanner(System.in);
	
	public Aluno() {
		
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "\nAluno: " + nomeAluno +
				"\nMatricula: " + matricula + 
				"\nCurso: " + curso;
	}
	
	public void adicionarAluno() {
		System.out.println("Informe o nome: ");
		this.setNomeAluno(entrada.nextLine());
		System.out.println("Informe a matrícula: ");
		this.setMatricula(entrada.nextInt());
		entrada.nextLine();
		System.out.println("Informe o curso: ");
		this.setCurso(entrada.nextLine());
	}
}
