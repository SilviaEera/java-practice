package headfirst.chapterfifthone;

public abstract class Instrument {
	private String serialNumber;
	private double price;
	private InstrumentSpec spec;
	
	
	public Instrument(String serial, double price, InstrumentSpec spec) {
		this.serialNumber = serialNumber;
		this.price = price;
		this.spec = spec;
	}


	public String getSerialNumber() {
		return serialNumber;
	}


	public double getPrice() {
		return price;
	}


	public InstrumentSpec getSpec() {
		return spec;
	}
	
	
}
