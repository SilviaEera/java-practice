package oop.headfirst.chapterone;

public class Guiter {
	private String serialNumber, model;

	Wood backWood;

	Wood topWood;

	Type type;

	Builder builder;
	
	private double price;
	
	public Guiter(String serialNumber, Builder builder,String model, Type type, Wood backWood, Wood topWood, double price) {
		this.serialNumber = serialNumber;
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
		this.price = price;
	}
	
	
//	setters and getters
	
	


	public String getSerialNumber() {
		return serialNumber;
	}
	
	public String getModel() {
		return model;
	}
	
	public Builder getBuilder() {
		return builder;
	}
	
	public Type getType() {
		return type;
	}
	
	public Wood getBackWood() {
		return backWood;
	}
	
	public Wood getTopWood() {
		return topWood;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
}
