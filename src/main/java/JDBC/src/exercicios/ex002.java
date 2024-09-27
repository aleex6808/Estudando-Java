package exercicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ex002 {

	public static void CriarTabela() {
		String sql = "CREATE TABLE IF NOT EXISTS Clientes2 (" + 
				"id INT AUTO_INCREMENT PRIMARY KEY," +
				"nome VARCHAR(100)," + 
				"email VARCHAR(100), " +
				"data_cadastro DATE" +
				");";
		
		try (Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/loja", "root" ,"");
			Statement state = conexao.createStatement()) {
				state.execute(sql);
				System.out.println("Tabela criada com sucesso.");
			} catch (SQLException e){
				System.out.println("Erro ao criar a tabela: " + e.getMessage());
			}
	}
	
	public static void main(String[] args) {
		CriarTabela();
	}
	
}
