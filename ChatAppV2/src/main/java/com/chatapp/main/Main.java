package com.chatapp.main;

import com.chatapp.database.Database;
import entity.UserEntity;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Main {
    public static void main(String[] args) {
        Database db = new Database();

//        UserEntity userEntity = new UserEntity();
//        userEntity.setNickname("Dilum Sadeepa");
//        userEntity.setUsername("dilum");
//        userEntity.setEmail("dilum19990612@gmail.com");
//        File file = new File("E:\\University\\Level 3\\Semester 01\\Advance java\\project\\javachatapp\\ChatAppV2\\src\\main\\java\\com\\chatapp\\image\\user.png");
//        byte[] imageData;
//        try {
//            imageData = Files.readAllBytes(file.toPath());
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        userEntity.setAvatar(imageData);
//        userEntity.setIsDeleted(0);
//        userEntity.setPassword("123456789");
//        userEntity.setRoleId(1);
//
//        db.insert(userEntity);
    }
}
