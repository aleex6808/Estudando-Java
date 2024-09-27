package exercicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AtualizarDados {

	public static void atualizandoDados(String nome, String email) {

		if (nome == null || nome.isEmpty() || email == null || email.isEmpty()) {
			System.out.println("Nome ou email inválidos");
			return;
		}

		String sql = "UPDATE usuario SET nome = ? WHERE email = ?";

		try (Connection con = Conectando.getConnection(); 
			PreparedStatement ptsmt = con.prepareStatement(sql)) {
			ptsmt.setString(1, nome);
			ptsmt.setString(2, email);

			int linhasAfetadas = ptsmt.executeUpdate();

			if (linhasAfetadas > 0) {
				System.out.println("Usuário atualizado com sucesso!");
			} else {
				System.out.println("Usuário não encontrado..");
			}

		} catch (SQLException e) {
			System.out.println("Erro ao atualizar o usuário.");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		atualizandoDados("Alex", "alex@email.com");
	}
}
