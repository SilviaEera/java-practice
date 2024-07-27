import java.io.*;

public class TryWithResource {
    public static void main(String[] args) throws Exception {

        // with try with resoueces dont need to write catch block to catch the exception
        try (FileOutputStream f = new FileOutputStream("test.txt")) {

            String s = "Some test lines written.";
            f.write(s.getBytes());
        }
    }

}