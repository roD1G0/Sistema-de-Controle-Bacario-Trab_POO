package app.interfaces;


import javax.swing.*;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicButtonUI;
import java.awt.*;
import java.util.ArrayList;

public class UserInterface extends JFrame {

    JButton Bt1;
    JButton Bt2;
    JButton Bt3;


    public UserInterface() {
        setSize(716, 740);
        setTitle("Sistema de controle Bancário");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setResizable(false);

        //Center panel
        JPanel Cpanel = new JPanel();
        Cpanel.setBackground(new Color(0, 56, 128));
        Cpanel.setBounds(0, 0, 700, 700);

        JTextArea jTextArea = new JTextArea();
        jTextArea.setText("Menu Principal");
        jTextArea.setBounds(260, 80, 300, 300);
        jTextArea.setFont(new Font("Comic Sans", Font.BOLD, 30));
        jTextArea.setBackground(new Color(0, 56, 128));
        jTextArea.setForeground(Color.WHITE);
        jTextArea.setVisible(true);

        JLabel label = new JLabel("Menu de prinicipal");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.TOP);
        label.setForeground(Color.BLACK);
        label.setFont(new Font("Comic Sans", Font.BOLD, 115));
        label.setOpaque(true);
        label.setSize(getPreferredSize());
        label.setLocation(5, 10);

        Cpanel.add(label);
        Cpanel.repaint();


 

        ImageIcon icon = new ImageIcon("Button1.png");
        Image scaledImg = icon.getImage().getScaledInstance(200, 60, java.awt.Image.SCALE_SMOOTH);
        icon = new ImageIcon(scaledImg);

        Bt1 = new JButton(icon);
        Bt1.setHorizontalTextPosition(JButton.CENTER);
        Bt1.setVerticalTextPosition(JButton.CENTER);

        Bt2 = new JButton(icon);
        Bt2.setHorizontalTextPosition(JButton.CENTER);
        Bt2.setVerticalTextPosition(JButton.CENTER);

        Bt3 = new JButton(icon);
        Bt3.setHorizontalTextPosition(JButton.CENTER);
        Bt3.setVerticalTextPosition(JButton.CENTER);

        //Button
        Bt1.setBounds(250, 300, 200, 60);
        Bt1.addActionListener(e -> new JanelaMenuContas());
        Bt1.addActionListener(e -> setVisible(false));
        Bt1.setText("Gerenciar Contas");
        Bt1.setFocusable(false);
        Bt1.setFont(new Font("Comic Sans", Font.PLAIN, 18));
        Bt1.setForeground(Color.WHITE);
        Bt1.setBackground(new Color(0, 56, 128));
        Border ButtonBorder = BorderFactory.createLineBorder(new Color(0, 56, 128), 0);

        Bt2.setBounds(250, 400, 200, 60);
        Bt2.addActionListener(e -> System.out.print("Abrir janela de Genrenciamento de clientes"));
        Bt2.setText("Gerenciar Clientes");
        Bt2.setFocusable(false);
        Bt2.setFont(new Font("Comic Sans", Font.PLAIN, 18));
        Bt2.setForeground(Color.WHITE);
        Bt2.setBackground(new Color(0, 56, 128));

        Bt3.setBounds(250, 500, 200, 60);
        Bt3.addActionListener(e -> System.exit(0));
        Bt3.setText("Encerrar");
        Bt3.setFocusable(false);
        Bt3.setFont(new Font("Comic Sans", Font.PLAIN, 18));
        Bt3.setForeground(Color.WHITE);
        Bt3.setBackground(new Color(0, 56, 128));


        //JLabel label1 = new JLabel();
        //ImageIcon icon2 = new ImageIcon("Voltar.png");
        //Image im = icon2.getImage().getScaledInstance(200, 60,  java.awt.Image.SCALE_SMOOTH);
        //icon = new ImageIcon(scaledImg);
        //label1.setBounds(150, 200, 200,200);

        //Border
        Border PanelB = BorderFactory.createLineBorder(new Color(0, 98, 167), 4);

        ImageIcon image = new ImageIcon("Logo2.png"); //create the image
        setIconImage(image.getImage());//change Icon

