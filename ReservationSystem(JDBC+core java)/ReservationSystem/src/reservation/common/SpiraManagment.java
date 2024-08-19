package reservation.common;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class SpiraManagment {
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
}
