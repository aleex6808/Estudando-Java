package ArrayList_Teste;
import java.util.ArrayList;

public class Turma {
	private String nomeTurma;
	private ArrayList<Aluno> alunos;
	
	public Turma(String nomeTurma) {
		this.nomeTurma = nomeTurma;
		this.alunos = new ArrayList<Aluno>();
	}
	
	public String getNomeTurma() {
		return nomeTurma;
	}
	
	public void adicionarAluno(Aluno aluno) {
		alunos.add(aluno);
	}
	
	public void removerAluno(Aluno aluno) {
		alunos.remove(aluno);
	}
	
	public void listarAlunos() {
		for (Aluno aluno: alunos) {
			System.out.println(aluno);
		}
	}
	
	public int contarAlunos() {
		return alunos.size();
	}
}
