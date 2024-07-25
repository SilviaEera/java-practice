package multithread;

// a single flow program. 
// can not leave the printHello block and move to the main method
class InfiniteLoop {
    public void printHello() {
        int i = 1;

        while (true) {
            System.out.println(i + " Hello");
            i++;
        }
    }
}

public class ControlFlow {
    public static void main(String[] args) {

        InfiniteLoop il = new InfiniteLoop();
        il.printHello();
        int i = 1;

        while (true) {
            System.out.println(i + " Hello");
            i++;
        }
    }
}