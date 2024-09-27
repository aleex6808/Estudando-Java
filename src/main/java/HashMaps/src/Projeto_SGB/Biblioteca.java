package Projeto_SGB;

<<<<<<< HEAD
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

=======
>>>>>>> 990e138cee44e4a19cc36469159d77557b9cdea9
// Importa as bibliotecas

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Biblioteca {
	// Declaração dos Maps
	
	private Map<String, Livro> livros;
	private Map<String, Membro> membros;
	private Map<String, Emprestimo> emprestimos;
	Scanner entrada = new Scanner(System.in);

	// Criação das Hashmaps e atribuição no método construtor
	
	public Biblioteca() {
		this.livros = new HashMap<String, Livro>();
		this.membros = new HashMap<String, Membro>();
		this.emprestimos = new HashMap<String, Emprestimo>();
	}

	// Método de adicionar livro
	
	public void adicionarLivro(Livro livro) {
<<<<<<< HEAD
		

		String sql = "INSERT INTO livros (titulo, autor, codigoISBN, quantidadeDisp) VALUES (?, ?, ? ,?) ;" ;
		
		try (Connection con = ConexaoDB.getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql)) {
			
				pstmt.setString(1, livro.getTitulo());
				pstmt.setString(2, livro.getAutor());
				pstmt.setString(3, livro.getCodigoISBN());
				pstmt.setInt(4, livro.getQuantidadeDisp());
				
				pstmt.executeUpdate();
				
				livros.put(livro.getCodigoISBN(), livro); // Adiciona o livro ao Hashmap de livros
				
				System.out.println("\nLivro " + livro.getTitulo() + " adicionado com sucesso! ");
			} catch (SQLException e) {
				System.out.println("Erro ao inserir o usuário: ");
				e.printStackTrace();
			}
	}

	// Método de remover o livro
	
	public void removerLivro(String codigoISBN) {
		
		String sql = "DELETE FROM livros WHERE codigoISBN = ?" ;
		
		try(Connection con = ConexaoDB.getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql)) {
			
				pstmt.setString(1, codigoISBN);
				
				pstmt.executeUpdate(); // Remove o livro no Banco de Dados
				
				livros.remove(codigoISBN);  // Remove o livro do Hashmap de livros
				
				System.out.println("Livro removido com sucesso!!");
		} catch (SQLException e) {
			System.out.println("Erro ao remover livro...");
			e.printStackTrace();
		}
		
