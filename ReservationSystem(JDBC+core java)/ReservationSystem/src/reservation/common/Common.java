package reservation.common;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Common {
	
	private static Common comm;
	private static Connection connection;
	
	private Common() {
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\Eera\\Desktop\\java\\ReservationSystem(JDBC+core java)\\ReservationSystem\\application.properties");
			Properties properties = new Properties();
			
			properties.load(fis);
			
			connection = DriverManager.getConnection(properties.getProperty("url"), properties.getProperty("user"), properties.getProperty("pass"));
		
		} catch(Exception e) {
			e.printStackTrace();
	}
	
	}
	
	public static Common getCommonClass() throws Exception{
		if(comm==null) {
			comm = new Common();
		}
		return comm;
	}
	
	public Connection getConnection() {
		return connection;
	}
	
	public void CloseConnection() {
		if(connection!=null) {
			try {
				connection.close();
				System.out.println("closing connection....");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	

}
