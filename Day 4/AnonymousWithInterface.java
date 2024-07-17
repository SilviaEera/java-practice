interface Test1 {
    public void testDisplay();
}

class WithInterface {
    public void withInterfaceDisplay() {
        Test1 t = new Test1() {
            public void testDisplay() {
                System.out.println("Anonymous example using interface");
            }
        };

        t.testDisplay();
    }
}

public class AnonymousWithInterface {
    public static void main(String[] args) {
        WithInterface withinter = new WithInterface();
        withinter.withInterfaceDisplay();
    }
}
