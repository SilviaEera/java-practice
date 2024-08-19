package conn.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	private static Connection connection;
	private static DatabaseConnection ins;
	
	
	private DatabaseConnection() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/university";
		String user = "root";
		String pass = "admin";
		
		this.connection = DriverManager.getConnection(url, user, pass);
	}
	
	public static synchronized DatabaseConnection getDBC() throws Exception {
		if(ins==null) {
			ins = new DatabaseConnection();
		}
		return ins;
	}
	
	public static Connection getConnection() {
		return connection;
	}
	
	
}