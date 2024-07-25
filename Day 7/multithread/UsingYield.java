package multithread;

class UsinYieldInThread extends Thread {
    public void run() {
        int cnt = 0;
        while (true) {
            System.out.println(cnt++ + " my thread");
            UsinYieldInThread.yield();
        }
    }
}

public class UsingYield {
    public static void main(String[] args) {
        UsinYieldInThread uyit = new UsinYieldInThread();

        uyit.start();

        int cnt = 0;
        while (true) {
            System.out.println(cnt++ + " main");
            //
            // using yield on a thread gives the other threads more cpu time
            // Thread.yield();
        }

    }
}
