package multithread;

class ThreadClass extends Thread {

    public void run() {
        int count = 0;
        while (true) {
            System.out.println(count++);
            // have to use try catch or it will throw an exception
            // this exception must be handled
            try {
                // using sleep to slow down the thread
                // time is in milliseconds
                // runs once then sleeps
                sleep(10);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public ThreadClass(String name) {
        super(name);
    }
}

public class ThreadClasses {
    public static void main(String[] args) {
        ThreadClass tc = new ThreadClass("Test Thread 1");
        ThreadClass tc2 = new ThreadClass("test thread 2");
        tc.start();
        // tc.setPriority(3);
        tc2.start();

        // using the methods available in Threads class
        //
        //
        // System.out.println("id of thread1: " + tc.getId());
        // System.out.println("id of thread2: " + tc2.getId());
        // System.out.println("name of thread: " + tc.getName());
        // System.out.println("old priority: " + tc.getPriority());
        // tc.setDaemon(true);
        // tc.setPriority(10);
        // System.out.println("new priority: " + tc.getPriority());
        // System.out.println("is a daemon: " + tc.isDaemon());
        // System.out.println("is alive: " + tc.isAlive());
        // tc.start();
        // System.out.println("state of thread: " + tc.getState());
        // System.out.println("state of thread: " + tc2.getState());
        // System.out.println();
    }
}
