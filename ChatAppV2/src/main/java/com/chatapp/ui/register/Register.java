package com.chatapp.ui.register;

import javax.swing.*;

public class Register extends JFrame{


    private JButton REGISTERButton;
    private JButton LOGINButton;
    private JPanel register;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Register");
        frame.setContentPane(new Register().register);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
