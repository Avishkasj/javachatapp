package com.chatapp.ui.register;

import com.chatapp.database.Database;
import entity.UserEntity;

public class UserProfile {
    Database database = new Database();
    UserEntity user = database.UserPro(3); // Replace 123 with the specific user ID

if (user != null) {
        System.out.println("User ID: " + user.getId());
        System.out.println("Username: " + user.getUsername());
        System.out.println("Email: " + user.getEmail());
    } else {
        System.out.println("User not found!");
    }

}
