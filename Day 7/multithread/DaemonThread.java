package multithread;

class DeamonThreadTest extends Thread {
    public void run() {
        int count = 1;
        while (true) {
            System.out.println(count++);
            // if (count == 3001) {
            // break;
            // }
        }
    }
}

public class DaemonThread {
    public static void main(String[] args) {
        DeamonThreadTest dtt = new DeamonThreadTest();

        // when main method ends if thread is set as a daemon the thread will also end
        // daemon can also be set in the thread constractor
        dtt.setDaemon(true);
        dtt.start();

        // Question: why does the thread execution speed/time vary each time

        //
        // the main method is sleeping for 10 milliseconds
        // while the DaemonThreadTest thread is running
        // after the 10 ms the main thread terminates so does the daemon thread
        try {
            Thread.sleep(10);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
