package projetoSGC;

import java.util.Scanner;

public class Main {
	private static final Scanner entrada = new Scanner(System.in);
	private static final Alunos alunos = new Alunos();
	private static final Professores professores = new Professores();
	private static final Cursos cursos = new Cursos();
	
	public static void main(String[] args) {
		
		int opcao = 0;

		while (opcao != 5) {
			mostrarMenuPrincipal();
			opcao = lerOpcao();
			
			switch (opcao) {
			case 1:
				gerenciarProfessores();
				break;
			case 2:
				gerenciarAlunos();
				break;
			case 3:
				gerenciarCursos();
				break;
			case 4:
				buscar();
				break;
			case 5:
				System.out.println("Saindo...");
				break;
			default:
				System.out.println("Opção inválida. Tente novamente.");
				break;
			}
		}
	}
	
	private static void mostrarMenuPrincipal() {
		System.out.println("Menu: ");
		System.out.println("1 - Gerenciar professores");
		System.out.println("2 - Gerenciar Aluno");
		System.out.println("3 - Gerenciar Curso");
		System.out.println("4 - Buscar");
		System.out.println("5 - Sair");
		System.out.println("Digite aqui: ");
	}
	
	private static int lerOpcao() {
		while(!entrada.hasNextInt()) {
			System.out.println("Por favor, insira um número válido.");
			entrada.next();
		}
		return entrada.nextInt();
	}
	
	private static void gerenciarProfessores() {
		int opcao = 0;
		while (opcao != 4) {
			mostrarMenuGerenciar("professores");
			opcao = lerOpcao();
			
			switch(opcao) {
			case 1:
				Professor professor = new Professor();
				professor.adicionarProfessor();
				professores.adicionarProfessor(professor);
				break;
			case 2:
				professores.removerProfessor();
				break;
			case 3:
				professores.listarProfessores();
				break;
			case 4:
				System.out.println("Saindo do menu de gerenciar professores...");
				break;
			default:
				System.out.println("Opção inválida. Tente novamente.");
				break;
			}
		}
	}
	
	private static void gerenciarAlunos() {
		int opcao = 0;
		while (opcao != 4) {
			mostrarMenuGerenciar("alunos");
			opcao = lerOpcao();
			
			switch (opcao) {
			case 1:
				Aluno aluno = new Aluno();
				aluno.adicionarAluno();
				alunos.adicionarAluno(aluno);
				break;
			case 2:
				alunos.removerAluno();
				break;
			case 3:
				alunos.listarAlunos();
				break;
			case 4:
				System.out.println("Saindo do menu de gerenciar alunos...");
				break;
			default:
				System.out.println("Opção inválida. Tente novamente.");
				break;
			}
		}
	}
	
	private static void gerenciarCursos() {
		int opcao = 0;
		while (opcao != 4) {
			mostrarMenuGerenciar("cursos");
			opcao = lerOpcao();
			
			switch (opcao) {
			case 1:
				Curso curso = new Curso();
				curso.adicionarCurso();
				cursos.adicionarCurso(curso);
				break;
			case 2:
				cursos.removerCurso();
				break;
			case 3:
				cursos.listarCursos();
				break;
			case 4:
				System.out.println("Saindo do menu de gerenciar cursos...");
				break;
			default:
				System.out.println("Opção inválida. Tente novamente");
				break;
			}
		}
	}
	
	private static void buscar() {
		int opcao = 0;
		while (opcao != 4) {
			System.out.println("\nBuscar");
			System.out.println("1 - Buscar curso por nome");
			System.out.println("2 - Buscar alunos por matrícula");
			System.out.println("3 - Buscar professores por especialização");
			System.out.println("4 - Sair");
			System.out.println("Digite aqui: ");
			opcao = lerOpcao();
			
			switch (opcao) {
			case 1:
				cursos.buscarCursos();
				break;
			case 2:
				alunos.buscarAlunos();
				break;
			case 3:
				professores.buscarProfessores();
				break;
			case 4:
				System.out.println("Saindo do menu de busca...");
				break;
			default:
				System.out.println("Opção inválida. Tente novamente.");
				break;
			}
		}
	}
	
	private static void mostrarMenuGerenciar(String tipo) {
		System.out.println("\nGerenciat " + tipo);
		System.out.println("1 - Adicionar " + tipo.substring(0, tipo.length() - 1));
		System.out.println("2 - Remover " + tipo.substring(0, tipo.length() - 1));
		System.out.println("3 - Listar " + tipo);
		System.out.println("4 - Sair");
		System.out.println("Digite aqui: ");
	}
}
