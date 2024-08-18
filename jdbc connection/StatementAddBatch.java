import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class StatementAddBatch {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "admin");
            Statement statement = c.createStatement();
            Scanner sc = new Scanner(System.in);
            while(true){
                System.out.print("Enter the name: ");
                String name = sc.next();
                System.out.print("Enter the age: ");
                int price = sc.nextInt();

                System.out.println("Enter more data? (Y/N)");

                String choice = sc.next();
                String query = String.format("INSERT INTO foodprice(foodname, foodprice) VALUES('%s', %d)", name, price);

                statement.addBatch(query);

                if(choice.toUpperCase().equals("N")){
                    break;
                }
            }

            int rowsAffected[] = statement.executeBatch();

        }catch (Exception e){

        }
    }
}
