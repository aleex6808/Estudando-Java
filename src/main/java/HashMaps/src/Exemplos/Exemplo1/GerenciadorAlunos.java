package Exemplos.Exemplo1;

import java.util.HashMap;
import java.util.Map;

public class GerenciadorAlunos {
	private Map<Integer, Aluno> alunosMap;
	
	public GerenciadorAlunos() {
		alunosMap = new HashMap<>();
	}
	
	public void adicionarAluno(int id, Aluno aluno) {
		alunosMap.put(id, aluno);
	}
	
	public Aluno obterAluno(int id) {
		return alunosMap.get(id);
	}
	
	public void removerAluno(int id) {
		alunosMap.remove(id);
	}
	
	public void listarAlunos() {
		for (Map.Entry<Integer, Aluno> entry : alunosMap.entrySet()) {
			System.out.println("ID: " + entry.getKey() + ", Aluno: " + entry.getValue());
		}
	}
}
