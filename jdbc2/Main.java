import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

//        String update = "UPDATE st SET "
        try{

            connection = JDBCUtil.getConnection();

            if(connection!=null){
                statement = connection.createStatement();
            }

            if(statement!=null){
                resultSet = statement.executeQuery("select * from st");
            }

            if(resultSet!=null){
                System.out.println("Name" + "\t" + "Department" + "\t" + "CGPA");
                while(resultSet.next()){
                    String name = resultSet.getString("sname");
                    String dept = resultSet.getString("dept");
                    Double cgpa = resultSet.getDouble("cgpa");

                    System.out.println(name + "\t" + dept + "\t" + cgpa);
                }
            }

        } catch (SQLException e){
            e.printStackTrace();
        } catch (java.lang.Exception e){
            e.printStackTrace();
        } finally {
            try{
                JDBCUtil.cleanUp(connection, statement, resultSet);
            } catch (Exception e){
                e.printStackTrace();
            } 
        }
    }
}
