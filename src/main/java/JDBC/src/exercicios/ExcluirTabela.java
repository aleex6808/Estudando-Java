package exercicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class ExcluirTabela {
	public static void excluirTabela() {
		
		String sql = "DROP TABLE produtos;";
		
		try (Connection con = getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql)) {
			pstmt.execute(sql);			
			System.out.println("Tabela excluída com sucesso!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/teste";
		String user = "root";
		String senha = "";
		
		return DriverManager.getConnection(url, user, senha);
	}
	
	public static void main(String[] args) {
		excluirTabela();
	}
}
