package multithread;

class UsingJoin extends Thread {
    public void run() {
        int count = 1;

        while (true) {
            System.out.println(count++);
            // using conditon to run the daemon thread
            // it will run for a while and stop
            // as it's a deamon thread and joined with the main thread
            // main thread will stop for this thread to stop executing to terminate itself
            // if (count == 200) {
            // break;
            // }
        }
    }

}

public class UsingJoinToJoinOtherThreads {
    public static void main(String[] args) {
        UsingJoin uj = new UsingJoin();
        uj.setDaemon(true);
        uj.start();

        // referancing the main thread using Thread.currentThread()
        Thread mainThread = Thread.currentThread();

        // joins any other thread that is running
        // using join will throw an exception
        // so it must be handled using try and catch
        try {
            mainThread.join();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
