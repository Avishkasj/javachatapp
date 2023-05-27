package com.chatapp.chat;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Observer extends Remote {
    void receiveMessage(Message message) throws RemoteException;
}