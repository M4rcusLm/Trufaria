package front;

import back.Usuario;
import back.Utils;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    Usuario adm;

    public Login() {
        initComponents();
        adm = new Usuario("usuario", "usuario123"); // criação de um usuário padrão
    }

    // aqui é a inicialização dos componentes da tela
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        btmLogin = new javax.swing.JButton();
        btmVerSenha = new javax.swing.JButton();
        btmCriarConta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Trufaria - Login");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(73, 43, 31), 5));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Sitka Banner", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(172, 58, 48));
        jLabel2.setText("SENHA");

        txtSenha.setBackground(new java.awt.Color(252, 252, 252));
        txtSenha.setFont(new java.awt.Font("Sitka Banner", 0, 11)); // NOI18N

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Sitka Banner", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(172, 58, 48));
        jLabel3.setText("LOGIN");

        btmLogin.setBackground(new java.awt.Color(172, 58, 48));
        btmLogin.setFont(new java.awt.Font("Sitka Banner", 0, 12)); // NOI18N
        btmLogin.setForeground(new java.awt.Color(255, 255, 255));
        btmLogin.setText("   PRÓXIMO   ");
        btmLogin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(172, 58, 48), 1, true));
        btmLogin.setBorderPainted(false);
        btmLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btmLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmLoginActionPerformed(evt);
            }
        });

        btmVerSenha.setFont(new java.awt.Font("Sitka Banner", 0, 12)); // NOI18N
        btmVerSenha.setForeground(new java.awt.Color(213, 138, 81));
        btmVerSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/front/imagens/ocultando-senha.png"))); // NOI18N
        btmVerSenha.setBorder(null);
        btmVerSenha.setContentAreaFilled(false);
        btmVerSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btmVerSenha.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btmVerSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmVerSenhaActionPerformed(evt);
            }
        });

        btmCriarConta.setFont(new java.awt.Font("Sitka Banner", 0, 12)); // NOI18N
        btmCriarConta.setForeground(new java.awt.Color(213, 138, 81));
        btmCriarConta.setText("Criar Conta");
        btmCriarConta.setBorder(null);
        btmCriarConta.setContentAreaFilled(false);
        btmCriarConta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btmCriarConta.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btmCriarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmCriarContaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btmCriarConta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btmLogin))
                            .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btmVerSenha)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btmVerSenha))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btmCriarConta))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btmLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(150, 150, 150))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btmLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmLoginActionPerformed
        if (adm.consultar(txtLogin.getText(), txtSenha.getText())) { // verifica se o login e senha estão corretos
            Utils.isLogged = true; // variável de controle que indica se o usuário está logado ou não
            dispose();
            new Home().setVisible(true); // abre a tela principal
        } else {
            // mensagem caso o usuário não digite nada
            if (txtLogin.getText().isBlank() || txtSenha.getText().isBlank()) {
                JOptionPane.showMessageDialog(null, "Preencha os campos.", "Erro", JOptionPane.ERROR_MESSAGE);
                txtLogin.requestFocusInWindow();
            } else { // mensagem caso o usuário erre o login ou a senha
                JOptionPane.showMessageDialog(null, "Login ou senha inválidos.", "Erro", JOptionPane.ERROR_MESSAGE);
                txtSenha.setText("");
                txtSenha.requestFocusInWindow();
            }
        }
    }//GEN-LAST:event_btmLoginActionPerformed

    private void btmVerSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmVerSenhaActionPerformed
        // isso aqui é a função do botão Ver Senha
        char previous = txtSenha.getEchoChar();
        if (previous == (char) 0) {
            btmVerSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/front/imagens/ocultando-senha.png")));
            txtSenha.setEchoChar('*');
        } else {
            btmVerSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/front/imagens/mostrando-senha.png")));
            txtSenha.setEchoChar((char) 0);
        }
    }//GEN-LAST:event_btmVerSenhaActionPerformed

    private void btmCriarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmCriarContaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btmCriarContaActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btmCriarConta;
    private javax.swing.JButton btmLogin;
    private javax.swing.JButton btmVerSenha;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
