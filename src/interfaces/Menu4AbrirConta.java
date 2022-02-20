package interfaces;

import app.Arquivo;
import app.Conta;
import app.ListaClientes;
import app.ListaContas;
import app.ContaCorrente;
import app.ContaPoupanca;
import app.ContaEspecial;

public class Menu4AbrirConta extends javax.swing.JFrame {

    /**
     * Creates new form Menu4AbrirConta
     */
    public Menu4AbrirConta() {
        lerListas();
        groupAbrirConta = new javax.swing.ButtonGroup();
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

        menuAC = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        subTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaClientes = new javax.swing.JList<>();
        infoClint = new javax.swing.JLabel();
        campoClint = new javax.swing.JTextField();
        radioCorrente = new javax.swing.JRadioButton();
        radioPoupanca = new javax.swing.JRadioButton();
        radioEspecial = new javax.swing.JRadioButton();
        infoConta = new javax.swing.JLabel();
        infoSenha = new javax.swing.JLabel();
        campoSenha = new javax.swing.JPasswordField();
        infoLimite = new javax.swing.JLabel();
        campoLimite = new javax.swing.JTextField();
        aviso = new javax.swing.JLabel();
        voltar = new javax.swing.JButton();
        confirmar = new javax.swing.JButton();
        avisoErr = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Controle Bancario");
        setFocusable(false);
        setMaximumSize(new java.awt.Dimension(716, 740));
        setPreferredSize(new java.awt.Dimension(716, 740));
        setResizable(false);
        setSize(new java.awt.Dimension(716, 740));

        menuAC.setBackground(new java.awt.Color(0, 56, 128));
        menuAC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 50, 105)));
        menuAC.setMaximumSize(new java.awt.Dimension(700, 700));
        menuAC.setPreferredSize(new java.awt.Dimension(700, 700));

        titulo.setBackground(new java.awt.Color(0, 56, 128));
        titulo.setFont(new java.awt.Font("Comic Sans MS", 1, 30)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Abrir Conta");
        titulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        subTitulo.setBackground(new java.awt.Color(0, 56, 128));
        subTitulo.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        subTitulo.setForeground(new java.awt.Color(255, 255, 255));
        subTitulo.setText("Escolha um cliente");

        listaClientes.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = lC.getLista();
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaClientes.setValueIsAdjusting(true);
        jScrollPane1.setViewportView(listaClientes);

        infoClint.setBackground(new java.awt.Color(0, 50, 128));
        infoClint.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        infoClint.setForeground(new java.awt.Color(255, 255, 255));
        infoClint.setText("Indique o indice do cliente:");

        radioCorrente.setBackground(new java.awt.Color(0, 50, 128));
        groupAbrirConta.add(radioCorrente);
        radioCorrente.setForeground(new java.awt.Color(255, 255, 255));
        radioCorrente.setText("Conta Corrente");

        radioPoupanca.setBackground(new java.awt.Color(0, 50, 128));
        groupAbrirConta.add(radioPoupanca);
        radioPoupanca.setForeground(new java.awt.Color(255, 255, 255));
        radioPoupanca.setText("Conta Poupança");

        radioEspecial.setBackground(new java.awt.Color(0, 50, 128));
        groupAbrirConta.add(radioEspecial);
        radioEspecial.setForeground(new java.awt.Color(255, 255, 255));
        radioEspecial.setText("Conta Especial");

        infoConta.setBackground(new java.awt.Color(0, 50, 128));
        infoConta.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        infoConta.setForeground(new java.awt.Color(255, 255, 255));
        infoConta.setText("Escolha um tipo de conta:");

        infoSenha.setBackground(new java.awt.Color(0, 50, 128));
        infoSenha.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        infoSenha.setForeground(new java.awt.Color(255, 255, 255));
        infoSenha.setText("Informe a senha: ");

        infoLimite.setBackground(new java.awt.Color(0, 50, 128));
        infoLimite.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        infoLimite.setForeground(new java.awt.Color(255, 255, 255));
        infoLimite.setText("Informe o limite:");

        aviso.setBackground(new java.awt.Color(0, 50, 128));
        aviso.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        aviso.setForeground(new java.awt.Color(255, 255, 255));
        aviso.setText("(O limite só será aplicado a coontas especiais)");

        voltar.setBackground(new java.awt.Color(0, 50, 105));
        voltar.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        voltar.setForeground(new java.awt.Color(255, 255, 255));
        voltar.setText("Voltar");
        voltar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });

        confirmar.setBackground(new java.awt.Color(0, 50, 105));
        confirmar.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        confirmar.setForeground(new java.awt.Color(0, 255, 0));
        confirmar.setText("Confirmar");
        confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarActionPerformed(evt);
            }
        });

        avisoErr.setBackground(new java.awt.Color(0, 56, 128));
        avisoErr.setForeground(new java.awt.Color(255, 255, 255));
        avisoErr.setText("Preencha todos os campos!");

        javax.swing.GroupLayout menuACLayout = new javax.swing.GroupLayout(menuAC);
        menuAC.setLayout(menuACLayout);
        menuACLayout.setHorizontalGroup(
            menuACLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuACLayout.createSequentialGroup()
                .addContainerGap(188, Short.MAX_VALUE)
                .addGroup(menuACLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuACLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuACLayout.createSequentialGroup()
                            .addGroup(menuACLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(titulo)
                                .addComponent(subTitulo))
                            .addGap(261, 261, 261))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuACLayout.createSequentialGroup()
                            .addGroup(menuACLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(menuACLayout.createSequentialGroup()
                                    .addComponent(voltar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(confirmar))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(203, 203, 203)))
                    .addGroup(menuACLayout.createSequentialGroup()
                        .addGroup(menuACLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(menuACLayout.createSequentialGroup()
                                .addComponent(infoSenha)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(aviso)
                            .addComponent(infoConta)
                            .addComponent(radioEspecial)
                            .addGroup(menuACLayout.createSequentialGroup()
                                .addComponent(infoClint)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoClint, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(menuACLayout.createSequentialGroup()
                                .addComponent(infoLimite)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoLimite, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(menuACLayout.createSequentialGroup()
                                .addGroup(menuACLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(radioPoupanca)
                                    .addComponent(radioCorrente))
                                .addGap(94, 94, 94)
                                .addComponent(avisoErr)))
                        .addGap(180, 180, 180))))
        );
        menuACLayout.setVerticalGroup(
            menuACLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuACLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(titulo)
                .addGap(18, 18, 18)
                .addComponent(subTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(menuACLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(infoClint)
                    .addComponent(campoClint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(infoConta)
                .addGroup(menuACLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuACLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioCorrente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioPoupanca))
                    .addGroup(menuACLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(avisoErr)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioEspecial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(menuACLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(infoSenha)
                    .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(menuACLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(infoLimite)
                    .addComponent(campoLimite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aviso)
                .addGap(49, 49, 49)
                .addGroup(menuACLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(voltar)
                    .addComponent(confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(menuAC, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(150, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(menuAC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        new Menu2Contas().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_voltarActionPerformed

    private void confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarActionPerformed
        if(campoClint.getText() != null && campoSenha.getText() != null){
            int i = (int)(Double.parseDouble(campoClint.getText()));
            long senha = (long)(Double.parseDouble(campoSenha.getText()));
            if(lC.getCliente(i)!= null){
                if(radioCorrente.isSelected()){
                    ContaCorrente cC = new ContaCorrente(lC.getCliente(i), senha);
                    l.addConta(cC);
                    lC.incrementaContas(lC.getCliente(i));
                    gravarListas();
                }else if(radioPoupanca.isSelected()){
                    ContaPoupanca cP = new ContaPoupanca(lC.getCliente(i), senha);
                    l.addConta(cP);
                    lC.incrementaContas(lC.getCliente(i));
                    gravarListas();
                }else if(radioEspecial.isSelected()){
                    if(campoLimite.getText()!= null){
                        double limite = (double)(Double.parseDouble(campoLimite.getText()));
                        ContaEspecial cE = new ContaEspecial(lC.getCliente(i), senha,limite);
                        l.addConta(cE);
                        lC.incrementaContas(lC.getCliente(i));
                        gravarListas();
                    }else{
                        avisoErr.setText("Informe um limite para conta especial!");
                    }   
                }else{
                    avisoErr.setText("Selecione um tipo de conta!");
                }
            
            }else{
            avisoErr.setText("Cliente indicado não existe!");
        }
        
    }//GEN-LAST:event_confirmarActionPerformed

    /**
     * @param args the command line arguments
     */
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
    
    private static ListaClientes lC;
    private static ListaContas l;
    private final javax.swing.ButtonGroup groupAbrirConta;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aviso;
    private javax.swing.JLabel avisoErr;
    private javax.swing.JTextField campoClint;
    private javax.swing.JTextField campoLimite;
    private javax.swing.JPasswordField campoSenha;
    private javax.swing.JButton confirmar;
    private javax.swing.JLabel infoClint;
    private javax.swing.JLabel infoConta;
    private javax.swing.JLabel infoLimite;
    private javax.swing.JLabel infoSenha;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listaClientes;
    private javax.swing.JPanel menuAC;
    private javax.swing.JRadioButton radioCorrente;
    private javax.swing.JRadioButton radioEspecial;
    private javax.swing.JRadioButton radioPoupanca;
    private javax.swing.JLabel subTitulo;
    private javax.swing.JLabel titulo;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
