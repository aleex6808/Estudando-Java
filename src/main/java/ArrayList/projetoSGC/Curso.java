package projetoSGC;

import java.util.Scanner;

public class Curso {
	private String nomeCurso;
	private int cargaHoraria;
	private String nomeProfessor;
	Scanner entrada = new Scanner(System.in);
	
	public Curso() {
		
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public String getNomeProfessor() {
		return nomeProfessor;
	}

	public void setNomeProfessor(String nomeProfessor) {
		this.nomeProfessor = nomeProfessor;
	}

	@Override
	public String toString() {
		return "\nCurso:" + nomeCurso + 
				"\nCarga Horaria: " + cargaHoraria + 
				"\nNomeProfessor: " + nomeProfessor;
	}
	
	public void adicionarCurso() {
		System.out.println("Informe o nome do curso: ");
		this.setNomeCurso(entrada.nextLine());
		System.out.println("Informe a carga horária: ");
		this.setCargaHoraria(entrada.nextInt());
		entrada.nextLine();
		System.out.println("Informe o nome do professor responsável: ");
		this.setNomeProfessor(entrada.nextLine());
	}
	
}
