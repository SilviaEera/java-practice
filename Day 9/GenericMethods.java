public class GenericMethods {

    static <E> void show(E... ls) {
        for (E x : ls) {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {

        show(new String[] { "hello", "world" });
        show(4, 3, 35);

    }
}
