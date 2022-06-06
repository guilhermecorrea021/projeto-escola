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

/**
 *
 * @author walfr
 */
public class MenuAdministrador extends javax.swing.JFrame {

    /**
     * Creates new form MenuAdministrador
     */
    public MenuAdministrador() {
        setExtendedState(MAXIMIZED_BOTH);
        setTitle("Administrador");
        initComponents();
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
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jPanel1 = new javax.swing.JPanel();
        TxtUsername = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TxtTurma = new javax.swing.JTextField();
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
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtTable = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenu3 = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();

        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        TxtUsername.setBackground(new java.awt.Color(204, 204, 204));
        TxtUsername.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Tech-removebg-preview.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 3, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PERFIL:");
        jLabel2.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 3, 44)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("MENU DO ADMINISTRADOR");

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 3, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("NOME DO USUÁRIO:");
        jLabel4.setToolTipText("");

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 3, 22)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ID DE CADASTRO:");
        jLabel5.setToolTipText("");

        TxtTurma.setBackground(new java.awt.Color(204, 204, 204));
        TxtTurma.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

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
        jLabel6.setText("TURMA:");
        jLabel6.setToolTipText("");

        txtPerfil2.setBackground(new java.awt.Color(204, 204, 204));
        txtPerfil2.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txtPerfil2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aluno", "Professor", "Administrador" }));
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
        jLabel7.setText("SENHA:");
        jLabel7.setToolTipText("");

        txtSenha.setBackground(new java.awt.Color(204, 204, 204));
        txtSenha.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtSenha.setToolTipText("SENHA");
        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE)
                .addGap(51, 51, 51))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnSalvar, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnLimpar, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(143, 143, 143)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnAtualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                                    .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(TxtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TxtTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtPerfil2, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(3, 3, 3))
                                    .addComponent(txtSenha))))))
                .addGap(308, 308, 308))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(78, 78, 78)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPerfil2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(26, 26, 26)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAtualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(155, 155, 155))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1000, 1070);

        jPanel2.setBackground(new java.awt.Color(135, 206, 235));

        txtTable.setAutoCreateRowSorter(true);
        txtTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
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
        txtTable.getTableHeader().setReorderingAllowed(false);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, txtTable, org.jdesktop.beansbinding.ObjectProperty.create(), txtTable, org.jdesktop.beansbinding.BeanProperty.create("elements"));
        bindingGroup.addBinding(binding);
        binding.bind();
        jScrollPane1.setViewportView(txtTable);
        if (txtTable.getColumnModel().getColumnCount() > 0) {
            txtTable.getColumnModel().getColumn(0).setResizable(false);
            txtTable.getColumnModel().getColumn(1).setResizable(false);
            txtTable.getColumnModel().getColumn(2).setResizable(false);
            txtTable.getColumnModel().getColumn(3).setResizable(false);
            txtTable.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 875, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(141, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(389, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(381, 381, 381))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(1000, 0, 1040, 1070);

        jMenuBar1.setToolTipText("");
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuBar1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        jMenu1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenu1.setText("Arquivos");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuBar1.add(jMenu1);

        jMenu2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenu2.setText("Usuários");
        jMenu2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu2.add(jSeparator2);

        jMenuBar1.add(jMenu2);

        jMenu3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenu3.setText("Clientes");
        jMenu3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu3.setMargin(new java.awt.Insets(5, 5, 5, 5));
        jMenu3.add(jSeparator1);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        txtId.setEnabled(true);
        btnPesquisar.setEnabled(true);
        btnLimpar.setEnabled(false);
        btnAtualizar.setEnabled(true);
        btnSalvar.setEnabled(true);
        TxtUsername.setEnabled(true);
        TxtTurma.setEnabled(true);
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
                TxtTurma.setText(usuario.getTurma());
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
        TxtTurma.setText("");
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
                    + this.TxtTurma.getText()+ "',perfil='"
                    + this.txtPerfil2.getSelectedItem()
                    + "' WHERE nome='" + this.TxtUsername.getText() + "'");
                JOptionPane.showMessageDialog(rootPane, "Usuário atualizado com sucesso!");
            } catch (SQLException | ClassNotFoundException e) {
                JOptionPane.showMessageDialog(rootPane, e);
            }//Fim try
            TxtUsername.setText("");
            txtSenha.setText("");
            TxtTurma.setText("");
            txtPerfil2.setSelectedItem("");

        }
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        Usuario usuario = new Usuario();
        usuario.setUsername(TxtUsername.getText());
        usuario.setSenha(txtSenha.getText());
        usuario.setTurma(TxtTurma.getText());
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
        TxtTurma.setText("");
        txtPerfil2.setSelectedItem("");
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
            TxtTurma.setText("");
            txtPerfil2.setSelectedItem("");

        }
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
    private void jUsuariosMouseClicked(java.awt.event.MouseEvent evt) {
        
        txtId.setEnabled(true);
        btnPesquisar.setEnabled(true);
        btnSalvar.setEnabled(false);
        btnAtualizar.setEnabled(true);
        btnExcluir.setEnabled(true);
        TxtUsername.setEnabled(true);
        txtSenha.setEnabled(true);
        txtPerfil2.setEnabled(true);
        
        int linha = txtTable.getSelectedRow();
        txtId.setText(txtTable.getValueAt(linha,0).toString()); 
        TxtUsername.setText(txtTable.getValueAt(linha,1).toString()); 
        txtSenha.setText(txtTable.getValueAt(linha,2).toString()); 
        txtPerfil2.setSelectedItem(txtTable.getValueAt(linha,3).toString()); 
    }
    
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
                    rs.getString(4)
                   
                       
                
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
            java.util.logging.Logger.getLogger(MenuAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAdministrador().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtTurma;
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JTextField txtId;
    private javax.swing.JComboBox<String> txtPerfil2;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTable txtTable;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
