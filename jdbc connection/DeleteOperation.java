import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteOperation {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "admin");

//            String qs = "ROLLBACK ";
            String q = "DELETE FROM testtable WHERE name = (?)";

//            PreparedStatement preparedStatement = c.prepareStatement(qs);
            PreparedStatement preparedStatement1 = c.prepareStatement(q);

//            preparedStatement1.setString(1, "Yuna");

//            preparedStatement.executeUpdate();
            int ar = preparedStatement1.executeUpdate();

            if (ar > 0) {
                System.out.println("yes");
            } else{
                System.out.println("no");
            }
        }catch (Exception e){}
    }
}
