package reservation.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import reservation.common.Common;
import reservation.common.SpiraManagment;

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
		
		String updateQueryName = "UPDATE spirareservation SET guest_name = (?) where reservation_id=(?)";
		
		String updateQueryRoom = "UPDATE spirareservation SET room_number = (?) where reservation_id=(?)";
		
		String updateQueryContact = "UPDATE spirareservation SET contact_number = (?) where reservation_id=(?)";
		

		String deleteQuery = "DELETE FROM spirareservation where reservation_id=(?)";
		
		String selectAllQuery = "SELECT * FROM spirareservation";
		
		String selectSingleQuery = "SELECT * FROM spirareservation where reservation_id=(?)";
		
		while(true) {
			System.out.println("Welcome to Spira Island");
			System.out.println("1. Register a new guest.");
			System.out.println("2. Update info of a guest.");
			System.out.println("3. Remove a guest.");
			System.out.println("4. Show list of all guests.");
			System.out.println("5. Show info of a Single guest.");
			System.out.println("6. Exit the system.");
			
			System.out.println("Please choose an option.");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				SpiraManagment.addGuest(c, sc);
				break;
			}
		}
		
//		if(c!=null) {
//			s = c.prepareStatement(insertQuery);
//			
//			System.out.println("enter the guest name");
//			
//			s.setString(1, sc.nextLine());
//			
//			System.out.println("enter the room number");
//			
//			s.setInt(2, sc.nextInt());
//			
//			System.out.println("enter contact number");
//			
//			s.setString(3, sc.next());
//		}
//		
//		if(s!=null) {
//			rowsAffected = s.executeUpdate();
//		}
//		
//		
//		Common.getCommonClass().CloseConnection();
	}

}
