package main;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) throws IOException, SQLException {
		
		Connection c = null;
		ResultSet r = null;
		PreparedStatement pst = null;
		
		Scanner sc = null;
		String name = null;
		Integer age = null;
		try {
			Util.getInstance();
			
			if(c==null) {
				c = Util.getConnection();
			}
			
			if(c!=null) {
				String q = "insert into new(`sname`, `sage`) values(?, ?)";
				
				pst = c.prepareStatement(q);
			}
			
			if(pst!=null) {
				sc = new Scanner(System.in);
				
				if(sc!=null) {
					while(true) {
						System.out.print("please enter a name :: ");
						name = sc.next();
						
						System.out.print("please enter an age ::");
						age = sc.nextInt();
						
						pst.setString(1, name);
						pst.setInt(2, age);
						
						pst.addBatch();
						
						System.out.println("do you want to insert more records? [yes/no]");
						
						String option = sc.next();
						
						if(option.equalsIgnoreCase("no")) {
							break;
						}
					}
					
					//executing the queries present inside the batch file
					pst.executeBatch();
					
					System.out.println("record inserted successfully !! ");
				}
			}
			
		}catch(Exception e) {
			
		}
	}
}
