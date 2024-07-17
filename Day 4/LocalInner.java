class Outer {

    void diaplay() {
        // class inside the method will only be useful and visible inside the method
        class Inner {
            void innerDisplay() {
                System.out.println("this is a class inside a method.");
            }
        }

        Inner i = new Inner();
        i.innerDisplay();
    }

}

public class LocalInner {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.diaplay();
    }
}
