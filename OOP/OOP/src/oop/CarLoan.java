package oop;

public class CarLoan extends Loan{

	public CarLoan(String name, String address, int amount, int duration) {
		super(name, address, amount, duration);
		super.setInterestRate(1.4f);
	}

}
