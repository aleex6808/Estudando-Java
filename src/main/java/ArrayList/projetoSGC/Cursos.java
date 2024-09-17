package projetoSGC;

import java.util.ArrayList;
import java.util.Scanner;

public class Cursos {
	private ArrayList<Curso> cursos;
	Scanner entrada = new Scanner(System.in);
	public Cursos() {
		this.cursos = new ArrayList<Curso>();
	}
	
	public void adicionarCurso(Curso curso) {
		cursos.add(curso);
	}
	
	public void removerCurso() {
		if(cursos.size() > 0) {
			System.out.println("Lista de Cursos: ");
			listarCursos();
			
			System.out.println("Digite o nome do curso que deseja remover: ");
			String nomeRemover = entrada.nextLine();
			
			boolean encontrado = false;
			Curso cursoParaRemover = null;
			for (Curso curso : cursos) {
				if (curso.getNomeCurso().equalsIgnoreCase(nomeRemover)) {
					cursoParaRemover = curso;
					encontrado = true;
					break;
				}
			}
			if (encontrado) {
				cursos.remove(cursoParaRemover);
				System.out.println("Curso removido com sucesso!!");
			} else {
				System.out.println("Curso não encontrado");
			}
		} else {
			System.out.println("Nenhum curso cadastrado.");
		}
	}
	
	public void listarCursos() {
		if (cursos.size() > 0) {
			for (Curso curso : cursos) {
				System.out.println(curso);
			}
		}
	}
	
	public void buscarCursos() {
		System.out.println("Digite o nome do curso que deseja buscar: ");
		String nomeCurso = entrada.nextLine();
		for (Curso curso : cursos) {
			if(curso.getNomeCurso().equalsIgnoreCase(nomeCurso)) {
				System.out.println(curso);
			} else {
				System.out.println("Curso não encontrado.");
			}
		}
	}
}
