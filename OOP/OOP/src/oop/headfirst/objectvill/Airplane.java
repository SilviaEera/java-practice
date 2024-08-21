package oop.headfirst.objectvill;

public class Airplane {

	private int speed;
	private int crewMember;
	private String planeName;
	private int ticketPrice;
	
	
	{
		speed = 200;
		planeName = "Boing 357";
		crewMember = 30;
	}
	
	public Airplane() {
		
	}
	
	public Airplane(int speed, int ticketPrice) {
		this.speed = speed;
		this.ticketPrice = ticketPrice;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public int getCrewMember() {
		return crewMember;
	}
	
	public String getPlaneName() {
		return planeName;
	}
	
	public int getTicketSpeed() {
		return ticketPrice;
	}
	
	public void setTicketPrice(int ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	
	
	public String toString() {
		String r = "[ 'Plane name' : " + planeName + "' Speed' : " + speed + "km/h" + " 'Crew Member' : " + crewMember + " 'Ticket price' : " + ticketPrice + "BDT" + " ]" ;
		return r;
	}
//	class jet

	
	
	public static void main(String [] args) {
		Airplane ar = new Airplane(300, 70000);
		Jet j = new Jet();
		
		System.out.println("Jet   "+j);
		
		System.out.print(ar);
	}
	
}


