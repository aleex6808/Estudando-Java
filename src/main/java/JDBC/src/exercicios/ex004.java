package exercicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ex004 {
	public static void listarClientes(){
		String sql = "SELECT * FROM Clientes2";
		
		try (Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/loja", "root", "");
				Statement state = conexao.createStatement();
				ResultSet result = state.executeQuery(sql)) {
			
			while (result.next()) {
				System.out.println("ID: " + result.getInt("id"));
				System.out.println("Nome: " + result.getString("nome"));
				System.out.println("Data de cadastro: " + result.getDate("data_cadastro"));
				System.out.println("---------------------------------------");
			}
		} catch (SQLException e) {
			System.out.println("Erro ao listar clientes: " + e.getMessage());
		}
		
	}
	
	public static void main(String[] args) {
		listarClientes();
	}
	
}
