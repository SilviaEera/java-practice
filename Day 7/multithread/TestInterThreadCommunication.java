package multithread;

class MyData {
    int value;
    boolean flag = true;

    synchronized public void set(int value) {
        while (flag != true) {
            try {
                wait();
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        this.value = value;
        flag = false;
        notify();

    }

    synchronized public int get() {
        while (flag != false) {
            try {
                wait();
                Thread.sleep(500);
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

// the thread that will set the value

class Setter extends Thread {
    MyData md;
    // int value;
    int cnt = 1;

    Setter(MyData md) {
        this.md = md;
    }

    public void run() {
        while (true) {

            md.set(cnt);
            System.out.println("set value ===> " + cnt);
            cnt++;
        }
    }
}

// the thread that will get the value
class Getter extends Thread {
    MyData md;
    int value;

    Getter(MyData md) {
        this.md = md;
    }

    public void run() {
        while (true) {
            value = md.get();
            System.out.println("get value ===> " + value);
            // sys
        }
    }
}

public class TestInterThreadCommunication {
    public static void main(String[] args) {
        MyData md = new MyData();

        Setter s = new Setter(md);
        Getter g = new Getter(md);

        s.start();
        g.start();
    }
}
