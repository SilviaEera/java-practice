package oop.headfirst.chapterone;

public class Guiter {
	private String serialNumber, builder, model, type, backWood, topWood;
	
	private double price;
	
	public Guiter(String serialNumber, String builder, String type, String backWood, String topWood, double price) {
		this.serialNumber = serialNumber;
		this.builder = builder;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
		this.price = price;
	}
	
	
//	setters and getters
	
	public String getSerialNumber() {
		return serialNumber;
	}
	
	public String getBuilder() {
		return builder;
	}
	
	public String getType() {
		return type;
	}
	
	public String getBackWood() {
		return backWood;
	}
	
	public String getTopWood() {
		return topWood;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
}
