package headfirst.fourthchapter;

public class Bark {
	
	private String sound;
	
	public Bark(String sound) {
		this.sound = sound;
	}
	
	
	public boolean equals(Object bark) {

		if(bark instanceof Bark) {
			Bark otherBark = (Bark) bark;
			
			if((this.sound).equalsIgnoreCase(otherBark.sound)) {
				return true;
			}
		}
		return false;
	}
	
	
	
	public String getSound() {
		return sound;
	}
	
	public String toString() {
		return sound;
	}

}
