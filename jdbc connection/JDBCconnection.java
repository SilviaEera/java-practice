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
            String updateQuery = String.format("update testtable set age='%o' where name = '%s'", 19, "noman");
//            String insertQuery = String.format("INSERT INTO testtable(name, age) VALUES('%s', %o)", "noman",19);
            int rowsUpdated = statement.executeUpdate(updateQuery);

            if(rowsUpdated>0){
                System.out.println(rowsUpdated + " rows updated");
            } else {
                System.out.println("no rows updated.");
            }

//            int rowsAffected = statement.executeUpdate(insertQuery);
            result = statement.executeQuery(query);

//

//            if(rowsAffected>0){
//                System.out.println("data insertion successful.");
//            } else{
//                System.out.println("data not inserted.");
//            }
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
        } catch(Exception e){

        }

    }
}
