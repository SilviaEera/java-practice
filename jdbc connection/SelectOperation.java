import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectOperation {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "admin");

            String q = "SELECT * FROM testtable";

            PreparedStatement preparedStatement = c.prepareStatement(q);

//            preparedStatement.setInt(1, 1);

            ResultSet resultSet = preparedStatement.executeQuery();

            System.out.println("ID" +"\t" +"Name" + "\t" + "Age");
            System.out.println("-----------");
            while(resultSet.next()){
//                System.out.println (resultSet.getString("name" +" "));
//                System.out.print(resultSet.getInt("age"));

                int id = resultSet.getInt("id");

                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");

                System.out.println(id + "\t" + name + "\t" +  age);
            }

        } catch (Exception e){

        }
    }
}
