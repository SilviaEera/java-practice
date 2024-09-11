package headfirst.secondchapter;

public class BarkSave {
	
	private String bark;
	
	
	public  BarkSave(String bark) {
		this.bark = bark;
	}


	public String getBark() {
		return bark;
	}
	
	public boolean equals(BarkSave bark) {
		if(bark instanceof BarkSave) {
			BarkSave  otherBark = (BarkSave) bark;
			if(this.bark.equalsIgnoreCase(otherBark.bark)) {
				return true;
			}
		}
		return false;
	}
}
