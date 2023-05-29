package com.chatapp.chat;

import java.rmi.Remote;
import java.rmi.RemoteException;


public interface Chat extends Remote {
    void registerObserver(Observer observer) throws RemoteException;
    void removeObserver(Observer observer) throws RemoteException;
    void notifyObservers(String text) throws RemoteException;
    public void subscribe(int userId) throws RemoteException;

    public void unsubscribe(int userId) throws RemoteException;
    public boolean is_subscribe(int userId) throws RemoteException;
    public void sendMessage(Message msg) throws RemoteException;

    public Message broadcast() throws RemoteException;
    public void saveToFile() throws RemoteException;
    public String test(String text) throws RemoteException;
}
