package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Util {
	
	private Util() {
		
	}
	private static Util instance = null;
	private static Connection connection = null;
	
	public static Util getInstance() {
		if(instance == null) {
			synchronized (Util.class) {
				if(instance==null) {
					instance = new Util();
				}
			}
		}
		
		return instance;
	}
	
	
	
	public static Connection getConnection() throws SQLException {
		if(connection==null) {
			String url = "jdbc:mysql:///tub";
			String user = "root";
			String pass = "admin";

			connection = DriverManager.getConnection(url, user, pass);
			System.out.println("Connection object created...");
		}
		
		
		return connection;
	}
	
	
	
	public static void closeAll(PreparedStatement pst, Connection connection, ResultSet resultSet) {

		try {
			if (connection != null) {
				connection.close();
			}

			if (pst != null) {
				pst.close();
			}

			if (resultSet != null) {
				resultSet.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	

}
