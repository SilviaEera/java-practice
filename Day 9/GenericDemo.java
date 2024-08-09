class Demo<T> {
    private T obj;

    public void setData(T obj) {
        this.obj = obj;
    }

    public T getData() {
        return obj;
    }
}

public class GenericDemo {
    public static void main(String[] args) throws Exception {
        Demo<Integer> d = new Demo<>();

        d.setData(7);

        Integer s = d.getData();

        System.out.println(s);

    }
}
