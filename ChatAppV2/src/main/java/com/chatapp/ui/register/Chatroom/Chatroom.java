package com.chatapp.ui.register.Chatroom;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Chatroom {
    private JTextField textField1;
    private JButton createButton;
    private JTable table1;
    private JButton startButton;
    private JPanel roompanel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Chatroom");
        frame.setContentPane(new Chatroom().roompanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Chatroom() {
    createButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String roomname = textField1.getText().trim();

        }
    });

}
}
