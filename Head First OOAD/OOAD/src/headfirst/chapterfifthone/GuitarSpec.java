package headfirst.chapterfifthone;

public class GuitarSpec extends InstrumentSpec{
	private String numString;

	public GuitarSpec(Builder builder, String model, Type type, String numString,Wood backWood, Wood topWood) {
		super(builder, model, type, backWood, topWood);
		
		this.numString = numString;
	}

	public String getNumString() {
		return numString;
	}
	
	public boolean match(InstrumentSpec checkSpec) {
		
		GuitarSpec spec = (GuitarSpec) checkSpec;
		
		if(!(super.match(checkSpec))) {
			return false;
		}
		
		if(!(checkSpec instanceof GuitarSpec)) {
			return false;
		}
		
		return true;
	}

}
