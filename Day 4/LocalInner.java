class OuterL {

    void diaplay() {
        // class inside the method will only be useful and visible inside the method
        class InnerL {
            void innerDisplay() {
                System.out.println("this is a class inside a method. its the implementation of local inner class.");
            }

            void show() {
                System.out.println("from anonymous object");
            }
        }

        InnerL i = new InnerL();
        i.innerDisplay();

        // anonymous object
        new InnerL().show();
    }

}

public class LocalInner {
    public static void main(String[] args) {
        OuterL o = new OuterL();
        o.diaplay();
    }
}