=======
		livros.put(livro.getCodigoISBN(), livro); // Adiciona o livro ao Hashmap de livros

		System.out.println("\nLivro " + livro.getTitulo() + " adicionado com sucesso! ");
	}

	// Método de remoover o livro
	
	public void removerLivro(String codigoISBN) {
		livros.remove(codigoISBN);  // Remove o livro do Hashmap de livros
>>>>>>> 990e138cee44e4a19cc36469159d77557b9cdea9
	}

	// Método de listar o livro
	
	public void listarLivros() {
<<<<<<< HEAD
		String sql = "SELECT titulo, autor, codigoISBN, quantidadeDisp FROM livros" ;
		
		try (Connection con = ConexaoDB.getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery()) {
			
			while (rs.next()) {
				String titulo = rs.getString("titulo");
				String autor = rs.getString("autor");
				String codigoISBN = rs.getString("codigoISBN");
				int quantidadeDisp = rs.getInt("quantidadeDisp");
				
				System.out.printf(" Título: %s \n Autor: %s \n ISBN: %s \n Quantidade: %d%n",
						titulo, autor, codigoISBN, quantidadeDisp);
			}
		} catch (SQLException e) {
			System.out.println("Erro ao listar os livros.");
			e.printStackTrace();
		}
		
=======
		if (!livros.isEmpty()) { // Caso a Hashmap de livros NÃO esteja vazia
			for (Map.Entry<String, Livro> entrada : livros.entrySet()) { // Itera sobre o set de livros
				System.out.println(entrada.getValue()); // Mostra os livros
			}
		} else { // Caso esteja vazia
			System.out.println("Nenhum livro encontrado."); 
		}
>>>>>>> 990e138cee44e4a19cc36469159d77557b9cdea9
	}

	// Método de adicionar membro
	
	public void adicionarMembro(Membro membro) {
<<<<<<< HEAD
	
		membros.put(membro.getIdMembro(), membro); // Adiciona o membro ao Hashmap de membros
	
=======

		membros.put(membro.getIdMembro(), membro); // Adiciona o membro ao Hashmap de membros

>>>>>>> 990e138cee44e4a19cc36469159d77557b9cdea9
		System.out.println("\nMembro " + membro.getNome() + " adicionado com sucesso! "); 
	}

	// Método de remover membro
	
	public void removerMembro(String idMembro) {
		membros.remove(idMembro); // Remove o membro do Hashmap de membros
	}

	// Método de listar membros
	
	public void listarMembros() {
		if (!membros.isEmpty()) { // Caso a lista de membros NÃO esteja vazia
			for (Map.Entry<String, Membro> entrada : membros.entrySet()) { // Itera sobre o set de membros
				System.out.println(entrada.getValue()); // Mostra os membros
			}
		} else {
			System.out.println("Nenhum membro encontrado.");
		}
	}

	// Método de emprestar livro
	
	public void emprestarLivro(String idMembro, String codigoISBN) {
		System.out.println("Digite a data do empréstimo: "); // Solicita a data de empréstimo
		
		String dataEmprestimo = entrada.nextLine(); // Recebe a data de empréstimo

		// Caso o livro contenha a chave do codigoISBN do livro E tenha livros disponíveis
		if (livros.containsKey(codigoISBN) && livros.get(codigoISBN).getQuantidadeDisp() > 0) { 

			if (membros.get(idMembro).getLivrosEmprestados() < 3) { // Caso o membro possua até 3 livros emprestados

				Emprestimo emprestimo = new Emprestimo(idMembro, codigoISBN, dataEmprestimo); // Cria um novo empréstimo
				emprestimos.put(emprestimo.getId(), emprestimo); // Adiciona o novo empréstimo ao dicionário

				// Imprime uma mensagem de sucesso
				System.out.println("Membro: " + membros.get(idMembro).getNome() + "(ID:" + idMembro + ")"
						+ " pegou emprestado o livro: " + " '' " + livros.get(emprestimo.getCodigo()).getTitulo()
						+ " '' " + "(ISBN: " + livros.get(emprestimo.getCodigo()).getCodigoISBN() + ").");

				// Atualiza a quantidade de livros emprestados pro membro e quantidade de livros disponíveis em + 1
				membros.get(idMembro).setLivrosEmprestados(membros.get(idMembro).getLivrosEmprestados() + 1);
				livros.get(codigoISBN).setQuantidadeDisp(livros.get(codigoISBN).getQuantidadeDisp() - 1);

			} else { // Caso o membro possua mais de 3 livros emprestados
				System.out.println("Número máximo de empréstimos por membro atingido.");
			}
		} else { // Caso o livro não contenha a chave do codigoISBN E não tenha livros disponíveis
			System.out.println("Não há livros disponíveis na biblioteca.");
		}

	}

	// Método devolver livro
	
	public void devolverLivro(String idMembro, String codigoISBN) {
		
		Emprestimo emprestimoEncontrado = null; // Cria uma variável do tipo empréstimo e adiciona o valor null
		
		for(Emprestimo emprestimo : emprestimos.values()) { // Cria uma variável empréstimo e itera sobre a Hashmap de empréstimos
			
			//Caso o código do livro emprestado seja igual ao código buscado E o id do membro que pegou emprestado seja igual ao id buscado
			if (emprestimo.getCodigo().equals(codigoISBN) && emprestimo.getIdMembro().equals(idMembro)) { 
				emprestimoEncontrado = emprestimo; // Atribui o emprestimo encontrado pra váriavel emprestimoEncontrado
				break;
			}
		}
		
		if (emprestimoEncontrado == null) { // Caso o empréstimo não seja encontrado
			System.out.println("Nenhum empréstimo encontrado para o código ISBN e membro informados.");
	        return;
		}
		
		
		// Caso no empréstimo a data de devolução esteja como "Emprestado"
		if (emprestimoEncontrado.getDataDevolucao().equals("Emprestado")) {
			
			// Solicita e atribui a data de devolução para o empréstimo
			System.out.println("Digite a data da devolução: ");
			String dataDevolucao = entrada.nextLine();

			emprestimoEncontrado.setDataDevolucao(dataDevolucao);
			
			// Cria uma variável do tipo Membro e atribui o membro do id buscado 
			Membro membro = membros.get(idMembro);
			
			// Decrementa o número de livros emprestados do membro buscado
			membro.setLivrosEmprestados(membro.getLivrosEmprestados() - 1); 
			
			// Cria uma variável do tipo Livro e atribui o livro do codigoISBN buscado 
			Livro livro = livros.get(codigoISBN);
			
			// Incrementa o número de livros disponíveis 
			livro.setQuantidadeDisp(livro.getQuantidadeDisp() + 1);

			System.out.println("Livro devolvido com sucesso."); 
		} else { // Caso no empréstimo a data de devolução não esteja como "Emprestado"
			System.out.println("Não foi possível devolver o livro.");
		}
	}


	// Método de listar empréstimo
	
	public void listarEmprestimo() {
		if (!emprestimos.isEmpty()) { // Caso a Hashmaps de empréstimos NÃO esteja vazia 
			for (Map.Entry<String, Emprestimo> entrada : emprestimos.entrySet()) {  // Itera sobre a Hashmap de emprestimos
				System.out.println(entrada.getValue()); // Mostra os empréstimos
			}
		} else { // Caso esteja vazia
			System.out.println("Nenhum empréstimo encontrado.");
		}
	}

}
