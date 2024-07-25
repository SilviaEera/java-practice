package multithread;

class SharedData {
    private int value = 0;
    boolean flag = true;

    // set method for writing the value
    synchronized public void setData(int value) {
        //
        //
        // when the flag is true the producer thread will write the value
        //
        //
        // when the flag is not true it will wait.
        // wait means this thead will stop its process and the other thread will run

        //
        // after running the producer thread and setting the value the flag will be set
        // to false
        // means after writing the value the other thread will read the value
        while (flag != true) {
            try {
                wait();

                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        this.value = value;
        flag = false;
        notify();
    }

    // get method for reading the value
    synchronized public int getData() {

        while (flag != false) {
            try {
                wait();

                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        int x = 0;

        x = value;
        flag = true;
        notify();
        return x;
    }
}

// producer that will set the data

class Producer extends Thread {
    SharedData sd;

    Producer(SharedData sd) {
        this.sd = sd;
    }

    public void run() {
        int count = 1;

        while (true) {
            sd.setData(count);
            System.out.println("producer " + count);
            count++;
        }
    }
}

class Consumer extends Thread {
    SharedData sd;

    Consumer(SharedData sd) {
        this.sd = sd;
    }

    public void run() {

        int value;
        while (true) {
            value = sd.getData();
            System.out.println("consumer " + value);
        }
    }
}

public class InterCommunicationOfThreads {
    public static void main(String[] args) {
        SharedData sd = new SharedData();

        Producer p = new Producer(sd);
        Consumer c = new Consumer(sd);

        p.start();
        c.start();

    }
}
