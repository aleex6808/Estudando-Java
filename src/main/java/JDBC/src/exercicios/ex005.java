package exercicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ex005 {
	public static void atualizarCliente(int id, String nome, String email) {
		String sql = "UPDATE Clientes2 SET nome = ?, email = ? WHERE id = ?" ;
		
		try (Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/loja", "root", "");
			PreparedStatement prepState = conexao.prepareStatement(sql)) {
			prepState.setString(1, nome);
			prepState.setString(2, email);
			prepState.setInt(3, id);
			prepState.executeUpdate();
			System.out.println("Cliente atualizado com sucesso.");
		} catch (SQLException e) {
			System.out.println("Erro ao atualizar cliente: " + e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		atualizarCliente(1, "Jorge Amado", "jorge@email.com");
	}
}
