class TestStatic {
    static int price = 10;

    String color;

    public void printDetails() {
        System.out.println("price : " + price);
        System.out.println("color : " + color);
    }
}

public class StaticVariable {
    public static void main(String[] args) {

        // if i change the static variables value in an instance, all the instance
        // cerate
        TestStatic s1 = new TestStatic();
        s1.color = "blue";
        s1.price = 100;

        s1.printDetails();
        System.out.println("===========");
        TestStatic s2 = new TestStatic();

        s2.printDetails();

    }
}
