
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class dbconnection{
    
    Connection connect;
    
    public static Connection ConnecterDB(){
        try {
          Connection connect= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","123");
          System.out.println("you are connected");
           return connect;
        } catch (SQLException ex) {
            Logger.getLogger(dbconnection.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
