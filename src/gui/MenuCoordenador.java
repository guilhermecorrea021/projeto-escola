/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dao.UsuarioDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Usuario;


public class MenuCoordenador extends javax.swing.JFrame {

    public MenuCoordenador() {
        setExtendedState(MAXIMIZED_BOTH);
        setTitle("Coordenador");
        initComponents();
        carregaTabela();
    }

  public void PopularJTable(String sql) {
          try
          {
           Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/escola?useTimezone=true"+"&serverTimezone=UTC","root","12345");
              PreparedStatement banco = (PreparedStatement)conn.prepareStatement(sql);
           banco.execute(); // cria o vetor

              ResultSet resultado = banco.executeQuery(sql);

           DefaultTableModel model =(DefaultTableModel) txtTable.getModel();
           model.setNumRows(0);

           while(resultado.next())
           {
               model.addRow(new Object[] 
               { 
                  //retorna os dados da tabela do BD, cada campo e um coluna.
                  resultado.getString("id"),
                  resultado.getString("nome"),
                  resultado.getString("turma"),
                  resultado.getString("perfil"),
                  
               }); 
          } 
           banco.close();
           conn.close();
          }
         catch (SQLException ex)
         {
            System.out.println("o erro foi " +ex);
          }
         }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TxtUsername = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnPesquisar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPerfil2 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtTable = new javax.swing.JTable();
        txtTurma = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImages(null);
        setUndecorated(true);
        setSize(new java.awt.Dimension(1980, 1080));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(65, 105, 225));

        TxtUsername.setBackground(new java.awt.Color(204, 204, 204));
        TxtUsername.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        TxtUsername.setName(""); // NOI18N
        TxtUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TxtUsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TxtUsernameFocusLost(evt);
            }
        });
        TxtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtUsernameActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 3, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons8_people_30px.png"))); // NOI18N
        jLabel2.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 3, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons8_user_30px.png"))); // NOI18N
        jLabel4.setToolTipText("");

        btnPesquisar.setBackground(new java.awt.Color(0, 102, 255));
        btnPesquisar.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons8_search_30px_1.png"))); // NOI18N
        btnPesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
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

        btnAtualizar.setBackground(new java.awt.Color(102, 153, 255));
        btnAtualizar.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        btnAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons8_update_left_rotation_30px.png"))); // NOI18N
        btnAtualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
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

        btnExcluir.setBackground(new java.awt.Color(255, 0, 51));
        btnExcluir.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons8_trash_30px.png"))); // NOI18N
        btnExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        txtId.setBackground(new java.awt.Color(204, 204, 204));
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 3, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons8_graduation_cap_30px.png"))); // NOI18N
        jLabel6.setToolTipText("");

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

        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 3, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons8_lock_30px.png"))); // NOI18N
        jLabel7.setToolTipText("");

        txtSenha.setBackground(new java.awt.Color(204, 204, 204));
        txtSenha.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtSenha.setToolTipText("SENHA");
        txtSenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSenhaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSenhaFocusLost(evt);
            }
        });
        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });

        txtTable.setAutoCreateRowSorter(true);
        txtTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "nome", "senha", "turma", "perfil"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        txtTable.setDebugGraphicsOptions(javax.swing.DebugGraphics.FLASH_OPTION);
        txtTable.setDropMode(javax.swing.DropMode.ON);
        txtTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(txtTable);
        if (txtTable.getColumnModel().getColumnCount() > 0) {
            txtTable.getColumnModel().getColumn(0).setResizable(false);
            txtTable.getColumnModel().getColumn(1).setResizable(false);
            txtTable.getColumnModel().getColumn(2).setResizable(false);
            txtTable.getColumnModel().getColumn(3).setResizable(false);
            txtTable.getColumnModel().getColumn(4).setResizable(false);
        }

        txtTurma.setBackground(new java.awt.Color(204, 204, 204));
        txtTurma.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txtTurma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1001", "1002", "2001", "2002", "3001", "3002", "" }));
        txtTurma.setToolTipText("");
        txtTurma.setActionCommand("");
        txtTurma.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtTurma.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        txtTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTurmaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 186, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 854, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(180, 180, 180))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(383, 383, 383)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(76, 76, 76)
                                .addComponent(btnLimpar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSenha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPerfil2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(76, 76, 76)
                                .addComponent(btnSalvar)))
                        .addGap(62, 62, 62)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAtualizar)
                            .addComponent(btnExcluir)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(482, 482, 482)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPerfil2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );

        TxtUsername.getAccessibleContext().setAccessibleName("");

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 250, 1220, 830);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/tech fundo branco 300.png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/logo solano sem fundo 420.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(159, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(249, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(1220, 0, 760, 1080);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("MENU DO COORDENADOR");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(345, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(341, 341, 341))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(93, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 1220, 250);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        txtId.setEnabled(true);
        btnPesquisar.setEnabled(true);
        btnLimpar.setEnabled(false);
        btnAtualizar.setEnabled(true);
        btnSalvar.setEnabled(true);
        TxtUsername.setEnabled(true);
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

                TxtUsername.setText(usuario.getUsername());
                txtTurma.setSelectedItem(usuario.getTurma());
                txtPerfil2.setSelectedItem(usuario.getPerfil());

            }

            else{

                JOptionPane.showMessageDialog(null, "Id Inválido");

            }
            {

            }
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txtId.setText("");
        TxtUsername.setText("");
        txtTurma.setSelectedItem("");
        txtSenha.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        if (TxtUsername.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Digite o nome.");
        }
        else {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/escola?useTimezone=true&serverTimezone=UTC","root","12345");

                java.sql.Statement st = conn.createStatement();
                st.executeUpdate("UPDATE aluno SET nome='"
                    + this.TxtUsername.getText() + "',senha='"
                    + this.txtSenha.getText()+ "',turma='"
                    + this.txtTurma.getSelectedItem()+ "',perfil='"
                    + this.txtPerfil2.getSelectedItem()
                    + "' WHERE nome='" + this.TxtUsername.getText() + "'");
                JOptionPane.showMessageDialog(rootPane, "Usuário atualizado com sucesso!");
            } catch (SQLException | ClassNotFoundException e) {
                JOptionPane.showMessageDialog(rootPane, e);
            }//Fim try
            TxtUsername.setText("");
            txtSenha.setText("");
            txtTurma.setSelectedItem("");
            txtPerfil2.setSelectedItem("");

            
        }
        
     carregaTabela();
     
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        Usuario usuario = new Usuario();
        usuario.setUsername(TxtUsername.getText());
        usuario.setSenha(txtSenha.getText());
        usuario.setTurma((String) txtTurma.getSelectedItem());
        usuario.setPerfil((String) txtPerfil2.getSelectedItem());

        if (TxtUsername.getText().isEmpty()||
            txtSenha.getText().isEmpty()){

            JOptionPane.showMessageDialog(null, "Os campos não podem retornar vazios");

        }
        else{

            UsuarioDAO dao = new UsuarioDAO();
            dao.inserir(usuario);

            JOptionPane.showMessageDialog(null, "Usuario "+ TxtUsername.getText()
                +" foi inserido com sucesso");

        }

        TxtUsername.setText("");
        txtSenha.setText("");
        txtTurma.setSelectedItem("");
        txtPerfil2.setSelectedItem("");
        
        carregaTabela();
        
    }//GEN-LAST:event_btnSalvarActionPerformed

    
    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (TxtUsername.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Digite o nome e a senha");
        }
        else {
            try {

                Class.forName("com.mysql.cj.jdbc.Driver");

                Connection conn =
                DriverManager.getConnection("jdbc:mysql://localhost:3306/escola?useTimezone=true&serverTimezone=UTC","root","12345");
                java.sql.Statement st = conn.createStatement();
                st.executeUpdate("DELETE FROM aluno WHERE nome='" + this.TxtUsername.getText() + "'");
                JOptionPane.showMessageDialog(rootPane, "Usuário excluído com sucesso!");
            }
            catch (SQLException | ClassNotFoundException e) {
                JOptionPane.showMessageDialog(rootPane, e);
            }
            TxtUsername.setText("");
            txtSenha.setText("");
            txtTurma.setSelectedItem("");
            txtPerfil2.setSelectedItem("");

       
        }
        
        carregaTabela();
        
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtPerfil2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPerfil2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPerfil2ActionPerformed

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed

    private void txtTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTurmaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTurmaActionPerformed

    private void TxtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtUsernameActionPerformed

    private void TxtUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtUsernameFocusGained
        if(TxtUsername.getText().equals("Digite o nome"))
        {
            TxtUsername.setText("");
        }
    }//GEN-LAST:event_TxtUsernameFocusGained

    private void TxtUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtUsernameFocusLost
        if(TxtUsername.getText().equals(""))
        {
            TxtUsername.setText("Digite o nome");
        }
    }//GEN-LAST:event_TxtUsernameFocusLost

    private void txtSenhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSenhaFocusGained
        if(txtSenha.getText().equals("senha"))
        {
            txtSenha.setText("");
        }
    }//GEN-LAST:event_txtSenhaFocusGained

    private void txtSenhaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSenhaFocusLost
        if(txtSenha.getText().equals(""))
        {
            txtSenha.setText("senha");
        }
    }//GEN-LAST:event_txtSenhaFocusLost

    private void carregaTabela(){
        
        DefaultTableModel modelo = (DefaultTableModel) txtTable.getModel();
        modelo.setNumRows(0);
        
        txtTable.getColumnModel().getColumn(0).setPreferredWidth(20);
        txtTable.getColumnModel().getColumn(1).setPreferredWidth(25);
        txtTable.getColumnModel().getColumn(2).setPreferredWidth(25);
        txtTable.getColumnModel().getColumn(3).setPreferredWidth(25);
        
        
        try {
            
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/escola?useTimezone=true"+"&serverTimezone=UTC","root","12345");
            PreparedStatement pstm;
            ResultSet rs;
            pstm = conn.prepareStatement("select * from aluno");
            rs  = pstm.executeQuery();
            
            while(rs.next()){
                modelo.addRow(new Object[]{
                    
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5)
                   
                       
                
            });
            }
            pstm.close();
            conn.close();
            
            
        } catch (SQLException ErroSql) {
            
            JOptionPane.showMessageDialog(null, "Erro ao carregar os dados da tabela" + ErroSql, "Erro", JOptionPane.ERROR_MESSAGE );
        }
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuCoordenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuCoordenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuCoordenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuCoordenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuCoordenador().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtUsername;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtId;
    private javax.swing.JComboBox<String> txtPerfil2;
    private javax.swing.JPasswordField txtSenha;
    javax.swing.JTable txtTable;
    private javax.swing.JComboBox<String> txtTurma;
    // End of variables declaration//GEN-END:variables
}
