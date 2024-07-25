package multithread;

class DisplayCharacters {

    // method can also be made synchronize to achive synchronization
    // use the synchronized keyword before the method
    // if used synchronized at a time only one thread can use this method or block

    //
    //

    // this method is the shared data object that handles everything
    // the thread just has to call its method to read and write
    public void displayCharacter(String s) {

        // using s synchronized block to achive synchronization
        // this will finish one thread execution fitst then start the next thread
        synchronized (this) {
            for (int i = 0; i < s.length(); i++) {
                System.out.print(s.charAt(i));

                // making the thread run slowly using sleep
                // after running once the thread will sleep/stop for 100 ms then continue
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }

    }
}

class ThreadOne extends Thread {
    DisplayCharacters d;

    ThreadOne(DisplayCharacters d) {
        this.d = d;
    }

    public void run() {
        d.displayCharacter("  Raven of the inner palace  ");

    }
}

class ThreadTwo extends Thread {
    DisplayCharacters d2;

    ThreadTwo(DisplayCharacters d2) {
        this.d2 = d2;
    }

    public void run() {
        d2.displayCharacter("  six of crows  ");
    }
}

public class SynchronizationUsingMonitor {
    public static void main(String[] args) {
        DisplayCharacters dc = new DisplayCharacters();

        ThreadOne t1 = new ThreadOne(dc);
        ThreadTwo t2 = new ThreadTwo(dc);

        t1.start();
        t2.start();

    }
}
