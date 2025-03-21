/*
Projeto: Sistema de Gerenciamento de Tarefas
Descrição
Crie um sistema de gerenciamento de tarefas simples em Java que permita ao usuário adicionar, visualizar, atualizar e excluir tarefas. Este projeto irá ajudá-lo a aplicar conceitos de variáveis, tipos de dados, operadores, estruturas de controle, funções/métodos, listas/arrays e manipulação de strings.

Funcionalidades
Adicionar Tarefa: O usuário pode adicionar uma nova tarefa com um título e uma descrição.
Visualizar Tarefas: O usuário pode visualizar todas as tarefas cadastradas.
Atualizar Tarefa: O usuário pode atualizar o título e/ou descrição de uma tarefa existente.
Excluir Tarefa: O usuário pode excluir uma tarefa.
Buscar Tarefa: O usuário pode buscar uma tarefa pelo título.
//Lembre de colocar mensagens ao usuário do resultado das ações feitas
Estrutura do Projeto
Classe Principal (GerenciadorDeTarefas.java):

Contém o método main e o loop principal do menu.
Chama métodos de outras classes para realizar as operações.
Classe SGT (SGT.java):

Representa uma tarefa com atributos titulo e descricao.
Métodos getter e setter para acessar e modificar os atributos.
Classe ManipuladorDeTarefas (ManipuladorDeTarefas.java):

Contém métodos para adicionar, visualizar, atualizar, excluir e buscar tarefas.
Armazena as tarefas em uma lista (array list).
*/

package Projetos;

import java.util.Scanner;

class SGT {

	public static int TAM = 10;
	public static int contTarefas;
	public static int i;
	public static Scanner entrada = new Scanner(System.in);
	public static String[] tarefa = new String[TAM], descricao = new String[TAM];

	public static void main(String[] args) {

		int opcao = 0;

		while (opcao != 7) {
			menu();
			opcao = entrada.nextInt();
			entrada.nextLine();
			switch (opcao) {
			case 1:
				AdicionarTarefa(tarefa, descricao);
				break;
			case 2:
				VisualizarTarefa(tarefa, descricao);
				break;
			case 3:
				AtualizarTarefa(tarefa, descricao);
				break;

			case 4:
				ExcluirTarefa(tarefa, descricao);
				break;

			case 5:
				BuscarTarefa(tarefa, descricao);
				break;

			case 6:
				BubbleSort(tarefa);
				BubbleSort(descricao);

				VisualizarTarefa(tarefa,descricao);
				
				break;

			case 7:
				System.out.println("\n--- Fim do programa!! ---\n");
				break;

			default:
				System.out.println("Opcão inválida");
				break;
			}

		}
		entrada.close();
	}

	public static void menu() {
		System.out.println("\n--- Sistema de Gerenciamento de Tarefas ---\n");
		System.out.println(" 1 - Adicionar Tarefa ");
		System.out.println(" 2 - Visualizar Tarefa(s) ");
		System.out.println(" 3 - Atualizar Tarefa ");
		System.out.println(" 4 - Excluir Tarefa ");
		System.out.println(" 5 - Buscar Tarefa ");
		System.out.println(" 6 - Ordenar Alfabeticamente a lista ");
		System.out.println(" 7 - Sair");
		System.out.print("\n Digite aqui: ");
	}

	public static void AdicionarTarefa(String[] tarefa, String[] descricao) {

		System.out.print("\nDigite o título da tarefa: ");
		tarefa[i] = entrada.nextLine();
		if (tarefa[i] != null && tarefa[i].equals("")) {
			System.out.println("\nErro!! Campo vazio..\n");
		} else {
			contTarefas++;
		}
		System.out.print("\nDigite a descrição da tarefa: ");
		descricao[i] = entrada.nextLine();
		if (descricao[i] != null && descricao[i].equals("")) {
			System.out.println("\nErro!! Campo vazio..\n");
		}
		
		System.out.print("\nTarefa adicionada com sucesso!");
		i++;
	}

	public static void VisualizarTarefa(String[] tarefa, String[] descricao) {
		System.out.println("-----------------------------------------");
		if (contTarefas != 0) {
			for (i = 0; i < contTarefas; i++) {
				if (tarefa[i] != null && tarefa[i].equals("0")) {

				} else {
					System.out.println("\nTarefa " + (i + 1) + ": " + tarefa[i] + "");
					System.out.println("Descrição " + (i + 1) + ": " + descricao[i] + "\n");
				}
			}
		} else {
			System.out.println("--- Lista Vazia ---");
		}
		System.out.println("-----------------------------------------");
	}

	public static void AtualizarTarefa(String[] tarefa, String[] descricao) {
		int opcao2 = 0, atualizar = 0;
		String novoTitulo, novaDescricao;
		System.out.println("\n1 - Atualizar o título ");
		System.out.println("2 - Atualizar a descrição ");

		System.out.print("\nEscolha uma das opções acima: ");
		opcao2 = entrada.nextInt();

		System.out.print("\nDigite o número da tarefa que deseja atualizar: ");
		atualizar = entrada.nextInt();
		entrada.nextLine();

		switch (opcao2) {

		case 1:
			System.out.print("\nDigite o novo título da tarefa: ");
			novoTitulo = entrada.nextLine();

			tarefa[atualizar - 1] = novoTitulo;
			break;

		case 2:
			System.out.print("\nDigite a nova descrição da tarefa: ");
			novaDescricao = entrada.nextLine();

			descricao[atualizar - 1] = novaDescricao;
		default:
			System.out.println("Opcão inválida");
			break;
		}
		System.out.print("\nTarefa atualizada com sucesso!");
	}

	public static void ExcluirTarefa(String[] tarefa, String[] descricao) {
		int excluir;
		System.out.print("\nDigite o número da tarefa que deseja excluir: ");
		excluir = entrada.nextInt();
		entrada.nextLine();

		tarefa[excluir - 1] = "0";
		descricao[excluir - 1] = "0";
		System.out.print("\nTarefa excluída com sucesso!");
		contTarefas--;
	}

	public static void BubbleSort(String[] var) {
		String aux;
		for (i = 0; i < contTarefas; i++) {
			for (int j = 0; j < (contTarefas - 1); j++) {
				if (tarefa[j].compareTo(tarefa[j + 1]) > 0) {
					aux = tarefa[j];
					tarefa[j] = tarefa[j + 1];
					tarefa[j + 1] = aux;
				}
			}
		}
	}
	public static void BuscarTarefa(String[] tarefa, String[]descricao) {
		System.out.println("Digite o título da tarefa que deseja buscar: ");
		String buscar = entrada.nextLine();
		System.out.println("\n-----------------------------------------");
		for (i = 0; i < contTarefas; i++) {
			if (buscar.equalsIgnoreCase(tarefa[i])) {
				System.out.println("\nTarefa " + (i + 1) + ": " + tarefa[i] + "");
				System.out.println("Descrição " + (i + 1) + ": " + descricao[i] + "\n");
			}
		}
		System.out.println("-----------------------------------------\n");
	}
}