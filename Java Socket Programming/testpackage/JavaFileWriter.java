package testpackage;

import java.io.File;
import java.io.FileWriter;

public class JavaFileWriter {
    public static void main(String[] args) throws Exception {
        File f = new File("Test.txt");
        f.createNewFile();
//        true is used so the contents of the file won't be overrided.
        FileWriter fw = new FileWriter("Test.txt", true);

        fw.write("\n");
        fw.write("test line ");

        fw.close();
    }
}
