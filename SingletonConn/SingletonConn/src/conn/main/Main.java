package conn.main;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
	public static void main(String args[]) throws Exception {
		
		DatabaseConnection.getDBC();
		
		Connection c = DatabaseConnection.getConnection();
		
		Statement statement = c.createStatement();
		
		
		String q = "SELECT * FROM st";
		
		ResultSet resultSet = statement.executeQuery(q);
		
		
		while(resultSet.next()) {
			System.out.println(resultSet.getString("sname"));
		}
		
	}
	
	
	

}