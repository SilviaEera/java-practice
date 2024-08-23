package oop;

public class HomeLoan extends Loan{

	public HomeLoan(String name, String address, int amount, int duration) {
		super(name, address, amount, duration);
		
		super.setInterestRate(3.6f);
		
	}

}
