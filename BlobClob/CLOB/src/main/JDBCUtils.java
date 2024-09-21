package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCUtils {
	private static Connection connection = null;
	private static JDBCUtils instance = null;
	
	
	public static JDBCUtils getJDBCUtil() {
		
		if(instance == null) {
			synchronized(JDBCUtils.class) {
				if(instance == null) {
					instance = new JDBCUtils();
				}
			}
		}
		
		return instance;
	}
	
	public static Connection getConnection() {
		
		if(connection==null) {
			String url = "jdbc:mysql:///tub";
			String user = "root";
			String pass = "admin";

			try {
				connection = DriverManager.getConnection(url, user, pass);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Connection object created...");
		}
		
		return connection;
	}
	
	
	public static void clear(Connection con, ResultSet res, PreparedStatement pst) {
		
		try {
			if(con!=null) {
				con.close();
			if(res!=null) {
				res.close();
			}
			if(pst!=null) {
				pst.close();
			}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
