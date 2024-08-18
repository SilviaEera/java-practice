import java.sql.*;

public class JDBCconnection {

    //for security purpose making these variables private so it can't be accessed outside this class;

    private static final String url = "jdbc:mysql://localhost/test";
    private static final String user = "root";
    private static final String pass = "admin";
    public static void main(String[] args) {
        try{
            //loading and registering the driver

            Class.forName("com.mysql.cj.jdbc.Driver");

            //creating the connection

            Connection connection = null;
            Statement statement = null;
            ResultSet result = null;


            connection = DriverManager.getConnection(url, user, pass);

            //create statement
            statement = connection.createStatement();
            String query = "select * from testtable";

            result = statement.executeQuery(query);
            while(result.next()){
                int id = result.getInt(1);
                String name = result.getString(2);
                int age = result.getInt(3);

                System.out.println(id + "\t" + name + "\t" + age);
            }




            System.out.println("success");
        } catch(ClassNotFoundException e){
            System.out.println(e);
        }catch(SQLException e){
            System.out.println(e);
        }

    }
}
