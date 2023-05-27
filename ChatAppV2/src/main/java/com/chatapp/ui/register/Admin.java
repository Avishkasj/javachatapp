package com.chatapp.ui.register;

import javax.swing.*;

public class Admin extends JFrame{
    private JPanel admin;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Admin");
        frame.setContentPane(new Admin().admin);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,700);
        frame.pack();
        frame.setVisible(true);
    }
}
