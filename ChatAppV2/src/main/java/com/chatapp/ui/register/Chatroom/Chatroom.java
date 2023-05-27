package com.chatapp.ui.register.Chatroom;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Chatroom {
    private JTextField textField1;
    private JButton createButton;
    private JTable table1;
    private JButton startButton;
public Chatroom() {
    createButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String roomname = textField1.getText().trim();
            
        }
    });
}
}
