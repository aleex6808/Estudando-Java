package exercicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;

public class ex007 {
	public static void buscarClientesPorNome(String nome) {
		String sql = "SELECT * FROM Clientes2 WHERE nome LIKE ?";
		String url = "jdbc:mysql://localhost:3306/loja";
		String user = "root";
		String password = "";
		
		try (Connection con = DriverManager.getConnection(url, user, password);
			PreparedStatement prepState = con.prepareStatement(sql)) {
				prepState.setString(1, "%" + nome + "%");
				ResultSet result = prepState.executeQuery();
				
				while (result.next()) {
					System.out.println("ID: " + result.getInt("id"));
					System.out.println("Nome: " + result.getString("nome"));
					System.out.println("Email: " + result.getString("email"));
					System.out.println("Data de Cadastro: " + result.getDate("data_cadastro"));
					System.out.println("------------------------------------");
				}
			} catch (SQLException e) {
				System.out.println("Erro ao buscar clientes: " + e.getMessage());
			}
	}
	
	public static void main(String[] args) {
		buscarClientesPorNome("Amado");
	}
}
