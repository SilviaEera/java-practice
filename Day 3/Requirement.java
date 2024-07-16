import java.util.*;

abstract class Dog {

    String dogName;

    public void namePrint() {
        System.out.println(dogName);
    }
    // public Dog(String dogName) {
    // this.dogName = dogName;
    // }

    abstract void Vet();

    abstract void Food();

}

class MyDog extends Dog {

    void Vet() {
        System.out.println("taken to vet regularly.");
    }

    void Food() {
        System.out.println("good food given");
    }
}

class Requirement {
    public static void main(String args[]) {
        Dog mydog = new MyDog();

        mydog.dogName = "doggesshor";

        mydog.Food();
        mydog.Vet();
        mydog.namePrint();
    }
}