package com.chatapp.ui.register;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;


public class UserDashboard extends JFrame{
    private JButton profButton;

    public UserDashboard() {
        super("User Profile");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        profButton = new JButton("Profile");
    profButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            showUserProfile();
        }
    });
        add(profButton);

        pack();
        setVisible(true);
}
    private void showUserProfile() {
        UserProfileDao userProfileDao = new UserProfileDao();
        try {
            UserProfile userProfile = userProfileDao.getUserProfile(3); // Replace with actual user ID
            displayUserProfile(userProfile);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void displayUserProfile(UserProfile userProfile) {
        JOptionPane.showMessageDialog(this,
                "Username: " + userProfile.getUsername() + "\n" +
                        "Email: " + userProfile.getEmail(),
                "User Profile",
                JOptionPane.INFORMATION_MESSAGE);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(UserDashboard::new);
    }

}
