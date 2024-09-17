package POO.Exercicios.Exercicio01;

import java.util.ArrayList;

public class Turma {
	private ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	
	public void adicionarAluno(Aluno aluno) {
		alunos.add(aluno);
	}
	
	public void removerAluno(Aluno aluno) {
		alunos.remove(aluno);
	}
	
	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}


}
