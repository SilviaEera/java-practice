package oop;

class DonateToCarity{
	private double balance;

	public void setBalance(double balance) {
		if(balance > 0) {
			this.balance = balance;
			System.out.println("You successfully deposited " + balance + " BDT.");
		} else {
			System.out.println("You cannot deposite negetive amount.");
		}
		
	}
	
}

public class Charity {
	public static void main(String[] args) {
		DonateToCarity dtc = new DonateToCarity();
		dtc.setBalance(1000);
		
	}
	
}
