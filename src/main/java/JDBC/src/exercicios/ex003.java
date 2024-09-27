package exercicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.time.LocalDate;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class ex003 {
	public static void inserirCliente(String nome, String email, LocalDate dataCadastro) {
		String sql = "INSERT INTO Clientes2 (nome, email, data_cadastro) VALUES (?, ?, ?)";

		try (Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/loja", "root", "");
				PreparedStatement prepState = conexao.prepareStatement(sql)) {
			prepState.setString(1, nome);
			prepState.setString(2, email);
			prepState.setDate(3, java.sql.Date.valueOf(dataCadastro));
			prepState.executeUpdate();
			System.out.println("Cliente inserido com sucesso.");
		} catch (SQLException e) {
			System.out.println("Erro ao inserir cliente" + e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		inserirCliente("Jorge Amado", "jorge@email.com", LocalDate.now());
	}
}
