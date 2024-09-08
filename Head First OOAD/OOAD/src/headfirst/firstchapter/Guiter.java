package headfirst.firstchapter;

public class Guiter {
	
//	variables used 
	
	private String serial;
	private Double price;
	private GuiterSpec spec;
	
	
//	constructor 
	
	public Guiter(String serial, Double price, GuiterSpec spec ) {
		this.serial = serial;
		this.price = price;
		this.spec = spec;
	}
	
//	getter and setter method 
	
//	public Guiter(String serial2, double price2, GuiterSpec spec2) {
//		// TODO Auto-generated constructor stub
//	}

	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getSerial() {
		return serial;
	}

	public GuiterSpec getSpec() {
		return spec;
	}

	
	
	

}
