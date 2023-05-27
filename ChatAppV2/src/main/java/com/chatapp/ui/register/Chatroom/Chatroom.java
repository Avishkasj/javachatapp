package com.chatapp.ui.register.Chatroom;

import com.chatapp.chat.User;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Chatroom extends JFrame {
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
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setContentPane(roompanel);
        this.pack();

        System.out.println(User.getNickname());

    createButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String roomname = textField1.getText().trim();

        }
    });

}
}
