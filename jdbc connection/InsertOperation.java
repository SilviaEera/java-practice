import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertOperation {
    public static void main(String[] args) {

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "admin");

            String q = "INSERT INTO testtable(name, age) VALUES(?, ?)";

            PreparedStatement preparedStatement = c.prepareStatement(q);

            Scanner sc = new Scanner(System.in);

            System.out.println("please enter the name");
            String n = sc.nextLine();
            System.out.println("Please enter the age");
            int a = sc.nextInt();
            preparedStatement.setString(1, n);
            preparedStatement.setInt(2, a);

            int affectedRow = preparedStatement.executeUpdate();

            if(affectedRow>0){
                System.out.println("affected " + affectedRow + " row/s");
            } else {
                System.out.println("No rows affected");
            }
        }catch (Exception e){

        }


    }
}
