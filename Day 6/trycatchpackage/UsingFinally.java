package trycatchpackage;

class TestClass {
    public void finallyMethod() {
        try {
            System.out.println(10 / 0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("This is inside the finally block");
        }
    }
}

public class UsingFinally {
    public static void main(String[] args) {
        TestClass tc = new TestClass();
        tc.finallyMethod();
    }
}
