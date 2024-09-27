package exercicios;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ex006 {

	public static void excluirCliente(int id) {
		String sql = "DELETE FROM Clientes2 WHERE id = ?";

		String url = "jdbc:mysql://localhost:3306/loja";
		String user = "root";
		String senha = "";

		try (Connection conexao = DriverManager.getConnection(url, user, senha);
			PreparedStatement prepState = conexao.prepareStatement(sql)) {
			prepState.setInt(1, id);
			prepState.executeUpdate();
			
			System.out.println("Cliente excluido com sucesso. ");
		} catch (SQLException e) {
			System.out.println("Erro ao excluir cliente: " + e.getMessage());
		}
	}

	public static void main(String[] args) {
		excluirCliente(1);
	}
	
}
