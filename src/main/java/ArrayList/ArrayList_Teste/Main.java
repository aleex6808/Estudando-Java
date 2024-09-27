package ArrayList_Teste;

public class Main {
	public static void main(String[] args) {
		Turma turma = new Turma("Turma 1");
		
		Aluno aluno1 = new Aluno("João", 20);
		Aluno aluno2 = new Aluno("Maria", 22);
		
		turma.adicionarAluno(aluno1);
		turma.adicionarAluno(aluno2);
		
		System.out.println("Alunos da " + turma.getNomeTurma() + ":" );
		turma.listarAlunos();
		
		System.out.println("Total de alunos: " + turma.contarAlunos());
		
		turma.removerAluno(aluno1);
		System.out.println("\n Após remover João:");
		turma.listarAlunos();
	}
}
