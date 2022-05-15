
package factory;

import java.sql.Connection;
import java.sql.SQLException;


public class TestaConexao {
    
     public static void main(String[] args) throws SQLException{
        
        Connection connection = Conexao.getConnection();
        System.out.println("Conexao Aberta");
        
    }
    
}
