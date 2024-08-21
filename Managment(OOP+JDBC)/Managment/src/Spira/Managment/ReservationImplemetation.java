package Spira.Managment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

public class ReservationImplemetation implements Reservation{
	
	private Connection connection;
	
	public ReservationImplemetation(Connection connection) {
		this.connection = connection;
	}

	@Override
	public void addGuest(Guest guest) throws Exception {
		String q = "insert into spirareservation(`guest_name`, `room_number`, `contact_number`) values(?, ?, ?)";
		
		try {
			PreparedStatement ps = connection.prepareStatement(q);
			
			ps.setString(1, guest.getName());
			ps.setInt(2, guest.getRoom());
			ps.setString(3, guest.getContact());
			
			int raf = ps.executeUpdate();
			
			if(raf>0) {
				System.out.println("successful.");
			} 
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Guest> showAllGuest() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateGuest(Guest guest) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteGuest(Guest guest) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
