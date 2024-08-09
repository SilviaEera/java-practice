import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

class Producer extends Thread {
    OutputStream o;
    Scanner sc = new Scanner(System.in);

    Producer(
            OutputStream o) {
        this.o = o;
    }

    String s;

    public void run() {
        // int count = 1;
        int count = 1;
        while (count <= 10) {
            try {
                s = sc.nextLine();
                o.write(s.getBytes());
                o.flush();
                System.out.println("Producer " + s);
                System.out.println();
                System.out.flush();
                // count++;
                Thread.sleep(10);
                count++;

            } catch (IOException e) {
                System.out.println(e);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class Consumer extends Thread {
    InputStream i;
    // String s;

    Consumer(InputStream i) {
        this.i = i;
    }

    public void run() {
        int x;

        try {
            byte b[] = new byte[i.available()];
            while (i.available() != -1) {
                i.read(b);
                x = i.read();
                // for (int x : b) {
                System.out.print((char) x);
                // }
                System.out.print((char) x);

                Thread.sleep(10);
                System.out.flush();
            }
            System.out.println();
        } catch (IOException e) {

        } catch (InterruptedException e) {
        }
    }
}

public class PipedStream {
    public static void main(String[] args) {
        PipedInputStream pi = new PipedInputStream();
        PipedOutputStream po = new PipedOutputStream();

        Producer p = new Producer(po);
        Consumer c = new Consumer(pi);

        try {
            po.connect(pi);
        } catch (IOException e) {

        }
        p.start();
        c.start();
    }
}
