package Exemplos.Exemplo1;

import java.util.HashMap;
import java.util.Map;

public class alunosID {
	public static void main(String[] args) {
		GerenciadorAlunos gerenciador = new GerenciadorAlunos();
		gerenciador.adicionarAluno(1, new Aluno("João", 20));
		gerenciador.adicionarAluno(2, new Aluno("Maria", 22));
		gerenciador.listarAlunos();
		
		System.out.println("Aluno com ID 1: " + gerenciador.obterAluno(1));
		gerenciador.removerAluno(1);
		gerenciador.listarAlunos();
	}
}
