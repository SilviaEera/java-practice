package oop;

class Plane{
	public void takeOff() {
		System.out.println("plane is taking off");
	}
	
	public void flying() {
		System.out.println("plane is flying");
	}
}

 
class CargoPlane extends Plane{
	 public void flying() {
		 System.out.println("flies at lower height.");
	 }
	 
	 public void carry() {
		 System.out.println("Carries cargos.");
	 }
}

class PassengerPlane extends Plane{
	public void flying() {
		System.out.println("flies at heigher heright."); //overrided method
	}
	
	public void carry() {
		System.out.println("carries passengers"); //specilized method
	}
}

class Airport{
	void test(Plane plane) {
		plane.flying();
		plane.takeOff();
		
	}
}


public class MainPlane {

	public static void main(String[] args) {
		Plane p = new Plane(); //loose coupling
		
		Plane pc = new CargoPlane(); //tight coupling
		
		Plane pp = new PassengerPlane();
		
		Airport a = new Airport();
		
		a.test(pp);
		
		((PassengerPlane)pp).carry();  //downcasting 
		((CargoPlane) pc).carry(); //downcasting
//		p.takeOff();
//		pc.flying();
//		pp.flying();
	}
	
}
