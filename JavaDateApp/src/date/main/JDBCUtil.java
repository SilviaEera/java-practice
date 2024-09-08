import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

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

        FileInputStream fis = new FileInputStream("C:\\Users\\Eera\\Desktop\\java\\jdbc2\\applicationPropertie.properties");
        Properties properties = new Properties();
        properties.load(fis);

//        String url = "jdbc:mysql:///university";
//        String user = "root";
//        String pass = "admin";

        Connection c = DriverManager.getConnection(properties.getProperty("url"), properties.getProperty("user"), properties.getProperty("pass"));
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
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
