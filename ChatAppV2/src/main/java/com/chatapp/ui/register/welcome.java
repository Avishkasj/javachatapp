package com.chatapp.ui.register;

import com.chatapp.ui.register.register.register;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class welcome extends JFrame{


    private JPanel Register;
    private JButton registerButton;
    private JButton loginButton;

    public welcome() {
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                welcome.super.dispose();
                JFrame frame1 = new register();
                frame1.setVisible(true);
                frame1.setSize(400, 500);
            }
        });
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                welcome.super.dispose();
                JFrame frame2 = new login();
                frame2.setVisible(true);
                frame2.setSize(400, 500);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Welcome");
        welcome register = new welcome();
        frame.setContentPane(register.Register);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 500); // Set the desired size here (width, height)
        frame.setVisible(true);
    }

}
