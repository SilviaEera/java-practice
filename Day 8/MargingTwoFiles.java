import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOError;
import java.io.IOException;
import java.io.SequenceInputStream;

public class MargingTwoFiles {
    public static void main(String[] args) {
        try {
            FileInputStream fi1 = new FileInputStream("file to copy from.txt");
            FileInputStream fi2 = new FileInputStream("file to write to.txt");
            FileOutputStream fo = new FileOutputStream("margeTxt.txt");
            FileOutputStream fo2 = new FileOutputStream("marge.txt");
            SequenceInputStream si = new SequenceInputStream(fi1, fi2);

            // byte b[] = new byte[si.available()];
            int x;
            while ((x = si.read()) != -1) {
                int v = si.read();
                fo2.write((char) v);
                fo.write((char) x);

            }

            // fo.write(b);

            // fi1.close();
            // fi2.close();
            // fo.close();
            // si.close();

        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
