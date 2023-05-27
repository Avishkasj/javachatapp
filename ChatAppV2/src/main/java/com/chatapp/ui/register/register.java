package com.chatapp.ui.register;

import javax.swing.*;

public class register extends JFrame{
    public static void main(String[] args) {
        JFrame frame = new JFrame("register");
        frame.setContentPane(new register().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private JButton REGISTERButton;
    private JButton LOGINButton;
    private JPanel panel1;
}
