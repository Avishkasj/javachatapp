package com.chatapp.chat;

import java.io.Serializable;
import java.util.Arrays;

public class Message implements Serializable {

    private static final long serialVersionUID = 4395048792208962653L;

    private int id;
    private int groupId;
    private int userId;
    private String nickname;
    private byte[] avatar;
    private String message;
    private String mstime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMstime() {
        return mstime;
    }

    public void setMstime(String mstime) {
        this.mstime = mstime;
    }

    @Override
    public String toString() {
        return message;
    }
}
