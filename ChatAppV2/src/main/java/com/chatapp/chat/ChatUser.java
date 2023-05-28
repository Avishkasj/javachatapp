package com.chatapp.chat;
import java.io.*;

public class ChatUser implements Serializable {

    private String username;
    private int userId;
    private String nickname;
    private byte[] avatar;

    public ChatUser(String username, int userId, String nickname, byte[] avatar) {
        this.username = username;
        this.userId = userId;
        this.nickname = nickname;
        this.avatar = avatar;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public byte[] getAvatar() {
        return avatar;
    }

    public void setAvatar(byte[] avatar) {
        this.avatar = avatar;
    }
}

