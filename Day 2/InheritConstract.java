class Parent {
    public Parent() {
        System.out.println("parent constractor");
    }
}

class Child extends Parent {
    public Child() {
        System.out.println("child constractor");
    }
}

public class InheritConstract {
    public static void main(String args[]) {
        Child ch = new Child();
    }
}
