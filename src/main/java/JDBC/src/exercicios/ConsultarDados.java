package exercicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConsultarDados {

	public static void consultandoDados(String email) {
		String sql = "SELECT * FROM usuario WHERE email = ?" ;
		
		try (Connection con = Conectando.getConnection()) {
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, email);
			
			try (ResultSet rs = pstmt.executeQuery()) {
				if (rs.next()) {
					System.out.println("Nome: " + rs.getString("nome"));
				} else {
					System.out.println("Usuário não encontrado.");
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		consultandoDados("alex@email.com");
	}
	
}
