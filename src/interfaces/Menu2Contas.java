package interfaces;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;

public class Menu2Contas extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2447323559500383661L;
	private JButton btnAbrir;
	private JButton btnGerenciar;
	private JButton btnListar;
	private JButton btnVoltar;
	private JPanel panelMenu;
	private JLabel titulo;
	private ImageIcon icon;
	
	public Menu2Contas() {
	setSize(716, 740);
        setTitle("Sistema de controle Bancário");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setResizable(false);
        initComponents();
	}
	public void initComponents() {
		icon = new ImageIcon("Button1.png");
        Image scaledImg = icon.getImage().getScaledInstance(200, 60, java.awt.Image.SCALE_SMOOTH);
        icon = new ImageIcon(scaledImg);
        
        panelMenu = new JPanel();
        btnAbrir = new JButton(icon);
        btnGerenciar = new JButton(icon);
        btnListar = new JButton(icon);
        btnVoltar = new JButton(icon);
        titulo = new JLabel("Menu de contas");
        
        //panel
        panelMenu.setBackground(new Color(0, 56, 128));
        panelMenu.setBounds(0, 0, 700, 700);
        
        //label
        titulo.setHorizontalAlignment(JLabel.CENTER);
        titulo.setVerticalAlignment(JLabel.TOP);
        titulo.setForeground(Color.WHITE);
        titulo.setFont(new Font("Comic Sans", Font.BOLD, 30));
        titulo.setSize(getPreferredSize());
        titulo.setLocation(5, 10);
        
        //Button Borders
        Border ButtonBorder = BorderFactory.createLineBorder(new Color(0, 50, 105), 0);
        
        //button
        btnAbrir.setHorizontalTextPosition(JButton.CENTER);
        btnAbrir.setVerticalTextPosition(JButton.CENTER);
        btnAbrir.setBounds(250, 300, 200, 60);
        btnAbrir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnAbrirActionPerformed(evt);
            }
        });
        btnAbrir.setText("Abrir conta");
        btnAbrir.setFocusable(false);
        btnAbrir.setFont(new Font("Comic Sans", Font.PLAIN, 18));
        btnAbrir.setForeground(Color.WHITE);
        btnAbrir.setBackground(new Color(0, 56, 128));
        btnAbrir.setBorder(ButtonBorder);
        
        btnGerenciar.setHorizontalTextPosition(JButton.CENTER);
        btnGerenciar.setVerticalTextPosition(JButton.CENTER);
        btnGerenciar.setBounds(250, 400, 200, 60);
        btnGerenciar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnGerenciarActionPerformed(evt);
            }
        });
        btnGerenciar.setText("Gerenciar Conta");
        btnGerenciar.setFocusable(false);
        btnGerenciar.setFont(new Font("Comic Sans", Font.PLAIN, 18));
        btnGerenciar.setForeground(Color.WHITE);
        btnGerenciar.setBackground(new Color(0, 56, 128));
        btnGerenciar.setBorder(ButtonBorder);
        
        btnListar.setHorizontalTextPosition(JButton.CENTER);
        btnListar.setVerticalTextPosition(JButton.CENTER);
        btnListar.setBounds(250, 500, 200, 60);
        btnListar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });
        btnListar.setText("Listar contas");
        btnListar.setFocusable(false);
        btnListar.setFont(new Font("Comic Sans", Font.PLAIN, 18));
        btnListar.setForeground(Color.WHITE);
        btnListar.setBackground(new Color(0, 56, 128));
        btnListar.setBorder(ButtonBorder);
        
        btnVoltar.setHorizontalTextPosition(JButton.CENTER);
        btnVoltar.setVerticalTextPosition(JButton.CENTER);
        btnVoltar.setBounds(250, 600, 200, 60);
        btnVoltar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        btnVoltar.setText("Voltar");
        btnVoltar.setFocusable(false);
        btnVoltar.setFont(new Font("Comic Sans", Font.PLAIN, 18));
        btnVoltar.setForeground(Color.WHITE);
        btnVoltar.setBackground(new Color(0, 56, 128));
        btnVoltar.setBorder(ButtonBorder);
        
        //Border
        Border b = BorderFactory.createLineBorder(new Color(0, 98, 167), 4);
        
        ImageIcon image = new ImageIcon("Logo2.png"); //create the image
        setIconImage(image.getImage());//change Icon
        
        panelMenu.setBorder(b);
        
        //add Components
        panelMenu.add(titulo);
        add(btnAbrir);
        add(btnGerenciar);
        add(btnListar);
        add(btnVoltar);
        add(panelMenu);

        //Show the window
        setVisible(true);
	}
	public void btnAbrirActionPerformed(ActionEvent evt) {
		new Menu4AbrirConta().setVisible(true);
		setVisible(false);
	}
	public void btnGerenciarActionPerformed(ActionEvent evt) {
		
	}
	public void btnListarActionPerformed(ActionEvent evt) {
		new ListarContas().setVisible(true);
                setVisible(false);
	}
	public void btnVoltarActionPerformed(ActionEvent evt) {
		new Menu1().setVisible(true);
		setVisible(false);
	}

}
