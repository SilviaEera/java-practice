package trycatchpackage;

public class MultipleCatch {
    int arr[] = { 2, 5, 3, 6, 2, 9, 0, 4, 2 };

    public void dis2() {
        try {
            int res = arr[5] / arr[1];
            System.out.println("Result is " + res);
            System.out.println();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println(e);
        } catch (ArithmeticException e) {
            System.err.println(e);
        }

        System.out.println("end of multiple try catch / nested try catch");
    }
}
