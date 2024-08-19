package jdbc.main;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import jdbc.util.JdbcUtil;

public class SelectOperation {
	
	public static void main(String args[]) throws Exception {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		
		try {
			connection = JdbcUtil.getConnection();
			if(connection!=null) {
				statement = connection.createStatement();
			}
			if(statement!=null) {
				resultSet = statement.executeQuery("select * from st");
			}
			
			if(resultSet!=null) {
				while(resultSet.next()) {
					System.out.println(resultSet.getString("sname") + "\t" + resultSet.getString("dept") + "\t" + resultSet.getDouble("cgpa"));
				}
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.closeAll(connection, statement, resultSet);
		}
	}

}
