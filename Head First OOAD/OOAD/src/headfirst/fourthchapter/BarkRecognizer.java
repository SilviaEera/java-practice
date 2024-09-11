package headfirst.fourthchapter;

import java.util.Iterator;
import java.util.List;

public class BarkRecognizer {
	
	private DogDoor door;
	
	
	public BarkRecognizer(DogDoor door) {
		this.door = door;
	}
	
	
	public void recognizer(Bark bark) {
		System.out.println("Bark recognizer heard a " + bark);
		
		List barkList = door.getAllowedBarks();
		
		for(Iterator i = barkList.iterator(); i.hasNext();) {
			Bark allowedBark = (Bark) i.next();
			
			if(allowedBark.equals(bark)) {
				door.open();
				return;
			} 
		}
		System.out.println("This dog is not allowed..");
	}

}
