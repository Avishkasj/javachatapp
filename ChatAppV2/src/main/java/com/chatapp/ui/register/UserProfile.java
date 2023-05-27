package com.chatapp.ui.register;

import com.chatapp.database.Database;
import entity.UserEntity;

import javax.swing.*;

public class UserProfile {
    private JPanel panel1;
    private JTextField intID;
    private JTextField textUname;
    private JTextField textEmail;

    public UserProfile() {
        Database database = new Database();
        UserEntity user = database.UserPro(3); // Replace 3 with the actual user ID

        if (user != null) {
            intID.setText(String.valueOf(user.getId()));
            textUname.setText(user.getUsername());
            textEmail.setText(user.getEmail());
        } else {
            System.out.println("User not found!");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("User Profile");
            frame.setContentPane(new UserProfile().panel1);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
        });
    }
}
