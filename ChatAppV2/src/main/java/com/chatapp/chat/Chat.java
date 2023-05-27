package com.chatapp.chat;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Chat extends Remote {
    public void subscribe() throws RemoteException;
    public boolean is_subscribe() throws RemoteException;
    public void sendMessage(Messsage msg) throws RemoteException;

    public Messsage broadcast() throws RemoteException;
    public void saveToFile() throws RemoteException;
    public String test(String text) throws RemoteException;
}
