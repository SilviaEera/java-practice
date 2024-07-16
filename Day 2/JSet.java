import java.util.*;

public class JSet {
    public static void main(String[] args) {
        Set<String> nset = new HashSet<String>();
        nset.add("hi");
        nset.add("there,");
        nset.add("I'm");
        nset.add("Jun");
        nset.add("Wu");
        nset.add("Xie");

        // iterating using a Iterator

        Iterator<String> iterate = nset.iterator();

        while (iterate.hasNext()) {
            String nxt = iterate.next();
            System.out.println(nxt);
        }

        // iterating using a for each loop

        for (String elem : nset) {
            System.out.println(elem);
        }

        // to remove element from set

        nset.remove("hi");
        nset.remove("there");

    }
}
