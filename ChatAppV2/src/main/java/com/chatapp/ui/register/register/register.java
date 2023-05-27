package com.chatapp.ui.register.register;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class register extends JFrame{
    public JPanel reg;
    private JTextField textField1;
    private JTextField textField2;
    private JButton registerButton;

public register() {
    this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    this.setContentPane(reg);
    this.pack();
    registerButton.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {

        }
    });
}
}
