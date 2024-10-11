package rowset;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class Testt {
    public static void main(String[] args) {
        try {
            Connection c = DriverManager.getConnection("jdbc:mysql:///tub", "root", "admin");
            // Add code here to use the connection
        } catch (SQLException se) {
            se.printStackTrace();
        }
    }
}