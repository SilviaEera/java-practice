import java.util.LinkedList;

public class LinkedListClass {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList<>();

        ll.add(2);
        ll.add(7);
        ll.add(3);
        ll.add(5);

        System.out.println(ll);

        ll.push(53);
        ll.push(5.3);

        System.out.println(ll);

    }
}
