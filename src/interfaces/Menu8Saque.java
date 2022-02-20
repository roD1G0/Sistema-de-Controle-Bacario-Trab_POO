package interfaces;

import app.Conta;
import app.ListaContas;
import app.ListaClientes;
import app.Arquivo;

public class Menu8Saque extends javax.swing.JFrame {

    /**
     * Creates new form Menu8Saque
     */
    public Menu8Saque() {
        lerListas();
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
        infoNumConta = new javax.swing.JLabel();
        campoNumConta = new javax.swing.JTextField();
        infoSenha = new javax.swing.JLabel();
        campoSenha = new javax.swing.JPasswordField();
        infoValor = new javax.swing.JLabel();
        campoValor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista = new javax.swing.JList<>();
        btnVoltar = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();
        aviso = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de controle bancario");

        menuPanel.setBackground(new java.awt.Color(0, 56, 128));
        menuPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 50, 105)));
        menuPanel.setFocusable(false);
        menuPanel.setMaximumSize(new java.awt.Dimension(700, 700));
        menuPanel.setPreferredSize(new java.awt.Dimension(700, 700));

        titulo.setBackground(new java.awt.Color(0, 56, 128));
        titulo.setFont(new java.awt.Font("Comic Sans MS", 1, 30)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("Saque");
        titulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        infoNumConta.setBackground(new java.awt.Color(0, 56, 128));
        infoNumConta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        infoNumConta.setForeground(new java.awt.Color(255, 255, 255));
        infoNumConta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infoNumConta.setText("Informe o numero da conta:");

        campoNumConta.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        infoSenha.setBackground(new java.awt.Color(0, 56, 128));
        infoSenha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        infoSenha.setForeground(new java.awt.Color(255, 255, 255));
        infoSenha.setText("Informe a senha: ");

        infoValor.setBackground(new java.awt.Color(0, 56, 128));
        infoValor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        infoValor.setForeground(new java.awt.Color(255, 255, 255));
        infoValor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infoValor.setText("Informe o valor: ");

        lista.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = l.getLista();
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lista.setFocusable(false);
        lista.setValueIsAdjusting(true);
        jScrollPane1.setViewportView(lista);

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

        btnConfirmar.setBackground(new java.awt.Color(0, 50, 128));
        btnConfirmar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnConfirmar.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirmar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Alisson\\Desktop\\Rodrigo\\Trabalho POO\\Sistema-de-Controle-Bacario-Trab_POO\\Button1.png")); // NOI18N
        btnConfirmar.setText("Confirmar");
        btnConfirmar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 50, 128)));
        btnConfirmar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        aviso.setBackground(new java.awt.Color(0, 56, 128));
        aviso.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        aviso.setForeground(new java.awt.Color(255, 255, 255));
        aviso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aviso.setText("Preencha todos os campos");

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuPanelLayout.createSequentialGroup()
                        .addGap(307, 307, 307)
                        .addComponent(titulo))
                    .addGroup(menuPanelLayout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(menuPanelLayout.createSequentialGroup()
                                .addComponent(infoNumConta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoNumConta, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(197, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout.createSequentialGroup()
                        .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(infoSenha, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(infoValor, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(campoValor)
                            .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(214, 214, 214))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout.createSequentialGroup()
                        .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnConfirmar)
                            .addComponent(btnVoltar)
                            .addComponent(aviso))
                        .addGap(247, 247, 247))))
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(titulo)
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(infoNumConta)
                    .addComponent(campoNumConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(infoSenha)
                    .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(infoValor)
                    .addComponent(campoValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(aviso)
                .addGap(33, 33, 33)
                .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
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
                .addContainerGap()
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        new Menu7GerenciarContas().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        if(campoNumConta.getText() != null && campoSenha.getText() != null && campoValor.getText() != null){
            long numConta = (long)(Double.parseDouble(campoNumConta.getText()));
            long senha = (long)(Double.parseDouble(campoSenha.getText()));
            double valor = (double)(Double.parseDouble(campoValor.getText()));
            if(l.saqueConta(numConta,senha,valor)){
                gravarListas();
                aviso.setText("Saque efetuado!");
                lista.setModel(new javax.swing.AbstractListModel<String>() {
                    String[] strings = l.getLista();
                    public int getSize() { return strings.length; }
                    public String getElementAt(int i) { return strings[i]; }
                }); 
            }else{
                aviso.setText("Saque não efetuado!");
            }
        }else{
            aviso.setText("Preencha todos os campos!");
        }
        
    }//GEN-LAST:event_btnConfirmarActionPerformed

    public static void lerListas() {
        		try{
        			Object obj;
        			obj = Arquivo.ler("ListaClientes");
        			lC = (ListaClientes) obj;
        		}catch(Exception er) {
        			System.err.println(er.getMessage());
        		}
        		try{
        			Object obj;
        			obj = Arquivo.ler("ListaContas");
        			l = (ListaContas) obj;
                                Conta.setGeraNumeros(l.getMaiorNumero()+1);
        		}catch(Exception er) {
        			System.err.println(er.getMessage());
        		}
        	}
            public static void gravarListas() {
        		try {
        			Arquivo.gravar(l, "ListaContas");
        		}catch(Exception er) {
        			System.err.println(er.getMessage());
        		}
        		try {
        			Arquivo.gravar(lC, "ListaClientes");
        		}catch(Exception er) {
        			System.err.println(er.getMessage());
        		}
        	}
    private static ListaContas l;
    private static ListaClientes lC;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aviso;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JTextField campoNumConta;
    private javax.swing.JPasswordField campoSenha;
    private javax.swing.JTextField campoValor;
    private javax.swing.JLabel infoNumConta;
    private javax.swing.JLabel infoSenha;
    private javax.swing.JLabel infoValor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lista;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}