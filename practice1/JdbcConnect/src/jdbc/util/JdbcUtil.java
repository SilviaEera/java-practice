package jdbc.util;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class JdbcUtil {
	private JdbcUtil() {}
	
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch(Exception e) {
			System.out.print("Could not locate MySQL connector. ");
		}
	}
	public static Connection getConnection() throws Exception{
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Eera\\Desktop\\java\\practice1\\JdbcConnect\\appinfo.properties");
		Properties properties = new Properties();
		properties.load(fis);
		
		Connection c= DriverManager.getConnection(properties.getProperty("url"), properties.getProperty("user"), properties.getProperty("pass"));
		
		return c;
	}
	
	public static void closeAll(Connection connection, Statement statement, ResultSet resultSet) throws Exception {
		if(connection!=null) {
			connection.close();
		} 
		if(statement!=null) {
			statement.close();
		}
		if(resultSet!=null) {
			resultSet.close();
		}
	}

}
