package reservation.common;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SpiraManagment {
//	registering new guest to the resort
//	
	public static void addGuest(Connection c, Scanner sc) {
		
		try {
			String insertQuery = "INSERT INTO spirareservation(`guest_name`, `room_number`, `contact_number`) VALUES(?, ?, ?)";
			PreparedStatement ps = c.prepareStatement(insertQuery);
			
			ps.setString(1, sc.next());
			
			ps.setInt(2, sc.nextInt());
			
			ps.setString(3, sc.next());
			
			int rowAffected = ps.executeUpdate();
			
			if(rowAffected <1) {
				System.out.print("none");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
	
// showing all guest list
	
	public static void showAllGuests(Connection c) throws Exception {
		String selectAllQuery = "SELECT * FROM spirareservation";
		
		PreparedStatement ps = c.prepareStatement(selectAllQuery);
		
		ResultSet r = ps.executeQuery();
		System.out.println("ID    " + "\t" +"Name    " + "\t" + "Room Number    " + "\t" + "Contact Number    " + "Time    ");
		while(r.next()) {
			System.out.println(r.getInt(1)+ "    " + "\t" + r.getString(2) + "\t" + r.getInt(3) + "\t" + r.getString(4) + "\t" + r.getDate(5));
//		System.out.println(r.getString("guest_name"));
		}
	}
	
//	updating the name of a guest
}
