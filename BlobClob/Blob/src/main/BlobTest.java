package main;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class BlobTest {

	public static void main(String[] args) {
		
//		Resource used 
		Connection connection = null;
		ResultSet resultSet = null;
		PreparedStatement pst = null;
		Scanner sc = null;
		
//		Variables used 
		String name = null;
		String img = null;
		try {
			
			JDBCUtil.getJDBCUtil();
			
			connection = JDBCUtil.getConnection();
			
			String insertQ = "INSERT INTO person(`person_name`, `img`) VALUES(?, ?)";
			if(connection!=null) {
				pst = connection.prepareStatement(insertQ);
			}
			
			if(pst!=null) {
				sc = new Scanner(System.in);
				
				if(sc!=null) {
					System.out.print("Please enter the name : ");
					name = sc.next();
					
					System.out.println("Enter the image location : ");
					img = sc.next();
				}
				
				pst.setString(1, name);
				pst.setBinaryStream(2, new FileInputStream(new File(img)));
				
				int rowsAffected = pst.executeUpdate();
				
				System.out.println("Rows affected : " + rowsAffected);
			}
			
			
		} catch (SQLException e) {
            System.err.println("SQL Error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
			JDBCUtil.clear(connection, resultSet, pst);
			sc.close();
		}
 
	}

}
