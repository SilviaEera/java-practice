import java.sql.*;

public class JDBCUtil {

//    private constractor so objects can not be created
//    methods will be called using the callnames as methods are static
    private JDBCUtil(){}

    static{
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (Exception e){
            System.out.println(e);
        }
        }

//    to establish a connection
    public static Connection getConnection() throws  Exception{
        String url = "jdbc:mysql:///university";
        String user = "root";
        String pass = "admin";

        Connection c = DriverManager.getConnection(url, user, pass);
        return  c;

    }


//    to close the resources
    public static void  cleanUp(Connection connection, Statement statement, ResultSet resultSet){
        try{
            if(connection!=null){
                connection.close();
            }
            if(statement!=null){
                statement.close();
            }
            if(resultSet!=null){
                resultSet.close();
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
