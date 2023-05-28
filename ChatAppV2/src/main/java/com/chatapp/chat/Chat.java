package com.chatapp.chat;

import java.rmi.Remote;
import java.rmi.RemoteException;


public interface Chat extends Remote {
    void registerObserver(Observer observer) throws RemoteException;
    void removeObserver(Observer observer) throws RemoteException;
    void notifyObservers(Message message) throws RemoteException;
    public void subscribe() throws RemoteException;
    public boolean is_subscribe() throws RemoteException;
    public void sendMessage(Message msg) throws RemoteException;

    public Message broadcast() throws RemoteException;
    public void saveToFile() throws RemoteException;
    public String test(String text) throws RemoteException;
}
