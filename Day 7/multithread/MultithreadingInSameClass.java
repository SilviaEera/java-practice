package multithread;

public class MultithreadingInSameClass extends Thread {

    public void run() {
        int i = 0;
        while (true) {
            System.out.println(i + " hello");
            i++;
        }
    }

    public static void main(String[] args) {

        MultithreadingInSameClass mtsc = new MultithreadingInSameClass();

        mtsc.start();

        int i = 0;
        while (true) {
            System.out.println(i + " world");
            i++;
        }

    }
}
