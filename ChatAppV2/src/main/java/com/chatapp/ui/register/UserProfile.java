package com.chatapp.ui.register;

import com.chatapp.chat.User;
import com.chatapp.database.Database;
import entity.UserEntity;

import javax.swing.*;

public class UserProfile extends JFrame {
    private JPanel panel1;
    private JTextField intID;
    private JTextField textUname;
    private JTextField textEmail;

    public UserProfile() {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setContentPane(panel1);
        this.pack();
//        Database database = new Database();
//        UserEntity user = database.UserPro(3); // Replace 3 with the actual user ID

//        if (user != null) {
            intID.setText(String.valueOf(User.getId()));
            textUname.setText(User.getUsername());
            textEmail.setText(User.getEmail());
//        } else {
//            System.out.println("User not found!");
//        }
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
