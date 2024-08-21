package Spira.Managment;

public class Guest {

	private int id;
	private String name;
	private int room;
	private String contact;
	
	public Guest(String name, int room, String contact) {
		this.name = name;
		this.room = room;
		this.contact = contact;
	}
	
//	id
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
//	name
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
//	room
	public int getRoom() {
		return room;
	}
	
	public void setRoom(int room) {
		this.room = room;
	}
	
//	contact 
	public String getContact() {
		return contact;
	}
	
	public void setContact(String contact) {
		this.contact = contact;
	}
	
	
	public String toString() {
		String s = "Guest{ id : " + id + " name " + name + " room " + room +" contact " + contact + " }";
		return s;
	}
}
