package com.chatapp.ui.register;

import com.chatapp.chat.User;
import com.chatapp.database.Database;
import entity.UserEntity;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInput;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class UserProfile extends JFrame {
    private JPanel panel1;
    private JTextField intID;
    private JTextField textUname;
    private JTextField textEmail;
    private JButton updateButton; // Button to update user details
    private JButton avatar;
    private JTextField textNickname;
    private JButton deleteButton;

    JFileChooser fileChooser;
    byte[] imageData;

    Database db = new Database();

    public UserProfile() {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setContentPane(panel1);
        this.pack();

        intID.setText(String.valueOf(User.getId()));
        textUname.setText(User.getUsername());
        textEmail.setText(User.getEmail());
        //--
        textNickname.setText(User.getNickname());

        // Update user details when the button is clicked
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String newUsername = textUname.getText();
                String newEmail = textEmail.getText();
                String newNickname=textNickname.getText();

                UserEntity userEntity = new UserEntity();
                userEntity.setUsername(newUsername);
                userEntity.setEmail(newEmail);
                //userEntity.setAvatar(newAvatar);
                userEntity.setNickname(newNickname);





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
        avatar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fileChooser = new JFileChooser();
                int option = fileChooser.showOpenDialog(UserProfile.this);
                if (option == JFileChooser.APPROVE_OPTION) {
                    // Get the selected file
                    File file = fileChooser.getSelectedFile();

                    try {
                        imageData = Files.readAllBytes(file.toPath());

                        // Display the file name in a text field (optional)
//                        textField4.setText(file.getName());
                        User.setAvatar(imageData);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }

                    // Perform any additional operations with the image data if needed
                    // ...
                }
            }
        });
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UserEntity userEntity = new UserEntity();
                userEntity.setId(User.getId());
                db.delete(userEntity);
                UserProfile.super.dispose();
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
