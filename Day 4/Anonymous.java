abstract class Test {
    abstract void display();
}

class AnaOuter {
    public void anonymousDisplay() {
        Test myTest = new Test() {
            void display() {
                System.out.println("This is a anonymous inner class example.");
            }
        };

        myTest.display();
    }
}

public class Anonymous {
    public static void main(String[] args) {
        AnaOuter anaouter = new AnaOuter();

        anaouter.anonymousDisplay();
    }
}