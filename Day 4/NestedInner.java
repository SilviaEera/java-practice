class Outer {
    int age = 23;

    class Inner {
        public void innerDisplay() {
            System.out.println(age);
        }
    }

    public void outerDisplay() {
        Inner inner = new Inner();
        inner.innerDisplay();
    }
}

class NestedInner {
    public static void main(String args[]) {
        Outer outer = new Outer();
        outer.outerDisplay();
    }
}