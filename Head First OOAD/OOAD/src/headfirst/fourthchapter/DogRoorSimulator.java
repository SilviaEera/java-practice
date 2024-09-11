package headfirst.fourthchapter;

public class DogRoorSimulator {

	public static void main(String[] args) {
		DogDoor door = new DogDoor();
		
		door.addAllowedBark(new Bark("rowff"));
		door.addAllowedBark(new Bark("woof"));
		door.addAllowedBark(new Bark("yip"));
		
		
		BarkRecognizer barkRecognizer = new BarkRecognizer(door);
		
		System.out.println("Bruce barks...");
		barkRecognizer.recognizer(new Bark("rowff"));
		
		System.out.println("Bruce is outside.");
		
		try {
			Thread.currentThread().sleep(10000);
		} catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		
		System.out.println("Bruce is done, he want's to get inside..");
		
		System.out.println("But the door closed..");
		
		System.out.println("Next door husky howl..");
		
		barkRecognizer.recognizer(new Bark("Awooooooo"));
		
		try {
			Thread.currentThread().sleep(6000);
		} catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		
		System.out.println("Bruce is barking again..");
		barkRecognizer.recognizer(new Bark("WOOF"));
		
		
		System.out.println("He is back inside.....");
	}

}
