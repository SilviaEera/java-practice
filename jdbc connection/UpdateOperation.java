import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UpdateOperation {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "admin");

            String q = "UPDATE testtable SET name=(?) where id=(?)";

            PreparedStatement preparedStatement = c.prepareStatement(q);

            preparedStatement.setString(1, "Taskia Islam");
            preparedStatement.setInt(2, 4);

            int rowAffected = preparedStatement.executeUpdate();

            if(rowAffected>0){
                System.out.println("Updated database successfully");
            } else{
                System.out.println("Can't update database.");
            }

        }catch(Exception e){

        }
    }
}
