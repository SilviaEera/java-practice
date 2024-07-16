import java.util.Arrays;
import java.util.List;

class Num {
    private static void print(int number) {
        System.out.println(number);
    }

    public static void PrintNumList(List<Integer> nums) {
        nums.stream()
                .forEach(Num::print);
    }
}

public class NumPrint {
    public static void main(String args[]) {
        Num obj = new Num();

        obj.PrintNumList(Arrays.asList(1, 6, 4, 33, 7, 3, 0));
    }
}
