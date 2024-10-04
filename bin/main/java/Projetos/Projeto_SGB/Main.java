package Projeto_SGB;

import java.util.Scanner;

public class Main {
	
	// Criação da biblioteca e do Scanner
	
	static Biblioteca biblioteca = new Biblioteca();

	private static final Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		int opcao = 0;
		
		while (opcao != 4) { // Enquanto a opcao for diferente de 4 o programa continua rodando
			menuPrincipal(); // Mostra o  menu principal
			opcao = lerOpcao();

			switch (opcao) {
			case 1: // Gerencia livros
				int opcao2 = 0;

				while (opcao2 != 4) {
					menuGerenciar("Livro");
					opcao2 = lerOpcao();

					switch (opcao2) {
					case 1:
						adicionarLivro();
						break;
					case 2:
						removerLivro();
						break;
					case 3:
						listarLivros();
						break;
					case 4:
						System.out.println("Saindo do menu...");
						break;
					default:
						System.out.println("Opção inválida digite novamente.");
						break;
					}
				}
				break;
			case 2: // Gerencia os membros
				int opcao3 = 0;
				
				while(opcao3 != 4) {
					menuGerenciar("Membro");
					opcao3 = lerOpcao();
					switch(opcao3) {
					case 1:
						adicionarMembro();
						break;
					case 2:
						removerMembro();
						break;
					case 3:
						listarMembros();
						break;
					case 4:
						System.out.println("Saindo do menu...");
						break;
					default:
						System.out.println("Opção inválida digite novamente.");
						break;
					}
				}
				break;
			case 3: // Gerencia os empréstimos
				int opcao4 = 0;
				
				while(opcao4 != 4) {
					menuEmprestimo();
					opcao4 = lerOpcao();
					
					switch(opcao4) {
					case 1:
						emprestarLivro();
						break;
					case 2:
						devolverLivro();
						break;
					case 3:
						listarEmprestimos();
						break;
					case 4:
						System.out.println("Saindo do menu...");
						break;
					default:
						System.out.println("Opção inválida digite novamente.");
						break;
					}
				}
				break;
			case 4: // Sai do programa
				System.out.println("Saindo do programa...");
				break;
			default: // Caso uma opção indefinida seja digitada
				System.out.println("Opção inválida digite novamente: ");
				break;
			}
		}
	}

	/* Metódo de adicionar livro: Cria um novo objeto, solicita as informações e atribui
	   elas pro objeto. Adiciona o livro a classe biblioteca */
	
	public static void adicionarLivro() {
		Livro livro = new Livro(null, null, null, 0);

		System.out.print("\nDigite o título do livro: ");
		String titulo = entrada.nextLine();
		livro.setTitulo(titulo);
		

		System.out.print("\nDigite o autor do livro: ");
		String autor = entrada.nextLine();
		livro.setAutor(autor);
		
		System.out.print("\nDigite o código ISBN do livro: ");
		String codigoISBN = entrada.nextLine();
		livro.setCodigoISBN(codigoISBN);
		
		
		System.out.print("\nDigite a quantidade disponível: ");
		int quantidade = entrada.nextInt();
		livro.setQuantidadeDisp(quantidade);;
		entrada.nextLine();
		
		biblioteca.adicionarLivro(livro);
	}

	/* Metódo de remover livro: Solicita o codigoISBN e remove o livro da biblioteca */
	
	public static void removerLivro() {
		System.out.print("Digite o código ISBN do livro que deseja remover: ");
		String codigoISBN = entrada.nextLine();

		biblioteca.removerLivro(codigoISBN);
		
		System.out.println("Livro removido com sucesso.");
	}

	/* Metódo de adicionar membro: Cria um novo objeto, solicita as informações e atribui
	   elas pro objeto. Adiciona o membro a classe biblioteca */
	
	public static void adicionarMembro() {
		Membro membro = new Membro(null, null);

		System.out.print("\nDigite o nome do membro: ");
		String nome = entrada.nextLine();
		membro.setNome(nome);
		
		System.out.print("\nDigite o ID do membro: ");
		String id = entrada.nextLine();
		membro.setIdMembro(id);
		

		biblioteca.adicionarMembro(membro);
	}
	
	/* Metódo de remover livro: Solicita o idMembro e remove o membro da biblioteca */

	public static void removerMembro() {
		System.out.print("\nDigite o id do membro que você deseja remover: ");
		String idMembro = entrada.nextLine();

		biblioteca.removerMembro(idMembro);
		
		System.out.println("Membro removido com sucesso.");
	}
	
	/* Metódo de emprestar livro: Solicita as informações e busca elas em um objeto. 
	   Empresta o livro conforme as informações solicitadas*/

	public static void emprestarLivro() {
		
		System.out.print("\nDigite o id do membro que deseja solicitar o empréstimo: ");
		String idMembro = entrada.nextLine();
		
		
		System.out.print("\nDigite o código ISBN do livro: ");
		String codigoISBN = entrada.nextLine();
		
	

		biblioteca.emprestarLivro(idMembro, codigoISBN);
	}

	/* Metódo de devolver livro: Solicita as informações e busca elas em um objeto. 
	   Devolve o livro conforme as informações solicitadas*/
	
	public static void devolverLivro() {
		System.out.print("\nDigite o id do membro que deseja solicitar a devolução: ");
		String idMembro = entrada.nextLine();
		
		System.out.print("\nDigite o código ISBN do livro: ");
		String codigoISBN = entrada.nextLine();

		biblioteca.devolverLivro(idMembro, codigoISBN);
	}
	
	// Método que lista os livros

	public static void listarLivros() {
		System.out.println("=========================");
		System.out.println("Lista de livros na biblioteca: ");
		biblioteca.listarLivros();
		System.out.println("=========================");
	}

	// Método que lista os membros
	
	public static void listarMembros() {
		System.out.println("=========================");
		System.out.println("Lista de membros cadastrados na biblioteca: ");
		biblioteca.listarMembros();
		System.out.println("=========================");
	}

	// Método que lista os empréstimos
	
	public static void listarEmprestimos() {
		System.out.println("=========================");
		System.out.println("Lista de transações de empréstimos realizadas");
		biblioteca.listarEmprestimo();
		System.out.println("=========================");
	}
	
	// Método que mostra o menu principal

	public static void menuPrincipal() {
		System.out.println("1 - Gerenciar livros: ");
		System.out.println("2 - Gerenciar membros: ");
		System.out.println("3 - Gerenciar emprestimos: ");
		System.out.println("4 - Sair: ");
		System.out.print("Digite aqui: ");
	}
	
	// Método que mostra o menu gerenciar

	public static void menuGerenciar(String tipo) {
		System.out.println("\nGerenciar " + tipo + "s");
		System.out.println("1 - Adicionar " + tipo);
		System.out.println("2 - Remover " + tipo);
		System.out.println("3 - Listar " + tipo + "s");
		System.out.println("4 - Sair");
		System.out.print("Digite aqui: ");
	}
	
	// Método que mostra o menu de empréstimo
	
	public static void menuEmprestimo() {
		System.out.println("\nGerenciar empréstimos: ");
		System.out.println("1 - Emprestar livro: ");
		System.out.println("2 - Devolver livro: ");
		System.out.println("3 - Listar transações de empréstimos: ");
		System.out.println("4 - Sair");
		System.out.print("Digite aqui: ");
	}

	// Método que lê a opção 
	
	public static int lerOpcao() {
		while (!entrada.hasNextInt()) {
			System.out.println("Por favor digite uma opção válida.");
			entrada.next();
		}
		int opcao = entrada.nextInt();
		entrada.nextLine();
		return opcao;
	}
}
