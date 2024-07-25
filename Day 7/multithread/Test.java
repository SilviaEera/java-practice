package multithread;

class MyData {
    int value;
    boolean flag = true;

    synchronized public void setterMethod(int value) {
        while (flag == false) {
            try {
                wait();
                Thread.sleep(1200);
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        this.value = value;
        flag = false;
        notify();
    }

    synchronized public int getterMethod() {
        while (flag == true) {
            try {
                wait();
                Thread.sleep(1200);
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

// thread to set the value
class Setter extends Thread {
    MyData md;
    int count = 0;

    public Setter(MyData md) {
        this.md = md;
    }

    public void run() {
        while (true) {
            md.setterMethod(count);
            System.out.println("setter method " + count);
            count++;
        }
    }

}

// thread to get the value
class Getter extends Thread {
    MyData md;

    public Getter(MyData md) {
        this.md = md;
    }

    public void run() {
        while (true) {
            System.out.println("getter value:  " + md.getterMethod());
        }
    }
}

public class Test {
    public static void main(String[] args) {
        MyData md = new MyData();

        Setter s = new Setter(md);
        Getter g = new Getter(md);

        s.start();
        g.start();
    }
}
