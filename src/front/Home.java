package front;

import back.Trufa;
import back.Utils;
import javax.swing.JOptionPane;

public class Home extends javax.swing.JFrame {

    Trufa trufa;
    private int i; // variável que indica qual trufa mostrar (é o índice de posição do ArrayList de trufas)

    public Home() {
        initComponents();
        this.i = 0;
        try {
            mostrarTrufa(this.i); // o programa vai tentar executar essa linha, mas vai dar erro pq o ArrayList tá vazio, então ele vai pro bloco 'catch'
            if (Utils.trufas.size() == 1) {
                btmProximo.setEnabled(false);
            }
        } catch (Exception e) {
            // mensagem para caso nenhuma trufa esteja cadastrada
            lblSabor.setText("NENHUM PRODUTO CADASTRADO");
            lblDescricao.setText("<html>Selecione a opção de <strong>Cadastrar Produto</strong> para cadastrar um produto.</html>");
            lblValor.setText("R$ 0,00");
            btmComprar.setEnabled(false);
            btmProximo.setEnabled(false);
        }
    }

    // inicialização dos componentes da tela
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblSabor = new javax.swing.JLabel();
        btmComprar = new javax.swing.JButton();
        btmProximo = new javax.swing.JButton();
        lblDescricao = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblValor = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        btmCadastrarProduto = new javax.swing.JButton();
        btmPerfil = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Trufaria - Home");

        jPanel1.setBackground(new java.awt.Color(213, 138, 81));
        jPanel1.setForeground(new java.awt.Color(213, 138, 81));

        lblSabor.setFont(new java.awt.Font("Sitka Banner", 0, 14)); // NOI18N
        lblSabor.setForeground(new java.awt.Color(255, 255, 255));
        lblSabor.setText("TRUFA DE MARACUJÁ");

        btmComprar.setBackground(new java.awt.Color(172, 58, 48));
        btmComprar.setFont(new java.awt.Font("Sitka Banner", 0, 11)); // NOI18N
        btmComprar.setText("COMPRAR");
        btmComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmComprarActionPerformed(evt);
            }
        });

        btmProximo.setBackground(new java.awt.Color(172, 58, 48));
        btmProximo.setFont(new java.awt.Font("Sitka Banner", 0, 11)); // NOI18N
        btmProximo.setText("Próximo");
        btmProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmProximoActionPerformed(evt);
            }
        });

        lblDescricao.setForeground(new java.awt.Color(255, 255, 255));
        lblDescricao.setText("Trufa 100% com recheio de maracujá");

        lblValor.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        lblValor.setForeground(new java.awt.Color(255, 255, 255));
        lblValor.setText("R$ 1,50");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblValor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btmProximo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btmComprar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDescricao)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSabor))
                        .addGap(0, 139, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(lblSabor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDescricao)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btmComprar)
                        .addComponent(btmProximo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(lblValor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jToolBar1.setRollover(true);

        btmCadastrarProduto.setText("Cadastrar Produto");
        btmCadastrarProduto.setFocusable(false);
        btmCadastrarProduto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btmCadastrarProduto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btmCadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmCadastrarProdutoActionPerformed(evt);
            }
        });
        jToolBar1.add(btmCadastrarProduto);

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 204, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btmProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmProximoActionPerformed
        // mostra na tela as informações da próxima trufa cadastrada
        this.i += 1;
        try {
            mostrarTrufa(i); // o programa vai mostrando sempre a proxima trufa salva no ArrayList
        } catch(Exception e) {
            // caso não existam mais trufas no ArrayList, o programa mostra a primeira trufa cadastrada e aí o ciclo reinicia
            this.i = 0;
            mostrarTrufa(i);
        }
    }//GEN-LAST:event_btmProximoActionPerformed

    private void btmCadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmCadastrarProdutoActionPerformed
        dispose();
        new Cadastro().setVisible(true); // abre a tela de cadastro de trufas
    }//GEN-LAST:event_btmCadastrarProdutoActionPerformed

    private void btmComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmComprarActionPerformed
        if (trufa.getEstoque() == 0) {
            JOptionPane.showMessageDialog(null, "Estoque insuficiente!", "Erro", JOptionPane.WARNING_MESSAGE);
        } else {
            Utils.trufas.get(i).setEstoque(Utils.trufas.get(i).getEstoque() - 1);
            // new Compra().setVisible(true); // abre a tela de compras
        }
    }//GEN-LAST:event_btmComprarActionPerformed

    private void btmPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmPerfilActionPerformed
        if(!Utils.isLogged) {
            // se por algum motivo o usuário não esteja logado, ele é redirecionado para a tela de login
            dispose();
            new Login().setVisible(true);
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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btmCadastrarProduto;
    private javax.swing.JButton btmComprar;
    private javax.swing.JButton btmPerfil;
    private javax.swing.JButton btmProximo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblSabor;
    private javax.swing.JLabel lblValor;
    // End of variables declaration//GEN-END:variables

    private void mostrarTrufa(int i) {
        // mostra os dados da trufa na tela
        trufa = Utils.trufas.get(i);
        lblSabor.setText("TRUFA DE " + trufa.getSabor().toUpperCase());
        lblDescricao.setText("Trufa 100% com recheio de " + trufa.getSabor().toLowerCase());
        lblValor.setText(String.format("R$ %.2f", trufa.getValor()));
    }
}
