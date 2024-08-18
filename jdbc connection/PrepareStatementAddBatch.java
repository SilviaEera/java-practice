import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PrepareStatementAddBatch {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/university", "root", "admin");

            String q = "insert into st(sname, dept, cgpa) values(?, ?, ?)";
            PreparedStatement preparedStatement = c.prepareStatement(q);

            Scanner sc = new Scanner(System.in);

            while(true){
                System.out.println("enter the name: ");
                String name = sc.next();

                System.out.println("enter the department neme: ");
                String dept = sc.next();

                System.out.println("enter the cgpa: ");
                Double cgpa = sc.nextDouble();

                System.out.println("enter more data? (Y/N)");
                String choice = sc.next();

                preparedStatement.setString(1, name);
                preparedStatement.setString(2, dept);
                preparedStatement.setDouble(3, cgpa);

                preparedStatement.addBatch();

                if(choice.toUpperCase().equals("N")){
                    break;
                }
            }

            int[] rowAffected = preparedStatement.executeBatch();


//
        } catch (Exception e){}
    }
}
