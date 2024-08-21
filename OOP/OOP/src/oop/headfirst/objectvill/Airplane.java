package oop.headfirst.objectvill;

public class Airplane {

	private int speed;
	private int crewMember;
	private String planeName;
	private int ticketPrice;
	
	
	
	
	public Airplane() {
		
	}
	
//	public Airplane(int speed, int ticketPrice) {
//		this.speed = speed;
//		this.ticketPrice = ticketPrice;
//	}
	
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
	
	
//	public String toString() {
//		String r = "[ 'Plane name' : " + planeName + "' Speed' : " + speed + "km/h" + " 'Crew Member' : " + crewMember + " 'Ticket price' : " + ticketPrice + "BDT" + " ]" ;
//		return r;
//	}
//	class jet

	
	
//	public static void main(String [] args) {
//		Airplane ar = new Airplane();
//		Jet j = new Jet();
//		ar.setSpeed(20);
//		ar.setTicketPrice(200);
//		
//		System.out.println(ar.getSpeed());
//		j.setSpeed(ar.getSpeed());
//		System.out.println(j.getSpeed());
//		j.accelarate();
//		System.out.println(j.getSpeed());
//		
//		j.accelarate();
//		
//		System.out.println(j.getSpeed());
//	}
	
}


