package com.chatapp.ui.register;

import javax.swing.*;

public class Admin {
    private JPanel admin;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Admin");
        frame.setContentPane(new Admin().admin);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
