package projetoSGC;

import java.util.ArrayList;
import java.util.Scanner;

public class Alunos {
	private ArrayList<Aluno> alunos;
	Scanner entrada = new Scanner(System.in);

	
	public Alunos() {
		this.alunos = new ArrayList<Aluno>();
	}
	
	public void adicionarAluno(Aluno Aluno) {
		alunos.add(Aluno);
	}
	
	public void removerAluno() {
		if(alunos.size() > 0) {
			System.out.println("Lista de alunos: ");
			listarAlunos();
			
			System.out.println("Digite o nome do aluno que deseja remover: ");
			String nomeRemover = entrada.nextLine();
			
			boolean encontrado = false;
			Aluno alunoParaRemover = null;
			for (Aluno aluno : alunos) {
				if (aluno.getNomeAluno().equalsIgnoreCase(nomeRemover)) {
					alunoParaRemover = aluno;
					encontrado = true;
					break;
				}
			}
			if (encontrado) {
				alunos.remove(alunoParaRemover);
				System.out.println("Aluno removido com sucesso!!");
			} else {
				System.out.println("Aluno não encontrado");
			}
		} else {
			System.out.println("Nenhum aluno cadastrado.");
		}
	}
	
	public void listarAlunos() {
		if (alunos.size() > 0) {
			System.out.println("Digite o nome do curso para listar os alunos matriculados: ");
			String nomeCurso = entrada.nextLine();
			
			boolean encontrado = false;
			for (Aluno aluno : alunos) {
				if(aluno.getCurso().equalsIgnoreCase(nomeCurso)) {
					System.out.println(aluno);
					encontrado = true;
				}
				
			} 
			
			if (!encontrado) {
				System.out.println("Nenhum aluno encontrado no curso " + nomeCurso);
			}
		} else {
			System.out.println("Nenhum aluno cadastrado.");
		}
	}
	
	public void buscarAlunos() {
		System.out.println("Digite a matricula do aluno que deseja buscar: ");
		int matricula = entrada.nextInt();
		entrada.nextLine();
		
		boolean encontrado = false;
		for (Aluno aluno : alunos) {
			if(aluno.getMatricula() == matricula) {
				System.out.println(aluno);
				encontrado = true;
				break;
			} 
			
			if(!encontrado) {
				System.out.println("Aluno não encontrado.");
			}
		}
	}
}
