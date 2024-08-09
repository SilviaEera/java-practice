import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayInput {
    public static void main(String[] args) {

        String s = "Hello World";

        byte bArr[] = new byte[s.length()];

        bArr = s.getBytes();

        try {
            FileOutputStream fo = new FileOutputStream("new.txt");

            for (int y : bArr) {
                fo.write(y);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }

        for (int x : bArr) {
            System.out.print((char) x + "->" + x + " ");
        }

        // System.out.println();
    }
}
