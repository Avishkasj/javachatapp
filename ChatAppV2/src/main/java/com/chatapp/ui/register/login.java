package com.chatapp.ui.register;

import com.chatapp.database.Database;
import com.chatapp.ui.register.Chatroom.Chatroom;
import entity.UserEntity;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Objects;

public class login extends JFrame {
    private JTextField textField1;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JPanel login;
    private JTextField textField3;

    public Database db = new Database();

    public login() {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setContentPane(login);
        this.pack();

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = textField1.getText().trim();
                String password =textField3.getText().trim();
//                String password = new String(passwordField.getPassword()).trim();


                UserEntity user = db.login(username);
                String role= String.valueOf(user.getRoleId());
                if (Objects.equals(user.getPassword(), password)){
                    if (Objects.equals(role, "1")) {
                        // Redirect to create room page
                        // Replace this line with the code to redirect to the create room page
                        System.out.println("Redirecting to create room page...");
                        login.super.dispose();
                        JFrame frame4 = new Chatroom();
                        frame4.setVisible(true);
                        frame4.setSize(400, 500);
                    }
                    System.out.println("Login successful!");

                }

//                if (user != null) {
//                    // User exists and login is successful
//                    System.out.println("Login successful!");
//                } else {
//                    // User does not exist or invalid credentials
//                    System.out.println("Invalid username or password!");
//                }
            }
        });
    }
}
