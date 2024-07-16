class Student {
    private int age;

    // getter
    public int getAge() {
        return age;
    }

    // setter
    public void setAge(int age) {
        this.age = age;

    }

}

public class Test {
    public static void main(String args[]) {
        int ob1 = 20;

        // ob1.setAge(23);

        int ob2 = ob1;

        ob2 = 50;

        System.out.println(ob1);
        System.out.println(ob2);

    }

}
