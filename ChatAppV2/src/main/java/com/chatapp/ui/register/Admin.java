package com.chatapp.ui.register;

import javax.swing.*;
import java.awt.*;

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

    public Admin() throws HeadlessException {
        JFrame frame2 = new JFrame("Admin");
        frame2.setSize(400,600);
    }
}
