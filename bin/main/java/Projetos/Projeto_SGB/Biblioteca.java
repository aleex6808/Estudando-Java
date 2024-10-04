package Projeto_SGB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

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

		String sql = "INSERT INTO livros (titulo, autor, codigoISBN, quantidadeDisp) VALUES (?, ?, ? ,?) ;";

		try (Connection con = ConexaoDB.getConnection(); PreparedStatement pstmt = con.prepareStatement(sql)) {

			pstmt.setString(1, livro.getTitulo());
			pstmt.setString(2, livro.getAutor());
			pstmt.setString(3, livro.getCodigoISBN());
			pstmt.setInt(4, livro.getQuantidadeDisp());

			pstmt.executeUpdate(); // Adiciona o livro ao banco de dados

			livros.put(livro.getCodigoISBN(), livro); // Adiciona o livro ao Hashmap de livros

			System.out.println("\nLivro " + livro.getTitulo() + " adicionado com sucesso! ");
		} catch (SQLException e) {
			System.out.println("Erro ao inserir o usuário: ");
			e.printStackTrace();
		}
	}

	// Método de remover o livro

	public void removerLivro(String codigoISBN) {

		String sql = "DELETE FROM livros WHERE codigoISBN = ?";

		try (Connection con = ConexaoDB.getConnection(); PreparedStatement pstmt = con.prepareStatement(sql)) {

			pstmt.setString(1, codigoISBN);

			pstmt.executeUpdate(); // Remove o livro no Banco de Dados

			livros.remove(codigoISBN); // Remove o livro do Hashmap de livros

			System.out.println("Livro removido com sucesso!!");
		} catch (SQLException e) {
			System.out.println("Erro ao remover livro...");
			e.printStackTrace();
		}

	}

	// Método de listar o livro

	public void listarLivros() {
		String sql = "SELECT titulo, autor, codigoISBN, quantidadeDisp FROM livros";

		try (Connection con = ConexaoDB.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery()) {

			while (rs.next()) {
				String titulo = rs.getString("titulo");
				String autor = rs.getString("autor");
				String codigoISBN = rs.getString("codigoISBN");
				int quantidadeDisp = rs.getInt("quantidadeDisp");

				System.out.printf(" Título: %s \n Autor: %s \n ISBN: %s \n Quantidade: %d%n", titulo, autor, codigoISBN,
						quantidadeDisp);
			}
		} catch (SQLException e) {
			System.out.println("Erro ao listar os livros.");
			e.printStackTrace();
		}

	}

	// Método de adicionar membro

	public void adicionarMembro(Membro membro) {

		String sql = "INSERT INTO membros (nome, IDmembro, livrosEmprestados) " + "VALUES (?, ?, ?)";

		try (Connection con = ConexaoDB.getConnection(); PreparedStatement pstmt = con.prepareStatement(sql)) {
			pstmt.setString(1, membro.getNome());
			pstmt.setString(2, membro.getIdMembro());
			pstmt.setInt(3, membro.getLivrosEmprestados());

			pstmt.executeUpdate(); // Adiciona o membro ao Banco de Dados

			membros.put(membro.getIdMembro(), membro); // Adiciona o membro ao Hashmap de membros

		} catch (SQLException e) {
			System.out.println("Erro ao inserir membro.");
			e.printStackTrace();
		}

		System.out.println("\nMembro " + membro.getNome() + " adicionado com sucesso! ");
	}

	// Método de remover membro

	public void removerMembro(String idMembro) {
		String sql = "DELETE FROM membros WHERE IDMembro = ?";

		try (Connection con = ConexaoDB.getConnection(); PreparedStatement pstmt = con.prepareStatement(sql)) {
			pstmt.setString(1, idMembro);

			pstmt.executeUpdate();
			membros.remove(idMembro); // Remove o membro do Hashmap de membros
			System.out.println("Membro removido com sucesso.");
		} catch (SQLException e) {
			System.out.println("Erro ao remover membro.");

			e.printStackTrace();
		}

	}

	// Método de listar membros

	public void listarMembros() {
		String sql = "SELECT nome, IDmembro, livrosEmprestados FROM membros";

		try (Connection con = ConexaoDB.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery()) {

			while (rs.next()) {
				String nome = rs.getString("nome");
				String IDmembro = rs.getString("IDMembro");
				String livrosEmprestados = rs.getString("livrosEmprestados");

				System.out.printf(" Nome: %s \n Id: %s \n Quantidade de livros emprestados: %s \n", nome, IDmembro,
						livrosEmprestados);
			}

		} catch (SQLException e) {
			System.out.println("Erro ao mostrar dados dos membros");
			e.printStackTrace();
		}
	}

	// Método de emprestar livro

	public void emprestarLivro(String idMembro, String codigoISBN) {
	    System.out.println("Digite a data do empréstimo: ");
	    String dataEmprestimo = entrada.nextLine();

	    String sqlVerificarQDisp = "SELECT quantidadeDisp FROM livros WHERE codigoISBN = ? LIMIT 1";
	    String sqlVerificarLEmprestados = "SELECT livrosEmprestados FROM membros WHERE IDmembro = ? LIMIT 1";

	    try (Connection conVerificar = ConexaoDB.getConnection();
	         PreparedStatement pstmtVerificarQDisp = conVerificar.prepareStatement(sqlVerificarQDisp);
	         PreparedStatement pstmtVerificarLEmprestados = conVerificar.prepareStatement(sqlVerificarLEmprestados)) {
	        
	        pstmtVerificarQDisp.setString(1, codigoISBN);
	        pstmtVerificarLEmprestados.setString(1, idMembro);

	        ResultSet rsQ = pstmtVerificarQDisp.executeQuery();
	        ResultSet rsL = pstmtVerificarLEmprestados.executeQuery();

	        if (rsQ.next() && rsL.next()) {
	            int quantidadeDisp = rsQ.getInt("quantidadeDisp");
	            int livrosEmprestados = rsL.getInt("livrosEmprestados");

	            if (quantidadeDisp > 0 && livrosEmprestados < 3) {
	                Emprestimo emprestimo = new Emprestimo(idMembro, codigoISBN, dataEmprestimo); 
	                
	                String sqlInserir = "INSERT INTO emprestimo (id, idMembro, codigo, dataEmprestimo, dataDevolucao) "
	                        + "VALUES (?, ?, ?, ?, ?)";

	                try (PreparedStatement pstmtInserir = conVerificar.prepareStatement(sqlInserir)) {
	                    pstmtInserir.setString(1, emprestimo.getIdMembro());
	                    pstmtInserir.setString(2, idMembro);
	                    pstmtInserir.setString(3, codigoISBN);
	                    pstmtInserir.setString(4, emprestimo.getDataEmprestimo());
	                    pstmtInserir.setString(5, emprestimo.getDataDevolucao());

	                    pstmtInserir.executeUpdate();
	                }

	                String sqlUpdateMembro = "UPDATE membros SET livrosEmprestados = livrosEmprestados + 1 WHERE IDmembro = ?";
	                String sqlUpdateLivro = "UPDATE livros SET quantidadeDisp = quantidadeDisp - 1 WHERE codigoISBN = ?";

	                try (PreparedStatement pstmtUpdateMembro = conVerificar.prepareStatement(sqlUpdateMembro);
	                     PreparedStatement pstmtUpdateLivro = conVerificar.prepareStatement(sqlUpdateLivro)) {
	                    pstmtUpdateMembro.setString(1, idMembro);
	                    pstmtUpdateMembro.executeUpdate();

	                    pstmtUpdateLivro.setString(1, codigoISBN);
	                    pstmtUpdateLivro.executeUpdate();
	                }

	                System.out.println("Empréstimo realizado com sucesso.");
	            } else {
	                System.out.println("Livro indisponível ou membro já possui 3 empréstimos.");
	            }
	        } else {
	            System.out.println("Livro ou membro não encontrado no banco de dados.");
	        }
	    } catch (SQLException e) {
	        System.out.println("Erro ao realizar o empréstimo: ");
	        e.printStackTrace();
	    }
	}


	// Método devolver livro

	public void devolverLivro(String idMembro, String codigoISBN) {

	    // Verificar se o empréstimo existe no banco de dados
	    String sqlVerificarEmprestimo = "SELECT * FROM emprestimo WHERE idMembro = ? AND codigo = ? AND dataDevolucao = 'Emprestado' LIMIT 1";
	    String sqlAtualizarDevolucao = "UPDATE emprestimo SET dataDevolucao = ? WHERE idMembro = ? AND codigo = ? AND dataDevolucao = 'Emprestado'";
	    String sqlAtualizarLivrosEmprestados = "UPDATE membros SET livrosEmprestados = livrosEmprestados - 1 WHERE idMembro = ?";
	    String sqlAtualizarQuantidadeLivros = "UPDATE livros SET quantidadeDisp = quantidadeDisp + 1 WHERE codigoISBN = ?";

	    try (Connection con = ConexaoDB.getConnection();
	         PreparedStatement pstmtVerificarEmprestimo = con.prepareStatement(sqlVerificarEmprestimo)) {

	        // Definir parâmetros para a consulta
	        pstmtVerificarEmprestimo.setString(1, idMembro);
	        pstmtVerificarEmprestimo.setString(2, codigoISBN);

	        ResultSet rs = pstmtVerificarEmprestimo.executeQuery();

	        // Verifica se o empréstimo existe e está "Emprestado"
	        if (rs.next()) {
	            System.out.println("Digite a data da devolução: ");
	            String dataDevolucao = entrada.nextLine();

	            // Atualizar a data de devolução do empréstimo no banco de dados
	            try (PreparedStatement pstmtAtualizarDevolucao = con.prepareStatement(sqlAtualizarDevolucao)) {
	                pstmtAtualizarDevolucao.setString(1, dataDevolucao);
	                pstmtAtualizarDevolucao.setString(2, idMembro);
	                pstmtAtualizarDevolucao.setString(3, codigoISBN);
	                pstmtAtualizarDevolucao.executeUpdate();
	            }

	            // Decrementar o número de livros emprestados pelo membro
	            try (PreparedStatement pstmtAtualizarLivrosEmprestados = con.prepareStatement(sqlAtualizarLivrosEmprestados)) {
	                pstmtAtualizarLivrosEmprestados.setString(1, idMembro);
	                pstmtAtualizarLivrosEmprestados.executeUpdate();
	            }

	            // Incrementar a quantidade de livros disponíveis
	            try (PreparedStatement pstmtAtualizarQuantidadeLivros = con.prepareStatement(sqlAtualizarQuantidadeLivros)) {
	                pstmtAtualizarQuantidadeLivros.setString(1, codigoISBN);
	                pstmtAtualizarQuantidadeLivros.executeUpdate();
	            }

	            System.out.println("Livro devolvido com sucesso.");

	        } else {
	            System.out.println("Nenhum empréstimo encontrado para o código ISBN e membro informados.");
	        }

	    } catch (SQLException e) {
	        System.out.println("Erro ao verificar ou atualizar o empréstimo no banco de dados: ");
	        e.printStackTrace();
	    }
	}



	// Método de listar empréstimo

	public void listarEmprestimo() {
	    String sqlListarEmprestimos = "SELECT * FROM emprestimo";

	    try (Connection con = ConexaoDB.getConnection();
	         PreparedStatement pstmtListar = con.prepareStatement(sqlListarEmprestimos)) {

	        ResultSet rs = pstmtListar.executeQuery();

	        if (!rs.isBeforeFirst()) { // Verifica se o ResultSet está vazio
	            System.out.println("Nenhum empréstimo encontrado.");
	        } else {
	            while (rs.next()) {
	                // Obtém as colunas necessárias
	                String idEmprestimo = rs.getString("id");
	                String idMembro = rs.getString("idMembro");
	                String codigoISBN = rs.getString("codigo");
	                String dataEmprestimo = rs.getString("dataEmprestimo");
	                String dataDevolucao = rs.getString("dataDevolucao");

	                // Exibe as informações do empréstimo
	                System.out.println("ID do Empréstimo: " + idEmprestimo);
	                System.out.println("ID do Membro: " + idMembro);
	                System.out.println("Código ISBN do Livro: " + codigoISBN);
	                System.out.println("Data de Empréstimo: " + dataEmprestimo);
	                System.out.println("Data de Devolução: " + dataDevolucao);
	                System.out.println("-------------------------------------");
	            }
	        }

	    } catch (SQLException e) {
	        System.out.println("Erro ao listar os empréstimos: ");
	        e.printStackTrace();
	    }
	}
}
