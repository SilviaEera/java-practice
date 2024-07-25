package multithread;

class MultithreadUsingRunnable implements Runnable {
    public void run() {
        int i = 0;
        while (true) {
            System.out.println(i + " hello");
            i++;
        }
    }
}

public class UsingRunnable {
    public static void main(String[] args) {

        MultithreadUsingRunnable mtwr = new MultithreadUsingRunnable();

        Thread t = new Thread(mtwr);

        t.start();

        int i = 0;
        while (true) {
            System.out.println(i + " world");
            i++;
        }

    }
}
