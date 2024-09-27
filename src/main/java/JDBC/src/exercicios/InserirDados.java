package exercicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InserirDados {
	
	public static void inserirUsuario(String nome, String email) {
		String sql = "INSERT INTO usuario (nome, email) VALUES (?, ?)";
		
		try (Connection con = Conectando.getConnection()) {
			
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, nome);
			pstmt.setString(2, email);
			pstmt.executeUpdate();
			System.out.println("Usuário inserido com sucesso!");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		inserirUsuario("Alex", "alex@email.com");
	}
	
}
