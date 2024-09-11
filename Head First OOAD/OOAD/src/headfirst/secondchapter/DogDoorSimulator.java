package headfirst.secondchapter;

public class DogDoorSimulator {

	public static void main(String[] args) {
		
		
		BarkSave barkSoundMain = new BarkSave("rowlf");
		DogDoor door = new DogDoor(barkSoundMain);
		
//		remote object taking door object as parameter 
		
		Remote remote = new Remote(door);
		BarkRecognizer barkr = new BarkRecognizer(door);
		BarkSave barkSound = new BarkSave("Woof");
		System.out.println("Fido is barks to go outside...");
		barkr.recognizer(barkSound);
//		remote.pressButton();
		
		System.out.println("\nFido goes outside...");
		
//		remote.pressButton();
		
		System.out.println("\nFido's all done...");
		
//		remote.pressButton();
		
//		try {
//			Thread.currentThread().sleep(4000);
//		} catch(InterruptedException ie) {
//			ie.printStackTrace();
//		}
		
		System.out.println("Dog Door closes.");
		System.out.println("....Fido is stuck outside...");
		
		System.out.println("Fido barks");
		barkr.recognizer(barkSound);
//		if(!door.isOpen()) {
//			
//		}
//		System.out.println("...Gina grabs the remote.");
//		remote.pressButton();
		System.out.println("\nFido is back inside...");
		
//		remote.pressButton();
	}

}
