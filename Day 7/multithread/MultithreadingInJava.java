package multithread;

// have to extende the Thread class to achive multithreading
class Multithread extends Thread {
    // have to override the run() method to achive multithrading
    public void run() {
        int i = 1;
        while (true) {
            System.out.println(i + " hello");
            i++;
        }
    }
}

class TestThread extends Thread {
    public void run() {
        int i = 1;
        while (true) {
            System.out.println(i + " Test..............");
            i++;
        }
    }
}

public class MultithreadingInJava {
    public static void main(String[] args) {

        // creating the object of Multithread with the referance mt
        Multithread mt = new Multithread();
        // start() method will call the run() method and start running the thread
        // built in method of the Thread class that calls a thread
        TestThread tt = new TestThread();
        tt.start();

        mt.start();

        int i = 1;
        while (true) {
            System.out.println(i + " world");
            i++;
        }

    }
}
