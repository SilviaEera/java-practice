package headfirst.secondchapter;

public class BarkRecognizer {
	DogDoor door;
	
	public BarkRecognizer(DogDoor door) {
		this.door = door;
	}

	public void recognizer(BarkSave bark) {
		System.out.println("Bark Recognized heard a " + bark);
		
		if(door.getAllowedBark().equals(bark)) {
			door.open();
		} else {
			System.out.println("This dog is not allowed inside.");
		}
		
//		door.open();
	}
}
