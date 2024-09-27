package exercicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conectando {
	private static final String url = "jdbc:mysql://localhost:3306/teste";
	private static final String user = "root";
	private static final String senha = "";
	
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url, user, senha);
	}
	
	public static void main(String[] args) {
		try(Connection con = Conectando.getConnection()) {
			System.out.println("Conexão estabelecida com sucesso!!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
