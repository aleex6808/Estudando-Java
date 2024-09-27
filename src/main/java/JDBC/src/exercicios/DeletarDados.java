package exercicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeletarDados {
	
	public static void deletarDados(String email) {
		
		if(email == null || email.isEmpty()) {
			System.out.println("Email não encontrado...");
			return;
		}
		
		String sql = "DELETE FROM usuario WHERE email = ?";
		
		try (Connection con = Conectando.getConnection(); 
			PreparedStatement ptsmt = con.prepareStatement(sql)) {
				ptsmt.setString(1, email);
				int linhasAfetadas = ptsmt.executeUpdate();
				
				if (linhasAfetadas > 0) {
				System.out.println("Usuário deletado com sucesso");
				} else {
					System.out.println("Usuário não encontrado..");
				}
			} catch (SQLException e) {
				System.out.println("Erro ao deletar o usuário");
				e.printStackTrace();
			}
	}
	
	public static void main(String[] args) {
		deletarDados("alex@email.com");
	}
	
}
