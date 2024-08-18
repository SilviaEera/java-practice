
class Test {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("successful");
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }

    }
}