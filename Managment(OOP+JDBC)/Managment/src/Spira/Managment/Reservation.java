package Spira.Managment;

import java.util.List;

public interface Reservation {
	void addGuest(Guest guest) throws Exception;
	
	List<Guest> showAllGuest() throws Exception;
	
	void updateGuest(Guest guest) throws Exception;
	
	void deleteGuest(Guest guest) throws Exception;	
}



