package interfaces;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;

public class Menu1 extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 962015977889947749L;
	private JButton btnContas;
	private JButton btnClientes;
	private JButton btnEncerrar;
	private JPanel panelMenu;
	private JLabel titulo;
	private ImageIcon icon;
	
	public Menu1() {
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
		btnContas = new JButton(icon);
		btnClientes = new JButton(icon);
		btnEncerrar = new JButton(icon);
		titulo = new JLabel("Menu Principal");
		
		//panel
		panelMenu.setBackground(new Color(0, 56, 128));
        panelMenu.setBounds(0, 0, 700, 700);
        
        //label
        titulo.setBounds(250, 00, 200, 60);
        titulo.setHorizontalAlignment(JLabel.CENTER);
        titulo.setVerticalAlignment(JLabel.TOP);
        titulo.setForeground(Color.WHITE);
        titulo.setFont(new Font("Comic Sans", Font.BOLD, 30));
        titulo.setSize(getPreferredSize());
        titulo.setLocation(5, 10);
        
        //Button border
        Border ButtonBorder = BorderFactory.createLineBorder(new Color(0, 50, 105), 0);
        
        //buttons
        btnContas.setText("Gerenciar Contas;");
        btnContas.setHorizontalTextPosition(JButton.CENTER);
        btnContas.setVerticalTextPosition(JButton.CENTER);
        btnContas.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnContasActionPerformed(evt);
            }
        });
        btnContas.setBounds(250, 300, 200, 60);
        btnContas.setFocusable(false);
        btnContas.setFont(new Font("Comic Sans", Font.PLAIN, 18));
        btnContas.setForeground(Color.WHITE);
        btnContas.setBackground(new Color(0, 56, 128));
        btnContas.setBorder(ButtonBorder);
        

        btnClientes.setText("Gerenciar Clientes;");
        btnClientes.setHorizontalTextPosition(JButton.CENTER);
        btnClientes.setVerticalTextPosition(JButton.CENTER);
        btnClientes.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });
        btnClientes.setBounds(250, 400, 200, 60);
        btnClientes.setFocusable(false);
        btnClientes.setFont(new Font("Comic Sans", Font.PLAIN, 18));
        btnClientes.setForeground(Color.WHITE);
        btnClientes.setBackground(new Color(0, 56, 128));
        btnClientes.setBorder(ButtonBorder);

        btnEncerrar.setText("Encerrar");
        btnEncerrar.setHorizontalTextPosition(JButton.CENTER);
        btnEncerrar.setVerticalTextPosition(JButton.CENTER);
        btnEncerrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnEncerrarActionPerformed(evt);
            }
        });
        btnEncerrar.setBounds(250, 500, 200, 60);
        btnEncerrar.setFocusable(false);
        btnEncerrar.setFont(new Font("Comic Sans", Font.PLAIN, 18));
        btnEncerrar.setForeground(Color.WHITE);
        btnEncerrar.setBackground(new Color(0, 56, 128));
        btnEncerrar.setBorder(ButtonBorder);

        //Border
        Border PanelB = BorderFactory.createLineBorder(new Color(0, 98, 167), 4);
        
        ImageIcon image = new ImageIcon("Logo2.png"); //create the image
        setIconImage(image.getImage());
        
        //add the border
        panelMenu.setBorder(PanelB);
        
        //add Components
        panelMenu.add(titulo);
        add(btnContas);
        add(btnClientes);
        add(btnEncerrar);
        add(panelMenu);
        
        //Show the window
        setVisible(true);
	}
	public void btnContasActionPerformed(ActionEvent evt) {
		new Menu2Contas();
		setVisible(false);
	}
	public void btnClientesActionPerformed(ActionEvent evt) {
		new Menu3Clientes();
		setVisible(false);
	}
	public void btnEncerrarActionPerformed(ActionEvent evt) {
		System.exit(0);
	}

}
