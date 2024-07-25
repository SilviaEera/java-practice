import trycatchpackage.TryCatch;
import trycatchpackage.MultipleCatch;

public class MainTryCatch {
    public static void main(String[] args) {
        TryCatch tc = new TryCatch();
        tc.dis();

        System.out.println();
        System.out.println("finished executing TryCatch.");
        System.out.println();
        MultipleCatch mtc = new MultipleCatch();
        mtc.dis2();
    }
}
