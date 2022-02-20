/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

import app.Arquivo;
import app.Conta;
import app.ListaClientes;
import app.ListaContas;
import app.ClientePF;
import app.ClientePJ;

public class Menu6CadastrarCliente extends javax.swing.JFrame {

    public Menu6CadastrarCliente() {
        lerListas();
        groupCadClint = new javax.swing.ButtonGroup();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuPanel = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        suTitulo = new javax.swing.JLabel();
        radioFisica = new javax.swing.JRadioButton();
        radioJuridica = new javax.swing.JRadioButton();
        infoDocumento = new javax.swing.JLabel();
        campoDocumento = new javax.swing.JTextField();
        infoNome = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        infoCep = new javax.swing.JLabel();
        campoCep = new javax.swing.JTextField();
        infoPais = new javax.swing.JLabel();
        campoPais = new javax.swing.JTextField();
        infoCidade = new javax.swing.JLabel();
        campoCidade = new javax.swing.JTextField();
        infoRua = new javax.swing.JLabel();
        campoRua = new javax.swing.JTextField();
        infoNumero = new javax.swing.JLabel();
        campoNumero = new javax.swing.JTextField();
        voltar = new javax.swing.JButton();
        confirmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Controle Bancario");

        menuPanel.setBackground(new java.awt.Color(0, 56, 128));
        menuPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 50, 105)));
        menuPanel.setFocusable(false);
        menuPanel.setPreferredSize(new java.awt.Dimension(700, 700));

        titulo.setBackground(new java.awt.Color(0, 56, 128));
        titulo.setFont(new java.awt.Font("Comic Sans MS", 1, 30)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("Cadastrar Cliente");

        suTitulo.setBackground(new java.awt.Color(0, 56, 128));
        suTitulo.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        suTitulo.setForeground(new java.awt.Color(255, 255, 255));
        suTitulo.setText("Escolha qual o tipo de cliente:");

        radioFisica.setBackground(new java.awt.Color(0, 56, 128));
        groupCadClint.add(radioFisica);
        radioFisica.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radioFisica.setForeground(new java.awt.Color(255, 255, 255));
        radioFisica.setText("Pessoa Fisica");
        radioFisica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioFisicaActionPerformed(evt);
            }
        });

        radioJuridica.setBackground(new java.awt.Color(0, 56, 128));
        groupCadClint.add(radioJuridica);
        radioJuridica.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radioJuridica.setForeground(new java.awt.Color(255, 255, 255));
        radioJuridica.setText("Pessoa Juridica");
        radioJuridica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioJuridicaActionPerformed(evt);
            }
        });

        infoDocumento.setBackground(new java.awt.Color(0, 56, 128));
        infoDocumento.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        infoDocumento.setForeground(new java.awt.Color(255, 255, 255));
        infoDocumento.setText("documento");

        infoNome.setBackground(new java.awt.Color(0, 26, 128));
        infoNome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        infoNome.setForeground(new java.awt.Color(255, 255, 255));
        infoNome.setText("Nome: ");

        infoCep.setBackground(new java.awt.Color(0, 56, 128));
        infoCep.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        infoCep.setForeground(new java.awt.Color(255, 255, 255));
        infoCep.setText("CEP: ");

        infoPais.setBackground(new java.awt.Color(0, 56, 128));
        infoPais.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        infoPais.setForeground(new java.awt.Color(255, 255, 255));
        infoPais.setText("Pais:");

        infoCidade.setBackground(new java.awt.Color(0, 56, 128));
        infoCidade.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        infoCidade.setForeground(new java.awt.Color(255, 255, 255));
        infoCidade.setText("Cidade: ");

        infoRua.setBackground(new java.awt.Color(0, 56, 128));
        infoRua.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        infoRua.setForeground(new java.awt.Color(255, 255, 255));
        infoRua.setText("Rua: ");

        infoNumero.setBackground(new java.awt.Color(0, 56, 128));
        infoNumero.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        infoNumero.setForeground(new java.awt.Color(255, 255, 255));
        infoNumero.setText("Numero: ");

        voltar.setBackground(new java.awt.Color(0, 50, 105));
        voltar.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        voltar.setForeground(new java.awt.Color(255, 255, 255));
        voltar.setText("Voltar");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });

        confirmar.setBackground(new java.awt.Color(0, 50, 105));
        confirmar.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        confirmar.setForeground(new java.awt.Color(255, 255, 255));
        confirmar.setText("Confirmar");
        confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuPanelLayout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(titulo))
                    .addGroup(menuPanelLayout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124)
                        .addComponent(confirmar))
                    .addGroup(menuPanelLayout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioFisica)
                            .addComponent(suTitulo)
                            .addComponent(radioJuridica)
                            .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(menuPanelLayout.createSequentialGroup()
                                    .addComponent(infoNome)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(campoNome))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, menuPanelLayout.createSequentialGroup()
                                    .addComponent(infoNumero)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(campoNumero))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, menuPanelLayout.createSequentialGroup()
                                    .addComponent(infoRua)
                                    .addGap(18, 18, 18)
                                    .addComponent(campoRua))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, menuPanelLayout.createSequentialGroup()
                                    .addComponent(infoCidade)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(campoCidade))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, menuPanelLayout.createSequentialGroup()
                                    .addComponent(infoPais)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(campoPais))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, menuPanelLayout.createSequentialGroup()
                                    .addComponent(infoCep)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(campoCep))
                                .addGroup(menuPanelLayout.createSequentialGroup()
                                    .addComponent(infoDocumento)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(campoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(200, Short.MAX_VALUE))
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(titulo)
                .addGap(45, 45, 45)
                .addComponent(suTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioFisica)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioJuridica)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(infoDocumento)
                    .addComponent(campoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(infoNome)
                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(infoCep)
                    .addComponent(campoCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(infoPais)
                    .addComponent(campoPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(infoCidade)
                    .addComponent(campoCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(infoRua)
                    .addComponent(campoRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(infoNumero)
                    .addComponent(campoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(voltar)
                    .addComponent(confirmar))
                .addGap(117, 117, 117))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radioFisicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioFisicaActionPerformed
        infoDocumento.setText("CPF: ");
    }//GEN-LAST:event_radioFisicaActionPerformed

    private void radioJuridicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioJuridicaActionPerformed
        infoDocumento.setText("CNPJ: ");
    }//GEN-LAST:event_radioJuridicaActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        new Menu3Clientes().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_voltarActionPerformed

    private void confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarActionPerformed
        String nome = campoNome.getText();
        long documento = (long)(Double.parseDouble(campoDocumento.getText()));
        long cep = (long)(Double.parseDouble(campoCep.getText()));
        String pais = campoPais.getText();
        String cidade = campoCidade.getText();
        String rua = campoRua.getText();
        int numero = (int)(Double.parseDouble(campoNumero.getText()));
        
        if(radioFisica.isSelected()){
            ClientePF cPF = new ClientePF(nome, documento);
            l.addCliente(cPF);
            l.setEndereco(cPF, cep, pais, cidade, rua, numero);
            gravarListas();
        }else if(radioJuridica.isSelected()){
            ClientePJ cPJ = new ClientePJ(nome, documento);
            l.addCliente(cPJ);
            l.setEndereco(cPJ, cep, pais, cidade, rua, numero);
            gravarListas();
        }
       
    }//GEN-LAST:event_confirmarActionPerformed
    
    public static void lerListas() {
        		
        		try{
        			Object obj;
        			obj = Arquivo.ler("ListaContas");
        			lC = (ListaContas) obj;
                                Conta.setGeraNumeros(lC.getMaiorNumero()+1);
        		}catch(Exception er) {
        			System.err.println(er.getMessage());
        		}
                        try{
        			Object obj;
        			obj = Arquivo.ler("ListaClientes");
        			l = (ListaClientes) obj;
        		}catch(Exception er) {
        			System.err.println(er.getMessage());
        		}
        	}
    public static void gravarListas() {
		try {
			Arquivo.gravar(lC, "ListaContas");
		}catch(Exception er) {
			System.err.println(er.getMessage());
		}
		try {
			Arquivo.gravar(l, "ListaClientes");
		}catch(Exception er) {
			System.err.println(er.getMessage());
		}
	}
    private static ListaContas lC;
    private static ListaClientes l;
    private final javax.swing.ButtonGroup groupCadClint;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoCep;
    private javax.swing.JTextField campoCidade;
    private javax.swing.JTextField campoDocumento;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoNumero;
    private javax.swing.JTextField campoPais;
    private javax.swing.JTextField campoRua;
    private javax.swing.JButton confirmar;
    private javax.swing.JLabel infoCep;
    private javax.swing.JLabel infoCidade;
    private javax.swing.JLabel infoDocumento;
    private javax.swing.JLabel infoNome;
    private javax.swing.JLabel infoNumero;
    private javax.swing.JLabel infoPais;
    private javax.swing.JLabel infoRua;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JRadioButton radioFisica;
    private javax.swing.JRadioButton radioJuridica;
    private javax.swing.JLabel suTitulo;
    private javax.swing.JLabel titulo;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
