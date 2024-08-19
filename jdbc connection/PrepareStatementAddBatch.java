import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PrepareStatementAddBatch {
    public static void main(String[] args) {
        Connection c = null;
        PreparedStatement preparedStatement = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/university", "root", "admin");

            String q = "insert into st(sname, dept, cgpa) values(?, ?, ?)";
            preparedStatement = c.prepareStatement(q);

            Scanner sc = new Scanner(System.in);

            while(true){
                System.out.println("enter the name: ");
                String name = sc.nextLine();

                System.out.println("enter the department neme: ");
                String dept = sc.nextLine();

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

            
            preparedStatement.close();
            c.close();
//
        } catch (Exception e){

        }

    }
}
