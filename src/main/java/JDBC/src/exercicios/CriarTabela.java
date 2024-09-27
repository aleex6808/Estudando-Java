package exercicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
 

public class CriarTabela {

	public static void criarTabela() {
		String url = "jdbc:mysql://localhost:3306/teste";
		String user = "root";
		String senha = "";
		
		try (Connection con = DriverManager.getConnection(url, user, senha)) {
			Statement stmt = con.createStatement();
			String sql = "CREATE TABLE usuario( "
						+ "id INT AUTO_INCREMENT PRIMARY KEY, "
						+ "nome VARCHAR(100),"
						+ "email VARCHAR(100)"
						+ ");";
				stmt.execute(sql);
				System.out.println("Tabela criada com sucesso!");
				
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		criarTabela();
	}
	
}