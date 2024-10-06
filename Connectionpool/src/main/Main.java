package main;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class Main {

	public static void main(String[] args) throws SQLException {
	
		String p = "src\\main\\db.properties";
		
		HikariConfig config = new HikariConfig(p);
		
		try(HikariDataSource dataSource = new HikariDataSource(config)){

			Connection c = dataSource.getConnection();
			
			Statement s = c.createStatement();
			
			ResultSet r = s.executeQuery("select * from student");
			
			while(r.next()) {
				System.out.println(r.getString("sname") + "\t\t\t\t\t\t" + r.getInt("sage") + "\t" + r.getString("saddress"));
			}
		}catch(Exception e) {
			
		}
		
		
		
	}
}
