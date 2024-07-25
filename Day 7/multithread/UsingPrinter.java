package multithread;

class Printer {
    synchronized public void printing(String userName) {
        System.out.println(userName + " is currently printing a document.");

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class User extends Thread {
    Printer printer;
    String userName;

    User(String userName, Printer printer) {
        this.userName = userName;
        this.printer = printer;
    }

    public void usePrinter() {
        printer.printing(userName);
    }

    public void run() {
        usePrinter();
    }
}

public class UsingPrinter {

    public static void main(String[] args) {
        Printer printer = new Printer();

        User user1 = new User("Silvia", printer);
        User user2 = new User("Kogami", printer);
        User user3 = new User("Indra", printer);

        user1.start();
        user2.start();
        user3.start();

    }

}
