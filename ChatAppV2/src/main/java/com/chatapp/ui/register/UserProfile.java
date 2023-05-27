package com.chatapp.ui.register;

import com.chatapp.database.Database;
import entity.UserEntity;



public class UserProfile {
    public static void main(String[] args) {
    Database database = new Database();
    UserEntity user = database.UserPro(1); // Replace 123 with the specific user ID

        
        System.out.println("User ID: " + user.getId());
        System.out.println("Username: " + user.getUsername());
        System.out.println("Email: " + user.getEmail());
        System.out.println("User not found!");

    }
}


