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
        TestStatic s1 = new TestStatic();
        s1.color = "blue";
        s1.price = 100;

        s1.printDetails();

    }
}
