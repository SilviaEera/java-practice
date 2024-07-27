
// import java.io.*;
import java.io.FileInputStream;
// import java.io.FileNotFoundException;
// import java.io.IOException;
// import javax.imageio.stream.FileImageInputStream;

public class FileInput {
    public static void main(String[] args) throws Exception {
        try (
                FileInputStream inp = new FileInputStream("test.txt")) {
            // byte newByteArr[] = new byte[inp.available()];

            // inp.read(newByteArr);

            int x;

            // do {
            // x = inp.read();
            // System.out.print((char) x);
            // } while (x != -1);

            while (inp.available() != 0) {
                x = inp.read();
                System.out.print((char) x);
            }

            // String readFromFile= new String(newByteArr);

            // System.out.println(readFromFile);

        }
    }
}