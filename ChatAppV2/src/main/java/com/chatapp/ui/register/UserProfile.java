package com.chatapp.ui.register;

import com.chatapp.chat.User;
import com.chatapp.database.Database;
import entity.UserEntity;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserProfile extends JFrame {
    private JPanel panel1;
    private JTextField intID;
    private JTextField textUname;
    private JTextField textEmail;
    private JButton updateButton; // Button to update user details

    public UserProfile() {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setContentPane(panel1);
        this.pack();

        intID.setText(String.valueOf(User.getId()));
        textUname.setText(User.getUsername());
        textEmail.setText(User.getEmail());

        // Update user details when the button is clicked
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String newUsername = textUname.getText();
                String newEmail = textEmail.getText();

                UserEntity userEntity = new UserEntity();
                userEntity.setUsername(newUsername);
                userEntity.setEmail(newEmail);




                // Update user details in the database
                Database database = new Database();
                int success = database.update(userEntity);

                if (success == 1) {
                    JOptionPane.showMessageDialog(UserProfile.this, "User details updated successfully.");
                } else {
                    JOptionPane.showMessageDialog(UserProfile.this, "Failed to update user details.");
                }
            }
        });
    }

    public static void run() {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("User Profile");
            frame.setContentPane(new UserProfile().panel1);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
        });
    }
}
