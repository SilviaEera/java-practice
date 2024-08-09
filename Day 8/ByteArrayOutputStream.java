// import java.io.ByteArrayOutputStream;

import java.io.*;

public class ByteArrayOutputStream {

    public static void main(String[] args) throws Exception {
        char c[] = { 'c', 'f', 's', 'a' };

        CharArrayReader ch = new CharArrayReader(c);
        int x;
        while ((x = ch.read()) != -1) {
            System.out.print((char) x + " ");
        }

        ch.close();

        // byte b[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h' };
        // ByteArrayInputStream bos = new ByteArrayOutputStream(b);

        // ByteArrayOutputStream bos = new ByteArrayOutputStream();

        // bos.w

    }
}
