import java.sql.*;

public class Test {
    public static void main(String[] args) {
        Connection conn = null;
        ResultSet resultSet = null;
        Statement statement = null;
        try{

//           step 1: load and register the driver
            Class.forName("com.mysql.cj.jdbc.Driver");


//            step 2: establish the connection

            String url = "jdbc:mysql://localhost:3306/test";
            String userName = "root";
            String passWord = "admin";
            conn = DriverManager.getConnection(url,userName, passWord);

//            System.out.println("implemtntation class name :" + conn.getClass().getName());

            String sqlSelectQuery = "select name, age from testtable";
            statement = conn.createStatement();
            resultSet = statement.executeQuery(sqlSelectQuery);

//            System.out.println("impleamntation class name : " + statement.getClass().getName());
//            System.out.println("implamantation class name : " + resultSet.getClass().getName());
//

//            step 4: processing the resultset

            System.out.println("name\tage");

            while(resultSet.next()){
                String name = resultSet.getString(1);
                Integer age = resultSet.getInt(2);

                System.out.println(name + "\t" + age);

            }





//            System.out.println(resultSet);
            System.out.println("Successful");
        } catch(ClassNotFoundException e){
            System.out.println(e);
        }catch(SQLException se){
            System.out.println(se);
        }
    }
}
