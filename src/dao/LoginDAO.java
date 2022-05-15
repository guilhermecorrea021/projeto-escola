
package dao;

import factory.Conexao;
import gui.Login;
import gui.MenuAluno;
import gui.MenuPrincipal;
import java.awt.Component;
import static java.awt.SystemColor.menu;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Usuario;


public class LoginDAO {
    
    public Connection connection;
    private int id;
    private String nome;
    private String senha;
    private String perfil;
    private final Login gui;
    
    
    
     public LoginDAO(Login gui){ 
        this.connection = Conexao.getConnection();
        this.gui = gui;
    
     }
     
   
     
     public void logar(){
       
         
         String nome = gui.getTxtUsername().getText();
         String senha = gui.getTxtSenha().getText();
         
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        try (Connection conn = (Connection)
                
                DriverManager.getConnection("jdbc:mysql://localhost:3306/escola?useTimezone=true&serverTimezone=UTC","root","12345"); 
                Statement stmt = (Statement) conn.createStatement()) {

           String query = "select * from aluno where nome = '" + nome +"' and senha = '" + senha + "'";

                try (ResultSet rs = stmt.executeQuery(query)) {
                    if (rs.next()) {
                        
                       String perfil = rs.getString("perfil");
       
                        if("Aluno".equals(perfil)){
                           JOptionPane.showMessageDialog(null,"Conectado com sucesso");
                           MenuAluno aluno = new MenuAluno();
                           aluno.setVisible(true);
                           this.gui.dispose();
                        }
                        
                        else if("Professor".equals(perfil)){
                           JOptionPane.showMessageDialog(null,"Conectado com sucesso");
                           MenuPrincipal menu = new MenuPrincipal();
                           menu.setVisible(true);
                           this.gui.dispose();
                        }
                    
                    

                    else {
                        JOptionPane.showMessageDialog(null,"Usuário e/ou senha incorretos.");
                        gui.getTxtUsername().setText("");
                        gui.getTxtSenha().setText("");
                        
                    }   
                }
        
              }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        } catch (InstantiationException ex) {
            Logger.getLogger(LoginDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(LoginDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoginDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
     }
     
}
     



