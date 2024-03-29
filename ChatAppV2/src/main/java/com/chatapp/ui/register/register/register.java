package com.chatapp.ui.register.register;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import com.chatapp.database.Database;
import entity.UserEntity;

public class register extends JFrame {
    public JPanel reg;
    private JTextField textField1;
    private JTextField textField2;
    private JButton registerButton;
    private JTextField textField3;
    private JTextField textField4;
    private JButton button1;
    private JButton avaterButton;


    JButton uploadButton;
    JFileChooser fileChooser;
    byte[] imageData;

    public Database db = new Database();

    public register() {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setContentPane(reg);
        this.pack();

        avaterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fileChooser = new JFileChooser();
                int option = fileChooser.showOpenDialog(register.this);
                if (option == JFileChooser.APPROVE_OPTION) {
                    // Get the selected file
                    File file = fileChooser.getSelectedFile();

                    try {
                        imageData = Files.readAllBytes(file.toPath());

                        // Display the file name in a text field (optional)
//                        textField4.setText(file.getName());
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }

                    // Perform any additional operations with the image data if needed
                    // ...
                }

            }
        });

        registerButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                String uname = textField1.getText().trim();
                String password = textField2.getText().trim();
                String nickname = textField3.getText().trim();
                String email = textField4.getText().trim();

                // Create a UserEntity instance and set the values
                UserEntity user = new UserEntity();
                user.setUsername(uname);
                user.setPassword(password);
                user.setNickname(nickname);
                user.setEmail(email);
                user.setIsDeleted(0);
                user.setRoleId(2);
////                File file = new File("/Users/avishkasupun/Documents/Untitled/ChatAppV2/src/main/java/com/chatapp/image/user.png");
////        byte[] imageData;
//        try {
////            imageData = Files.readAllBytes(file.toPath());
//        } catch (IOException ex) {
//            throw new RuntimeException(ex);
//        }
                user.setAvatar(imageData);
        db.insert(user);
                System.out.println("User registered successfully!");
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                register.super.dispose();
            }
        });

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Register");
        frame.setContentPane(new register().reg);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
