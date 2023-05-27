package com.chatapp.ui.register;

import com.chatapp.database.Database;
import entity.UserEntity;

import javax.swing.*;


public class UserProfile {
    private JPanel panel1;
    private JTextField intID;
    private JTextField textUname;
    private JTextField textEmail;

    public static void main(String[] args) {
    Database database = new Database();
    UserEntity user = database.UserPro(3);


        System.out.println("User ID: " + user.getId());
        System.out.println("Username: " + user.getUsername());
        System.out.println("Email: " + user.getEmail());
        System.out.println("User not found!");

    }
}


