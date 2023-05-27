package com.chatapp.chat;


import entity.UserEntity;

public class User {
    private static int id;
    private static String username;
    private static String nickname;
    private static String email;
    private static byte[] avatar;
    private static int isDeleted;
    private static String password;
    private static int roleId;

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        User.id = id;
    }

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        User.username = username;
    }

    public static String getNickname() {
        return nickname;
    }

    public static void setNickname(String nickname) {
        User.nickname = nickname;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        User.email = email;
    }

    public static byte[] getAvatar() {
        return avatar;
    }

    public static void setAvatar(byte[] avatar) {
        User.avatar = avatar;
    }

    public static int getIsDeleted() {
        return isDeleted;
    }

    public static void setIsDeleted(int isDeleted) {
        User.isDeleted = isDeleted;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        User.password = password;
    }

    public static int getRoleId() {
        return roleId;
    }

    public static void setRoleId(int roleId) {
        User.roleId = roleId;
    }

    public static void setUser(UserEntity userEntity){
        User.username = userEntity.getUsername();
        User.nickname = userEntity.getNickname();
        User.email = userEntity.getEmail();
        User.avatar = userEntity.getAvatar();
        User.password = userEntity.getPassword();
    }
}
