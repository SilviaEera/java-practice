interface Member {
    public void callback();
}

class Store {
    Member members[] = new Member[10];
    int count = 0;

    void register(Member mem) {
        members[count++] = mem;
    }

    void inviteSale() {
        for (int i = 0; i < count; i++) {
            members[i].callback();
        }
    }
}

class Customer implements Member {
    String name;

    Customer(String name) {
        this.name = name;
    }

    public void callback() {
        System.out.println("Please visit the store dear, " + name);
    }
}

public class InterfaceCallback {
    public static void main(String[] args) {
        Store st = new Store();
        Customer customer1 = new Customer("Silvia");
        Customer customer2 = new Customer("Mao Mao");
        Customer customer3 = new Customer("Jinshi");

        st.register(customer1);
        st.register(customer2);
        st.register(customer3);

        st.inviteSale();
    }
}
