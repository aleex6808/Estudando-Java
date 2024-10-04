package Projeto_SGB;

import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDB {
	private static String url = "jdbc:mysql://localhost:3306/biblioteca";
	private static String user = "root";
	private static String password = "jojosbig3";
	
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url, user, password);
	}
	
	public static void main(String[] args) throws SQLException {
		getConnection();
	}
}
