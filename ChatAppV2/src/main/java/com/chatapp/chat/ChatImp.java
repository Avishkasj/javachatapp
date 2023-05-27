package com.chatapp.chat;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ChatImp extends UnicastRemoteObject implements Chat {
    public ChatImp() throws RemoteException {
        super();
    }

    @Override
    public void subscribe() throws RemoteException {

    }

    @Override
    public boolean is_subscribe() throws RemoteException {
        return false;
    }

    @Override
    public void sendMessage(Messsage msg) throws RemoteException {

    }

    @Override
    public Messsage broadcast() throws RemoteException {
        return null;
    }

    @Override
    public void saveToFile() throws RemoteException {

    }

    @Override
    public String test(String text) throws RemoteException {
        System.out.println(text);
        return text;
    }
}
