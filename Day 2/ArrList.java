import java.util.*;

public class ArrList {
    public static void main(String args[]) {

        List<String> n = new ArrayList<>();

        n.add("the");
        n.add("fox");
        n.add("is");
        n.add("cute");

        // using get method of list to access an elemetn

        try {
            String s = n.get(5);
            System.out.println(s);
        } catch (Exception e) {
            System.err.println(e);
        }

        for (String i : n) {
            System.out.println(i);
        }

        // using iterator

        Iterator itt = n.iterator();

        while (itt.hasNext()) {
            System.out.println(" iterator use " + itt.next());

        }

        System.out.println("END OF ITERATOR ");

        // Accessing list elemetn using a standered for loop

        for (int i = 0; i < n.size(); i++) {
            System.out.println("using a good old for loop: " + n.get(i));
        }

        System.out.println("end of the for loop");

        // for ArrayList's search operation is O(1); For LinkedList's search operation
        // is O(n); for insertion in linkedlist: at the begninning it's O(1), at the
        // middle or end O(n)

        // size of the list

        int size = n.size();

        System.out.println(size);

    }
}
