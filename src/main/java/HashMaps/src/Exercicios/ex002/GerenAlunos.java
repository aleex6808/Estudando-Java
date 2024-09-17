package Exercicios.ex002;

import java.util.HashMap;
import java.util.Map;

public class GerenAlunos {
	private Map<Integer, Aluno> alunos;

	public GerenAlunos() {
		this.alunos = new HashMap<>();
	}
	
	public void adicionarAluno(int matricula, Aluno aluno) {
		alunos.put(matricula, aluno);
	}
	
	public void removerAluno(int matricula) {
		alunos.remove(matricula);
	}
	
	public void buscarAluno(int matricula) {
		Aluno aluno = alunos.getOrDefault(matricula, null);
		
		if(aluno != null) {
			System.out.println("Aluno encontrado: " + aluno);
		} else {
			System.out.println("Aluno não encontrado.");
		}
	}
	
	public void listarAlunos() {
		if (!alunos.isEmpty()) {
			alunos.entrySet()
				.stream()
				.sorted(Map.Entry.comparingByKey())
				.forEach(entrada -> System.out.println("Matricula: " + entrada.getKey() + "\nAluno: " + entrada.getValue()));
		} else {
			System.out.println("Nenhum aluno encontrado.");
		}
	}
	
}
