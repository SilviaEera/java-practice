class A {
}

class B extends A {
}

class C extends B {
}

class D {
}

class Gen<T extends A> {
}

class Gen2<T extends Number> {
}

public class GenericBounds {
    public static void main(String[] args) {
        Gen<C> ng = new Gen<>();

        Gen2<Double> dg = new Gen2<>();
    }
}
