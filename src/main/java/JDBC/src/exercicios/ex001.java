package exercicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ex001 {
	public static void conectar() {
		String url = "jdbc:mysql://localhost:3306/loja";
		String usuario = "root";
		String senha = "";
		
		try (Connection conexao = DriverManager.getConnection(url, usuario, senha)) {
			if (conexao != null) {
				System.out.println("Conectado com sucesso");
			}
		} catch (SQLException e) {
			System.out.println("Erro de conexão: " + e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		conectar();
	}
}
