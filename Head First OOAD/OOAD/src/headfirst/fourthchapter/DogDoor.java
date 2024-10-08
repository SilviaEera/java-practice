package headfirst.fourthchapter;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class DogDoor {
	
	private boolean open;
	private List allowedBarks;
	
	
	public DogDoor() {
		this.open = false;
		this.allowedBarks = new LinkedList();
	}
	
	public void addAllowedBark(Bark bark) {
		allowedBarks.add(bark);
	}
	
	public List getAllowedBarks() {
		return allowedBarks;
	}
	
	
	public void open() {
		System.out.println("The dog door opens..");
		open = true;
		
//		using timer to close the door automatically if open
		
		final Timer timer = new Timer();
		
		timer.schedule(new TimerTask() {
			
			@Override
			public void run() {
				close();
				timer.cancel();
			}
		},5000);
	}
	
	public void close() {
		System.out.println("The dog door closes..");
		open = false;
	}
	
	
	public boolean isOpen() {
		return open;
	}
	
	
	
}
