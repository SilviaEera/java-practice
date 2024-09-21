package main;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.Reader;
import java.nio.CharBuffer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import org.apache.commons.io.IOUtils;
//import org.apache.commons.io.*;

public class RetrivePDF {

	public static void main(String[] args) {
		Connection conn = null;
		ResultSet res = null;
		PreparedStatement pst = null;
		
		Scanner sc = null;
		Integer id = null;
		String name = null;
	
		JDBCUtils.getJDBCUtil();
		// 
		
		try {
			conn = JDBCUtils.getConnection();
			String selectQ = "SELECT * FROM files where id=? ";
			if(conn!=null) {
				pst = conn.prepareStatement(selectQ);
			}
			
			if(pst!=null) {
				sc = new Scanner(System.in);
				if(sc!=null) {
					System.out.println("Enter ID :: ");
					id = sc.nextInt();
					
					pst.setInt(1, id);
					
					res = pst.executeQuery();
				}
			}
			
			
			if(res!=null) {
				if(res.next()) {
					id = res.getInt(1);
					name = res.getString(2);
					
					Reader reader = res.getCharacterStream(3);
					File file = new File("C:\\Users\\Eera\\Desktop\\java\\BlobClob\\CLOB\\assets",name+".txt");
					
					FileWriter writer = new FileWriter(file);
					
					IOUtils.copy(reader, writer);
					System.out.println(id + "\t" +name + "\t" +file.getAbsolutePath());
					writer.close();
					
				}
			}
		} catch(Exception e) {
			
		}

	}
	
	
	

}