        //add the border
        Cpanel.setBorder(PanelB);

        //add Components
        add(Cpanel);
        Cpanel.add(Bt1);
        Cpanel.add(Bt2);
        Cpanel.add(Bt3);
        Cpanel.add(jTextArea);
        //add(label1);
        //add(label);

        //Show the window
        setVisible(true);
    }

    public class JanelaMenuContas extends JFrame {

        JButton Bt1;
        JButton Bt2;
        JButton Bt3;
        JButton Bt4;

        public JanelaMenuContas() {
            setSize(716, 740);
            setTitle("Sistema de controle Bancário");
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLayout(null);
            setResizable(false);

            //Center panel
            JPanel Cpanel = new JPanel();
            Cpanel.setBackground(new Color(0, 56, 128));
            Cpanel.setBounds(0, 0, 700, 700);

            JTextArea jTextArea = new JTextArea();
            jTextArea.setText("Menu Contas");
            jTextArea.setBounds(260, 80, 300, 300);
            jTextArea.setFont(new Font("Comic Sans", Font.BOLD, 30));
            jTextArea.setBackground(new Color(0, 56, 128));
            jTextArea.setForeground(Color.WHITE);
            jTextArea.setVisible(true);

            //Button Image
            ImageIcon icon = new ImageIcon("Button1.png");
            Image scaledImg = icon.getImage().getScaledInstance(200, 60, java.awt.Image.SCALE_SMOOTH);
            icon = new ImageIcon(scaledImg);

            //ImageIcon voltar = new ImageIcon("Voltar.png");
            //Image img = voltar.getImage().getScaledInstance(40, 20, Image.SCALE_DEFAULT);
            //icon = new ImageIcon(img);


            Bt1 = new JButton(icon);
            Bt1.setHorizontalTextPosition(JButton.CENTER);
            Bt1.setVerticalTextPosition(JButton.CENTER);

            Bt2 = new JButton(icon);
            Bt2.setHorizontalTextPosition(JButton.CENTER);
            Bt2.setVerticalTextPosition(JButton.CENTER);

            Bt3 = new JButton(icon);
            Bt3.setHorizontalTextPosition(JButton.CENTER);
            Bt3.setVerticalTextPosition(JButton.CENTER);

            Bt4 = new JButton(icon);
            Bt4.setHorizontalTextPosition(JButton.CENTER);
            Bt4.setVerticalTextPosition(JButton.CENTER);

            //Button Borders
            Border ButtonBorder = BorderFactory.createLineBorder(new Color(0, 56, 128), 0);


            Bt1.setBounds(250, 300, 200, 60);
            Bt1.addActionListener(e -> setVisible(false));
            Bt1.addActionListener(e -> new JanelaAbrirConta());
            Bt1.setText("Abrir conta");
            Bt1.setFocusable(false);
            Bt1.setFont(new Font("Comic Sans", Font.PLAIN, 18));
            Bt1.setForeground(Color.WHITE);
            Bt1.setBackground(new Color(0, 56, 128));
            Bt1.setFocusPainted(false);

            Bt2.setBounds(250, 400, 200, 60);
            Bt2.addActionListener(e -> System.out.print("Abrir janela de Gerenciamento de Contas"));
            Bt2.setText("Gerenciar Conta");
            Bt2.setFocusable(false);
            Bt2.setFont(new Font("Comic Sans", Font.PLAIN, 18));
            Bt2.setForeground(Color.WHITE);
            Bt2.setBackground(new Color(0, 56, 128));
            Bt2.setFocusPainted(false);

            Bt3.setBounds(250, 500, 200, 60);
            Bt3.addActionListener(e -> System.out.print("Abrir lista de contas"));
            Bt3.setText("Listar Contas");
            Bt3.setFocusable(false);
            Bt3.setFont(new Font("Comic Sans", Font.PLAIN, 18));
            Bt3.setForeground(Color.WHITE);
            Bt3.setBackground(new Color(0, 56, 128));
            Bt3.setFocusPainted(false);

            Bt4.setBounds(250, 600, 200, 60);
            Bt4.addActionListener(e -> dispose());
            Bt4.addActionListener(e -> UserInterface.this.setVisible(true));
            Bt4.setText("Voltar");
            Bt4.setFocusable(false);
            Bt4.setFont(new Font("Comic Sans", Font.PLAIN, 18));
            Bt4.setForeground(Color.WHITE);
            Bt4.setBackground(new Color(0, 56, 128));
            Bt4.setFocusPainted(false);

            //Border
            Border b = BorderFactory.createLineBorder(new Color(0, 98, 167), 4);

            ImageIcon image = new ImageIcon("Logo2.png"); //create the image
            setIconImage(image.getImage());//change Icon

            //add the border
            Cpanel.setBorder(b);

            //add Components
            add(Cpanel);
            Cpanel.add(Bt1);
            Cpanel.add(Bt2);
            Cpanel.add(Bt3);
            Cpanel.add(Bt4);
            Cpanel.add(jTextArea);
            //add(label1);
            //add(label);

            //Show the window
            setVisible(true);
        }

        public class JanelaAbrirConta extends JFrame {

            JButton Bt1;
            JButton Bt2;
            JButton Bt3;
            JButton Bt4;

            public JanelaAbrirConta() {
                setSize(716, 740);
                setTitle("Sistema de controle Bancário");
                setDefaultCloseOperation(EXIT_ON_CLOSE);
                setLayout(null);
                setResizable(false);

                //Center panel
                JPanel Cpanel = new JPanel();
                Cpanel.setBackground(new Color(0, 56, 128));
                Cpanel.setBounds(0, 0, 700, 700);

                JTextArea jTextArea = new JTextArea();
                jTextArea.setText("Abrir Conta");
                jTextArea.setBounds(260, 80, 300, 300);
                jTextArea.setFont(new Font("Comic Sans", Font.BOLD, 30));
                jTextArea.setBackground(new Color(0, 56, 128));
                jTextArea.setForeground(Color.WHITE);
                jTextArea.setVisible(true);

                JTextArea jTextArea1 = new JTextArea();
                jTextArea1.setText("Qual tipo de conta deseja abrir");
                jTextArea1.setBounds(260, 80, 300, 300);
                jTextArea1.setFont(new Font("Comic Sans", Font.BOLD, 25));
                jTextArea1.setBackground(new Color(0, 56, 128));
                jTextArea1.setForeground(Color.WHITE);
                jTextArea1.setVisible(true);


                //Button Image
                ImageIcon icon = new ImageIcon("Button1.png");
                Image scaledImg = icon.getImage().getScaledInstance(200, 60, java.awt.Image.SCALE_SMOOTH);
                icon = new ImageIcon(scaledImg);


                Bt1 = new JButton(icon);
                Bt1.setHorizontalTextPosition(JButton.CENTER);
                Bt1.setVerticalTextPosition(JButton.CENTER);

                Bt2 = new JButton(icon);
                Bt2.setHorizontalTextPosition(JButton.CENTER);
                Bt2.setVerticalTextPosition(JButton.CENTER);

                Bt3 = new JButton(icon);
                Bt3.setHorizontalTextPosition(JButton.CENTER);
                Bt3.setVerticalTextPosition(JButton.CENTER);

                Bt4 = new JButton(icon);
                Bt4.setHorizontalTextPosition(JButton.CENTER);
                Bt4.setVerticalTextPosition(JButton.CENTER);


                //Button Borders
                Border ButtonBorder = BorderFactory.createLineBorder(new Color(0, 56, 128), 0);


                Bt1.setBounds(250, 300, 200, 60);
                Bt1.addActionListener(e -> new JanelaContaCorrente());
                Bt1.addActionListener(e -> setVisible(false));
                Bt1.setText("Conta Corrente");
                Bt1.setFocusable(false);
                Bt1.setFont(new Font("Comic Sans", Font.PLAIN, 18));
                Bt1.setForeground(Color.WHITE);
                Bt1.setBackground(new Color(0, 56, 128));
                Bt1.setFocusPainted(false);

                Bt2.setBounds(250, 400, 200, 60);
                Bt2.addActionListener(e -> System.out.print("Abrir janela de Conta Poupanca"));
                Bt2.setText("Conta Poupanca");
                Bt2.setFocusable(false);
                Bt2.setFont(new Font("Comic Sans", Font.PLAIN, 18));
                Bt2.setForeground(Color.WHITE);
                Bt2.setBackground(new Color(0, 56, 128));
                Bt2.setFocusPainted(false);

                Bt3.setBounds(250, 500, 200, 60);
                Bt3.addActionListener(e -> System.out.print("Abrir janela de Conta Especial"));
                Bt3.setText("Conta Especial");
                Bt3.setFocusable(false);
                Bt3.setFont(new Font("Comic Sans", Font.PLAIN, 18));
                Bt3.setForeground(Color.WHITE);
                Bt3.setBackground(new Color(0, 56, 128));
                Bt3.setFocusPainted(false);

                Bt4.setBounds(250, 600, 200, 60);
                Bt4.addActionListener(e -> dispose());
                Bt4.addActionListener(e -> JanelaMenuContas.this.setVisible(true));
                Bt4.setText("Voltar");
                Bt4.setFocusable(false);
                Bt4.setFont(new Font("Comic Sans", Font.PLAIN, 18));
                Bt4.setForeground(Color.WHITE);
                Bt4.setBackground(new Color(0, 56, 128));
                Bt4.setFocusPainted(false);


                //button


                //JLabel label1 = new JLabel();
                //ImageIcon icon2 = new ImageIcon("Voltar.png");
                //Image im = icon2.getImage().getScaledInstance(200, 60,  java.awt.Image.SCALE_SMOOTH);
                //icon = new ImageIcon(scaledImg);
                //label1.setBounds(150, 200, 200,200);

                //Border
                Border b = BorderFactory.createLineBorder(new Color(0, 98, 167), 4);

                ImageIcon image = new ImageIcon("Logo2.png"); //create the image
                setIconImage(image.getImage());//change Icon

                //add the border
                Cpanel.setBorder(b);

                //add Components
                add(Cpanel);
                Cpanel.add(Bt1);
                Cpanel.add(Bt2);
                Cpanel.add(Bt3);
                Cpanel.add(Bt4);
                Cpanel.add(jTextArea);
                //add(label1);
                //add(label);

                //Show the window
                setVisible(true);
            }

            public class JanelaContaCorrente extends JFrame {

                JButton Bt1;
                JButton Bt2;
                JButton Bt3;
                JButton Bt4;

                public JanelaContaCorrente() {
                    setSize(716, 740);
                    setTitle("Sistema de controle Bancário");
                    setDefaultCloseOperation(EXIT_ON_CLOSE);
                    setLayout(null);
                    setResizable(false);

                    //Center panel
                    JPanel Cpanel = new JPanel();
                    Cpanel.setBackground(new Color(0, 56, 128));
                    Cpanel.setBounds(0, 0, 700, 700);

                    JTextArea jTextArea = new JTextArea();
                    jTextArea.setText("Conta Corrente");
                    jTextArea.setBounds(260, 80, 300, 300);
                    jTextArea.setFont(new Font("Comic Sans", Font.BOLD, 30));
                    jTextArea.setBackground(new Color(0, 56, 128));
                    jTextArea.setForeground(Color.WHITE);
                    jTextArea.setVisible(true);

                    JTextArea jTextArea1 = new JTextArea();
                    jTextArea1.setText("Lista de Clientes: \n" + listarCliente());
                    jTextArea1.setBounds(260, 50, 300, 300);
                    jTextArea1.setFont(new Font("Comic Sans", Font.BOLD, 25));
                    jTextArea1.setBackground(new Color(0, 56, 128));
                    jTextArea1.setForeground(Color.WHITE);
                    jTextArea1.setVisible(true);


                    //Button Image
                    ImageIcon icon = new ImageIcon("Button1.png");
                    Image scaledImg = icon.getImage().getScaledInstance(200, 60, java.awt.Image.SCALE_SMOOTH);
                    icon = new ImageIcon(scaledImg);


                    Bt1 = new JButton(icon);
                    Bt1.setHorizontalTextPosition(JButton.CENTER);
                    Bt1.setVerticalTextPosition(JButton.CENTER);

                    Bt2 = new JButton(icon);
                    Bt2.setHorizontalTextPosition(JButton.CENTER);
                    Bt2.setVerticalTextPosition(JButton.CENTER);

                    Bt3 = new JButton(icon);
                    Bt3.setHorizontalTextPosition(JButton.CENTER);
                    Bt3.setVerticalTextPosition(JButton.CENTER);

                    Bt4 = new JButton(icon);
                    Bt4.setHorizontalTextPosition(JButton.CENTER);
                    Bt4.setVerticalTextPosition(JButton.CENTER);


                    //Button Borders
                    Border ButtonBorder = BorderFactory.createLineBorder(new Color(0, 56, 128), 0);


                    Bt1.setBounds(250, 300, 200, 60);
                    Bt1.addActionListener(e -> System.out.print("Abrir janela de Conta Corrente"));
                    Bt1.setText("Conta Corrente");
                    Bt1.setFocusable(false);
                    Bt1.setFont(new Font("Comic Sans", Font.PLAIN, 18));
                    Bt1.setForeground(Color.WHITE);
                    Bt1.setBackground(new Color(0, 56, 128));
                    Bt1.setFocusPainted(false);

                    Bt2.setBounds(250, 400, 200, 60);
                    Bt2.addActionListener(e -> System.out.print("Abrir janela de Conta Poupanca"));
                    Bt2.setText("Conta Poupanca");
                    Bt2.setFocusable(false);
                    Bt2.setFont(new Font("Comic Sans", Font.PLAIN, 18));
                    Bt2.setForeground(Color.WHITE);
                    Bt2.setBackground(new Color(0, 56, 128));
                    Bt2.setFocusPainted(false);

                    Bt3.setBounds(250, 500, 200, 60);
                    Bt3.addActionListener(e -> System.out.print("Abrir janela de Conta Especial"));
                    Bt3.setText("Conta Especial");
                    Bt3.setFocusable(false);
                    Bt3.setFont(new Font("Comic Sans", Font.PLAIN, 18));
                    Bt3.setForeground(Color.WHITE);
                    Bt3.setBackground(new Color(0, 56, 128));
                    Bt3.setFocusPainted(false);

                    Bt4.setBounds(250, 600, 200, 60);
                    Bt4.addActionListener(e -> dispose());
                    Bt4.addActionListener(e -> JanelaAbrirConta.this.setVisible(true));
                    Bt4.setText("Voltar");
                    Bt4.setFocusable(false);
                    Bt4.setFont(new Font("Comic Sans", Font.PLAIN, 18));
                    Bt4.setForeground(Color.WHITE);
                    Bt4.setBackground(new Color(0, 56, 128));
                    Bt4.setFocusPainted(false);


                    //button


                    //JLabel label1 = new JLabel();
                    //ImageIcon icon2 = new ImageIcon("Voltar.png");
                    //Image im = icon2.getImage().getScaledInstance(200, 60,  java.awt.Image.SCALE_SMOOTH);
                    //icon = new ImageIcon(scaledImg);
                    //label1.setBounds(150, 200, 200,200);

                    //Border
                    Border b = BorderFactory.createLineBorder(new Color(0, 98, 167), 4);

                    ImageIcon image = new ImageIcon("Logo2.png"); //create the image
                    setIconImage(image.getImage());//change Icon

                    //add the border
                    Cpanel.setBorder(b);

                    //add Components
                    add(Cpanel);
                    Cpanel.add(Bt1);
                    Cpanel.add(Bt2);
                    Cpanel.add(Bt3);
                    Cpanel.add(Bt4);
                    Cpanel.add(jTextArea);
                    Cpanel.add(jTextArea1);
                    //add(label1);
                    //add(label);

                    //Show the window
                    setVisible(true);
                }

                public String listarCliente()
                {
                    String[] cliente = new String[5];

                    for (int i = 0; i < cliente.length; i++) {

                        cliente[i] = "cliente " + i + "\n";

                        return(cliente[i]);
                    }

                    return null;
                }
            }
        }
    }
}