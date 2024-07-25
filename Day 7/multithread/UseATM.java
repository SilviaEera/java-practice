package multithread;

class ATM {
    synchronized public void checkBalance(String customerName) {
        System.out.print(customerName + " checking ");

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.print(" balance. ");
    }

    synchronized public void withdraw(String customerName, int withdrawAmount) {
        System.out.print("customer " + customerName + " is withdrawing ");

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.print(withdrawAmount + " ");
    }
}

class Customer extends Thread {
    ATM atm;

    String customerName;
    int withdrawAmount;

    Customer(String customerName, int withdrawAmount, ATM atm) {
        this.customerName = customerName;
        this.withdrawAmount = withdrawAmount;
        this.atm = atm;
    }

    public void UseATM() {
        atm.checkBalance(customerName);
        atm.withdraw(customerName, withdrawAmount);
    }

    public void run() {
        UseATM();
    }

}

public class UseATM {
    public static void main(String[] args) {
        ATM atm = new ATM();
        Customer c1 = new Customer("Silvia", 1000, atm);
        Customer c2 = new Customer("Tasnimoon", 100, atm);
        Customer c3 = new Customer("Saku", 50000, atm);
        c1.start();
        c2.start();
        c3.start();
    }

}
