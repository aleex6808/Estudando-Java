package aula01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoUtil {

	private static ConexaoUtil conexaoUtil;

	public static ConexaoUtil getInstance() {
		if (conexaoUtil == null) {
			conexaoUtil = new ConexaoUtil();
		}
		return conexaoUtil;
	}

	public Connection getConecction() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/loja";
		String user = "root";
		String password = "";

		return DriverManager.getConnection(url, user, password);
	}

	public static void main(String[] args) {
		try {
			System.out.println(getInstance().getConecction());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
