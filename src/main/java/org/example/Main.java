package org.example;

import javax.swing.*;
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
        frame.setSize(700, 700);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.LIGHT_GRAY);
    }
}