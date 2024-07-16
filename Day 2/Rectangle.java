class Test {
    private int height;
    private int width;

    public Test() {
        height = 2;
        width = 5;
    }

    public void area() {
        System.out.println(height * width);
    }
}

public class Rectangle {
    public static void main(String args[]) {
        Test ob = new Test();

        ob.area();

    }
}
