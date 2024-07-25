final class FinalClass {
    public void finalClassDisplay() {
        System.out.println("this class is final and cannot be implemented.");
    }
}

// The type FinalImplementation cannot subclass the final class FinalClass

class SuperFinal {
    final public void displayFinal() {
        System.out.println("this is a final method that cannot be overrided.");
    }

    public void displayNotFinal() {
        System.out.println("this is not a final method so it can be overrided. say cheese :)");
    }
}

class ChildFinal extends SuperFinal {
    // void displayFinal() {
    // cannot override :)
    // }

    // overrided this method
    public void displayNotFinal() {
        System.out.println("overrided this method as it was not final");
    }
}

public class FinalImplementation {
    public static void main(String[] args) {
        SuperFinal sp = new ChildFinal(); // dynamic method dispatch

        sp.displayFinal();
        sp.displayNotFinal();
    }
}