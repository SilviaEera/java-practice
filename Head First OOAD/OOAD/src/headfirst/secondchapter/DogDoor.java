package headfirst.secondchapter;

import java.util.Timer;
import java.util.TimerTask;

public class DogDoor {
	private boolean open;
	private BarkSave allowedBark; 
	
	public DogDoor(BarkSave bark) {
		
//		initially the dog door will be closed 
		this.open = false;
		this.allowedBark = bark;
		
	}
	
	public void open() {
		System.out.println("The dog door opens.");
		open = true;
	
	final Timer timer = new Timer();
	
		timer.schedule(new TimerTask(){
			public void run() {
				close();
				timer.cancel();
			}
		}, 1000); 
	}
	public void close() {
		System.out.println("The dog door closes.");
		open = false;
	}
	
//	to check if the door is open or not 
	
	public boolean isOpen() {
		return open;
	}

	public BarkSave getAllowedBark() {
		return allowedBark;
	}

	public void setAllowedBark(BarkSave allowedBark) {
		this.allowedBark = allowedBark;
	}
}
