import java.util.*;

public class TwoThreeMoves {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // if (n / 2 < 1) {
        // System.err.println(1);
        // } else if (n / 3 < 1) {
        // System.out.println(1);
        // } else if (n % 2 == 0) {
        // if (n / 3 != (int) (n / 3)) {
        // System.out.println(n / 2);
        // } else {
        // System.out.println(n / 3);
        // }
        // }

        int two = n / 2;
        int three = n / 3;

        if (two < three) {
            System.out.println(2);
        } else if (three < two) {
            if (three == (int) three) {
                System.out.println(three);
            } else {
                System.out.println(two);
            }
        }

        // else if (n / 3 < n / 2) {
        // System.out.println(n / 3);
        // }
    }
}
