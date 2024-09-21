package main;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
import java.io.File;

public class CLOB {
	public static void main(String[] args) {
		
		Connection conn = null;
		ResultSet res = null;
		PreparedStatement pst = null;
		
		Scanner sc = null;
		String name = null;
		String file = null;
		
		JDBCUtils.getJDBCUtil();
		// 
		
		try {
			conn = JDBCUtils.getConnection();
			String insertQ = "INSERT INTO files(`name`, `file`) values(?, ?);";
			if(conn!=null) {
				pst = conn.prepareStatement(insertQ);
			}
			
			if(pst!=null) {
				sc = new Scanner(System.in);
				if(sc!=null) {
					System.out.println("Enter file name :: ");
					name = sc.next();
					
					System.out.println("Enter file location :: ");
					file = sc.next();
					
					pst.setString(1, name);
					pst.setCharacterStream(2, new FileReader(new File(file)));;
					
					int rowsAffected = pst.executeUpdate();
					
					
					
				}
			}
		} catch(Exception e) {
			
		}
		
	}
}
