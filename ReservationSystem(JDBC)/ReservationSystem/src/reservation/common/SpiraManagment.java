package reservation.common;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Scanner;

public class SpiraManagment {
//	registering new guest to the resort
//	
	public static void addGuest(Connection c, Scanner sc) {
		
		try {
			String insertQuery = "INSERT INTO spirareservation(`guest_name`, `room_number`, `contact_number`) VALUES(?, ?, ?)";
			PreparedStatement ps = c.prepareStatement(insertQuery);
			
			System.out.println("Plese enter the name.");
			ps.setString(1, sc.next());
			
			System.out.println("Plese enter the room number.");
			ps.setInt(2, sc.nextInt());
			
			
			System.out.println("Plese enter the contact number.");
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
	
	public static void updateName(Connection c, Scanner sc) {
		String selectAllQuery = "SELECT guest_name FROM spirareservation WHERE reservation_id=?";
		String updateQueryName = "UPDATE spirareservation SET guest_name = ? where reservation_id=?";
		
		try {
			
			PreparedStatement psn = c.prepareStatement(selectAllQuery );
			PreparedStatement ps = c.prepareStatement(updateQueryName);
			
			
			System.out.println("Enter the id number of the guest.");
			
			int id = sc.nextInt();
			psn.setInt(1, id);
			
			ResultSet r = psn.executeQuery();
			
			String name = null;
			while(r.next()) {
				name = r.getString(1);
				System.out.println("Previous name: " + "\t" + name);
			}
			
			ps.setInt(2, id);
			
			System.out.println("Plese enter the new name to update or press Enter to keep " + name);
			String newName = sc.next();
			if(newName.equals("" )) {
				newName = name;
			}
			ps.setString(1, newName);
			
			
			
			
			
			
			int rowsAffected = ps.executeUpdate();
			if(rowsAffected==1) {
				System.out.println("Name updated sussessfully");
			} else {
				System.out.println("Could not update name.");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
//	update room number
	
	public static void updateRoom(Connection c, Scanner sc) {
		String updateQueryRoom = "UPDATE spirareservation SET room_number = (?) where reservation_id=(?)";
		
		try {
			PreparedStatement ps = c.prepareStatement(updateQueryRoom);
			
			
			System.out.println("Enter the id number of the guest.");
			ps.setInt(2, sc.nextInt());
			
			System.out.println("Plese enter the new room number to update.");
			ps.setInt(1, sc.nextInt());
			
			
			
			int rowsAffected = ps.executeUpdate();
			if(rowsAffected==1) {
				System.out.println("Room updated sussessfully");
			} else {
				System.out.println("Could not update Room.");
			}
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Room reserved. Choose another room.");
		}
		
	}
	
//	update contact
	public static void updateContact(Connection c, Scanner sc) {
		String updateQueryContact = "UPDATE spirareservation SET contact_number = (?) where reservation_id=(?)";
		
		try {
			PreparedStatement ps = c.prepareStatement(updateQueryContact);
			
			
			System.out.println("Enter the id number of the guest.");
			ps.setInt(2, sc.nextInt());
			
			System.out.println("Plese enter the new  contact number to update.");
			ps.setString(1, sc.next());
			
			
			
			int rowsAffected = ps.executeUpdate();
			if(rowsAffected==1) {
				System.out.println("Contact updated sussessfully");
			} else {
				System.out.println("Could not update Contact.");
			}
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
