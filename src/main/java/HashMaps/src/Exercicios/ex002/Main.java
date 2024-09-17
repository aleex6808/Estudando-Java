package Exercicios.ex002;

public class Main {
	public static void main(String[] args) {
		GerenAlunos gerenAlunos = new GerenAlunos();
		
		Aluno a1 = new Aluno("João", 2023001);
		Aluno a2 = new Aluno("John" , 2023002);
		Aluno a3 = new Aluno("Manuel", 2023003);
		Aluno a4 = new Aluno("Jack", 2023004);
		
		gerenAlunos.adicionarAluno(2023001, a1);
		gerenAlunos.adicionarAluno(2023002, a2);
		gerenAlunos.adicionarAluno(2023003, a3);
		gerenAlunos.adicionarAluno(2023004, a4);
		
		
		System.out.println("--------------------------"); 
		gerenAlunos.listarAlunos();
		
		System.out.println("\n--------------Buscando---------");
		gerenAlunos.buscarAluno(2023003);
		
		gerenAlunos.removerAluno(2023002);
		
		System.out.println("\n--------------Listando após remover---------");
		gerenAlunos.listarAlunos();
	}
	
	
	
}
