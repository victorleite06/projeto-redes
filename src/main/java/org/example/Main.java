package org.example;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        loginPage();
    }

    private static void loginPage() {
        JFrame frame = new JFrame();
        frame.setTitle("Login Page");
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.LIGHT_GRAY);

        JLabel titulo = new JLabel();
        titulo.setText("Login");
        titulo.setVisible(true);
        titulo.setFont(new Font("Montserrat", Font.PLAIN, 30));
        titulo.setSize(500, 500);
        titulo.setVerticalAlignment(JLabel.TOP);
        titulo.setHorizontalAlignment(JLabel.CENTER);

        JPanel tituloArea = new JPanel();
        tituloArea.setLayout(new BorderLayout());
        tituloArea.setBounds(0 ,0, 500, 40);
        tituloArea.setBackground(Color.LIGHT_GRAY);
        tituloArea.add(titulo);

        JLabel usuario = new JLabel();
        usuario.setText("Usuário");
        usuario.setVisible(true);
        usuario.setFont(new Font("Montserrat", Font.PLAIN, 20));
        usuario.setSize(100, 60);

        JTextField campoUsuario = new JTextField();
        campoUsuario.setBounds(100, 15, 150, 30);
        campoUsuario.setVisible(true);

        JPanel usuarioArea = new JPanel();
        usuarioArea.setLayout(new BorderLayout());
        usuarioArea.setBackground(Color.LIGHT_GRAY);
        usuarioArea.setBounds(120 ,80, 250, 75);

        usuarioArea.add(usuario);
        usuarioArea.add(campoUsuario);

        JLabel senha = new JLabel();
        senha.setText("Senha");
        senha.setVisible(true);
        senha.setFont(new Font("Montserrat", Font.PLAIN, 20));
        senha.setSize(100, 60);

        JTextField campoSenha = new JPasswordField();
        campoSenha.setBounds(100, 15, 150, 30);
        campoSenha.setVisible(true);

        JPanel senhaArea = new JPanel();
        senhaArea.setLayout(new BorderLayout());
        senhaArea.setBackground(Color.LIGHT_GRAY);
        senhaArea.setBounds(120 ,150, 250, 75);

        senhaArea.add(senha);
        senhaArea.add(campoSenha);

        JButton botaoSalvar = new JButton();
        botaoSalvar.setBounds(210, 0, 80, 30);
        botaoSalvar.addActionListener(e -> {
            logar(campoUsuario, campoSenha);
        });
        botaoSalvar.setText("Entrar");

        JPanel botaoArea = new JPanel();
        botaoArea.setLayout(new BorderLayout());
        botaoArea.setBackground(Color.LIGHT_GRAY);
        botaoArea.setBounds(0, 230, 500, 30);
        botaoArea.add(botaoSalvar);

        JPanel bodyArea = new JPanel();
        bodyArea.setLayout(new BorderLayout());
        bodyArea.setBackground(Color.LIGHT_GRAY);
        bodyArea.setBounds(0 ,60, 500, 450);
        bodyArea.add(usuarioArea);
        bodyArea.add(senhaArea);
        bodyArea.add(botaoArea);

        frame.add(tituloArea);
        frame.add(bodyArea);
    }

    private static void logar(JTextField usuario, JTextField senha) {
        System.out.println(usuario.getText());
        System.out.println(senha.getText());
    }
}