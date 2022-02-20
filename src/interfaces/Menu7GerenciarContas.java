/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

/**
 *
 * @author Alisson
 */
public class Menu7GerenciarContas extends javax.swing.JFrame {

    /**
     * Creates new form Menu7GerenciarContas
     */
    public Menu7GerenciarContas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuPanel = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        btnSaque = new javax.swing.JButton();
        btnDeposito = new javax.swing.JButton();
        btnAltSenha = new javax.swing.JButton();
        btnAltLimite = new javax.swing.JButton();
        btnEncerrar = new javax.swing.JButton();
        btnReativar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de controle bancario");
        setBounds(new java.awt.Rectangle(0, 0, 716, 740));
        setMaximumSize(new java.awt.Dimension(716, 740));
        setSize(new java.awt.Dimension(716, 740));

        menuPanel.setBackground(new java.awt.Color(0, 56, 128));
        menuPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 50, 105)));
        menuPanel.setMaximumSize(new java.awt.Dimension(700, 700));
        menuPanel.setPreferredSize(new java.awt.Dimension(700, 700));

        titulo.setFont(new java.awt.Font("Comic Sans MS", 1, 30)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Gerenciar Contas");

        btnSaque.setBackground(new java.awt.Color(0, 50, 128));
        btnSaque.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSaque.setForeground(new java.awt.Color(255, 255, 255));
        btnSaque.setIcon(new javax.swing.ImageIcon("C:\\Users\\Alisson\\Desktop\\Rodrigo\\Trabalho POO\\Sistema-de-Controle-Bacario-Trab_POO\\Button1.png")); // NOI18N
        btnSaque.setText("Saque");
        btnSaque.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 50, 128)));
        btnSaque.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaqueActionPerformed(evt);
            }
        });

        btnDeposito.setBackground(new java.awt.Color(0, 50, 128));
        btnDeposito.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDeposito.setForeground(new java.awt.Color(255, 255, 255));
        btnDeposito.setIcon(new javax.swing.ImageIcon("C:\\Users\\Alisson\\Desktop\\Rodrigo\\Trabalho POO\\Sistema-de-Controle-Bacario-Trab_POO\\Button1.png")); // NOI18N
        btnDeposito.setText("Deposito");
        btnDeposito.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 50, 128)));
        btnDeposito.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositoActionPerformed(evt);
            }
        });

        btnAltSenha.setBackground(new java.awt.Color(0, 50, 128));
        btnAltSenha.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAltSenha.setForeground(new java.awt.Color(255, 255, 255));
        btnAltSenha.setIcon(new javax.swing.ImageIcon("C:\\Users\\Alisson\\Desktop\\Rodrigo\\Trabalho POO\\Sistema-de-Controle-Bacario-Trab_POO\\Button1.png")); // NOI18N
        btnAltSenha.setText("Alterar Senha");
        btnAltSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 50, 128)));
        btnAltSenha.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnAltLimite.setBackground(new java.awt.Color(0, 50, 128));
        btnAltLimite.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAltLimite.setForeground(new java.awt.Color(255, 255, 255));
        btnAltLimite.setIcon(new javax.swing.ImageIcon("C:\\Users\\Alisson\\Desktop\\Rodrigo\\Trabalho POO\\Sistema-de-Controle-Bacario-Trab_POO\\Button1.png")); // NOI18N
        btnAltLimite.setText("Alterar Limite");
        btnAltLimite.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 50, 128)));
        btnAltLimite.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnEncerrar.setBackground(new java.awt.Color(0, 50, 128));
        btnEncerrar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnEncerrar.setForeground(new java.awt.Color(255, 255, 255));
        btnEncerrar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Alisson\\Desktop\\Rodrigo\\Trabalho POO\\Sistema-de-Controle-Bacario-Trab_POO\\Button1.png")); // NOI18N
        btnEncerrar.setText("Encerrar Conta");
        btnEncerrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 50, 128)));
        btnEncerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnReativar.setBackground(new java.awt.Color(0, 50, 128));
        btnReativar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnReativar.setForeground(new java.awt.Color(255, 255, 255));
        btnReativar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Alisson\\Desktop\\Rodrigo\\Trabalho POO\\Sistema-de-Controle-Bacario-Trab_POO\\Button1.png")); // NOI18N
        btnReativar.setText("Reativar Conta");
        btnReativar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 50, 128)));
        btnReativar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnVoltar.setBackground(new java.awt.Color(0, 50, 128));
        btnVoltar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Alisson\\Desktop\\Rodrigo\\Trabalho POO\\Sistema-de-Controle-Bacario-Trab_POO\\Button1.png")); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 50, 128)));
        btnVoltar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addContainerGap(226, Short.MAX_VALUE)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout.createSequentialGroup()
                        .addComponent(titulo)
                        .addGap(224, 224, 224))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout.createSequentialGroup()
                        .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSaque, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnAltLimite, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(btnAltSenha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(btnDeposito, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnEncerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(btnReativar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(btnVoltar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                        .addGap(263, 263, 263))))
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(titulo)
                .addGap(38, 38, 38)
                .addComponent(btnSaque, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAltSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAltLimite, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEncerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnReativar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        new Menu2Contas().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnSaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaqueActionPerformed
        new Menu8Saque().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnSaqueActionPerformed

    private void btnDepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositoActionPerformed
        new Menu9Deposito().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnDepositoActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAltLimite;
    private javax.swing.JButton btnAltSenha;
    private javax.swing.JButton btnDeposito;
    private javax.swing.JButton btnEncerrar;
    private javax.swing.JButton btnReativar;
    private javax.swing.JButton btnSaque;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
