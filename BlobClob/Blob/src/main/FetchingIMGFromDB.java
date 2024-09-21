package main;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import org.apache.commons.io.IOUtils;

//import org.apache.commons*;

public class FetchingIMGFromDB {

	public static void main(String[] args) throws SQLException, IOException {
		Connection conn = null;
		ResultSet res = null;
		PreparedStatement pst = null;
		Scanner sc = null;
		
		Integer id = null;
		String name = null;
		String img = null;
		
		
		JDBCUtil.getJDBCUtil();
		
		try {
			
			conn = JDBCUtil.getConnection();
			
			String SelectQ = "SELECT * FROM person where id = ?";
			if(conn!=null) {
				pst = conn.prepareStatement(SelectQ);
			}
			
			if(pst!=null) {
				sc = new Scanner(System.in);
				
				if(sc!=null) {
					System.out.print("Enter the id :: ");
					id = sc.nextInt();
				}
				
				pst.setInt(1, id);
				
				res = pst.executeQuery();
				
				if(res!=null) {
					if(res.next()) {
						
						
						id = res.getInt("id");
						
						name = res.getString("person_name");
						
						InputStream is = res.getBinaryStream("img");
						
						File file = new File("C:\\Users\\Eera\\Desktop\\java\\BlobClob\\Blob\\asstes", name+".mp4");
						
						FileOutputStream fos = new FileOutputStream(file);
						System.out.println("ID\tName\tImage Location");
						System.out.println(id + "\t" + name + "\t" + file.getAbsolutePath());
						
						
						IOUtils.copy(is, fos);
						
					//	efficient 
						
//						byte[] buffer = new byte[1024];
//						
//						
//						while(is.read(buffer)>0) {
//							fos.write(buffer);
//						}
						
					//	not efficient cause reading 1 byte at a time and writing it.
						
//						int i = is.read();
//						
//						while(i != -1) {
//							fos.write(i);
//							i = is.read();
//						}
						
						fos.close();
						is.close();
						
					}
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
