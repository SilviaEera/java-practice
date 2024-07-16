class Paren {
    public Paren() {
        System.out.println("Parent without parameter");
    }

    public Paren(int a, int c) {
        System.out.println("parent with parameters " + a + " " + c);
    }
}

class Chil extends Paren {
    public Chil() {
        System.out.println("no param");
    }

    public Chil(int b, int c, int x) {
        super(c, x);

        System.out.println("with params");
    }
}

public class WithParam {
    public static void main(String args[]) {
        Chil h = new Chil(5, 6, 4);
    }
}
