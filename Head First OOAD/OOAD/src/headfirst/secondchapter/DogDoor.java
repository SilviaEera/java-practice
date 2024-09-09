package headfirst.secondchapter;

public class DogDoor {
	private boolean open;
	
	
	public DogDoor() {
		
//		initially the dog door will be closed 
		this.open = false;
	}
	
	public void open() {
		System.out.println("The dog door opens.");
		open = true;
	}
	
	public void close() {
		System.out.println("The dog door closes.");
		open = false;
	}
	
//	to check if the door is open or not 
	
	public boolean isOpen() {
		return open;
	}
}
