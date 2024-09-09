package headfirst.secondchapter;

public class DogDoorSimulator {

	public static void main(String[] args) {
		DogDoor door = new DogDoor();
		
//		remote object taking door object as parameter 
		
		Remote remote = new Remote(door);
		
		System.out.println("Fido is barks to go outside...");
		
		remote.pressButton();
		
		System.out.println("\nFido goes outside...");
		
//		remote.pressButton();
		
		System.out.println("\nFido's all done...");
		
//		remote.pressButton();
		
		try {
			Thread.currentThread().sleep(8000);
		} catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		
//		System.out.println("Dog Door closes.");
		System.out.println("....Fido is stuck outside...");
		System.out.println("...Gina grabs the remote.");
		remote.pressButton();
		System.out.println("\nFido is back inside...");
		
//		remote.pressButton();
	}

}
