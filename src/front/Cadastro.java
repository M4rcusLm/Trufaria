package front;

import back.Trufa;
import back.Utils;
import javax.swing.JOptionPane;

public class Cadastro extends javax.swing.JFrame {

    Trufa trufa;
    int count;

    public Cadastro() {
        count = 0; // contador para verificar quantas vezes o usuário clicou no botão de cadastrar
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        txtSabor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btmCadastrar = new javax.swing.JButton();
        spnEstoque = new javax.swing.JSpinner();
        jSeparator2 = new javax.swing.JSeparator();
        jToolBar1 = new javax.swing.JToolBar();
        btmHome = new javax.swing.JButton();
        btmPerfil = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Trufaria - Cadastro");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(252, 252, 252));

        jSeparator1.setForeground(new java.awt.Color(213, 138, 81));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/front/imagens/fabricação_de_trufas_resized.jpg"))); // NOI18N
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel1.setFont(new java.awt.Font("Sitka Banner", 0, 14)); // NOI18N
        jLabel1.setText("PRODUTO");

        txtNome.setEditable(false);
        txtNome.setForeground(new java.awt.Color(102, 102, 102));
        txtNome.setText("Trufa");

        jLabel3.setFont(new java.awt.Font("Sitka Banner", 0, 14)); // NOI18N
        jLabel3.setText("ESTOQUE");

        jLabel4.setFont(new java.awt.Font("Sitka Banner", 0, 14)); // NOI18N
        jLabel4.setText("SABOR");

        jLabel5.setFont(new java.awt.Font("Sitka Banner", 0, 14)); // NOI18N
        jLabel5.setText("PREÇO");

        btmCadastrar.setBackground(new java.awt.Color(172, 58, 48));
        btmCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btmCadastrar.setText("CADASTRAR");
        btmCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmCadastrarActionPerformed(evt);
            }
        });

        spnEstoque.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtNome, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jLabel3))
                                    .addComponent(spnEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txtSabor)))
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btmCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSabor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btmCadastrar))
                .addGap(0, 32, Short.MAX_VALUE))
        );

        jSeparator2.setForeground(new java.awt.Color(213, 138, 81));

        jToolBar1.setRollover(true);

        btmHome.setText("Home");
        btmHome.setFocusable(false);
        btmHome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btmHome.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btmHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmHomeActionPerformed(evt);
            }
        });
        jToolBar1.add(btmHome);

        btmPerfil.setText("Perfil");
        btmPerfil.setFocusable(false);
        btmPerfil.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btmPerfil.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btmPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmPerfilActionPerformed(evt);
            }
        });
        jToolBar1.add(btmPerfil);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btmCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmCadastrarActionPerformed
        count += 1; // o usuário clicou 1 vez no botão
        String sabor;
        double valor;
        int estoque;
        try {
            sabor = txtSabor.getText();
            valor = Double.valueOf(txtValor.getText().replace(",", "."));
            estoque = (Integer) spnEstoque.getValue();
            if (sabor.isBlank()) {
                double erroProposital = 11 / 0;
                /* Caso o usuário digite algo para tentar quebrar o programa (letras no campo de Preço ou espaços em branco)
                    um erro proposital é feito para que o bloco 'catch' seja chamado e exiba uma mensagem de erro.
                */
            }
            if (estoque == 0 && count < 2) {
                JOptionPane.showMessageDialog(null, "<html>Escolha um valor diferente de 0 para o estoque, ou <br>aperte mais uma vez no botão de <strong>Cadastrar</strong> para confirmar.</html>", "O estoque está definido como 0", JOptionPane.INFORMATION_MESSAGE);
                // caso o usuário defina o estoque como 0, ele deverá clicar no botão de cadastrar mais uma vez para confirmar
            } else {
                // caso o estoque seja diferente de 0 ou o usuário tenha clicado 2 vezes no botão de cadastrar, a trufa é cadastrada
                trufa = new Trufa(sabor, valor, estoque);
                Utils.trufas.add(trufa);
                JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                limparCampos();
                count = 0;
            }
        } catch (Exception e) {
            // mensagem de erro
            JOptionPane.showMessageDialog(null,
                    "<html>Ocorreu um erro! Tente essas resoluções:<br> <blockquote>&#10026 Preencha todos os campos.</blockquote><blockquote>&#10026 Coloque só números no campo <strong>Preço</strong></blockquote><blockquote>&#10026 Evite espaços no campo <strong>Preço</strong></blockquote></html>",
                    "Erro", JOptionPane.ERROR_MESSAGE);
            count = 0;
        }
    }//GEN-LAST:event_btmCadastrarActionPerformed

    private void btmHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmHomeActionPerformed
        dispose();
        new Home().setVisible(true); // abre a tela inicial
    }//GEN-LAST:event_btmHomeActionPerformed

    private void btmPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmPerfilActionPerformed
        if (!Utils.isLogged) {
            dispose();
            new Login().setVisible(true); // direciona para o login caso o user não esteja logado
        } else {
            // new Perfil().setVisible(true); // abre a tela de perfil
        }
    }//GEN-LAST:event_btmPerfilActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btmCadastrar;
    private javax.swing.JButton btmHome;
    private javax.swing.JButton btmPerfil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JSpinner spnEstoque;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSabor;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables

    private void limparCampos() {
        txtSabor.setText("");
        txtValor.setText("");
        spnEstoque.setValue(0);
    }
}
