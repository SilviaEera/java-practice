class GenArr<T> {
    T A[] = (T[]) new Object[4];
    int length = 0;

    public void append(T v) {
        A[length++] = v;
    }

    public void display() {
        for (T x : A) {
            System.out.print(x + " ");
        }
    }
}

public class GenericArray {
    public static void main(String[] args) {

        GenArr<Integer> newArr = new GenArr<>();

        newArr.append(3);
        newArr.append(7);
        newArr.append(5);

        newArr.display();

    }
}
