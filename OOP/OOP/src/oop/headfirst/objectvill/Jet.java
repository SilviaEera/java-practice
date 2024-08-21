package oop.headfirst.objectvill;

public class Jet extends Airplane{

	private static final int multiplier = 2;
	public Jet() {
		super();
	}
	
	public void setSpeed(int speed) {
		super.setSpeed(speed*multiplier);
	}
	
	public void accelarate() {
		super.setSpeed(getSpeed()*multiplier);
	}
	public void display() {
		System.out.println("From subclass Jet");
	}
	
}
