package tp1SE352;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BD {
	static String dbURL = "jdbc:mysql://localhost:3306/federation";
    static String username = "root";
    static String password = "";
    public static Connection getBD() {
    	Connection con=null;
        try {
    
         con = DriverManager.getConnection(dbURL, username, password);
    
        if (con != null) {
            return con;
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
    return con;
    }

}
