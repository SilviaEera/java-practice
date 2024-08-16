package socketprogramming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// 
// object class has toString method that retuns the address of the object when we print the referance of the object.
// 

// to sort complex objects with multiple data we use comparable or comparator
// if the class cannot be accessed we use comparator
// we use the compare(T arg1, T arg2) method with comparator
// if the class is accessiable the comparable interface is used.
// we use the compareTo(T arg1) method with comparable

class Demo {
    int age;
    int id;
    String name;

    public Demo(int age, int id, String name) {
        this.age = age;
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "Name : " + name + " || " + " Age : " + age + " || " + " ID : " + id + "   ";
    }

}

class Comp implements Comparator<Demo> {
    public int compare(Demo a1, Demo a2) {
        if (a1.age > a2.age) {
            return 1;
        } else {
            return -1;
        }
    }
}

public class Test {
    public static void main(String[] args) {

        Demo d1 = new Demo(9, 1, "Afian");
        Demo d2 = new Demo(6, 2, "Taskia");
        Demo d3 = new Demo(2, 3, "Tasnuva");

        ArrayList<Demo> al = new ArrayList<>();
        Comp cmp = new Comp();

        al.add(d1);
        al.add(d2);
        al.add(d3);

        System.out.println(al);

        Collections.sort(al, cmp);

        System.out.println();

        System.out.println(al);
    }
}
