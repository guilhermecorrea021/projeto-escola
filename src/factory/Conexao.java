
package factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    
    public static Connection getConnection(){
        Connection conn = null;
        
       try {
           
       conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/escola?useTimezone=true&serverTimezone=UTC","root","12345");
    
        } catch(SQLException e){
        
    }
       return conn;
}
}
    
    

