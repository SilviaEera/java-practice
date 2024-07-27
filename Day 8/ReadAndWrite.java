import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadAndWrite {
    public static void main(String[] args) {
        try {
            FileInputStream fi = new FileInputStream("file to copy from.txt");

            byte b[] = new byte[fi.available()];

            fi.read(b);

            FileOutputStream fo = new FileOutputStream("file to write to.txt");
            String s = new String(b);
            s = s.toLowerCase();
            System.out.println(s.toLowerCase());
            // fo.write(b);
            fo.write(s.getBytes());
            fi.close();
            fo.close();
        } catch (FileNotFoundException e) {
            System.err.println(e);
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
