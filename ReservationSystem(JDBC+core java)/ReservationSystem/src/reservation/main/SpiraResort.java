package reservation.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import reservation.common.Common;

public class SpiraResort {

	public static void main(String[] args) throws Exception {
//		new reservation
//		check reservation
//		update reservation
//		delete reservation
//		show a particular reservation
//		show all reservations
//		exit the menu
		Scanner sc = new Scanner(System.in);
		Connection c =null;
		PreparedStatement s = null;
		ResultSet r = null;
		int rowsAffected;
		Common.getCommonClass();
		
		c= Common.getCommonClass().getConnection();
		String insertQuery = "INSERT INTO spirareservation(`guest_name`, `room_number`, `contact_number`) VALUES(?, ?, ?)";
		
		
		
		
		if(c!=null) {
			s = c.prepareStatement(insertQuery);
			
			System.out.println("enter the guest name");
			
			s.setString(1, sc.nextLine());
			
			System.out.println("enter the room number");
			
			s.setInt(2, sc.nextInt());
			
			System.out.println("enter contact number");
			
			s.setString(3, sc.next());
		}
		
		if(s!=null) {
			rowsAffected = s.executeUpdate();
		}
		
		
		Common.getCommonClass().CloseConnection();
	}

}
