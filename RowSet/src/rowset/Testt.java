package rowset;

import java.sql.SQLException;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class Testt {
    public static void main(String[] args) {
        try {
            RowSetFactory rsf = RowSetProvider.newFactory();
        } catch (SQLException se) {
            se.printStackTrace();
        }
    }
}