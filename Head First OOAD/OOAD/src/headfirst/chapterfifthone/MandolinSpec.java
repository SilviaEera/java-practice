package headfirst.chapterfifthone;

public class MandolinSpec extends InstrumentSpec{
	
	private Style style;
	
	public MandolinSpec(Builder builder, String model, Style style, Type type, Wood backWood, Wood topWood) {
		super(builder, model, type, backWood, topWood);
		
		this.style = style;
	}

	public Style getStyle() {
		return style;
	}

	
	
	

}
