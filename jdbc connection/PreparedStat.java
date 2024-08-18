import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PreparedStat {

    private static final String url = "jdbc:mysql://localhost:3306/test";
    private static final String user = "root";
    private static final String pass = "admin";


//
    public static void main(String[] args) {
        Connection c = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            c = DriverManager.getConnection(url, user, pass);

            String query = "insert into testtable(name, age) values(?, ?)";
//            String showDBQuery = "select name from testtable where id=(?)";


//            PreparedStatement preparedStatement1 = c.prepareStatement(showDBQuery);
            PreparedStatement preparedStatement = c.prepareStatement(query);

//            preparedStatement1.setInt(1, 1);
//            preparedStatement.setString(1, "Tasnuva");
//            preparedStatement.setInt(2, 1);

//            int rowsAffected = preparedStatement.executeUpdate();
//
////            ResultSet resultSet = preparedStatement1.executeQuery();
//            if(rowsAffected>0){
//                System.out.println("updated db successfully !");
//            } else{
//                System.out.println("could not update.");
//            }

            System.out.println();

//            while(resultSet.next()){
//                String name = resultSet.getString(1);
//                int age = resultSet.getInt(2);
//
//                System.out.println(name + "\t" + age);
//            }

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
