package trycatchpackage;

import java.util.*;

public class TryCatch {
    Scanner sc = new Scanner(System.in);
    int a = 343;

    int c;

    public void dis() {
        try {
            int b = sc.nextInt();
            c = a / b;
            System.out.println("Result is: " + c);
            System.out.println();
        } catch (ArithmeticException e) {
            System.err.println(e);
        } catch (InputMismatchException e) {
            System.err.println(e);
            System.out.println();
            System.out.println("please enter an integer value to continue.");
            System.out.println();
        }
        System.out.println("End of try catch.");
        System.out.println();
    }
}