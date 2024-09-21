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
				
				
//				if a mathing bark is found return from the method/get out of the method
				return;
			} 
		}
		
//		if not mathch is found after iterating the whole list, get out of the loop and return not allowed
		
		
		System.out.println("This dog is not allowed..");
	}

}
