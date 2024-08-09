public class ObjectClass {
    public static void main(String[] args) {
        Object obj[] = new Object[3];

        obj[0] = "Hi";
        obj[1] = "I'm";
        obj[2] = 9;

        for (int i = 0; i < obj.length; i++) {
            System.out.print(obj[i] + " ");
        }

    }
}
