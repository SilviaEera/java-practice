import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutput {
    public static void main(String[] args) {
        try {
            FileOutputStream newFile = new FileOutputStream("C:/Users/Eera/Desktop/FileInput/Test.txt");

            String s = "The quick brown fox jumps over the lazy dog. ";

            String s2 = "Written from a java program to test the output stream. to test on your own just change the file directory and make a folder where you want to keep your file. ";

            String test = "Test String";
            byte b[] = test.getBytes();
            newFile.write(s.getBytes());
            newFile.write(s2.getBytes());
            newFile.write(b, 5, b.length - 5);
            ;

            newFile.close();

        } catch (FileNotFoundException e) {
            System.err.println(e);
        } catch (IOException e) {
            System.err.println(e);
        }

    }
}
