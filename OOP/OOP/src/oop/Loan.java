package oop;

public class Loan {
	private String name;
	private String address;
	private int amount;
	private int duration;
	private float interestRate;
	
	public Loan() {
		
	}
	public Loan(String name, String address, int amount, int duration) {
		this.name = name;
		this.address = address;
		this.amount = amount;
		this.duration = duration;
	}
	
	public double calcIn(int amount, int duration, float interestRate) {
		this.amount = amount;
		this.duration = duration;
		this.interestRate = interestRate;
		
		return (amount*duration)*interestRate;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name ) {
		this.name = name;
	}
	
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public int getDuration() {
		return duration;
	}
	
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public float getInterestRate() {
		return interestRate;
	}
	
	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}
	
	public String toString() {
		return "[ 'Name' : " + name + " " + " 'Address' : " + address + " " +  " 'Duration' : " + duration + " " + " 'Amount' : " + amount + " ]";
	}
}
