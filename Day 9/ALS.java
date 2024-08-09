import java.util.*;

public class ALS {
    public static void main(String[] args) {
        ArrayList al = new ArrayList<>();

        al.add(100);
        al.add(200);
        al.add(300);
        al.add(400);

        System.out.println(al);

        System.out.println("##############################################################");

        ArrayList al2 = new ArrayList<>();

        al2.add(3);
        al2.add("Cat");
        al2.add('A');
        al2.add("Fox");
        al2.add(2.4);

        System.out.println("before adding another collection to this collection: ");

        System.out.println(al2);

        al2.add(2, al);

        System.out.println(al2.size());

        al.ensureCapacity(40);

        System.out.println(al);

        System.out.println(al.size());
        System.out.println(al.lastIndexOf(al));

        System.out.println("after adding the first collection to this collection: ");

        System.out.println(al2);

        // al2.retainAll(al);
        al2.remove(2);

        System.out.println(al.contains(1000));

        // al2.clear();
        System.out.println(al2);
    }

}
