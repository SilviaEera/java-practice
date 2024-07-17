class StaticOuter {
    static int a = 3;
    int b = 6;

    static class StaticInner {
        // static inner classes can be directly accessed by using the outer class name
        // static inner can access the members of outer class if its also static

        void display() {
            System.out.println(a);
            System.out.println("a static inner class accessed using the outer class name.");
            // System.out.println(b); //can not be accessed as its non-static
        }

    }

    void nw() {
        System.out.println("for testing");
    }

}

public class StaticInner {
    public static void main(String[] args) {
        StaticOuter.StaticInner i = new StaticOuter.StaticInner();
        i.display();

        StaticOuter st = new StaticOuter();
        st.nw();

    }
}
