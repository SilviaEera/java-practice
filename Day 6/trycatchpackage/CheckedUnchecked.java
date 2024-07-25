package trycatchpackage;

public class CheckedUnchecked {
    static void test1() {

        // arithmetic execeptions are unchecked exceptions that do not need to be
        // handled but does throw exception when executed
        try {
            System.out.println(10 / 0);
        } catch (Exception e) {
            System.out.println(e.getCause());
            System.out.println(e.getMessage());
            System.out.println(e.fillInStackTrace());
        }
        // writing this throws an exception that is carried to all the methods that
        // calls it.
        // System.out.println(10 / 0);
    }

    static void test2() {
        test1();
    }

    static void test3() {
        test2();
    }

    public static void main(String[] args) {
        test3();
    }
}
