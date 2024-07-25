class CoffeeMachine {
    public int coffeeQuantity;
    public int waterQuantity;
    static private CoffeeMachine myCoffeeMachine = null;

    void coffeeCup() {
        System.out.println("coffee");
    }

    private CoffeeMachine() {
        coffeeQuantity = 1;
        waterQuantity = 1;

    }

    static public CoffeeMachine getCoffeeMachine() {
        if (myCoffeeMachine == null) {
            myCoffeeMachine = new CoffeeMachine();
        }
        return myCoffeeMachine;
    }

}

public class SingletonClass {
    public static void main(String[] args) {
        CoffeeMachine cu = CoffeeMachine.getCoffeeMachine();
        cu.coffeeCup();

        CoffeeMachine t = CoffeeMachine.getCoffeeMachine();
        // System.out.println(t.coffeeQuantity);
        t.coffeeQuantity = 4;

        System.out.println(cu.coffeeQuantity);
    }
}
