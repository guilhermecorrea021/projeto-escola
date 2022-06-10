/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dao.LoginDAO;
import dao.UsuarioDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import model.Usuario;

/**
 *
 * @author guigo
 */
public class Register extends javax.swing.JFrame {

     private final UsuarioDAO controller;

    public Register() {
    setTitle("Cadastro Solano");
    initComponents();
        this.setLocationRelativeTo(null);  
        controller = new UsuarioDAO();
  
    }
    
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnPesquisar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        txtSenha = new javax.swing.JPasswordField();
        txtPerfil2 = new javax.swing.JComboBox<>();
        txtUsername = new javax.swing.JTextField();
        txtTurma = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SIstema Solano");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(65, 105, 225));

        txtId.setBackground(new java.awt.Color(204, 204, 204));
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons8_people_30px.png"))); // NOI18N
        jLabel4.setText(" ");

        btnPesquisar.setBackground(new java.awt.Color(102, 153, 255));
        btnPesquisar.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons8_search_30px_1.png"))); // NOI18N
        btnPesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnSalvar.setBackground(new java.awt.Color(51, 204, 0));
        btnSalvar.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons8_save_30px.png"))); // NOI18N
        btnSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnAtualizar.setBackground(new java.awt.Color(102, 153, 255));
        btnAtualizar.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        btnAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons8_update_left_rotation_30px.png"))); // NOI18N
        btnAtualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnLimpar.setBackground(new java.awt.Color(204, 51, 255));
        btnLimpar.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons8_broom_30px.png"))); // NOI18N
        btnLimpar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnExcluir.setBackground(new java.awt.Color(255, 0, 51));
        btnExcluir.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons8_trash_30px.png"))); // NOI18N
        btnExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        txtSenha.setBackground(new java.awt.Color(204, 204, 204));
        txtSenha.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtSenha.setToolTipText("SENHA");
        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });

        txtPerfil2.setBackground(new java.awt.Color(204, 204, 204));
        txtPerfil2.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txtPerfil2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aluno", "Professor", "Coordenador" }));
        txtPerfil2.setToolTipText("");
        txtPerfil2.setActionCommand("");
        txtPerfil2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtPerfil2.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        txtPerfil2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPerfil2ActionPerformed(evt);
            }
        });

        txtUsername.setBackground(new java.awt.Color(204, 204, 204));
        txtUsername.setFont(new java.awt.Font("Tw Cen MT", 2, 12)); // NOI18N
        txtUsername.setToolTipText("NOME");
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        txtTurma.setBackground(new java.awt.Color(204, 204, 204));
        txtTurma.setFont(new java.awt.Font("Tw Cen MT", 2, 12)); // NOI18N
        txtTurma.setToolTipText("TURMA");
        txtTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTurmaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons8_graduation_cap_30px.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons8_lock_30px.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons8_user_30px.png"))); // NOI18N

        btnLogin.setBackground(new java.awt.Color(51, 102, 255));
        btnLogin.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        btnLogin.setText("Já possui uma conta? Faça login");
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel7.setText("REGISTRO SOLANO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(153, 153, 153))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPerfil2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLimpar)
                            .addComponent(btnSalvar))
                        .addGap(71, 71, 71)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAtualizar)
                            .addComponent(btnExcluir))
                        .addGap(111, 111, 111))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(97, 97, 97))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel7)))
                .addGap(0, 35, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPerfil2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 430, 550));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/tech fundo preto 400.png"))); // NOI18N
        jLabel10.setAlignmentX(1.0F);
        jLabel10.setAlignmentY(1.0F);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(144, 144, 144)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 78, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 550));

        setSize(new java.awt.Dimension(868, 597));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (txtUsername.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Digite o nome");
        }
        else {
            try {

                Class.forName("com.mysql.cj.jdbc.Driver");

                Connection conn =
                DriverManager.getConnection("jdbc:mysql://localhost:3306/escola?useTimezone=true&serverTimezone=UTC","root","12345");
                java.sql.Statement st = conn.createStatement();
                st.executeUpdate("DELETE FROM aluno WHERE nome='" + this.txtUsername.getText() + "'");
                JOptionPane.showMessageDialog(rootPane, "Usuário excluído com sucesso!");
            }
            catch (SQLException | ClassNotFoundException e) {
                JOptionPane.showMessageDialog(rootPane, e);
            }
            txtUsername.setText("");
            txtSenha.setText("");
            txtTurma.setText("");
            txtPerfil2.setSelectedItem("");

        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txtId.setText("");
        txtUsername.setText("");
        txtSenha.setText("");
        txtTurma.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        if (txtUsername.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Digite o nome.");
        }
        else {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/escola?useTimezone=true&serverTimezone=UTC","root","12345");

                java.sql.Statement st = conn.createStatement();
                st.executeUpdate("UPDATE aluno SET nome='"
                    + this.txtUsername.getText() + "',senha='"
                    + this.txtSenha.getText()+ "',turma='"
                    + this.txtTurma.getText()+ "',perfil='"
                    + this.txtPerfil2.getSelectedItem()
                    + "' WHERE nome='" + this.txtUsername.getText() + "'");
                JOptionPane.showMessageDialog(rootPane, "Usuário atualizado com sucesso!");
            } catch (SQLException | ClassNotFoundException e) {
                JOptionPane.showMessageDialog(rootPane, e);
            }//Fim try
            txtUsername.setText("");
            txtSenha.setText("");
            txtTurma.setText("");
            txtPerfil2.setSelectedItem("");

        }
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        Usuario usuario = new Usuario();
        usuario.setUsername(txtUsername.getText());
        usuario.setSenha(txtSenha.getText());
        usuario.setTurma(txtTurma.getText());
        usuario.setPerfil((String) txtPerfil2.getSelectedItem());

        if (txtUsername.getText().isEmpty() ||
            txtSenha.getText().isEmpty()){

            JOptionPane.showMessageDialog(null, "Os campos não podem retornar vazios");

        }
        else{

            UsuarioDAO dao = new UsuarioDAO();
            dao.inserir(usuario);

            JOptionPane.showMessageDialog(null, "Usuario "+ txtUsername.getText()
                +" foi inserido com sucesso");

        }

        txtUsername.setText("");
        txtSenha.setText("");
        txtTurma.setText("");
        txtPerfil2.setSelectedItem("");
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTurmaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTurmaActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        txtId.setEnabled(true);
        btnPesquisar.setEnabled(true);
        btnLimpar.setEnabled(false);
        btnAtualizar.setEnabled(true);
        btnSalvar.setEnabled(true);
        txtUsername.setEnabled(true);
        txtSenha.setEnabled(true);
        txtTurma.setEnabled(true);
        txtPerfil2.setEnabled(true);

        if (txtId.getText().isEmpty()){

            JOptionPane.showMessageDialog(null, "Digite o ID para busca!");

        }else{

            Usuario usuario = new Usuario();

            usuario.setId(Integer.parseInt(txtId.getText()));

            UsuarioDAO dao = new UsuarioDAO();

            usuario = dao.consultar(usuario);

            if(usuario!=null){

                txtUsername.setText(usuario.getUsername());
                txtSenha.setText(usuario.getSenha());
                txtTurma.setText(usuario.getTurma());
                txtPerfil2.setSelectedItem(usuario.getPerfil());

            }

            else{

                JOptionPane.showMessageDialog(null, "Id Inválido");

            }
            {

            }
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void txtPerfil2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPerfil2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPerfil2ActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        Login log = new Login();
        log.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnLoginActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtId;
    private javax.swing.JComboBox<String> txtPerfil2;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtTurma;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    public JButton getjButton1() {
        return btnSalvar;
    }

    public void setjButton1(JButton jButton1) {
        this.btnSalvar = jButton1;
    }

    public JTextField getjTextField2() {
        return txtId;
    }

    public void setjTextField2(JTextField jTextField2) {
        this.txtId = jTextField2;
    }
    
    public JComboBox getTxtPerfil2() {
        return txtPerfil2;
    }

    public void setTxtPerfil(JComboBox txtPerfil2) {
        this.txtPerfil2= txtPerfil2;
    }

    public JPasswordField getTxtSenha() {
        return txtSenha;
    }

    public void setTxtSenha(JPasswordField txtSenha) {
        this.txtSenha = txtSenha;
    }

    public JTextField getTxtUsername() {
        return txtUsername;
    }

    public void setTxtUsername(JTextField txtUsername) {
        this.txtUsername = txtUsername;
    }


    private static class txtPerfill2 {

        public txtPerfill2() {
        }
    }
    
}