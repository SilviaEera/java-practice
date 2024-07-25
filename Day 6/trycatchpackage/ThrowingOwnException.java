package trycatchpackage;

class InvalidInputExcaption extends Exception {
    public String toString() {
        return "Please input a positive number. Height or width cannot be negative.";
    }
}

public class ThrowingOwnException {

    static int test1(int h, int w) throws InvalidInputExcaption {
        if (h < 0 || w < 0) {
            throw new InvalidInputExcaption();
        }

        int areaResult = h * w;
        return areaResult;
    }

    static void test2() throws InvalidInputExcaption {
        try {
            System.out.println("area is " + test1(9, 6));
        } catch (InvalidInputExcaption e) {
            System.out.println(e.toString());
        }
    }

    public static void main(String[] args) throws InvalidInputExcaption {
        test2();
    }
}
