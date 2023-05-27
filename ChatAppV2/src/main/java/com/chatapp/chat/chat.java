package com.chatapp.chat;

import java.rmi.Remote;

public interface chat extends Remote {
    public void subscribe();
    public boolean is_subscribe();
    public void sendMessage();
    public void saveToFile();
}
