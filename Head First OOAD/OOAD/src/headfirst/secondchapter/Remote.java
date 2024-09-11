package headfirst.secondchapter;

import java.util.Timer;
import java.util.TimerTask;

public class Remote {
	private DogDoor door;
	
	public Remote(DogDoor door) {
		this.door = door;
	}
	
	public void pressButton() {
		System.out.print("Pressing the remote button : ");
		
		if(door.isOpen()) {
			door.close();
		} else {
			door.open();
		}
	
	
	
//	adding timer so door will close automatically after a time 
	
//	final Timer timer = new Timer();
//	
//	timer.schedule(new TimerTask(){
//		public void run() {
//			door.close();
//			timer.cancel();
//		}
//	}, 5000);
	
	}
}

